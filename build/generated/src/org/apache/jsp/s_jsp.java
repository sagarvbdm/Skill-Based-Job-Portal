package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import source.data;
import java.io.IOException;
import java.io.PrintWriter;

public final class s_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("html {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*, *:before, *:after {\n");
      out.write("  box-sizing: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".column {\n");
      out.write("  float: center;\n");
      out.write("  width: 33.3%;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  padding: 0 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 650px) {\n");
      out.write("  .column {\n");
      out.write("    width: 90%;\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 0 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container::after, .row::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  border: none;\n");
      out.write("  outline: 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 8px;\n");
      out.write("  color: white;\n");
      out.write("  background-color: #000;\n");
      out.write("  text-align: center;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {\n");
      out.write("  background-color: #555;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sagar input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    height: 40px;\n");
      out.write("    background:#000b83;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write(".sagar input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("    cursor: pointer;\n");
      out.write("    background:#0066cc;\n");
      out.write("    color: #000;\n");
      out.write("     box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("<div class=\"navbars\">\n");
      out.write("        <a href=\"#default\" class=\"logo\">Placement planner</a>\n");
      out.write("        <div class=\"header-right\">\n");
      out.write("        <a class=\"active\" href=\"#home\">Home</a>\n");
      out.write("         <a href=\"#contact\">Contact</a>\n");
      out.write("         <a href=\"#about\">About</a>\n");
      out.write("        </div>\n");
      out.write("   </div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" <h2 align=\"center\"><font><strong><padding:50px>company name</padding:50px></strong></font></h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr bgcolor=\"#A52A2A\">\n");
      out.write("<!--<td><b>user_id</b></td>\n");
      out.write("<td><b>Password</b></td>\n");
      out.write("<td><b>Name</b></td>\n");
      out.write("<td><b>Email</b></td>-->\n");
      out.write("</tr>\n");

   String name = (String) session.getAttribute("name");
//   session.setAttribute("name", name);
     String name1 = (String) session.getAttribute("email");
      String name2 = (String) session.getAttribute("dob");
      String name3 = (String) session.getAttribute("status");
       String name4 = (String) session.getAttribute("addr");
       String name5 = (String) session.getAttribute("emp");
    Statement statement=null;
    ResultSet resultSet =null;
try{
Connection con = data.initializeDatabase(); 

PreparedStatement    p=con.prepareStatement("SELECT distinct(company_name),website from company , ys where company.rate1 between 1 and ys.rate1 and company.rate2 between 1 and ys.rate2 and ys.name=?");
p.setString(1,name);
resultSet = p.executeQuery();
while(resultSet.next()){ 


      out.write("\n");
      out.write("<tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("<center><td>");
      out.print(resultSet.getString("company_name") );
      out.write("<br></td></center>\n");
      out.write("<center><td>");
      out.print(resultSet.getString("website") );
      out.write("<br></td></center><br>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("<center><h1>Apply to</h1>\n");
      out.write("<form action=\"s2\" method=\"post\">\n");
      out.write("<input type=\"text\" name=\"apply\">\n");
      out.write("<input type=\"submit\" value=\"done\"></center>\n");
      out.write("</form>\n");
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
