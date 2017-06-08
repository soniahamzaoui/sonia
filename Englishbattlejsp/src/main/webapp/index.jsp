<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Battle Dev</title>
</head>
<body>



	<h1>Bienvenue sur Battle English !</h1>
	
	
	
	<form action="ConnexionServlet" method="post">
		<input type="text" name="EMAIL" placeHolder="Email" /> <input
			type="text" name="MOT_DE_PASSE" placeHolder="Mot de passe" /> <input
			type="submit" value="Connexion" />
	</form>
	
	
	
	<a href="inscription.jsp">Inscription</a>
	<br>
	<br>

</body>
</html>