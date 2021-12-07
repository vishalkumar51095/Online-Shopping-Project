package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbpackage.ConnectionProvider;
import java.sql.*;

public final class myCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Deepak Mobile trade limited</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>My Cart</title>\r\n");
      out.write("<style>\r\n");
      out.write("h3\r\n");
      out.write("{\r\n");
      out.write("\tcolor: yellow;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"color: white; text-align: center; font-size: 30px;\">My Cart <i class='fas fa-cart-arrow-down'></i></div>\r\n");
 
    String msg=request.getParameter("msg");
    if("notPossible".equals(msg))
    {

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3 class=\"alert\">There is only one Quantity! So click on remove!</h3>\r\n");
}
      out.write('\r');
      out.write('\n');

    if("inc".equals(msg))
    {

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Quantity  Increased Successfully!</h3>\r\n");
}
      out.write('\r');
      out.write('\n');

    if("dec".equals(msg))
    {

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Quantity  Decreased Successfully!</h3>\r\n");
}
      out.write('\r');
      out.write('\n');

    if("removed".equals(msg))
    {

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Product Successfully Removed!</h3>\r\n");
}
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<thead>\r\n");
      out.write("    ");
    
        int total=0;
        int sno=0;
        try
        {
            Connection con=ConnectionProvider.getconnection();
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select sum(total) from cart where email='"+email+"' and address is NULL");
             while(rs1.next())
             {
                 total=rs1.getInt(1);
             }     

      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th scope=\"col\" style=\"background-color: yellow;\">Total: <i class=\"fa fa-inr\"></i>");
out.println(total);
      out.write(" </th>\r\n");
      out.write("            ");
if(total>0){
      out.write("<th scope=\"col\"><a href=\"addressPaymentForOrder.jsp\">Proceed to order</a></th>");
}
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        \r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("          <th scope=\"col\">S.No</th>\r\n");
      out.write("            <th scope=\"col\">Product Name</th>\r\n");
      out.write("            <th scope=\"col\">Category</th>\r\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i> price</th>\r\n");
      out.write("            <th scope=\"col\">Quantity</th>\r\n");
      out.write("            <th scope=\"col\">Sub Total</th>\r\n");
      out.write("            <th scope=\"col\">Remove <i class='fas fa-trash-alt'></i></th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("      ");

          PreparedStatement st1=con.prepareStatement("select * from product inner join cart on product.id=cart.product_id and cart.email=? and cart.address is NULL");
          st1.setString(1,email);
          ResultSet rs=st1.executeQuery();
          while(rs.next())
          {
      
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("              ");
sno=sno+1;
      out.write("\r\n");
      out.write("              <td>");
out.println(sno);
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(4));
      out.write(" </td>\r\n");
      out.write("            <td><a href=\"incDecQuantityAction.jsp?id=");
      out.print(rs.getString(1));
      out.write("&quantity=inc\"><i class='fas fa-plus-circle'></i></a> ");
      out.print(rs.getString(8));
      out.write("  <a href=\"incDecQuantityAction.jsp?id=");
      out.print(rs.getString(1));
      out.write("&quantity=dec\"><i class='fas fa-minus-circle'></i></a></td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(10));
      out.write(" </td>\r\n");
      out.write("            <td><a href=\"removeFromCart.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">Remove <i class='fas fa-trash-alt'></i></a></td>\r\n");
      out.write("          </tr>\r\n");

    }
}
catch(Exception e)
{
 out.println(e);
}

      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
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
