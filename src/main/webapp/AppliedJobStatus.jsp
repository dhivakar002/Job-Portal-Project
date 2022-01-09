<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.JobPortal.Model.*"%>
    <%@page import="java.util.*"%>
    <%@page import="com.JobPortal.DaoImpl.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Applied Status</title>
</head>
<body>
<%		JobStatusDao status = new   JobStatusDao();
		List<JobStatusModel> update = new ArrayList<JobStatusModel>();
		update=status.updateStatus();
		%>
		
			<table border="2" id="alljobs">
			<h1><b>Applicant Status</b></h1>
			<thead>
				<tr>
				<th>S.No</th>
				   <th >Post Id</th>
					<th>Applicant Id</th>
					<th>Status</th>
					<th>Update</th>
					
					</tr>
					</thead>
			<br>
			<br>
			
						<tbody>
				<%
					int i = 0;
					for (JobStatusModel list : update) {
						i++;
										%>
				<tr>
					<td><%=i%></td>
					<td><%=list.getPostID()%></td>
					<td><%=list.getApplicantID()%></td>
					<td> <%=list.getStatus()%></td>	
					
					<td><a href="UpdateJobStatus.jsp">Update</a></td>
									
			</tr>
					
					<%
				}
				%>
					</tbody>
		           </table>
</body>
</html>
