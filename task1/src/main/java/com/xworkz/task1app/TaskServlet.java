package com.xworkz.task1app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/tolearn")
public class TaskServlet extends HttpServlet {
	
	
	public TaskServlet() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get in task");
		
		String data = "displaying do get method";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do post in task");
		
		String data = "displaying do post method";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do put in task");
		
		String str = "displaying do put method";
		PrintWriter writer = resp.getWriter();
		writer.print(str);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do delete in task");
		
		String ref = "displaying do put method";
		PrintWriter writer = resp.getWriter();
		writer.print(ref);
		resp.setContentType("text/plain");
	}
	
	private void doPatch() {
		System.out.println("running do patch in task");
		
		String ref = "displaying do put method";
		//PrintWriter writer = resp.getWriter();
		//writer.print(ref);
		//resp.setContentType("text/plain");
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do options in task");
		
		String ref = "displaying do put method";
		PrintWriter writer = resp.getWriter();
		writer.print(ref);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do trace in task");
		
		String ref = "displaying do put method";
		PrintWriter writer = resp.getWriter();
		writer.print(ref);
		resp.setContentType("text/plain");
	}

}
