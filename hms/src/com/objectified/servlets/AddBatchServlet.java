package com.objectified.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.objectified.dao.AddBatchDBUtil;
import com.objectified.dto.Batch;

/**
 * Servlet implementation class addBatchServlet
 */
@WebServlet("/addBatchServlet")
public class AddBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String batchId = request.getParameter("batchNo");
		String course = request.getParameter("courseId");
		String date = request.getParameter("date");
		int week = Integer.parseInt(request.getParameter("week"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		System.out.println(week);
		java.util.Date d = null;
		try
		{
			d = sdf.parse(date);

			Date actualDate = new Date(d.getTime());

			PrintWriter out = response.getWriter();

			AddBatchDBUtil.addBatch(new Batch(batchId, course, actualDate, week));
			out.print("Success");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		
	}

}
