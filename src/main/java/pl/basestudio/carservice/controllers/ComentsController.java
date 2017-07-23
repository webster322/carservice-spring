package pl.basestudio.carservice.controllers;

import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import pl.basestudio.carservice.services.IssuesService;

@Controller
@RequestMapping("/comment")
public class ComentsController {
	
	private IssuesService issuesService;
	
	
	@Autowired
	public ComentsController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}



	@RequestMapping("/{idComment}")
	public String getComment(@PathVariable("idComment") String idComment, Model model) {
		model.addAttribute("idComment", idComment);
		return "comment";
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String testParam(@RequestParam(name="pageNumber", required=false) String pageNumber,
			@RequestParam(name="recordCount", required=false) String recordCount,
			@CookieValue(name="recordCount", required=false, defaultValue="10") String recordCountCookie,
			@RequestHeader("User-Agent") String userAgent,
			@SessionAttribute("login") String login,
			HttpServletResponse response) {
		String recCount = null;
		if(recordCount!=null) {
			response.addCookie(new Cookie("recordCount", recordCount));
			recCount="Ustawi³em recordCount na "+recordCount;
		}else {
			recCount = "Odczyta z ciasteczka: "+recordCountCookie;
		}
		recCount+=" login="+login;
		return recCount;
	}
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	@ResponseBody
	public String addComment(@RequestBody MultiValueMap<String, String> body) {
		return body.toString();
	}
}
