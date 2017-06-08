<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>

<title></title>
</head>


<body>
	<h1>The big Breat Britain Battle</h1>
	
	<p>${jojo.nom} ${jojo.prenom}</p>
	
    <p>${question.verbe.baseVerbale}</p>

   <form action="PartieServlet" method="post">
		<input type="text" name="preterit" placeHolder="Preterit" /> <input
			type="text" name="participePasse" placeHolder="Participe Passé" /> <input
			type="submit" value="Valider" />
	</form>
	

</body>
</html>