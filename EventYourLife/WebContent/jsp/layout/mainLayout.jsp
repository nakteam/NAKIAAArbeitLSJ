<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Single Search</title>
</head>
<body>
	<!-- Header -->
	<div>
		<tiles:insertAttribute name="header" />
	</div>
	<!-- Menue -->
	<div>
		<tiles:insertAttribute name="menue" />
	</div>
	<!-- Content -->
	<div>
		<tiles:insertAttribute name="content" />
	</div>
	<!-- Footer -->
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>