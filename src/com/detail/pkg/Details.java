package com.detail.pkg;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class Details extends HttpServlet {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nam=request.getParameter("uname");
        
	
        out.println("<html><body>");
       
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost:3306/reg","root","balrampur");

        PreparedStatement ps=con.prepareStatement("select * from fullregp where uid = ? ");


        ps.setString(1, nam);
        ResultSet rs=ps.executeQuery();
        
        out.println("<table border=1 width=50% height=50%>");
        out.println("<tr><th>NAME</th><th>SEX</th><th>FATHER'S NAME</th><th>CONTACT NO></th><th>CGPA</th><tr>");
        while (rs.next()) {
            String n = rs.getString("fname");
            String nm = rs.getString("sex");
            String s = rs.getString("guardianname"); 
            String contct = rs.getString("cn");
            String cgpa= rs.getString("CGPA");
            out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>" + contct + "</td><td>" +cgpa + "</td></tr>"); 
        }
        out.println("</table>");
        out.println("</html></body>");
        con.close();
        
        
         
          
        
        }
        catch(Exception se)
        {
        	 out.println("error");
        }
	
      }
  }