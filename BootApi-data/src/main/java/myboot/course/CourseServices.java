package myboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myboot.course.course;

@Service
public class CourseServices {
	@Autowired
	private CourseRepositories tr;

	List<course> tp = new ArrayList<>();

	public List<course> getAllCourses(String topicId) {
		tr.findByTopicId(topicId).forEach(tp::add);
		return tp;
	}

	public Optional<course> getCourse(String id) {
		return tr.findById(id);
	}

	public void addCourse(course tp) {
		tr.save(tp);
	}

	public void updateCourse(course tp) {
		tr.save(tp);

	}

	public void dltCourse(String id) {

		tr.deleteById(id);

	}
}
