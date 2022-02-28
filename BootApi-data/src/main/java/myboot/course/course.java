package myboot.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import myboot.topic.topic;

@Entity
public class course {
@Id
private String id;
private String coursename;
private String subject;
@ManyToOne
private topic topic;
public topic getTopic() {
	return topic;
}
public void setTopic(topic topic) {
	this.topic = topic;
}
public course() {
	
}
public course(String id, String coursename, String subject,String topicId) {
	super();
	this.id = id;
	this.coursename = coursename;
	this.subject = subject;
	this.topic=new topic(topicId,"","");
}
public String getId() {
	return id;
}
public String getCoursename() {
	return coursename;
}
public String getSubject() {
	return subject;
}
}