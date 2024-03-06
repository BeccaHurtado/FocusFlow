package com.taskapp.FocusFlow;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.taskapp.FocusFlow.controller.TaskController;
import com.taskapp.FocusFlow.model.Task;

import lombok.Value;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import java.io.IOException;

@Controller
//@RestController
public class MainPage {
	
//	@Autowired
//	private TaskController taskController;

	@GetMapping("/")
	public String main(Model model) {
		//model.addAttribute("alltask", taskController.getAllTask());
		return "index";
	}
}
