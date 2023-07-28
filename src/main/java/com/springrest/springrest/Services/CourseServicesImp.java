package com.springrest.springrest.Services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    @Service
    public  class CourseServicesImp implements CourseService{

        List<Course> list;

        public  CourseServicesImp(){
            list =new ArrayList<>();
            list.add(new Course(125,"Java Core Course","This course containes basic of java"));
            list.add(new Course(126,"Mern Stack Devlopment","This course containes basic of MERN"));

        }
        @Override
        public List<Course>getCourses(){
            return  list;
        }

        @Override
        public Course getCourse(long courseId) {
            Course c=null;

            for ( Course course:list){
                if (course.getId()==courseId)
                {
                    c=course;
                    break;
                }
            }
            return c;
        }

        @Override
        public Course addCourse(Course course) {
           list.add(course);
            return course;
        }

        public Course updateCourse(long courseId, Course updatedCourse) {
            // Find the course with the given courseId
            Course existingCourse = getCourse(courseId);

            if (existingCourse != null) {
                // Update the existing course with the new information
                existingCourse.setTitle(updatedCourse.getTitle());
                existingCourse.setDescription(updatedCourse.getDescription());
            }

            return existingCourse;
        }
    }

