<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="com.JobPortal.Model.*"%>
    <%@page import="java.util.*"%>
    <%@page import="com.JobPortal.DaoImpl.*"%>
   
<!DOCTYPE html>
<html>
<head>
<style>
table.center {
  margin-left: 350px; 
  margin-right: auto;
}
</style>
<meta charset="ISO-8859-1">
<title>Jobs By Experience</title>
</head>
<body>
<%		PostJobDao search = new   PostJobDao();
		List<PostJobModel> searchList =(List<PostJobModel>) session.getAttribute("Experience");
		
		for(int i=0; i<searchList.size();i++){
			System.out.println(searchList.get(i));
			PostJobModel searchs = searchList.get(i);
			
		     searchList=search.SearchExp(searchs.getService());
		     System.out.println("Experience : "+searchs.getService());
		%>
		
			<table border="2" id="alljobs" style="margin-right: 70px;" class = "center">
			<h1 align="center" style="margin-right: 50px;"><b>Search By Experience List:</b></h1>
			<thead>
				<tr>
				<th>S.No</th>
				   <th >Company Id</th>
					<th>Company Name</th>
					<th>Post Id</th>					
					<th>Salary</th>	
					<th>Job Title</th>				
					<th>Location</th>
					<th>Experience</th>
					<th>Apply</th>
					</tr>
					</thead>
			<br>
			<br>
			
						<tbody>
				<%
					
					for (PostJobModel list : searchList) {
						i++;
						
						System.out.println(list);
										%>
				<tr>
					<td><%=i%></td>
					<td><%=list.getCompanyId()%></td>
					<td><%=list.getCompanyName()%></td>
					<td> <%=list.getPostId()%></td>	
					<td> <%=list.getIncome()%></td>	
					<td> <%=list.getJobTitle()%></td>										
					<td> <%=list.getLocation()%></td>
					<td> <%=list.getService()%></td>
					<td><a href="ApplyJob.jsp">Apply</a></td>
					
													
			</tr>
					
					<%
				}}
				%>
					</tbody>
		           </table>
</body>
</html>