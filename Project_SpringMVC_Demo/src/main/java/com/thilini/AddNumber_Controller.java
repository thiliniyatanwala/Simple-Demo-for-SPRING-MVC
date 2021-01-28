package com.thilini;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thilini.Service.AddService;


@Controller
public class AddNumber_Controller {
	@RequestMapping("/addNum")
/* public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2")); */
		//int k = i +j;
	
		// **** but we dont need to fetch t1 and t2 from HttpsServletrequest. 
		//*****  Instead we can fetch them and assign to i and j on the go Using @requestParam annotation
		
		
		public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request, HttpServletResponse response){
		
		
		
		//-------------------------------//
		AddService as = new AddService();
		int k = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", k);
		return mv;
		
		//------------------------------//
	}
}
