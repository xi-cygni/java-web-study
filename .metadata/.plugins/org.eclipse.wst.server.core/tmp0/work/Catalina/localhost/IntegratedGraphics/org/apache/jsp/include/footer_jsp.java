/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-11 13:27:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<div id=\"footerwrap\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <h4>About</h4>\r\n");
      out.write("          <div class=\"hline-w\"></div>\r\n");
      out.write("          <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <h4>Social Links</h4>\r\n");
      out.write("          <div class=\"hline-w\"></div>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-tumblr\"></i></a>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <h4>Our Address</h4>\r\n");
      out.write("          <div class=\"hline-w\"></div>\r\n");
      out.write("          <p>\r\n");
      out.write("            Some Ave, 987,<br/> 23890, New York,<br/> United States.<br/>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"copyrights\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <p>\r\n");
      out.write("        &copy; Copyrights <strong>Solid</strong>. All Rights Reserved\r\n");
      out.write("      </p>\r\n");
      out.write("      <div class=\"credits\">\r\n");
      out.write("        <!--\r\n");
      out.write("          You are NOT allowed to delete the credit link to TemplateMag with free version.\r\n");
      out.write("          You can delete the credit link only if you bought the pro version.\r\n");
      out.write("          Buy the pro version with working PHP/AJAX contact form: https://templatemag.com/solid-bootstrap-business-template/\r\n");
      out.write("          Licensing information: https://templatemag.com/license/\r\n");
      out.write("        -->\r\n");
      out.write("        Created with Solid template by <a href=\"https://templatemag.com/\">TemplateMag</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- / copyrights -->\r\n");
      out.write("\r\n");
      out.write("  <!-- JavaScript Libraries -->\r\n");
      out.write("  <script src=\"lib/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"lib/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"lib/php-mail-form/validate.js\"></script>\r\n");
      out.write("  <script src=\"lib/prettyphoto/js/prettyphoto.js\"></script>\r\n");
      out.write("  <script src=\"lib/isotope/isotope.min.js\"></script>\r\n");
      out.write("  <script src=\"lib/hover/hoverdir.js\"></script>\r\n");
      out.write("  <script src=\"lib/hover/hoverex.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main Javascript File -->\r\n");
      out.write("  <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}