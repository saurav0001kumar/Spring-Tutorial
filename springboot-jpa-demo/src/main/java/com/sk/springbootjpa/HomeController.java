package com.sk.springbootjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.springbootjpa.models.Coder;

@Controller
public class HomeController {

	@Autowired
	CoderRepo repo;

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	// SELECT * FROM CODERS
	@RequestMapping("showCodersFromDB")
	public String showCodersFromDB(Model m) {
		m.addAttribute("result", repo.findAll());
		return "result";
	}

	// SELECT * FROM CODERS WHERE CID=?
	@RequestMapping("getById")
	public String getById(@RequestParam int cid, Model m) {
		m.addAttribute("result", repo.getOne(cid));
		return "result";
	}

	// SELECT * FROM CODERS WHERE NAME=? ORDER BY CID DESC ---- Query DSL (Method-1)
	@PostMapping("getByNameOrderByIdDesc")
	public String getByNameOrderByIdDesc(@RequestParam String cname, Model m) {
		m.addAttribute("result", repo.findByCnameOrderByCidDesc(cname));
		return "result";
	}

	// SELECT * FROM CODERS WHERE NAME=? ORDER BY CID DESC ---- Query Annotation
	// (Method-2)
	@PostMapping("getByNameOrderByIdDescQueryAnnotation")
	public String getByNameOrderByIdDescQueryAnnotation(@RequestParam String cname, Model m) {
		m.addAttribute("result", repo.find(cname));
		return "result";
	}

	// INSERT INTO CODERS VALUES(?,?)
	@PostMapping("addCoderInfo")
	String addCoder(@ModelAttribute Coder c) {
		repo.save(c);
		return "result";
	}

}
