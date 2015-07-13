package com.reg.pkg;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class Register extends HttpServlet {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String uid = request.getParameter("t1");
        String rollno = request.getParameter("t2");
        String email = request.getParameter("t4");
        String pass = request.getParameter("t6");
        String mobile = request.getParameter("t7");
        
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost:3306/reg","root","balrampur");

        PreparedStatement ps=con.prepareStatement
        		("UPDATE reg.student SET rollno=?, email=?, pass=?, mobile=? WHERE uid=?");



       
        ps.setString(1, rollno);
        ps.setString(2, email);
        ps.setString(3, pass);
        ps.setString(4, mobile);
        ps.setString(5, uid);
        int i=ps.executeUpdate();
        
          if(i>0)
          {
            out.println("You are sucessfully registered");
          }
          else{
        	  
        	  out.print("<p style=\"color:red\">!!Please Enter Correct Unique ID!! Registration Failed</p>"); 
        	  RequestDispatcher rd=request.getRequestDispatcher("registration.html");  
              rd.include(request,response); 
          }
          
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }
