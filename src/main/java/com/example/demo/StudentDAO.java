package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class StudentDAO {
@Autowired
StudentRepo sr;
public List<Student> get() {
	return sr.findAll();
}
public String setvalue(Student w) {
	sr.save(w);
	return "added";
}
public Optional<Student> pass(@PathVariable int a) {
	return sr.findById(a);
}
}
