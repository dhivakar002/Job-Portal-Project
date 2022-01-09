<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.JobPortal.Model.*"%>
    <%@page import="java.util.*"%>
    <%@page import="com.JobPortal.DaoImpl.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Applicant</title>
</head>
<style>

.center {
  margin-left: auto;
  margin-right: auto;
}
</style>
<body>

<%		ApplyJobDao showJob = new   ApplyJobDao();
		List<ApplyJob> appliedList = new ArrayList<ApplyJob>();
		appliedList=showJob.showApplicant();
		%>
		
		
		<table border="2" id="allapplicants" style="text-align: center" class="center" >
			<h1 style="text-align: center"><b>Applicant List</b></h1>
			<thead>
				<tr>
				<th>S.No</th>
				   <th >Post Id</th>
					<th>Applicant Id</th>
					<th>Applicant Name</th>
					<th>Qualification</th>
					<th>Age</th>
					<th>Email</th>
					<th>Address</th>
					<th>Phone Number</th>
					<th>Skill</th>
					<th>Applied Date</th>
					
					
					</tr>
			</thead>
			<br>
			<br>
			
						<tbody>
				<%
					int i = 0;
					for (ApplyJob list : appliedList) {
						i++;
						
				%>
				<tr>
					<td><%=i%></td>
					<td><%=list.getPostId()%></td>
					<td><%=list.getApplicantId()%></td>
					<td> <%=list.getApplicantName()%></td>	
					<td><%=list.getQualification() %></td>	
					<td><%=list.getAge()%></td>	
					<td><%=list.getEmail() %></td>			
					<td> <%=list.getAddress()%></td>
					<td> <%=list.getPhoneNumber()%></td>
					<td><%=list.getSkill() %></td>
					<td><%=list.getDate() %></td>
									
			</tr>
					
					<%
				}
				%>
					</tbody>
		           </table>

</body>
</html>