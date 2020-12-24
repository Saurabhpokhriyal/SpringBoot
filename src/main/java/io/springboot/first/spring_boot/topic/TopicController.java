package io.springboot.first.spring_boot.topic;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService tservice;
	
	/*
	 * @RequestMapping("/topic") public List<Topics> topics() { return
	 * tservice.getAlltopic(); } // get call method based on id
	 * 
	 * @RequestMapping("/topics/{id}") public Topics getTopic(@PathVariable int id)
	 * { return tservice.getAlltopic(id); }
	 * 
	 * // post method
	 * 
	 * @RequestMapping(method = RequestMethod.POST,value ="/topic") public void
	 * addTopic(@RequestBody Topics topic) { tservice.addTopic(topic); }
	 */
	

}
