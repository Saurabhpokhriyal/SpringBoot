package io.springboot.first.spring_boot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topics> topic=Arrays.asList(
			new Topics(1,"Spring framework"," description1"),
			new Topics(2,"Spring framwork2","description2")
			
			);
	
	public List<Topics> getAlltopic(){
		return topic;
	}
}
