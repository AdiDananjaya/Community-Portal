<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/login.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  </head>
  <body>
    <div class="container"> 
        <div class="row"> 
            <div class="col-md-6"> 
                <div class="card">
                    <form:form class="box" action="login" method="post">
                    <div class="alert alert-danger alert-dismissible fade show my-3 ${ message == null ? "d-none" : "d-block" }" role="alert">
			  		${ message }
			  		<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
				
				<div class="alert alert-success alert-dismissible fade show my-3 ${ scMessage == null ? "d-none" : "d-block" }" role="alert">
			  		${ scMessage }
			  		<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>  
                        <h1>Login</h1> 
                        <p class="text-secondary"> Please enter your login and password!</p> 
                        <input type="text" name="email" placeholder="Email" id="emailAddress"> 
                        <input type="password" name="password" placeholder="Password" id="password"> 
                        <a class="forgot text-secondary" href="forgot-password">Forgot password?</a> 
                        <input type="submit" name="" value="Login" href="dashboard"> 
                        <div class="col-md-12"> 
                            <ul class="social-network social-circle"> 
                                <li><a href="#" class="icoFacebook" title="Facebook"><i class="bi bi-facebook"></i></a></li> 
                                <li><a href="#" class="icoTwitter" title="Twitter"><i class="bi bi-twitter" fill="currentColor"></i></a></li> 
                                <li><a href="#" class="icoGoogle" title="Google +"><i class="bi bi-google"></i></a></li> 
                            </ul> 
                        </div> 
                    </form:form> 
                </div> 
            </div> 
        </div>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  </body>
</html>