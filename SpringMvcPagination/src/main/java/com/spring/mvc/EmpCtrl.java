package com.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Emp;
import com.spring.mvc.service.EmpServ;

@Controller
public class EmpCtrl {

	@Autowired
	EmpServ eserv;

	@RequestMapping(value = "/init/{page_id}", method = RequestMethod.GET)
	public ModelAndView paginate(@PathVariable int page_id, Model model) {
		System.out.println("PageID : " + page_id);
		int pageId = page_id;
		int total = 5;
		if (page_id == 1) {
		} else {
			page_id = (page_id - 1) * total + 1;
		}
		List<Emp> list = eserv.getEmployeesByPage(page_id, total);
		model.addAttribute("pageId", pageId);
		return new ModelAndView("welcome", "list", list);
	}

	@RequestMapping(value = "/navig/{type}/{pageId}", method = RequestMethod.GET)
	public ModelAndView navigate(@PathVariable String type, @PathVariable int pageId, Model model) {
		System.out.println("Navigation Type : " + type + " PageId : " + pageId);
		int page_id = pageId;
		int total = 5;
		if ("next".equalsIgnoreCase(type)) {
			++page_id;
		}
		if ("prev".equalsIgnoreCase(type) && page_id > 1) {
			--page_id;
		}
		model.addAttribute("pageId", page_id);
		page_id = (page_id - 1) * total + 1;
		System.out.println("Page_Id : " + page_id + " Total : " + total);
		List<Emp> list = eserv.getEmployeesByPage(page_id, total);

		return new ModelAndView("welcome", "list", list);
	}
}