<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check-In Details</title>
</head>
<body>
     Passenger Airlines: ${reservation.passenger.getFirstName()}
     <br/>
     Operating Airlines: ${reservation.flight.getOperatingAirlines()}
     <br/>
   <form action="finalConfirmation" method="post">
    Reservation id <input type="text" id="id" name="id" value="${reservation.id}" readonly>
    Number of Bags<input type="text" name="numberOfBags"/>
    
      <button type="submit">proceed</button>
     
   </form>
 
   
  
</body>
</html>
