package com.courses.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.courses.dao.CoursesDao;
import com.courses.model.Course;
import com.courses.service.CoursesService;

@Service
public class CoursesServiceImpl implements CoursesService {

	@Autowired
	CoursesDao coursesDao;

	@Transactional
	public List<Course> getCourses() {
		List<Course> courses = coursesDao.getCoursesDao();

		return courses;
	}

	@Transactional
	public void saveCourses() {
		Course course = new Course();
		course.setTitle("Java");
		course.setType("programming");
		course.setDescription("Course About Java");

		Course course2 = new Course();
		course2.setTitle("JavaScript");
		course2.setType("programming");
		course2.setDescription("Course About JavaScript");

		Course course3 = new Course();
		course3.setTitle("Python");
		course3.setType("programming");
		course3.setDescription("Course About Python");

		Course course4 = new Course();
		course4.setTitle("Design");
		course4.setType("design");
		course4.setDescription("Course About Design");

		Course course5 = new Course();
		course5.setTitle("Photoshop");
		course5.setType("photo");
		course5.setDescription("Course About Photoshop");

		List<Course> courses = new ArrayList<Course>();
		courses.add(course);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		courses.add(course5);
		coursesDao.saveCourses(courses);

	}

	@Transactional
	public void addCourse(Course course) {
		coursesDao.addCourseDB(course);

	}

}
