package com.courses.dao.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.courses.dao.CoursesDao;
import com.courses.model.Course;

@Repository
public class CoursesDaoImpl implements CoursesDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Course> getCoursesDao() {
		List<Course> courses = sessionFactory.getCurrentSession()
				.createCriteria(Course.class).list();
		return courses;
	}

	public void saveCourses(List<Course> courses) {
		for (Course course : courses) {
			sessionFactory.getCurrentSession().save(course);
		}
	}

	public void addCourseDB(Course course) {
		sessionFactory.getCurrentSession().save(course);
	}
}
