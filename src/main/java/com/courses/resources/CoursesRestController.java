package com.courses.resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.courses.model.Course;
import com.courses.service.CoursesService;

@Component
@Path("/api")
public class CoursesRestController {

	@Autowired
	CoursesService coursesService;

	@GET
	@Path("/courses")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> getCourses() {
		List<Course> courses = coursesService.getCourses();
		return courses;
	}

	@POST
	@Path("/addcourse")
	@Produces(MediaType.APPLICATION_JSON)
	public Course addCourse(Course course) {
		coursesService.addCourse(course);
		return course;
	}

}
