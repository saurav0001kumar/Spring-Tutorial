package com.sk.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.springmvc.models.Coder;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	// ---Request Data from WebPage.------------------->

	// METHOD-1: Using HttpServletRequest & HttpSession
//	@RequestMapping("add")
//	public String add(HttpServletRequest req) {
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
//		int sum = a + b;
//
//		HttpSession session = req.getSession();
//		session.setAttribute("sum", sum);
//
//		return "sum.jsp";
//	}

	// METHOD-2: Using @RequestaParam & HttpSession
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, HttpSession session) {
//		int sum = a + b;
//		session.setAttribute("sum", sum);
//
//		return "sum.jsp";
//	}

	// METHOD-3: Using @RequestaParam & "ModelAndView" (excluded .jsp extension)
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b) {
//		int sum = a + b;
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("sum");
//		mv.addObject("sum", sum);
//
//		return mv;
//	}

	// METHOD-4: Using @RequestaParam & ModelMap OR Model
	@RequestMapping(value = "add", method = RequestMethod.GET) // OR @GetMapping("add")
	public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model m) {
		int sum = a + b;
		m.addAttribute("sum", sum);

		return "sum";
	}

	// ---Display details of a Model Class by getting input from WebPage.------->

	// Method-1:
//	@PostMapping("addCoderInfo")
//	public String addCoderInfo(@RequestParam("cid") int cid, @RequestParam("cname") String cname, Model m) {
//		Coder ob = new Coder();
//		ob.setCid(cid);
//		ob.setCname(cname);
//		m.addAttribute("coder", ob);
//		return "result";
//	}

	// Method-2: Using @ModelAttribute.
	@PostMapping("addCoderInfo")
	public String addCoderInfo(@ModelAttribute("coder") Coder c) {
		return "result";
	}

	// USING @ModelAttribute AT METHOD LEVEL:--------------------->
	// This will be called & initialized before all the @RequestMapping methods.

	@ModelAttribute
	public void initializeModelData(Model m) {
		m.addAttribute("initialName", "Vishnu");
	}

}
