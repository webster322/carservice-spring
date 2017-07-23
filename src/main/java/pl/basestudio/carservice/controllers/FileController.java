package pl.basestudio.carservice.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileController {
	
	@RequestMapping("/download")
	@ResponseBody
	public void downloadFile(HttpServletResponse response) throws IOException {
		File file = new File(getClass().getClassLoader().getResource("/car.jpg").getFile());
		InputStream inputStream = new FileInputStream(file);
		response.setContentType("image/jpeg");
		response.setContentLengthLong(file.length());
		response.setHeader("Content-Disposition", "attachement; fileName=car.jpg");
		FileCopyUtils.copy(inputStream, response.getOutputStream());
	}
	
	@RequestMapping(path="/upload", method=RequestMethod.GET)
	public String showUploadForm() {
		return "uploadfile";
	}
	
	@RequestMapping(path="/upload", method=RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
		return "uploadfile d³ugosc="+file.getSize();
	}
	
	@RequestMapping(path="/error", method=RequestMethod.GET)
	@ResponseBody
	public String genError() throws IOException {
		throw new IOException();
	}
	
	@ExceptionHandler(IOException.class)
	@ResponseBody
	public String handleError() {
		return "Wyst¹pi³ blad we/wy";
	}
}
