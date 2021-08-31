package fi.viikkokaksi.Viikko2Tehtava2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.viikkokaksi.Viikko2Tehtava2.domain.Student;

@Controller
public class StudentlistController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Pekka", "Kuusisto"));
		studentList.add(new Student("Jaana", "Männistö"));
		studentList.add(new Student("Maiju", "Metsiö"));
		model.addAttribute("students", studentList);
		return "hello";
	}
}
