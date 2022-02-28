package myboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class topic {
@Id
private String id;
private String topicname;
private String subject;
public topic() {
	
}
public topic(String id,String topicname,String subject)
{
	super();
	this.id=id;
	this.topicname=topicname;
	this.subject=subject;
	
}
public String getId() {
	return id;
}
public String getTopicname() {
	return topicname;
}
public String getSubject() {
	return subject;
}

}