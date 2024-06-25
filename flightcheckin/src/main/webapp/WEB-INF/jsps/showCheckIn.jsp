<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Check-In</title>
</head>
<body>
    <h2>Check-In</h2>
    <form action="startCheckIn" method="post">
        <label for="id">Reservation ID:</label>
        <input type="text" id="id" name="id">
        <button type="submit">Check In</button>
    </form>
</body>
</html>
