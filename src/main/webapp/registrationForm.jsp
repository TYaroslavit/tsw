<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styleR.css">
<script type="text/javascript" src="checkInput.js"></script>
	
<title>Insert title here</title>
</head>
<body>
<h1 id="error_warning">  </h1>
<form  onchange="validate()">
	<fieldset>
		<legend>Dati personali</legend>
			<input type="text" name="nome" placeholder="nome" class="formInput" required>
			<input type="text" name="cognome" placeholder="cognome" class="formInput" required>
			<input type="number" name="giorno" placeholder="giorno di nascita" class="formInput" required>
			<input type="number" name="mese" placeholder="mese di nascita" class="formInput" required>
			<input type="number" name="anno" placeholder="anno di nascita" class="formInput" required>
			<input type="text" name="indirizzo" placeholder="indirizzo(via palombo 19)" class="formInput" required>
			<input type="text" name="citta" placeholder="citta" class="formInput" required>
			<input type="text" name="zip" placeholder="zip" class="formInput" required>
			<input type="tel" name="telefono" placeholder="cellulare" class="formInput" required>
	</fieldset>
	<fieldset>
	<legend>Dati di login</legend>
	<input type="text" name="email" placeholder="email" class="formInput" required>
	<input type="password" name="pass" placeholder="password" class="formInput" required>
	<input type="password" name="repass" placeholder="reinserisci password" class="formInput" required>
	</fieldset>
	
	<input type="submit" name="invio" value="Invia" class="button1" >
	<input type="reset" name="reset" value="Reset" class="button1" >
</form>
</body>
</html>