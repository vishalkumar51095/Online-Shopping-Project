<%@page import="dbpackage.ConnectionProvider"%>
<%@page import="java.sql.*" %>
<%
String email=session.getAttribute("email").toString();
String mobileNumber=request.getParameter("mobileNumber");
String password=request.getParameter("password");
int check=0;
try
{
    Connection con=ConnectionProvider.getconnection(session);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select *from usersd where email='"+email+"' and password='"+password+"'");
   while(rs.next())
{
   check=1;
   st.executeUpdate("update usersd set mobileNumber='"+mobileNumber+"' where email='"+email+"'");
   response.sendRedirect("changeMobileNumber.jsp?msg=done");
}
}
catch(Exception e){
    out.println(e);
    response.sendRedirect("changeMobileNumber.jsp?msg=done");
}
%>