<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.JobPortal.Model.*"%>
    <%@page import="java.util.*"%>
    <%@page import="com.JobPortal.DaoImpl.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Jobs</title>
</head>
<body>
<body>

<%		PostJobDao showJob = new   PostJobDao();
		List<PostJobModel> jobList = new ArrayList<PostJobModel>();
		jobList=showJob.showJobs();
		%>
		
		
		<table border="2" id="alljobs">
			<h1><b>Job List</b></h1>
			<thead>
				<tr>
				<th>S.No</th>
				   <th >Company Id</th>
					<th>Post Id</th>
					<th>Job Title</th>
					<th>Salary</th>
					<th>Experience</th>
					<th>Category</th>
					<th>Post Date</th>
					<th>Apply Link</th>
					
					
					</tr>
			</thead>
			<br>
			<br>
			
						<tbody>
				<%
					int i = 0;
					for (PostJobModel list : jobList) {
						i++;
						
				%>
				<tr>
					<td><%=i%></td>
					<td><%=list.getCompanyId()%></td>
					<td><%=list.getPostId()%></td>
					<td> <%=list.getJobTitle()%></td>	
					<td><%=list.getIncome() %></td>	
					<td><%=list.getService()%></td>	
					<td><%=list.getCategories() %></td>			
					<td> <%=list.getPostDate()%></td>
					<td><a href="ApplyJob.jsp">Apply</a></td>
									
			</tr>
					
					<%
				}
				%>
					</tbody>
		           </table>
</body>
</html>