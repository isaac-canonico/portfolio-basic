package wcci.springbootdemo;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	int namesCounter;
	ArrayList<String> names = new ArrayList<>();
	
	@RequestMapping("/greeting/")
	@ResponseBody 
	public String sayHelloWorld() {
		populateRecipientNames();
		sortRecipientNames();
		String recipientNames = retrieveRecipientName();
		namesCounter++;
		return "Hello, World!" + recipientNames + "!";
	}
	
	private void sortRecipientNames() {
		Collections.sort(names);
		
	}

	private String retrieveRecipientName() {
	
		return names.get(namesCounter%names.size());
	}

	private void populateRecipientNames() {
		names.add("Bob");
		names.add("Suzan");
		names.add("World");
		names.add("Michael");
	}

}
