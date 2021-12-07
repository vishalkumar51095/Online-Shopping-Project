<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/signup-style.css">
<title> Sign up </title>
</head>
<body>
<div id='container'>
  <div class='signup'>
      <form action="signupAction.jsp" method="post" >
          <input type="text" name="name" placeholder="Enter Name" required>
          <input type="email" name="email" placeholder="Enter Email" required>
          <input type="number" name="mobileNumber" placeholder="Enter Mobile Number" required>
          
          <select name="securityQuestion" required>
            <option value="What is your pet name?" > What is your pet name? </option>
            <option value="What is your first school?"> What is your first school? </option>
            <option value="What is your first best friend?"> What is your first best friend? </option>
            <option value="What is your favourite subject?"> What is your favorite subject? </option>
          </select>
          <input type="text" name="answer" placeholder="Enter answer" required>
          <input type="password" name="password" placeholder="Enter password" required>
          <input type="submit" value="signup">
      </form>
     
    
      <h2><a href="login.jsp"> Login </a></h2>
  </div>
  <div class='whysign'>
      <%
          String msg=request.getParameter("msg");
          if("valid".equals(msg))
          {
         %>
<h1>Successfully Registered</h1>
<%
}%>
<% if("invalid".equals(msg))
{    
%>
<h1>Something Went Wrong! Try Again !</h1>
<%}%>
    <h2>Online Shopping</h2>
    <p>The Online Shopping System is the application that allows the users to shop online without going to the shops to buy them.</p>
  </div>
</div>
</body>
</html>