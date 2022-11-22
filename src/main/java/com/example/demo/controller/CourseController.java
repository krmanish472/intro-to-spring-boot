package com.example.demo.controller;

import com.example.demo.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// EITHER THIS OR ...

/*
@Controller
public class CourseController {

    @RequestMapping("/courses")
    @ResponseBody
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Java", "in28Minutes"),
                new Course(2, "Learn SpringBoot", "in28Minutes")
        );
    }
}
*/

// ... THIS
@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Java", "in28Minutes"),
                new Course(2, "Learn SpringBoot", "in28Minutes")
        );
    }
}

