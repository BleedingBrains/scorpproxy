<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="robots" content="noindex, follow"> 
<title>Scorpion's Proxy Server</title>
<style>
body {
	font: 14px Verdana, Arial, Helvetica, sans-serif;
}
.box {
	width:500px;
	margin: 10px auto;
	text-align: center;
	padding: 20px;
	border-top: 1px solid #CCCCCC;
	border-right: 2px solid #CCCCCC;
	border-bottom: 2px solid #CCCCCC;
	border-left: 1px solid #CCCCCC;
}
h1 {
	font: bold normal 1.2em Verdana, Arial, Helvetica, sans-serif;
	color: #000000;
	margin: 5px 5px 20px;
	padding: 10px;
	border-top: 1px solid #eee;
	border-right: 0px solid #ddd;
	border-bottom: 1px solid #ddd;
	border-left: 0px solid #ddd;
}
.footer {
	font: .9em Verdana, Arial, sans-serif;
	margin: 8px;
	padding: 12px 8px 8px;
	text-align: left;
}
.credit {
	font: .8em Verdana, Arial, sans-serif;
	margin: 8px;
	padding: 8px;
	text-align: left;
}
input.txt {
	background:#F9f9f9 url(none) repeat scroll 0%;
	border:1px solid #999999;
	font-size:0.9em;
	padding:5px;
	width:250px;
}
input.btn {
	font-size:0.9em;
	font-family: Arial, sans-serif;
	width: 100px;
	margin: 2px 0;
	padding: 4px;
}
</style>
</head>
<body>


<div class="box">
  <h1>Scorpion's Proxy Server</h1>
  <center>
    <form action="proxy" method="post" accept-charset="utf-8">
      <input name="url" type="text" class="txt" id = "input" value="type url here.." onfocus="this.value='';" />
      <input type="submit" class="btn" value="Go" />
    </form>
  </center>
  <p class="footer">Instructions: Just type the URL of any web page in the input box above (<em>e.g. www.google.com </em>)  and hit Enter.</p>
  

<tr>
      <td height="50" align="right" valign="middle" bgcolor="#000000" class="style4 style1">&copy; Copyright 2012-2013 Scorpion;    All Rights Reserved&nbsp;&nbsp;&nbsp;</td>
    </tr>
<tr>
<td ><%String isTrue = (String)request.getAttribute("ERROR");
if (isTrue != null) {
if (isTrue.equalsIgnoreCase("true")) {
    out.print("<div class=\"footer\" style=\"color: red;text-align: center;\"> Error In processing! :( </div>");
}
}
%></td>
</tr> 
   
</div>
</body>
</html>
