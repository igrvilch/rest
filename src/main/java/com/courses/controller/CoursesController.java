package com.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.courses.service.CoursesService;

@Controller
public class CoursesController {

	@Autowired
	CoursesService coursesService;

	@RequestMapping("/courses.do")
	public String fillDB() {
		coursesService.saveCourses();
		return "redirect:/index.html";
	}

}
