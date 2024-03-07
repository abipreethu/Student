package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
StudentService ss;
@GetMapping("/insert")
public List<Student> get() {
	return ss.get();
}


@PostMapping("/setss")
public String setvalue(@RequestBody Student w) {
	return ss.setvalue(w);
}



@GetMapping("/find/{a}")
public Optional<Student> pass(@PathVariable int a) {
	return ss.pass(a);
}
}

