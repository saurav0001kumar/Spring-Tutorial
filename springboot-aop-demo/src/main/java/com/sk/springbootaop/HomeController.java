package com.sk.springbootaop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sk.springbootaop.models.Coder;

// @RestController

@Controller
public class HomeController {

	@Autowired
	CoderRepo repo;

	@GetMapping("coders")
	@ResponseBody
	public List<Coder> getAllCoders() throws Exception {
		// int x = 9 / 0; //Creating an exception

		return repo.getAllRowsAsc();
	}

	@GetMapping("coder/{id}")
	@ResponseBody
	public Coder getOneCoder(@PathVariable("id") int cid) {
		return repo.findById(cid).orElse(new Coder(0, null));
	}

}
