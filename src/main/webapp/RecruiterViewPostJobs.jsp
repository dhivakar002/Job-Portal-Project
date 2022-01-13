<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.JobPortal.Model.*"%>
    <%@page import="java.util.*"%>
         <%@page import="com.JobPortal.Model.CompanyModel"%>
         <%@page import="com.JobPortal.Model.PostJobModel"%>
    
    <%@page import="com.JobPortal.DaoImpl.CompanyProfileDao"%>
        <%@page import="com.JobPortal.DaoImpl.PostJobDao"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Jobs</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
.back{
background-image: url();
background-repeat: no-repeat;
width: 100%;
	height: 100%;
	background-size: cover;
	content: "";
	position: fixed;
	left: 0;
	right: 0;
	top: 0;
	bottom: 0; 
	z-index: -1;
	display: block;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

table.center {
  margin-left: 300px; 
  margin-right: auto;
}
</style>

<body>
<%
String email  =  (String)session.getAttribute("Email");
System.out.println(email);
CompanyProfileDao comDao=new CompanyProfileDao();
int companyId=comDao.getEmployee(email);

System.out.println(companyId);
%>

<div class="back">
	

 	<%	
 	PostJobDao showJob = new   PostJobDao();
		List<PostJobModel> jobList = new ArrayList<PostJobModel>();
		jobList=showJob.showJobs();
		%> 
			<%-- <% CompanyModel user=(CompanyModel)session.getAttribute("PostJobModel"); %> --%>
		<table border="2" id="alljobs" style="margin-right: 70px;"  class="table">
			<h1 align="center" style="margin-right: 100px;"><b>Job List</b></h1>
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
					<th>Delete Link</th>					
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
					<td class ="table-danger"><%=list.getCompanyId()%></td>
					<td class="table-primary"><%=list.getPostId()%></td>
					<td class="table-info"> <%=list.getJobTitle()%></td>	
					<td class="table-primary"><%=list.getIncome() %></td>	
					<td class="table-warning"><%=list.getService()%></td>	
					<td class ="table-danger"><%=list.getCategories() %></td>			
					<td class="table-primary"> <%=list.getPostDate()%></td>
			
			<% 
		int comid=	list.getCompanyId(); 
			if(comid==companyId ){ %>
					
					
									<td class="table-warning"><a href="RecruiterViewPostJobs.jsp?postId=<%=list.getPostId()%>">Delete</a></td>
						<%} 
			else{ %>
						<td><b>Can't Delete</b></td>
						<%} %>
						</tr>
						
<%} %>				
					</tbody>
		           </table>
		          
		           <% int postId=Integer.parseInt(request.getParameter("postId"));
		           showJob.deletePostJob(postId);
		           %> 
		           
		            </div>
           
</body>
</html>