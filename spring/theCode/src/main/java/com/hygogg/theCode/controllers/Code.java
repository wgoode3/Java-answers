package com.hygogg.theCode.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class Code {
	@RequestMapping("")
    public String index(@ModelAttribute("error") String error) {
		return "index.jsp";
    }
	
	@RequestMapping(path="/submitCode", method = RequestMethod.POST)
	public String theCode(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		if (code.equals("bushido")) {
			return "redirect:/code";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}		
	}
	
	@RequestMapping("/code")
	public String show_code() {
		return "theCode.jsp";
	}
}
