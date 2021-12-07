package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbpackage.ConnectionProvider;
import java.sql.*;

public final class changeDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/changeDetailsHeader.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<link rel=\"stylesheet\" href=\"css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("            <center><h2>Change Details<i class=\"fa fa-edit\"></i></h2></center>\r\n");
      out.write("             ");
String email=session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("            <h2><a href=\"home.jsp\"><i class='fas fa-arrow-circle-left'>Back</i></a></h2>\r\n");
      out.write("             <h2><a href=\"\">Your Profile(");
out.println(email);
      out.write(") <i class='fas fa-user-alt'></i></a></h2>\r\n");
      out.write("            <a href=\"changePassword.jsp\">Change Password <i class='fas fa-key'></i></a>\r\n");
      out.write("            <a href=\"\">Add or change Address <i class='fas fa-map-marker-alt'></i></a>\r\n");
      out.write("            <a href=\"\">Change Security Question <i class=\"fa fa-repeat\"></i></a>\r\n");
      out.write("            <a href=\"\">Change Mobile Number <i class='fas fa-phone'></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write('\r');
      out.write('\n');
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Deepak Mobile trade limited</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changeDetails.css\">\r\n");
      out.write("<title>Change Details</title>\r\n");
      out.write("<style>\r\n");
      out.write("hr\r\n");
      out.write("{width:70%;}</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    try{
Connection con=ConnectionProvider.getconnection();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from usersd where email='"+email+"' ");
while(rs.next()){
    

      out.write("\r\n");
      out.write("<h3>Name:");
      out.print(rs.getString(1));
      out.write(" </h3>\r\n");
      out.write("<hr>\r\n");
      out.write(" <h3>Email:");
      out.print(rs.getString(2));
      out.write(" </h3>\r\n");
      out.write(" <hr>\r\n");
      out.write(" <h3>Mobile Number:");
      out.print(rs.getString(3));
      out.write(" </h3>\r\n");
      out.write(" <hr>\r\n");
      out.write("<h3>Security Question:");
      out.print(rs.getString(4));
      out.write(" </h3>\r\n");
      out.write("<hr>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");

    }}
catch(Exception e){
out.println(e);
}
      out.write("\r\n");
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
