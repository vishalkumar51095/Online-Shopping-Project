<%@page  import="dbpackage.ConnectionProvider"%>
<%@page  import="java.sql.*" %>
<%
String email=session.getAttribute("email").toString();
String product_id=request.getParameter("id");
try{
    Connection con=ConnectionProvider.getconnection(session);
    PreparedStatement st=con.prepareStatement("delete from cart where email=? and product_id=? and address is NULL");
    st.setString(1,email);
    st.setString(2,product_id);
//Statement st=con.createStatement();
    st.executeUpdate();
    response.sendRedirect("myCart.jsp?msg=removed");
}
catch(Exception e){
    out.println(e);
}
%>
