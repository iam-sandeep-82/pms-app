<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

   <!-- Bootstrap CSS -->
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

    <title>Show Patient</title>
  </head>
  <body class="bg-light">
  
  <div class="container p-2">
  
  	<div class="row">
  		<h2 class="display-3 b">Patients Details</h2>
  	</div>

	  <table class="table table-dark table-striped table-hover">
		  <thead>
		    <tr>
		      <th scope="col">Id</th>
		      <th scope="col">FirstName</th>
		      <th scope="col">LastName</th>
		      <th scope="col">Services</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach var="patient" items="${list_patients}">
				<tr>
			      <th scope="row">${patient.id}</th>
			      <td>${patient.firstname}</td>
			      <td>${patient.lastname}</td>
			      <td><a href="show-patient-services/${patient.id}">Click Here.</a></td>
			     </tr>
			</c:forEach>

		  </tbody>
		</table>
	
	</div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  
  </body>
</html>