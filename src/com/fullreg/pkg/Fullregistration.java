package com.fullreg.pkg;



import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class Fullregistration extends HttpServlet {
    

	/**
	 * 
	 */
	private static final long serialVersionUID = 3378574867948449095L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String ud= request.getParameter("uid");
        String fname= request.getParameter("fname");
        String lname = request.getParameter("lname");
        String gender = request.getParameter("gender");
        String birthday_month = request.getParameter("birthday_month");
        String birthday_day= request.getParameter("birthday_day");
        String birthday_year= request.getParameter("birthday_year");
        String gname = request.getParameter("gname");
        String gcn = request.getParameter("gcn");
        String pa1 = request.getParameter("pa1");
        String pa2 = request.getParameter("pa2");
        String cy = request.getParameter("cy");
        String st = request.getParameter("st");
        String email = request.getParameter("em");
        String pta1 = request.getParameter("pta1");
        String pta2= request.getParameter("pta2");
        String pcy= request.getParameter("pcy");
        String pst= request.getParameter("pst");
        String cn= request.getParameter("cn");
        String acn= request.getParameter("acn");
        String wbjee= request.getParameter("wbjee");
        String aieee= request.getParameter("aieee");
        String backlog= request.getParameter("backlog");
        String backlogclear= request.getParameter("backlogclear");
        String board= request.getParameter("board");
        String otherboard= request.getParameter("otherboard");
        String schoolname10= request.getParameter("schoolname10");
        String medium10= request.getParameter("medium10");
        String totalmarks10= request.getParameter("totalmarks10");
        String maxmarks10= request.getParameter("maxmarks10");
        String percent10= request.getParameter("percent10");
        String yearofpassing= request.getParameter("yearofpassing");
        String board12= request.getParameter("board12");
        String otherboard12= request.getParameter("otherboard12");
        String schoolname12= request.getParameter("schoolname12");
        String medium12= request.getParameter("medium12");
        String totalmarks12= request.getParameter("totalmarks12");
        String maxnumber12= request.getParameter("maxnumber12");
        String percent12= request.getParameter("percent12");
        String physics= request.getParameter("physics");
        String chemistry= request.getParameter("chemistry");
        String maths= request.getParameter("maths");
        String pcmtotal= request.getParameter("pcmtotal");
        String pcmtotalpercent= request.getParameter("pcmtotalpercent");
        String yeargap= request.getParameter("yeargap");
        String yearofpassing12= request.getParameter("yearofpassing12");
        String university= request.getParameter("university");
        String currentsemester= request.getParameter("currentsemester");
        String sgpa1= request.getParameter("SGPA1");
        String sgpa2= request.getParameter("SGPA2");
        String sgpa3= request.getParameter("SGPA3");
        String sgpa4= request.getParameter("SGPA4");
        String sgpa5= request.getParameter("SGPA5");
        String sgpa6= request.getParameter("SGPA6");
        String sgpa7= request.getParameter("SGPA7");
        String sgpa8= request.getParameter("SGPA8");
        String cgpa= request.getParameter("CGPA");
        String cgpapercent= request.getParameter("CGPApercent");
        String ygap= request.getParameter("ygap");
        String exptyearofpassing= request.getParameter("exptyearofpassing");
        String course= request.getParameter("course");
        String institute= request.getParameter("institute");
        String month= request.getParameter("month");
        String day= request.getParameter("day");
        String year= request.getParameter("year");
        String end_month= request.getParameter("end_month");
        String end_day= request.getParameter("end_day");
        String end_year= request.getParameter("end_year");

        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost:3306/reg","root","balrampur");

        PreparedStatement ps=con.prepareStatement
        		("INSERT INTO reg.fullregp (fname,lname,sex,birthday_month,birthday_day,birthday_year,guardianname,gcn,presentaddress1,presentaddress2,presentcity,presentstate,permanetadd1,permanentadd2,permanentcity,permanentstate,cn,acontactno,wbjee,aieee,backlog,backlogclear,board,otherboard,schoolname10,medium10,totalmarks10,maxmarks10,percent10,yearofpassing10,board12,otherboard12,schoolname12,medium12,totalmarks12,maxnumber12,percent12,physics,chemistry,maths,pcmtotal,pcmtotalpercent,yeargap,yearofpassing12,university,currentsemester,SGPA1,SGPA2,SGPA3,SGPA4,SGPA5,SGPA6,SGPA7,SGPA8,CGPA,CGPApercent,exptyearofpassing,course,institute,month,day,year,end_month,end_day,end_year,ygap,email,uid) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");


       
      
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3, gender);
        ps.setString(4, birthday_month);
        ps.setString(5,birthday_day);
        ps.setString(6,birthday_year);
        ps.setString(7,gname );
        ps.setString(8, gcn);
        ps.setString(9, pa1);
        ps.setString(10,pa2);
        ps.setString(11, cy);
        ps.setString(12, st);
        ps.setString(13, pta1);
        ps.setString(14, pta2);
        ps.setString(15, pcy);
        ps.setString(16,pst);
        ps.setString(17, cn);
        ps.setString(18,acn);
        ps.setString(19, wbjee);
        ps.setString(20, aieee);
        ps.setString(21, backlog);
        ps.setString(22,backlogclear);
        ps.setString(23, board);
        ps.setString(24,otherboard);
        ps.setString(25, schoolname10);
        ps.setString(26, medium10);
        ps.setString(27, totalmarks10);
        ps.setString(28, maxmarks10);
        ps.setString(29, percent10);
        ps.setString(30, yearofpassing);
        ps.setString(31, board12);
        ps.setString(32, otherboard12);
        ps.setString(33, schoolname12);
        ps.setString(34, medium12);
        ps.setString(35, totalmarks12);
        ps.setString(36, maxnumber12);
        ps.setString(37, percent12);
        ps.setString(38, physics);
        ps.setString(39, chemistry);
        ps.setString(40, maths);
        ps.setString(41, pcmtotal);
        ps.setString(42, pcmtotalpercent);
        ps.setString(43, yeargap);
        ps.setString(44, yearofpassing12);
        ps.setString(45, university);
        ps.setString(46, currentsemester);
        ps.setString(47, sgpa1);
        ps.setString(48, sgpa2);
        ps.setString(49, sgpa3);
        ps.setString(50, sgpa4);
        ps.setString(51, sgpa5);
        ps.setString(52, sgpa6);
        ps.setString(53, sgpa7);
        ps.setString(54, sgpa8);
        ps.setString(55, cgpa);
        ps.setString(56, cgpapercent);
        ps.setString(57, exptyearofpassing);
        ps.setString(58, course);
        ps.setString(59, institute);
        ps.setString(60,month);
        ps.setString(61, day);
        ps.setString(62, year);
        ps.setString(63, end_month);
        ps.setString(64, end_day);
        ps.setString(65,end_year);
        ps.setString(66, ygap);
        ps.setString(67, email);
        ps.setString(68,ud);
        
      
        int i=ps.executeUpdate();
        
          if(i>0)
          {
            out.println("You are sucessfully registered");
            RequestDispatcher rd=request.getRequestDispatcher("displaydetails.html");  
            rd.forward(request,response); 
          }
          else{
        	  
        	  out.println("<p style=\"color:red\">!!Please Enter Correct Unique ID!! Registration Failed</p>"); 
        	
          }
          
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }
