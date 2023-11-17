/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-11-17 05:46:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("	<head>\n");
      out.write("		<meta charset=\"UTF-8\">\n");
      out.write("		<title>Log in</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/all.css\">\n");
      out.write("        \n");
      out.write("	</head> \n");
      out.write("	<body>\n");
      out.write("        <div class=\"container\" style=\"margin-top:30px;\">\n");
      out.write("            <aside>\n");
      out.write("                <button style=\"margin-top: 250px;\" >\n");
      out.write("                    <img src=\"images/mypageA.png\" style=\"width:85px; padding:0;\" alt=\"myPage Icon\">\n");
      out.write("                    <p><strong>mypage</strong></p>\n");
      out.write("                </button>\n");
      out.write("                <button style=\"margin-top: 50px;\">\n");
      out.write("                    <img src=\"images/lookaround.png\" style=\"width:85px; padding:0;\" alt=\"lookaround Icon\">\n");
      out.write("                    <p><strong>my<br>Playlist</strong></p>\n");
      out.write("                </button>\n");
      out.write("                <button style=\"margin-top: 50px;\">\n");
      out.write("                    <img src=\"images/pixel_search.png\" style=\"width:85px; padding:0;\" alt=\"Search Icon\">\n");
      out.write("                    <p><strong>search</strong></p>\n");
      out.write("                </button>\n");
      out.write("            </aside>\n");
      out.write("            <section>\n");
      out.write("                <div class=\"bluetop\" style=\"margin-top:20px; width:1200px;\">\n");
      out.write("                    <p style=\"margin-top:5px\">log in</p>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width:1200px; height:30px; background-color: gray;\">\n");
      out.write("                </div>\n");
      out.write("                <article>\n");
      out.write("                    <div style=\"text-align: center; margin-top: 20%;\">\n");
      out.write("                        <h3>Log in</h3><br>\n");
      out.write("                        <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("	                        <input type=\"text\" id=\"user_id\" name=\"user_id\" placeholder=\"ID\" style=\"width:200px; height: 30px; margin-bottom:10px; border-style:none;\"><br>\n");
      out.write("	                        <input type=\"password\" id=\"user_password\" name=\"user_password\" placeholder=\"user_password\" style=\"width:200px; height: 30px; margin-bottom:15px; border-style:none;\"><br>\n");
      out.write("	                    	<input type=\"submit\" value=\"로그인\" style=\"background-color:blue; color:white; width:80px; height: 30px; border-style:none;\">\n");
      out.write("                    	</form><br>\n");
      out.write("                    		<a href=\"#\" style=\"font-size:xsmall; margin-top:10px;\">계정이 없으신가요?</a> <!-- 회원가입 페이지로 이동 -->\n");
      out.write("                    </div>\n");
      out.write("                </article>\n");
      out.write("            </section>\n");
      out.write("        </div><!--container-->\n");
      out.write("        ");

			//로그인이 실패했을 상황 가정 (로그인 실패시 보일 함수 호출)
			String loginError = (String)request.getAttribute("loginError");
		
			if(loginError != null){
		
      out.write("\n");
      out.write("			<script>\n");
      out.write("				displayLoginFail();\n");
      out.write("			</script>\n");
      out.write("		");

			} //if(loginError != null)
		
      out.write("\n");
      out.write("	</body>\n");
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
