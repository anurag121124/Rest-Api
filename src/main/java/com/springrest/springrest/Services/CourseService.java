package com.springrest.springrest.Services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public  Course addCourse(Course course);
    public Course updateCourse(long courseId, Course updatedCourse);

}
