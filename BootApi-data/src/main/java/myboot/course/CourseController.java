package myboot.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import myboot.course.course;
import myboot.topic.topic;

@RestController
public class CourseController {	
	@Autowired
	private CourseServices ts;

	@RequestMapping("/topics/{id}/courses")
	public List<course> getAll(@PathVariable String id) {
		return ts.getAllCourses(id);
	}

	@RequestMapping("/topics/{TopicId}/courses/{id}")
	public Optional<course> getTopic(@PathVariable String id) 
	{
	  return ts.getCourse(id);
		
		
		
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{TopicId}/courses")
	public void addCourse(@RequestBody course tp,@PathVariable String TopicId)
	{
		tp.setTopic(new topic(TopicId,"",""));
		ts.updateCourse(tp);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{TopicId}/courses/{id}")
	public void updateCourse(@RequestBody course tp,@PathVariable String id,@PathVariable String TopicId)
	{
		tp.setTopic(new topic(TopicId,"",""));
		ts.updateCourse(tp); 
	}
	@RequestMapping(method = RequestMethod.DELETE, value ="/topics/{TopicId}/courses/{id}")
	public void dltCourse(@PathVariable String id)
	{
		ts.dltCourse(id); 
	}

}

