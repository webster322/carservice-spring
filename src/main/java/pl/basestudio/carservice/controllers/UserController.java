package pl.basestudio.carservice.controllers;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.basestudio.carservice.services.IssuesService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(path = "login", method=RequestMethod.GET)
	@ResponseBody
	public String testIssue(@RequestParam("login") String login, HttpServletRequest request) {
		request.getSession().setAttribute("login", login);
		return "Ustawilem w sesji login: "+login;
	}
}
