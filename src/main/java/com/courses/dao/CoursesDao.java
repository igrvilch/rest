package com.courses.dao;

import java.util.List;

import com.courses.model.Course;

public interface CoursesDao {
	
	public List<Course> getCoursesDao();
	public void saveCourses(List<Course> courses);
	public void addCourseDB(Course course);

}
