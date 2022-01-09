package com.JobPortal.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JobPortal.DaoImpl.PostJobDao;
import com.JobPortal.Model.PostJobModel;

@WebServlet("/SearchCompanyController")
public class SearchCompanyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCompanyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		try {
		String company = request.getParameter("company");
		
		System.out.println("kcfsbhjfvd");
	  PostJobDao search = new PostJobDao();
	  
        List<PostJobModel> searchlist = search.SearchCom(company);
        
        
       HttpSession session = request.getSession();
        session.setAttribute("company",searchlist );
        
        response.sendRedirect("searchCompany.jsp");
		
   
		   response.getWriter().print("Search Suceessfully");

			
		
	} catch (Exception e) {
		System.out.println(e);
		
	}

		System.out.println("welcome");
	
		}
}
