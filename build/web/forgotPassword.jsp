<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/signup-style.css">
<title>Forgot Password</title>
</head>
<body>
<div id='container'>
  <div class='signup'>
      <form action="forgotPasswordAction.jsp" method="post">
          <input type="email" name="email" placeholder="Enter Email" required>
          <input type="number" name="mobileNumber" placeholder="Enter Mobile Number" required>
          
          <select name="securityQuestion">
            <option value="What is your pet name?">What is your pet name?</option>
            <option value="What is your first school?">What is your first school?</option>
            <option value="What is your first best friend?">What is your first best friend?</option>
            <option value="What is your favourite subject?">What is your favorite subject?</option>
                 </select>
          <input type="text" name="answer" placeholder="Enter Answer" required>
          <input type="password" name="newPassword" placeholder="Enter a new password to set" required>
          <input type="submit" value="Save">
      </form>
      <h2><a href="login.jsp">Login</a></h2>
  </div>
  <div class='whyforgotPassword'>
      <%
          String msg=request.getParameter("msg");
          if("done".equals(msg))
          {
         %>
   <h1>Password Changed Successfully!</h1>
 <%}%>
    <%
        if("invalid".equals(msg))
          {
         %>

<h1>Some thing Went Wrong! Try Again !</h1>
 <%}%>
    <h2>Online Shopping</h2>
    <p>The Online Shopping System is the application that allows the users to shop online without going to the shops to buy them.</p>
  </div>
</div>
</body>
</html>