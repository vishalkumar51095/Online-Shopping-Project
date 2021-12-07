<%@page  import="dbpackage.ConnectionProvider"%>
<%@page  import="java.sql.*" %>
<%
  String id=request.getParameter("id");
  String name=request.getParameter("name");
  String category=request.getParameter("category");
  String price =request.getParameter("price");
  String active=request.getParameter("active");
  //System.out.println(id+" "+name+" "+category+" "+price+" "+active);
  try{
      Connection con=ConnectionProvider.getconnection(session);
      Statement st=con.createStatement();
      st.executeUpdate("Update product set name='"+name+"',category='"+category+"',price='"+price+"',active='"+active+"' where id='"+id+"' ");//comma error
      if(active.equals("No"))
      { 
          st.executeUpdate("delete from cart where product_id='"+id+"' and address is NULL");
      }
      response.sendRedirect("allProductEditProduct.jsp?msg=done");
  }
  catch(Exception e){
      System.out.print(e);
      response.sendRedirect("allProductEditProduct.jsp?msg=wrong");
  }
  %>
  