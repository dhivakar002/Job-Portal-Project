package com.JobPortal.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JobPortal.DaoImpl.JobStatusDao;
import com.JobPortal.Model.JobStatusModel;

@WebServlet("/UpdateJobStatus")
public class UpdateJobStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdateJobStatus() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String PostId = request.getParameter("postId");
			String ApplicantId = request.getParameter("applicantId");
			String Status = request.getParameter("status");
			

			int postId = Integer.parseInt(PostId);
			int applicantId = Integer.parseInt(ApplicantId);
			
	    
			
	      JobStatusModel objStatus = new JobStatusModel(postId,applicantId,Status);
			JobStatusDao statusDao = new JobStatusDao();
			statusDao.updateJobStatusDao(objStatus);
			
			   response.getWriter().print("Update Suceessfully");

				
			   response.sendRedirect("ApplicantHomePage.jsp");
			
		} catch (Exception e) {
			System.out.println(e);
		}

			
			}
	}