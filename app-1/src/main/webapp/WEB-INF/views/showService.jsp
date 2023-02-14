<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Show Services</title>
  </head>
  <body class="bg-light">
  
  <div class="container p-2">
  
  	<div class="row">
  		<h2 class="display-3 b">All Service Details</h2>
  	</div>

	  <table class="table table-dark table-striped table-hover">
		  <thead>
			<tr>
			    <th scope="col">Id</th>
			    <th>Service Name</th>
			    <th>Service Price</th>
			</tr>
		  </thead>
		  <tbody>
		  	<c:forEach var="service" items="${list_services}">
				<tr>
			      <th scope="row">${service.id}</th>
			      <th>${service.name}</th>
			      <th>${service.price}</th>
			     </tr>
			</c:forEach>
		  </tbody>
		</table>
	
	</div>
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

  </body>
</html>