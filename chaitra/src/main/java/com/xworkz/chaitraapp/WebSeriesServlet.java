package com.xworkz.chaitraapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/towatch")
public class WebSeriesServlet extends HttpServlet {
	
	
	public WebSeriesServlet() {
		System.out.println("created" + this.getClass().getSimpleName());
		
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init ....config...");
	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do Get in webseries servlet");
		System.out.println(Thread.currentThread().getName());
		String name = req.getParameter("Name");
		String platform = req.getParameter("platform");
		String language = req.getParameter("language");
		String episode = req.getParameter("episode");
		String budjet = req.getParameter("budjet");
		
		System.out.println(name);
		System.out.println(platform);
		System.out.println(language);
		System.out.println(episode);
		System.out.println(budjet);
	
	
	PrintWriter writer = resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h1>");
	writer.print("<span style = 'color:blue'>");
	writer.print("Name" + name +"is sent successfully.");
	writer.print("</span");
	writer.print("</h1>");
	writer.print("</body>");
	writer.print("</html>");
	resp.setContentType("text/html");
	
	

}
}