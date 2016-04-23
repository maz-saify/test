<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" action="login">
		<s:textfield name="userName" label="Enter Username"></s:textfield>
		<s:password name="passWord" label="Enter Password"></s:password>
		<s:submit value="Submit"></s:submit>
	</s:form>
</body>
</html>