<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="Connection.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        Connection.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String username_1id=  request.getParameter("username16");
            java.lang.String username_1idTemp = null;
        if(!username_1id.equals("")){
         username_1idTemp  = username_1id;
        }
        String pwd_2id=  request.getParameter("pwd18");
            java.lang.String pwd_2idTemp = null;
        if(!pwd_2id.equals("")){
         pwd_2idTemp  = pwd_2id;
        }
        String email_3id=  request.getParameter("email20");
            java.lang.String email_3idTemp = null;
        if(!email_3id.equals("")){
         email_3idTemp  = email_3id;
        }
        String hpone_4id=  request.getParameter("hpone22");
            java.lang.String hpone_4idTemp = null;
        if(!hpone_4id.equals("")){
         hpone_4idTemp  = hpone_4id;
        }
        String wpone_5id=  request.getParameter("wpone24");
            java.lang.String wpone_5idTemp = null;
        if(!wpone_5id.equals("")){
         wpone_5idTemp  = wpone_5id;
        }
        String address_6id=  request.getParameter("address26");
            java.lang.String address_6idTemp = null;
        if(!address_6id.equals("")){
         address_6idTemp  = address_6id;
        }
        java.lang.String signUp13mtemp = sampleServiceProxyid.signUp(username_1idTemp,pwd_2idTemp,email_3idTemp,hpone_4idTemp,wpone_5idTemp,address_6idTemp);
if(signUp13mtemp == null){
%>
<%=signUp13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signUp13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 28:
        gotMethod = true;
        java.lang.String[] fetchCategory28mtemp = sampleServiceProxyid.fetchCategory();
if(fetchCategory28mtemp == null){
%>
<%=fetchCategory28mtemp %>
<%
}else{
        String tempreturnp29 = null;
        if(fetchCategory28mtemp != null){
        java.util.List listreturnp29= java.util.Arrays.asList(fetchCategory28mtemp);
        tempreturnp29 = listreturnp29.toString();
        }
        %>
        <%=tempreturnp29%>
        <%
}
break;
case 31:
        gotMethod = true;
        String category_7id=  request.getParameter("category34");
            java.lang.String category_7idTemp = null;
        if(!category_7id.equals("")){
         category_7idTemp  = category_7id;
        }
        java.lang.String[] fetchProducts31mtemp = sampleServiceProxyid.fetchProducts(category_7idTemp);
if(fetchProducts31mtemp == null){
%>
<%=fetchProducts31mtemp %>
<%
}else{
        String tempreturnp32 = null;
        if(fetchProducts31mtemp != null){
        java.util.List listreturnp32= java.util.Arrays.asList(fetchProducts31mtemp);
        tempreturnp32 = listreturnp32.toString();
        }
        %>
        <%=tempreturnp32%>
        <%
}
break;
case 36:
        gotMethod = true;
        String username_8id=  request.getParameter("username39");
            java.lang.String username_8idTemp = null;
        if(!username_8id.equals("")){
         username_8idTemp  = username_8id;
        }
        String id_9id=  request.getParameter("id41");
        int id_9idTemp  = Integer.parseInt(id_9id);
        java.lang.String removeCart36mtemp = sampleServiceProxyid.removeCart(username_8idTemp,id_9idTemp);
if(removeCart36mtemp == null){
%>
<%=removeCart36mtemp %>
<%
}else{
        String tempResultreturnp37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeCart36mtemp));
        %>
        <%= tempResultreturnp37 %>
        <%
}
break;
case 43:
        gotMethod = true;
        String user_10id=  request.getParameter("user46");
            java.lang.String user_10idTemp = null;
        if(!user_10id.equals("")){
         user_10idTemp  = user_10id;
        }
        java.lang.String[] displayCart43mtemp = sampleServiceProxyid.displayCart(user_10idTemp);
if(displayCart43mtemp == null){
%>
<%=displayCart43mtemp %>
<%
}else{
        String tempreturnp44 = null;
        if(displayCart43mtemp != null){
        java.util.List listreturnp44= java.util.Arrays.asList(displayCart43mtemp);
        tempreturnp44 = listreturnp44.toString();
        }
        %>
        <%=tempreturnp44%>
        <%
}
break;
case 48:
        gotMethod = true;
        String id_11id=  request.getParameter("id51");
        int id_11idTemp  = Integer.parseInt(id_11id);
        String user_12id=  request.getParameter("user53");
            java.lang.String user_12idTemp = null;
        if(!user_12id.equals("")){
         user_12idTemp  = user_12id;
        }
        java.lang.String addToCart48mtemp = sampleServiceProxyid.addToCart(id_11idTemp,user_12idTemp);
if(addToCart48mtemp == null){
%>
<%=addToCart48mtemp %>
<%
}else{
        String tempResultreturnp49 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addToCart48mtemp));
        %>
        <%= tempResultreturnp49 %>
        <%
}
break;
case 55:
        gotMethod = true;
        String username_13id=  request.getParameter("username58");
            java.lang.String username_13idTemp = null;
        if(!username_13id.equals("")){
         username_13idTemp  = username_13id;
        }
        String pwd_14id=  request.getParameter("pwd60");
            java.lang.String pwd_14idTemp = null;
        if(!pwd_14id.equals("")){
         pwd_14idTemp  = pwd_14id;
        }
        java.lang.String login55mtemp = sampleServiceProxyid.login(username_13idTemp,pwd_14idTemp);
if(login55mtemp == null){
%>
<%=login55mtemp %>
<%
}else{
        String tempResultreturnp56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(login55mtemp));
        %>
        <%= tempResultreturnp56 %>
        <%
}
break;
case 62:
        gotMethod = true;
        String category_15id=  request.getParameter("category65");
            java.lang.String category_15idTemp = null;
        if(!category_15id.equals("")){
         category_15idTemp  = category_15id;
        }
        String name_16id=  request.getParameter("name67");
            java.lang.String name_16idTemp = null;
        if(!name_16id.equals("")){
         name_16idTemp  = name_16id;
        }
        String model_17id=  request.getParameter("model69");
            java.lang.String model_17idTemp = null;
        if(!model_17id.equals("")){
         model_17idTemp  = model_17id;
        }
        String price_18id=  request.getParameter("price71");
        int price_18idTemp  = Integer.parseInt(price_18id);
        String user_19id=  request.getParameter("user73");
            java.lang.String user_19idTemp = null;
        if(!user_19id.equals("")){
         user_19idTemp  = user_19id;
        }
        java.lang.String advertiseProduct62mtemp = sampleServiceProxyid.advertiseProduct(category_15idTemp,name_16idTemp,model_17idTemp,price_18idTemp,user_19idTemp);
if(advertiseProduct62mtemp == null){
%>
<%=advertiseProduct62mtemp %>
<%
}else{
        String tempResultreturnp63 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(advertiseProduct62mtemp));
        %>
        <%= tempResultreturnp63 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>