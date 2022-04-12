package com.sk.springorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.springorm.dao.CoderDAO;
import com.sk.springorm.models.Coder;

@Controller
public class HomeController {

	@Autowired
	private CoderDAO dao;

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	// SELECT rows from DB.
	@GetMapping("getCoderInfo")
	public String addCoderInfo(Model m) {

		m.addAttribute("result", dao.getCoders());
		return "getCoders";
	}

	// Insert Rows in Database.
	@PostMapping("addCoderInfo")
	public String addCoderInfo(@ModelAttribute("result") Coder c) {

		dao.addCodertoDB(c);
		return "showCoders";
	}

	// To display only one selected row by "cid".
	@PostMapping("displaySelectedRowByCid")
	public String getOneRow(@RequestParam int cid, Model m) {
		m.addAttribute("result", dao.getOneCoder(cid));
		return "getCoders";
	}

}
