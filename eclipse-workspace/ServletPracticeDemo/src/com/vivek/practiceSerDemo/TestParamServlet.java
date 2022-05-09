package com.vivek.practiceSerDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step 1: set content type
		response.setContentType("text/html");
		
		// Step 2: get Printwriter
		PrintWriter out = response.getWriter();
		
		// Step 3: read configuration params
		ServletContext context = getServletContext(); // inherit from HttpServlet
		String maxCartSize = context.getInitParameter("max-shopping-cart-size");
		String teamName = context.getInitParameter("project-team-name");
		
		//READ PER-SERVLET parameter
		String theGreetingMessage = getInitParameter("greeting");
		String theServiceLevel = getInitParameter("serviceLevel");
		
		
		//Step 4: generate HTML content
		out.println("<html><body>");
		out.println("Max cart: " + maxCartSize);
		out.println("<br/><br/>");
		out.println("Team Name: " + teamName);
		out.println("<hr>");
		out.println("Per Servlet Params<br/><br/>");
		out.println("greeting: " + theGreetingMessage);
		out.println("<br/><br/>");
		out.println("serviceLevel: " + theServiceLevel);
		out.println("</body></html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
