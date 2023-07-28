package com.springrest.springrest.Controller;

import com.springrest.springrest.Services.CourseService;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;



    @GetMapping("/home")
    public String home() {
        return "Welcome TO my first Spring Boot Rest Api";
    }

    //Get The Course


    @GetMapping("/courses")
    public List<Course> getCourses() {

        return  this.courseService.getCourses();

    }

//    Single course return
    @GetMapping("/courses/{courseId}")
    public  Course getCourse(@PathVariable String courseId){

        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){

        return  this.courseService.addCourse(course);

    }

    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@PathVariable String courseId, @RequestBody Course updatedCourse) {
        Long id = Long.parseLong(courseId);
        return this.courseService.updateCourse(id, updatedCourse);
    }


}
