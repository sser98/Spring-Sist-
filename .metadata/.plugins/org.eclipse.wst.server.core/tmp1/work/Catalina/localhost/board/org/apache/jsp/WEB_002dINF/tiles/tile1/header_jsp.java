/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-12-01 23:56:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.tiles.tile1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.InetAddress;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1606094057597L));
    _jspx_dependants.put("jar:file:/C:/NCS/workspace(spring)/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.InetAddress");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	String ctxPath = request.getContextPath();

	// === #165. (웹채팅관련3) === 
	// === 서버 IP 주소 알아오기(사용중인 IP주소가 유동IP 이라면 IP주소를 알아와야 한다.) ===
	InetAddress inet = InetAddress.getLocalHost(); 
	String serverIP = inet.getHostAddress();
	
	//System.out.println("serverIP : " + serverIP);
	// serverIP : 192.168.56.65
	
	// String serverIP = "192.168.50.65"; 만약에 사용중인 IP주소가 고정IP 이라면 IP주소를 직접입력해주면 된다.
	
	// === 서버 포트번호 알아오기   ===
	int portnumber = request.getServerPort();
	//System.out.println("portnumber : " + portnumber);
	// portnumber : 9090
	
	String serverName = "http://"+serverIP+":"+portnumber; 
	//System.out.println("serverName : " + serverName);
	//serverName : http://192.168.50.65:9090 

      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<ul class=\"nav nav-tabs mynav\">\r\n");
      out.write("\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\tdata-toggle=\"dropdown\" href=\"#\">Home <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(ctxPath);
      out.write("/index.action\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(ctxPath);
      out.write("/deliciousStore.action\">전국맛집</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print( serverName);
      out.print(ctxPath);
      out.write("/chatting/multichat.action\">웹채팅</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\tdata-toggle=\"dropdown\" href=\"#\">게시판 <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print( ctxPath);
      out.write("/list.action\">목록보기</a></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t   ");
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(ctxPath);
      out.write("/add.action\">글쓰기</a></li>\r\n");
      out.write("\t\t   ");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Submenu 1-3</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\tdata-toggle=\"dropdown\" href=\"#\">로그인 <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /WEB-INF/tiles/tile1/header.jsp(54,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.loginuser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<li><a href=\"#\">회원가입</a></li>\r\n");
            out.write("\t\t\t\t<li><a href=\"");
            out.print(ctxPath);
            out.write("/login.action\">로그인</a></li>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        _jspx_th_c_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f1_reused = false;
      try {
        _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f1.setParent(null);
        // /WEB-INF/tiles/tile1/header.jsp(59,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.loginuser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
        if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<li><a href=\"");
            out.print(ctxPath);
            out.write("/myinfo.action\">나의정보</a></li>\r\n");
            out.write("\t\t\t\t<li><a href=\"");
            out.print(ctxPath);
            out.write("/logout.action\">로그아웃</a></li>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
        _jspx_th_c_005fif_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
      }
      out.write("\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- === #169. 제품등록(다중파일첨부)및 제품정보 메뉴 추가하기 === -->\t\t\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\tdata-toggle=\"dropdown\" href=\"#\">제품등록(다중파일첨부) <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t    <li><a href=\"");
      out.print(ctxPath);
      out.write("/product/addProduct.action\">제품등록</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(ctxPath);
      out.write("/product/storeProduct.action\">제품입고</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\tdata-toggle=\"dropdown\" href=\"#\">인사관리 <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(ctxPath);
      out.write("/emp/empList.action\">직원목록</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(ctxPath);
      out.write("/emp/chart.action\">통계차트</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\tdata-toggle=\"dropdown\" href=\"#\">제품정보 <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(ctxPath);
      out.write("/product/listProduct.action\">제품목록</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- === #49. 로그인이 성공되어지면 로그인되어진 사용자의 이메일 주소를 출력하기 === -->\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>    ");
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/tiles/tile1/header.jsp(92,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.loginuser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div style=\"float: right; margin-top: 0.5%; border: solid 0px red;\">\r\n");
          out.write("\t\t  <span style=\"color: navy; font-weight: bold; font-size: 10pt;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginuser.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span> 님 로그인중.. \r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
