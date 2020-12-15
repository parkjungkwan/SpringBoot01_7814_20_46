package com.example.demo.uss.web;

import java.util.Map;

import com.example.demo.cmm.utl.Proxy;
import com.example.demo.uss.service.StudentService;
import com.example.demo.uss.service.model.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class StudentController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    StudentService studentService;

    @PostMapping("/students")
    public Map<?, ?> register(@RequestBody StudentDto student) {
        logger.info("학생등록 정보: " + student.toString());
        var map = new HashMap<>();
        map.put("message", (studentService.register(student) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }

}
