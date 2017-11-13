package com.test.sura;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.test.sura.beans.*;
@Controller
public class RestController {
	
	@RequestMapping("/Welcome")
	public ModelAndView helloworld() {
		ModelAndView model = new ModelAndView("Hellopage");
		model.addObject("msg", "hello world");
		return model;
	}
	
	@ResponseBody //convierte la respuesta a un formato JSON
	@RequestMapping(value="/students", method= RequestMethod.GET)
	public ArrayList<Student> getStudentList(){
		
		Student student1 = new Student();
		student1.setName("bla");
		
		Student student2 = new Student();
		student1.setName("bla2");
		
		Student student3 = new Student();
		student1.setName("bla3");
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		
		return studentsList;
	}

}
