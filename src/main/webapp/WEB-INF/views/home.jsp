<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="css/home.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="css/login.css">
    <script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  </head>
  <body>
  <jsp:include page="../header_home.jsp"></jsp:include>

    <div class="container text-center">
        <div class="row align-items-end">
          <div class="col col-lg-4 align-self-center">
          <form class="" action="login" method="post">
            <h2>Welcome to your professional community</h2><br>
            <div class="mb-3">
                <input type="email" class="form-control" id="emailAddress" placeholder="Email" name="emailAddress">
            </div>
            <div class="mb-3">
                <input type="password" class="form-control" id="password" placeholder="Password" name="password">
            </div>
            <button type="submit" class="button1 rounded">Sign In</button>
            <hr style="width:92%;text-align:left;margin-left:0"><h3>OR</h3>
            
            <hr style="width:92%;text-align:right;">
            <div class="col-md-12"> 
                <ul class="social-network social-circle"> 
                    <li><a href="#" class="icoFacebook" title="Facebook"><i class="bi bi-facebook"></i></a></li> 
                    <li><a href="#" class="icoTwitter" title="Twitter"><i class="bi bi-twitter" fill="currentColor"></i></a></li> 
                    <li><a href="#" class="icoGoogle" title="Google +"><i class="bi bi-google"></i></a></li> 
                </ul> 
            </div>
            </form> 
          </div>
          
          <div class="col col-lg-8 align-self-end">
            <img src="images/u4.png" alt="" height="500" width="500" class="cover">
          </div>
        </div>
      </div>
      <jsp:include page="../footer.jsp"></jsp:include>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  </body>
</html>