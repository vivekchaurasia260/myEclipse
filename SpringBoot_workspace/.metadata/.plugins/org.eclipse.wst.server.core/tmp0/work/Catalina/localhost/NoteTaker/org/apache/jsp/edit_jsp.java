/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-12-11 16:04:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.helper.*;
import org.hibernate.*;
import com.entities.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1639200118726L));
    _jspx_dependants.put("/all_js_css.jsp", Long.valueOf(1639066645863L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.helper");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("org.hibernate");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.entities");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"css/style.css\" rel = \"stylesheet\" />    \r\n");
      out.write("    \r\n");
      out.write("     <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class = \"container\">\r\n");
      out.write("    \t");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark purple\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\">Note Taker</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"add_notes.jsp\">Add Note</a>\r\n");
      out.write("      </li>\r\n");
      out.write("     \r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"all_notes.jsp\">Show Notes</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t<h1>Edit your note</h1>\r\n");
      out.write("    \t\r\n");
      out.write("    \t");

    		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
	    	Session s = FactoryProvider.getFactory().openSession();
			Note note = (Note)s.get(Note.class, noteId);    	
    	
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t<form action=\"UpdateServlet\" method=\"post\">\r\n");
      out.write("    \t\r\n");
      out.write("    \t\t<input value=\"");
      out.print(note.getId() );
      out.write("\" name=\"noteId\" type=\"hidden\" />\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"title\">Note title</label>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <input name=\"title\" required type=\"text\" \r\n");
      out.write("\t\t\t    class=\"form-control\" id=\"title\" \r\n");
      out.write("\t\t\t    aria-describedby=\"emailHelp\" placeholder=\"Enter here\" \r\n");
      out.write("\t\t\t    value=\"");
      out.print( note.getTitle() );
      out.write("\" />\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"content\">Note Content</label>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <textarea name=\"content\" required\r\n");
      out.write("\t\t\t    id=\"content\"\r\n");
      out.write("\t\t\t    placeholder=\"Enter your content here\"\r\n");
      out.write("\t\t\t    class=\"form-control\"\r\n");
      out.write("\t\t\t    style=\"height:300px;\">");
      out.print(note.getContent());
      out.write("</textarea>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t <div class=\"container text-center\">\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t \t<button type=\"submit\" class=\"btn btn-success\">Save your note</button>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t</form>\r\n");
      out.write("    \t\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
