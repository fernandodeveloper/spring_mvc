package spring_webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// Adiciona um nível anterior ao path
// Todas as rotas do controller terão o /hello/{rota}
@RequestMapping("/hello")
public class HelloWorldController {

//	Rota: /hello/hello
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

//	Rota: /hello/processForm
	@RequestMapping("/processForm")
	public String processForm() {
		System.out.println("show form");
		return "showForm";
	}
	
	@RequestMapping("/processFormV2")
	public String upperCaseStudentName(HttpServletRequest request, Model model) {
		String studentName = request.getParameter("studentName").toUpperCase();
		System.out.println(request.getParameter("studentName"));
		model.addAttribute("message", studentName);
		return "showForm";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(
			@RequestParam("studentName") String studentName, 
			Model model) {
		
		studentName = studentName.toUpperCase();
		System.out.println(studentName);
		model.addAttribute("message", "Hello " + studentName);
		return "showForm";
	}
}
