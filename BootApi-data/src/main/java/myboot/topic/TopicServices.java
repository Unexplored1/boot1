package myboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	
	@Autowired
	private TopicRepositories Tr;
	
	 private List<topic> Topics =new ArrayList<>(Arrays.asList(new topic("1","abc","xcv"),
            new topic("2","abc1","xcv"),
            new topic("3","abc","xcv")));
	 
	public List<topic> getall(){
		List <topic> Topics=new ArrayList<>();
		Tr.findAll().forEach(Topics::add);
		return Topics; 
		
		
	}
    public Optional<topic> getone(String id){
    	return Tr.findById(id);
    }
    public void addtopic(topic topic1) {
    	Tr.save(topic1);
    	
    }
	public void updatetopic(String id,topic topic1) {
		Tr.save(topic1);
				
		}
	
	public void deleteTopic(String id) {
		Tr.deleteById(id);
		
	}
	}
