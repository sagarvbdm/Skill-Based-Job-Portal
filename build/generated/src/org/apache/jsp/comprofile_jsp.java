package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("     <!DOCTYPE html>   \n");
      out.write("        <html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Page Title</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the body */\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Header/logo Title */\n");
      out.write(".header {\n");
      out.write("  padding: 10px;\n");
      out.write("  height: 100px;\n");
      out.write("  background: #0099ff;\n");
      out.write("  color: white;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Increase the font size of the heading */\n");
      out.write(".header h1 {\n");
      out.write("  font-size: 40px;\n");
      out.write("  text-align:left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Sticky navbar - toggles between relative and fixed, depending on the scroll position. It is positioned relative until a given offset position is met in the viewport - then it \"sticks\" in place (like position:fixed). The sticky value is not supported in IE or Edge 15 and earlier versions. However, for these versions the navbar will inherit default position */\n");
      out.write(".navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background:var(--md-background-color);\n");
      out.write("  position: sticky;\n");
      out.write("  position: -webkit-sticky;\n");
      out.write("  top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the navigation bar links */\n");
      out.write(".navbar a {\n");
      out.write("  font-family:serif;\n");
      out.write("  font-size:20px;\n");
      out.write("  font-weight:100;\n");
      out.write("  font-style: normal;\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color:#333;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".right {\n");
      out.write("    font-family:serif;\n");
      out.write("  font-size:20px;\n");
      out.write("  font-weight:100;\n");
      out.write("    float:right;\n");
      out.write("    font-style: normal;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  border: none;\n");
      out.write("  background-color:transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Right-aligned link */\n");
      out.write(".navbar a.right {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change color on hover */\n");
      out.write(".navbar a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Active/current link */\n");
      out.write(".navbar a.active {\n");
      out.write("  background-color: #666;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Column container */\n");
      out.write(".row {  \n");
      out.write("  display: -ms-flexbox; /* IE10 */\n");
      out.write("  display: flex;\n");
      out.write("  -ms-flex-wrap: wrap; /* IE10 */\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create two unequal columns that sits next to each other */\n");
      out.write("/* Sidebar/left column */\n");
      out.write(".side {\n");
      out.write("  -ms-flex: 30%; /* IE10 */\n");
      out.write("  flex: 30%;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Main column */\n");
      out.write(".main {   \n");
      out.write("  -ms-flex: 70%; /* IE10 */\n");
      out.write("  flex: 70%;\n");
      out.write("  background-color: white;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fake image, just for this example */\n");
      out.write(".fakeimg {\n");
      out.write("  background-color: #aaa;\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Footer */\n");
      out.write(".footer {\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("  background: #ddd;\n");
      out.write("}\n");
      out.write(".avatar{\n");
      out.write("   width:200px;\n");
      out.write("   height:200px;\n");
      out.write("   border-radius: 20px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 700px) {\n");
      out.write("  .row {   \n");
      out.write("    flex-direction: column;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* The navigation bar */\n");
      out.write(".navbars {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color:  #000b83;\n");
      out.write("  position: fixed; /* Set the navbar to fixed position */\n");
      out.write("  top: 0; /* Position the navbar at the top of the page */\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Links inside the navbar */\n");
      out.write(".navbars a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("   font-family:serif;\n");
      out.write("  font-size:20px;\n");
      out.write("  font-weight:100;\n");
      out.write("   \n");
      out.write("    font-style: normal;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change background on mouse-over */\n");
      out.write(".navbars a:hover {\n");
      out.write("  background: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".header-right {\n");
      out.write("  float: right;\n");
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
      out.write("/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 400px) {\n");
      out.write("  .navbar a {\n");
      out.write("    float: none;\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--                  <SCRIPT type=\"text/javascript\">\n");
      out.write("\twindow.history.forward();\n");
      out.write("\tfunction noBack() { window.history.forward(); }\n");
      out.write("</SCRIPT>-->\n");
      out.write("\n");
      out.write(" ");

     response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
          response.setHeader("Pragma", "no-cache"); // HTTP 1.0            response.setDateHeader("Expires", 0);
		if (session != null) {
			if (session.getAttribute("username") != null) {
				String name = (String) session.getAttribute("username");
				out.print("<br><br><br><center><font-family:serif><h3>HELLO, " + name + "  WELCOME TO YOUR PROFILE</h3></center>");
			} else {
				response.sendRedirect("comlogin.jsp");
			}
		}
	
      out.write("\n");
      out.write("<!--\t</br>\n");
      out.write("\t</br>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("  <form action=\"login_invalid\" method=\"get\">\t\n");
      out.write("<div class=\"header\">\n");
      out.write("  <h1>Placement Planner</h1>\n");
      out.write("  <div style=\"text-align:right\"><img src=\"av1.png\" class=\"avatar\" width=\"100\" height=\"100\"/></div>\n");
      out.write("  <p> <b></b> </p>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("   \n");
      out.write("\t\n");
      out.write(" \n");
      out.write("<div class=\"navbar\">\n");
      out.write("  <a href=\"#\" class=\"active\">Home</a>\n");
      out.write("  <a href=\"details.html\">Profile Details</a>\n");
      out.write("  <a href=\"fav.html\">Favourite</a>\n");
      out.write("  <a> <input type=\"submit\" value=\"Logout\" class=\"right\"></a>\n");
      out.write("</div>\n");
      out.write("  </form>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<div class=\"footer\">\n");
      out.write("  <h2>Footer</h2>\n");
      out.write("</div>-->\n");
      out.write("  <form action=\"login_invalid\" method=\"get\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("<div class=\"navbars\">\n");
      out.write("     <a href=\"#default\" class=\"logo\">Placement planner</a>\n");
      out.write("       <div class=\"header-right\">\n");
      out.write("  <a href=\"profile.jsp\">Home</a>\n");
      out.write("  <a href=\"details.jsp\">Company Details</a>\n");
      out.write("    <a> <input type=\"submit\" value=\"Logout\" class=\"right\"></a>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("      </form>\n");
      out.write("<!--<div class=\"row\">\n");
      out.write("  <div class=\"side\">\n");
      out.write("    <h2>About Me</h2>\n");
      out.write("    <h5>Photo of me:</h5>\n");
      out.write("    <img src=\"avatar.png\" class=\"avatar\" height=\"200\" width=\"350\">\n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    <div class=\"fakeimg\" style=\"height:60px;\">Image</div><br>\n");
      out.write("    <div class=\"fakeimg\" style=\"height:60px;\">Image</div><br>\n");
      out.write("    <div class=\"fakeimg\" style=\"height:60px;\">Image</div>\n");
      out.write("  </div>-->\n");
      out.write(" <div class=\"main\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<style>\n");
      out.write(".mySlides {display:none}\n");
      out.write(".w3-left, .w3-right, .w3-badge {cursor:pointer}\n");
      out.write(".w3-badge {height:13px;width:13px;padding:0}\n");
      out.write("</style>\n");
      out.write("<div class=\"w3-container\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-content w3-display-container\" style=\"max-width:800px\">\n");
      out.write("  <img class=\"mySlides\" src=\"p11.jpg\" style=\"width:100%\">\n");
      out.write("  <img class=\"mySlides\" src=\"p12.png\" style=\"width:100%\">\n");
      out.write("  <img class=\"mySlides\" src=\"p14.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("  <div class=\"w3-center w3-container w3-section w3-large w3-text-white w3-display-bottommiddle\" style=\"width:100%\">\n");
      out.write("    <div class=\"w3-left w3-hover-text-khaki\" onclick=\"plusDivs(-1)\">&#10094;</div>\n");
      out.write("    <div class=\"w3-right w3-hover-text-khaki\" onclick=\"plusDivs(1)\">&#10095;</div>\n");
      out.write("    <span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(1)\"></span>\n");
      out.write("    <span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(2)\"></span>\n");
      out.write("    <span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(3)\"></span>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var slideIndex = 1;\n");
      out.write("showDivs(slideIndex);\n");
      out.write("\n");
      out.write("function plusDivs(n) {\n");
      out.write("  showDivs(slideIndex += n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function currentDiv(n) {\n");
      out.write("  showDivs(slideIndex = n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showDivs(n) {\n");
      out.write("  var i;\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"demo\");\n");
      out.write("  if (n > x.length) {slideIndex = 1}\n");
      out.write("  if (n < 1) {slideIndex = x.length}\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("    x[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("    dots[i].className = dots[i].className.replace(\" w3-white\", \"\");\n");
      out.write("  }\n");
      out.write("  x[slideIndex-1].style.display = \"block\";  \n");
      out.write("  dots[slideIndex-1].className += \" w3-white\";\n");
      out.write("}\n");
      out.write("</script><br><br>\n");
      out.write("<div class=\"sagar\">\n");
      out.write("<form action=\"notify\" method=\"post\">\n");
      out.write("    <center><input type=\"submit\" value=\"See Applied Members\"></center>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html> \n");
      out.write("<!--    \n");
      out.write("    <h2>TITLE HEADING</h2>\n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("   <div class=\"main\">\n");
      out.write("    <h2>TITLE HEADING</h2>\n");
      out.write("    \n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    \n");
      out.write("    <h2>TITLE HEADING</h2>\n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    </div> \n");
      out.write("    \n");
      out.write("    <div class=\"main\">\n");
      out.write("    <h2>TITLE HEADING</h2>\n");
      out.write("    \n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    \n");
      out.write("    <h2>TITLE HEADING</h2>\n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"main\">\n");
      out.write("    <h2>TITLE HEADING</h2>\n");
      out.write("    \n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    \n");
      out.write("    <h2>TITLE HEADING</h2>\n");
      out.write("    <div class=\"fakeimg\" style=\"height:200px;\">Image</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("  <h2>Footer</h2>\n");
      out.write("</div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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