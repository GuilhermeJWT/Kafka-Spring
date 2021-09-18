package br.com.systemsgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.model.ModelUser;

@RestController
@RequestMapping(value = "/api/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaTemplate<String, Object> template;
	
	private String topic = "guilhermetopic";
	
	@GetMapping(value = "/publish/{description}")
	public String publishMessage(@PathVariable String description) {
		template.send(topic, "Description: " + description);
		
		return "Message publish";
	}
	
	@GetMapping(value = "/publishJson")
	public String publishMessageJson() {
		ModelUser modelUser = new ModelUser(25, "Guilherme", new String [] {"Addres 1", "Addres 2", "Addres 3"});
		template.send(topic, modelUser);
		
		return "Message publish";
	}

}
