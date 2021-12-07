<%@page import="dbpackage.ConnectionProvider"%>
<%@page import="java.sql.*" %>
<%
    String email=session.getAttribute("email").toString();
    String securityQuestion=request.getParameter("securityQuestion");
    String newAnswer=request.getParameter("newAnswer");
    String password=request.getParameter("password");
    int check=0;
    try{
        Connection con=ConnectionProvider.getconnection(session);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select *from usersd where email='"+email+"' and password='"+password+"'");
        while(rs.next()){
            check=1;
            st.executeUpdate("update usersd set securityQuestion='"+securityQuestion+"',answer='"+newAnswer+"' where email='"+email+"' ");
            response.sendRedirect("changeSecurityQuestion.jsp?msg=done");
        }
        if(check==0)
            response.sendRedirect("changeSecurityQuestion.jsp?msg=wrong");
    }
    catch(Exception e){
       // response.sendRedirect("changeSecurityQuestion.jsp?msg=wrong");
        System.out.println(e);
    }
%>