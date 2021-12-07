package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbpackage.ConnectionProvider;
import java.sql.*;

public final class addNewProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/adminHeader.jsp");
    _jspx_dependants.add("/admin/../footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("        ");
String email=session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("            <center><h2>Online shopping (Deepak Mobile trade limited)</h2></center>\r\n");
      out.write("            <a href=\"addNewProduct.jsp\">Add New Product <i class='fas fa-plus-square'></i></a>\r\n");
      out.write("            <a href=\"allProductEditProduct.jsp\">All Products & Edit Products <i class='fab fa-elementor'></i></a>\r\n");
      out.write("            <a href=\"\">Messages Received <i class='fas fa-comment-alt'></i></a>\r\n");
      out.write("            <a href=\"\">Orders Received <i class=\"fas fa-archive\"></i></a>\r\n");
      out.write("            <a href=\"\">Cancel Orders <i class='fas fa-window-close'></i></a>\r\n");
      out.write("            <a href=\"\">Delivered Orders <i class='fas fa-dolly'></i></a>\r\n");
      out.write("            <a href=\"\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write('\r');
      out.write('\n');
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Deepak Mobile trade limited</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/addNewProduct-style.css\">\r\n");
      out.write("<title>Add New Product</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
 String msg=request.getParameter("msg");
       if("done".equals(msg)){
     
      out.write("\r\n");
      out.write("<h3 class=\"alert\">Product Added Successfully!</h3>\r\n");
}
      out.write("\r\n");
      out.write("    ");
 
       if("wrong".equals(msg)){
     
      out.write("\r\n");
      out.write("<h3 class=\"alert\">Some thing went wrong! Try Again!</h3>\r\n");
}
      out.write('\r');
      out.write('\n');

 int id=1;
 try{
      Connection con=ConnectionProvider.getconnection();
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select max(id) from product ");
          while(rs.next())
          {   id=rs.getInt(1);
              id=id+1;
             
          }
        
 }
 catch(Exception e){
     System.out.print(e);
 }


      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"addNewProductAction.jsp\" method=\"post\">\r\n");
      out.write("<h3 style=\"color: yellow;\">Product ID: ");
out.println(id);
      out.write(" </h3>\r\n");
      out.write("<input type=\"hidden\" name=\"id\" value =\"");
out.println(id);
      out.write(" \">\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write(" <h3>Enter Name</h3>\r\n");
      out.write(" <input class=\"input-style\" type=\"text\" name=\"name\" placeholder=\"Enter name\" required>\r\n");
      out.write(" \r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Enter Category</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"category\" placeholder=\"Enter category\" required>\r\n");
      out.write(" \r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Enter Price</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"number\" name=\"price\" placeholder=\"Enter Price\" required>\r\n");
      out.write(" \r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Active</h3>\r\n");
      out.write("<select class=\"input-style\" name=\"active\">\r\n");
      out.write("    <option value=\"Yes\"> Yes </option> \r\n");
      out.write("    <option value=\"No\"> No </option> \r\n");
      out.write("</select>\r\n");
      out.write("   \r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("<button class =\"button\"> Save <i class='far fa-arrow-alt-circle-right'></i></button>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
