package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/signup-style.css\">\n");
      out.write("<title> Sign up </title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id='container'>\n");
      out.write("  <div class='signup'>\n");
      out.write("      <form action=\"signupAction.jsp\" method=\"post\" >\n");
      out.write("          <input type=\"text\" name=\"name\" placeholder=\"Enter Name\" required>\n");
      out.write("          <input type=\"email\" name=\"email\" placeholder=\"Enter Email\" required>\n");
      out.write("          <input type=\"number\" name=\"mobileNumber\" placeholder=\"Enter Mobile Number\" required>\n");
      out.write("          \n");
      out.write("          <select name=\"securityQuestion\" required>\n");
      out.write("            <option value=\"What is your pet name?\" > What is your pet name? </option>\n");
      out.write("            <option value=\"What is your first school?\"> What is your first school? </option>\n");
      out.write("            <option value=\"What is your first best friend?\"> What is your first best friend? </option>\n");
      out.write("            <option value=\"What is your favourite subject?\"> What is your favorite subject? </option>\n");
      out.write("          </select>\n");
      out.write("          <input type=\"text\" name=\"answer\" placeholder=\"Enter answer\" required>\n");
      out.write("          <input type=\"password\" name=\"password\" placeholder=\"Enter password\" required>\n");
      out.write("          <input type=\"submit\" value=\"signup\">\n");
      out.write("      </form>\n");
      out.write("     \n");
      out.write("    \n");
      out.write("      <h2><a href=\"login.jsp\"> Login </a></h2>\n");
      out.write("  </div>\n");
      out.write("  <div class='whysign'>\n");
      out.write("      ");

          String msg=request.getParameter("msg");
          if("valid".equals(msg))
          {
         
      out.write("\n");
      out.write("<h1>Successfully Registered</h1>\n");

}
      out.write('\n');
 if("invalid".equals(msg))
{    

      out.write("\n");
      out.write("<h1>Something Went Wrong! Try Again !</h1>\n");
}
      out.write("\n");
      out.write("    <h2>Online Shopping</h2>\n");
      out.write("    <p>The Online Shopping System is the application that allows the users to shop online without going to the shops to buy them.</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
