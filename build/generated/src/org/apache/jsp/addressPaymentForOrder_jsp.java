package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbpackage.ConnectionProvider;
import java.sql.*;

public final class addressPaymentForOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Deepak Mobile trade limited</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/addressPaymentForOrder-style.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<script>\r\n");
      out.write("   if(window.history.forwart(1)!=null)\r\n");
      out.write("   {\r\n");
      out.write("       window.history.forward(1);\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<table>\r\n");
      out.write("<thead>\r\n");
      out.write("    ");

        String email=session.getAttribute("email").toString();
        int total=0;
        int sno=0;
        try{
            Connection con=ConnectionProvider.getconnection();
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select sum(total) from cart where email='"+email+"' and address is NULL");
             while(rs1.next()){
                 total=rs1.getInt(1);
             }     

      out.write("\r\n");
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("          <th scope=\"col\"><a href=\"myCart.jsp\"><i class='fas fa-arrow-circle-left'> Back</i></a></th>\r\n");
      out.write("            <th scope=\"col\" style=\"background-color: yellow;\">Total: <i class=\"fa fa-inr\">");
out.println(total);
      out.write("</i> </th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <thead>\r\n");
      out.write("            \r\n");
      out.write("          <tr>\r\n");
      out.write("          <th scope=\"col\">S.No</th>\r\n");
      out.write("            <th scope=\"col\">Product Name</th>\r\n");
      out.write("            <th scope=\"col\">Category</th>\r\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i> price</th>\r\n");
      out.write("            <th scope=\"col\">Quantity</th>\r\n");
      out.write("            <th scope=\"col\">Sub Total</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("         ");

          PreparedStatement st1=con.prepareStatement("select * from product inner join cart on product.id=cart.product_id and cart.email=? and cart.address is NULL");
          st1.setString(1,email);
          ResultSet rs=st1.executeQuery();
          while(rs.next())
          {
      
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
sno=sno+1;
      out.write("\r\n");
      out.write("           <td>");
out.println(sno);
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("            <td> ");
      out.print(rs.getString(8));
      out.write(" </td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
            ResultSet rs2=st.executeQuery("select *from usersd where email='"+email+"'");
              while(rs2.next())
                {
            
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      \r\n");
      out.write("<hr style=\"width: 100%\">\r\n");
      out.write("<form action=\"addressPaymentForOrderAction.jsp\" method=\"post\">\r\n");
      out.write(" <div class=\"left-div\">\r\n");
      out.write(" <h3>Enter Address</h3>\r\n");
      out.write(" <input class=\"input-style\" type=\"text\" name=\"address\" value=\"");
      out.print(rs2.getString(7));
      out.write("\" placeholder=\"Enter Address\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Enter city</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"city\" value=\"");
      out.print(rs2.getString(8));
      out.write("\" placeholder=\"Enter City\" required>\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Enter State</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"state\" value=\" ");
      out.print(rs2.getString(9));
      out.write("\" placeholder=\"Enter State\" required>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Enter country</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"country\" value=\"");
      out.print(rs2.getString(10));
      out.write("\" placeholder=\"Enter country\" required>\r\n");
      out.write("</div>\r\n");
      out.write("<h3 style=\"color: red\">*If there is no address its mean that you did not set you address!</h3>\r\n");
      out.write("<h3 style=\"color: red\">*This address will also updated to your profile</h3>\r\n");
      out.write("<hr style=\"width: 100%\">\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Select way of Payment</h3>\r\n");
      out.write("<select class=\"input-style\" method=\"post\">\r\n");
      out.write("    <option value=\"Cash on delivery(COD)\">Cash on delivery(COD)</option>\r\n");
      out.write("    <option value=\"Online Payment\"> Online Payment </option>\r\n");
      out.write("</select>\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Pay online on this deepakmobile@gmail.com</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"transactionId\"  placeholder=\"Enter Transaction Id\" required>\r\n");
      out.write("<h3 style=\"color: red\">*If you select online Payment then enter you transaction ID here otherwise leave this blank</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<hr style=\"width: 100%\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("    <h3>Mobile Number</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"mobileNumber\" value=\"");
      out.print(rs2.getString(3));
      out.write("\" placeholder=\"Enter Mobile Number\" required>   \r\n");
      out.write("<h3 style=\"color: red\">*This mobile number will also updated to your profile</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3 style=\"color: red\">*If you enter wrong transaction id then your order will we can cancel!</h3>\r\n");
      out.write("<button class=\"button\" type=\"submit\"> Proceed to Generate Bill & Save<i class='far fa-arrow-alt-circle-right'></i></button>\r\n");
      out.write("<h3 style=\"color: red\">*Fill form correctly</h3>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");

}
}
catch(Exception e)
{
 out.println(e);
}

      out.write("\r\n");
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
