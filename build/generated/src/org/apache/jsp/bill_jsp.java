package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbpackage.ConnectionProvider;
import java.sql.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bill.css\">\r\n");
      out.write("<title>Bill</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        String email=session.getAttribute("email").toString();
        try{
            int total=0;
            int sno=0;
            Connection con=ConnectionProvider.getconnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select sum(total) from cart where email='"+email+"' and status='bill'");
            while(rs.next()){
                total=rs.getInt(1);
            }
            ResultSet rs2=st.executeQuery("select *from usersd inner join cart on cart.email='"+email+"' and cart.status='bill'");
            while(rs2.next()){      
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Online shopping Bill (Deepak Mobile Pvt Lmt)</h3>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"left-div\"><h3>Name: ");
      out.print(rs2.getString(1));
      out.write(" </h3></div>\r\n");
      out.write("<div class=\"right-div-right\"><h3>Email: ");
out.println(email);
      out.write(" </h3></div>\r\n");
      out.write("<div class=\"right-div\"><h3>Mobile Number: ");
      out.print(rs2.getString(20));
      out.write("  </h3></div>  \r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\"><h3>Order Date: ");
      out.print(rs2.getString(21));
      out.write(" </h3></div>\r\n");
      out.write("<div class=\"right-div-right\"><h3>Payment Method: ");
      out.print(rs2.getString(23));
      out.write(" </h3></div>\r\n");
      out.write("<div class=\"right-div\"><h3>Expected Delivery: ");
      out.print(rs2.getString(22));
      out.write(" </h3></div> \r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\"><h3>Transaction Id:");
      out.print(rs2.getString(24));
      out.write("  </h3></div>\r\n");
      out.write("<div class=\"right-div-right\"><h3>City: ");
      out.print(rs2.getString(17));
      out.write("  </h3></div> \r\n");
      out.write("<div class=\"right-div\"><h3>Address: ");
      out.print(rs2.getString(16));
      out.write(" </h3></div> \r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\"><h3>State: ");
      out.print(rs2.getString(18));
      out.write(" </h3></div>\r\n");
      out.write("<div class=\"right-div-right\"><h3>Country: ");
      out.print(rs2.getString(19));
      out.write(" </h3></div>  \r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
break;}
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\t\r\n");
      out.write("<table id=\"customers\">\r\n");
      out.write("<h3>Product Details</h3>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>S.No</th>\r\n");
      out.write("    <th>Product Name</th>\r\n");
      out.write("    <th>category</th>\r\n");
      out.write("    <th>Price</th>\r\n");
      out.write("    <th>Quantity</th>\r\n");
      out.write("     <th>Sub Total</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  ResultSet rs1=st.executeQuery("select *from cart inner join product on cart.product_id=product_id and cart.email='"+email+"' and cart.status='bill'");
  while(rs.next())
    {
     sno=sno+1;

      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>");
out.println(sno);
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs1.getString(17));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs1.getString(18));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs1.getString(19));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs1.getString(3));
      out.write("</td>\r\n");
      out.write("     <td");
      out.print(rs1.getString(5));
      out.write("td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write(" ");
}
      out.write("   \r\n");
      out.write("</table>\r\n");
      out.write("<h3>Total:");
out.println(total);
      out.write(" </h3>\r\n");
      out.write("<a href=\"continueShopping.jsp\"><button class=\"button left-button\">Continue Shopping</button></a>\r\n");
      out.write("<a onclick=\"window.print();\"><button class=\"button right-button\">Print</button></a>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write(" ");
    
    }
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
