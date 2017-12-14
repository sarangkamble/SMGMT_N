package com.servletStore.settings.standard.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletStore.settings.school.model.SchoolPOJO;
import com.servletStore.settings.standard.model.StandardDAO;
import com.servletStore.settings.standard.model.StandardImpl;
import com.servletStore.settings.standard.model.StandardPOJO;

public class StdSectionAssignment extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String stds[] = request.getParameterValues("stds");
		String schoolId = request.getParameter("schoolId");
		String sectionId = request.getParameter("sectionId");
		StandardDAO stdDao = new StandardImpl();
		StandardPOJO stdPojo = new StandardPOJO();
		int insertSuccess=0;
		
		for(String x:stds){
			stdPojo.setStdId(Integer.parseInt(x));
			insertSuccess = stdDao.addClass(stdPojo, schoolId, sectionId);
		}
		
		if(insertSuccess>0){
			System.out.println("insertSuccess : "+insertSuccess);
		}
		
		response.sendRedirect("View/Settings/standard/stdSectionAssignment.jsp");
	}

}
