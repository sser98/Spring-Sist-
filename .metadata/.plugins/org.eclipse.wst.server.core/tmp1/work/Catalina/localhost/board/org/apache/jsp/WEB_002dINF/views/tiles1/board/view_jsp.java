/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-12-01 23:24:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.tiles1.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1606094087106L));
    _jspx_dependants.put("jar:file:/C:/NCS/workspace(spring)/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("\ttable, th, td, input, textarea {border: solid gray 1px;}\r\n");
      out.write("\t\r\n");
      out.write("\t#table, #table2 {border-collapse: collapse;\r\n");
      out.write("\t \t\t         width: 900px;\r\n");
      out.write("\t \t\t        }\r\n");
      out.write("\t#table th, #table td{padding: 5px;}\r\n");
      out.write("\t#table th{width: 120px; background-color: #DDDDDD;}\r\n");
      out.write("\t#table td{width: 750px;}\r\n");
      out.write("\t.long {width: 470px;}\r\n");
      out.write("\t.short {width: 120px;}\r\n");
      out.write("\t\r\n");
      out.write("\t.move {cursor: pointer;}\r\n");
      out.write("\t.moveColor {color: #660029; font-weight: bold;}\r\n");
      out.write("\t\r\n");
      out.write("\ta {text-decoration: none !important;}\r\n");
      out.write("\t\r\n");
      out.write("\ttd.comment {text-align: center;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tgoReadComment(); // 페이징처리 안한 댓글 읽어오기 \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"span.move\").hover(function(){\r\n");
      out.write("\t\t\t                   $(this).addClass(\"moveColor\");\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t                    ,function(){\r\n");
      out.write("\t\t                       $(this).removeClass(\"moveColor\");\r\n");
      out.write("\t\t                    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t}); // end of $(document).ready(function(){})----------------\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// == 댓글쓰기 == //\r\n");
      out.write("\tfunction goAddWrite() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar contentVal = $(\"input#commentContent\").val().trim();\r\n");
      out.write("\t\tif(contentVal == \"\") {\r\n");
      out.write("\t\t\talert(\"댓글 내용을 입력하세요!!\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\tvar form_data = $(\"form[name=addWriteFrm]\").serialize();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print( request.getContextPath());
      out.write("/addComment.action\",\r\n");
      out.write("\t\t\tdata:form_data,\r\n");
      out.write("\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\tdataType:\"JSON\",\r\n");
      out.write("\t\t\tsuccess:function(json){  // {\"n\", 1} OR {\"n\", 0}\r\n");
      out.write("\t\t\t\tvar n = json.n;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(n == 0) {\r\n");
      out.write("\t\t\t\t\talert(json.name+\"님의 포인트는 300점을 초과할 수 없으므로 댓글쓰기가 불가합니다.\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\tgoReadComment(); // 페이징처리 안한 댓글 읽어오기 \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(request, status, error){\r\n");
      out.write("\t\t\t\talert(\"code: \"+request.status+\"\\n\"+\"message: \"+request.responseText+\"\\n\"+\"error: \"+error);\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t}// end of function goAddWrite(){}---------------------------\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// === 페이징 처리 안한 댓글 읽어오기 === // \r\n");
      out.write("\tfunction goReadComment() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print( request.getContextPath());
      out.write("/readComment.action\",\r\n");
      out.write("\t\t\tdata:{\"parentSeq\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"},\r\n");
      out.write("\t\t\tdataType:\"JSON\",\r\n");
      out.write("\t\t\tsuccess:function(json){\r\n");
      out.write("\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\tif(json.length > 0) {\r\n");
      out.write("\t\t\t\t\t$.each(json, function(index, item){\r\n");
      out.write("\t\t\t\t\t\thtml += \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\thtml += \"<td class='comment'>\"+(index+1)+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\thtml += \"<td>\"+item.content+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\thtml += \"<td class='comment'>\"+item.name+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\thtml += \"<td class='comment'>\"+item.regdate+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\thtml += \"</tr>\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\thtml += \"<tr>\";\r\n");
      out.write("\t\t\t\t\thtml += \"<td colspan='4' class='comment'>댓글이 없습니다</td>\";\r\n");
      out.write("\t\t\t\t\thtml += \"</tr>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"tbody#commentDisplay\").html(html);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(request, status, error){\r\n");
      out.write("\t\t\t\talert(\"code: \"+request.status+\"\\n\"+\"message: \"+request.responseText+\"\\n\"+\"error: \"+error);\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t}// end of function goReadComment(){}------------------------\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div style=\"padding-left: 10%;\">\r\n");
      out.write("\t<h1>글내용보기</h1>\r\n");
      out.write("\t\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t\r\n");
      out.write("\t \r\n");
      out.write("\t<button type=\"button\" onclick=\"javascript:location.href='");
      out.print( request.getContextPath());
      out.write("/list.action'\">전체목록보기</button>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<button type=\"button\" onclick=\"javascript:location.href='");
      out.print( request.getContextPath());
      out.write("/edit.action?seq=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">수정</button>\r\n");
      out.write("\t<button type=\"button\" onclick=\"javascript:location.href='");
      out.print( request.getContextPath());
      out.write("/del.action?seq=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">삭제</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- ===== #94. 댓글 내용 보여주기 ===== -->\r\n");
      out.write("\t<table id=\"table2\" style=\"margin-top: 2%; margin-bottom: 3%;\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t    <th style=\"width: 10%; text-align: center;\">번호</th>\r\n");
      out.write("\t\t\t<th style=\"width: 60%; text-align: center;\">내용</th>\r\n");
      out.write("\t\t\t<th style=\"width: 10%; text-align: center;\">작성자</th>\r\n");
      out.write("\t\t\t<th style=\"text-align: center;\">작성일자</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody id=\"commentDisplay\"></tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("</div>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/tiles1/board/view.jsp(114,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty boardvo}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("\t\t<table id=\"table\">\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<th>글번호</th>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<th>성명</th>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<th>제목</th>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<th>내용</th>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t <p style=\"word-break: break-all;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("\t\t\t\t ");
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<th>조회수</th>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.readCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<th>날짜</th>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.regDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t</table>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<br/>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<div style=\"margin-bottom: 1%;\">이전글&nbsp;:&nbsp;<span class=\"move\" onclick=\"javascript:location.href='view.action?seq=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.previousseq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('\'');
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.previoussubject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span></div>\r\n");
          out.write("\t\t<div style=\"margin-bottom: 1%;\">다음글&nbsp;:&nbsp;<span class=\"move\" onclick=\"javascript:location.href='view.action?seq=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.nextseq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('\'');
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.nextsubject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span></div>\r\n");
          out.write("\t\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/tiles1/board/view.jsp(159,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty boardvo}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div style=\"padding: 50px 0; font-size: 16pt; color: red;\">존재하지 않습니다</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
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
      // /WEB-INF/views/tiles1/board/view.jsp(174,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.loginuser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<h3 style=\"margin-top: 50px;\">댓글쓰기 및 보기</h3>\r\n");
          out.write("\t\t<form name=\"addWriteFrm\" style=\"margin-top: 20px;\">\r\n");
          out.write("\t\t\t      <input type=\"hidden\" name=\"fk_userid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginuser.userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" />\r\n");
          out.write("\t\t\t성명 : <input type=\"text\" name=\"name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginuser.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" class=\"short\" readonly />  \r\n");
          out.write("\t\t\t&nbsp;&nbsp;\r\n");
          out.write("\t\t\t댓글내용 : <input id=\"commentContent\" type=\"text\" name=\"content\" class=\"long\" /> \r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t");
          out.write("\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"parentSeq\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" /> \r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<button id=\"btnComment\" type=\"button\" onclick=\"goAddWrite()\">확인</button> \r\n");
          out.write("\t\t\t<button type=\"reset\">취소</button> \r\n");
          out.write("\t\t</form>\r\n");
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
