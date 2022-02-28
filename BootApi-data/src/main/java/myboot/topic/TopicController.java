package myboot.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import myboot.topic.TopicServices;
import myboot.topic.topic;

@RestController

public class TopicController {
	@Autowired
	private TopicServices topicservices;
	@RequestMapping("/topic")
	public List<topic> getall()
	{  return topicservices.getall();
	}
	@RequestMapping("/topic/{id}")
	public Optional<topic> getone(@PathVariable String id) {
		return topicservices.getone(id);
	}
	@RequestMapping (method=RequestMethod.POST,value="/topic")
    public void addtopic(@RequestBody topic topic1 ){
    	topicservices.addtopic(topic1);
    	
    }
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updatetopic(@PathVariable String id ,@RequestBody topic topic1) {
		topicservices.updatetopic(id, topic1);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
	public void delTopic(@PathVariable String id) {
		topicservices.deleteTopic(id);
}
}