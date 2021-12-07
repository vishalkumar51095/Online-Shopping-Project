<%@page import="dbpackage.ConnectionProvider"%>
<%@page import="java.sql.*" %>
<%
String email=session.getAttribute("email").toString();
String subject=request.getParameter("subject");
String body=request.getParameter("body");
String Id=request.getParameter("Id");
try{
    Connection con=ConnectionProvider.getconnection(session);
    PreparedStatement ps=con.prepareStatement("insert into message(Id,email,subject,body) values(MESSAGE_SEQ.nextval,?,?,?)");
    //ps.setString(1,Id);
    ps.setString(1,email);
    ps.setString(2,subject);
    ps.setString(3,body);
    ps.executeUpdate();
    response.sendRedirect("messageUs.jsp?msg=valid");    
}
catch(Exception e){
     out.println(e);
    response.sendRedirect("messageUs.jsp?msg=invalid");  
}
%>