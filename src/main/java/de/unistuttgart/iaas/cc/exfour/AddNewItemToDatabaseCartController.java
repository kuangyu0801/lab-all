package de.unistuttgart.iaas.cc.exfour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddNewItemToDatabaseCartController {


	private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
	private static final String awsCredentialsFile = "aws.properties";

	@RequestMapping("/set")
	public String hello(@RequestParam(value = "item") String newItem) {


		// TODO: Task4 - Add newItem to the database





		return "set-cookie";
	}
}
