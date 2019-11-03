package spring_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring_webapp.model.Student;
import spring_webapp.service.LanguageService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	private static LanguageService languageService = LanguageService.getInstance();

	@RequestMapping("/showForm")
	public String showForm(Model studentModel) {
		
		Student student = new Student();
		studentModel.addAttribute("student", student);
		studentModel.addAttribute("languages", languageService.getAll());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student studentModel) {
		
		return "student-confirmation";
	}
}
