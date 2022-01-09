<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Status</title>
</head>
<link rel="stylesheet" href="UpdateApplicantStatus.css">
<body background="https://images.pexels.com/photos/1631677/pexels-photo-1631677.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500">

<form action="UpdateJobStatus" method="post" >
<div class="form-box">
<h1>Applicant Status</h1>
<input type ="number" name = "postId" placeholder = "Enter Post Id" pattern = "[0-9]{4}" autofocus required ><br><br>
<input type ="number" name = "applicantId" placeholder ="Enter Applicant Id" pattern = "[0-9]{3}" required><br><br>
<input type ="text" name = "status" placeholder="Enter Status" pattern = "[a-zA-Z]{5,9}" required><br><br>

 
 <input type ="submit" style="background-color: red" value ="Update">
    
</div>
</form>
</body>
</html>