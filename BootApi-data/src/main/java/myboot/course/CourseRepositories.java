package myboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepositories extends CrudRepository<course,String>
{     public List<course> findByTopicId(String topicId);

}
