package com.courses.service;

import java.util.List;

import com.courses.model.Course;

public interface CoursesService {

	public List<Course> getCourses();

	public void saveCourses();

	public void addCourse(Course course);

}
