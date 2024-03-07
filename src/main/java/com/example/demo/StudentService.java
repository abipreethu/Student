package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
@Autowired
StudentDAO sd;
public List<Student> get() {
	return sd.get();
}
public String setvalue(@RequestBody Student w) {
	return sd.setvalue(w);
}
public Optional<Student> pass(@PathVariable int a){
	return sd.pass(a);
}
}
