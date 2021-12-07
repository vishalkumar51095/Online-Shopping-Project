package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbpackage.ConnectionProvider;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
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

      out.write('\n');
      out.write('\n');
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
      out.write("        ");
String email=session.getAttribute("email").toString();
      out.write("\r\n");
      out.write("    \r\n");
      out.write("            <center><h2>Online shopping (Deepak Mobile Trade Limited)</h2></center>\r\n");
      out.write("            <h2><a href=\"\">");
out.println(email);
      out.write(" <i class='fas fa-user-alt'></i></a></h2>\r\n");
      out.write("            <a href=\"home.jsp\">Home<i class=\"fa fa-institution\"></i></a>\r\n");
      out.write("            <a href=\"myCart.jsp\">My Cart<i class='fas fa-cart-arrow-down'></i></a>\r\n");
      out.write("            <a href=\"\">My Orders  <i class='fab fa-elementor'></i></a>\r\n");
      out.write("            <a href=\"\">Change Details <i class=\"fa fa-edit\"></i></a>\r\n");
      out.write("            <a href=\"\">Message Us <i class='fas fa-comment-alt'></i></a>\r\n");
      out.write("            <a href=\"\">About <i class=\"fa fa-address-book\"></i></a>\r\n");
      out.write("            <a href=\"logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("            <div class=\"search-container\">\r\n");
      out.write("            <form action=\"searchHome.jsp\" method=\"post\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"Search\" name=\"search\">\r\n");
      out.write("                <button type=\"submit\"> <i class=\"fa fa-search\"></i></button>\r\n");
      out.write("            </form>      \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write('\n');
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Deepak Mobile trade limited</p>\r\n");
      out.write("      </div>");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Home</title>\n");
      out.write("<style>\n");
      out.write("h3\n");
      out.write("{\n");
      out.write("\tcolor: yellow;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"color: white; text-align: center; font-size: 30px;\">Home <i class=\"fa fa-institution\"></i></div>\n");
String msg=request.getParameter("msg"); 
  if("added".equals(msg))
  {

      out.write("\n");
      out.write("<h3 class=\"alert\">Product added successfully!</h3>\n");
}
      out.write('\n');
if("exist".equals(msg))
  {

      out.write("\n");
      out.write("<h3 class=\"alert\">Product already exist in you cart! Quantity  increased!</h3>\n");
}
      out.write('\n');
if("invalid".equals(msg))
  {

      out.write("\n");
      out.write("<h3 class=\"alert\">Some thing went wrong!Try again!</h3>\n");
}
      out.write("\n");
      out.write("<table>\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th scope=\"col\">ID</th>\n");
      out.write("            <th scope=\"col\">Name</th>\n");
      out.write("            <th scope=\"col\">Category</th>\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i> Price</th>\n");
      out.write("            <th scope=\"col\">Add to cart <i class='fas fa-cart-plus'></i></th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");

    try{
        Connection con=ConnectionProvider.getconnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select *from product where active='Yes'" );
        while(rs.next())
        {

      out.write("\n");
      out.write("\n");
      out.write("          <tr>\n");
      out.write("              <td>");
      out.print(rs.getString(1));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.print(rs.getString(2));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.print(rs.getString(3));
      out.write(" </td>\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(4));
      out.write("  </i></td>\n");
      out.write("            <td><a href=\"addToCartAction.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">Add to cart <i class='fas fa-cart-plus'></i></a></td>\n");
      out.write("          </tr>\n");

        }
        }
catch(Exception e)
{
        System.out.println(e);
}

      out.write("\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("</body>\n");
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
