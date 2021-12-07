<%@page  import="dbpackage.ConnectionProvider"%>
<%@page  import="java.sql.*" %>
<%
  String email=request.getParameter("email");
  String password=request.getParameter("password");
  if(("vishalkumar51095@gmail.com".equals(email))&& ("12345".equals(password)))
  {
      session.setAttribute("email",email);
      response.sendRedirect("admin/adminHome.jsp");
  }
  else
  {
      int z=0;
      try{
          Connection con=ConnectionProvider.getconnection(session);
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select *from usersd where email='"+email+"' and password='"+password+"' ");
          while(rs.next())
          {    z=1;
              session.setAttribute("email",email);
              response.sendRedirect("home.jsp");
          }
          if(z==0){
              response.sendRedirect("login.jsp?msg=notexist"); 
          }
          
      }
      catch(Exception e){
           System.out.print(e);
           response.sendRedirect("login.jsp?msg=invalid"); 
          
      }
  }

%>