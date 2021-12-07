<%@page  import="dbpackage.ConnectionProvider"%>
<%@page  import="java.sql.*" %>

<%

String email=request.getParameter("email");
String mobileNumber=request.getParameter("mobileNumber");
String securityQuestion=request.getParameter("securityQuestion");
String answer=request.getParameter("answer");
String newPassword=request.getParameter("newPassword");

int check=0;
try{
    Connection con=ConnectionProvider.getconnection(session);
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select *from usersd where email='"+email+"' and mobileNumber='"+mobileNumber+"' and  securityQuestion='"+securityQuestion+"'and answer='"+answer+"' ");// Error:- newPassword
          while(rs.next())
          {    check=1;
            PreparedStatement ps=con.prepareStatement("update usersd set password=? where email=?");
            ps.setString(1,newPassword);
            ps.setString(2,email);
            ps.executeUpdate( );
            response.sendRedirect("forgotPassword.jsp?msg=done");// i got wrong in msg
          }
          if(check==0){
              response.sendRedirect("login.jsp?msg=invalid"); 
          }
}
catch(Exception e)
{
   System.out.println(e);
}
%>