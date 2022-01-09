package com.Package.TestMain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.JobPortal.DaoImpl.ApplyJobDao;
import com.JobPortal.DaoImpl.CompanyProfileDao;
import com.JobPortal.DaoImpl.JobStatusDao;
import com.JobPortal.DaoImpl.PostJobDao;
import com.JobPortal.DaoImpl.User_InfoDAO;
import com.JobPortal.Model.ApplyJob;
import com.JobPortal.Model.CompanyModel;
import com.JobPortal.Model.JobStatusModel;
import com.JobPortal.Model.PostJobModel;
import com.JobPortal.Model.User_Info;



public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplyJobDao obj4 = new ApplyJobDao();
		PostJobDao obj3 = new PostJobDao();
		CompanyProfileDao obj2 = new CompanyProfileDao();
		JobStatusDao obj5 = new JobStatusDao();
		
		Scanner sc = new Scanner(System.in);
		int n;
	System.out.println("welcome to Job Portal  \nSelect :  1).Recruiter Sign-up 2).Recruiter Login 3).Candidate Sign-up 4).Candidate Login ");
		n = Integer.parseInt(sc.nextLine());
		
		switch (n) {
		
			case 1:
			
			boolean flag1 =false;
			int companyId = 0;
			String company_Name;
			String user_Name;
			String user_role;
			long phone_Number=0;
			String city;
			String mail_id;
			String pswd;			
			
			do {
				System.out.println("Enter the Company-Id");
				String  check=sc.nextLine();
				if (check.matches("[0-9]{3}")&&check!="")
				{
				
				flag1=false;
				companyId=Integer.parseInt(check);
				break;
				}
				else
				{
				System.out.println("invalid");
				flag1=true;
				}

				} while(flag1);
			
			do {
				System.out.println("Enter the Company Name");
				company_Name = sc.nextLine();
				if (company_Name.matches("[A-Za-z ]+"))
				{
					
				 flag1=false;
				}
				else 
				{
					System.out.println("invalid");
					flag1=true;
				}
			}while(flag1);
			
			do {
				System.out.println("Enter the userName");
			     	 user_Name = sc.nextLine();
				if (user_Name.matches("[a-zA-Z., ]+"))
				{
					
				 flag1=false;
				}
				else 
				{
					System.out.println("invalid");
					flag1=true;
				}
			}while(flag1);
			
			do {
				System.out.println("Enter the user-Role");
			     	 user_role = sc.nextLine();
				if (user_role.trim().matches("[a-zA-Z ]+"))
				{
					
				 flag1=false;
				}
				else 
				{
					System.out.println("invalid");
					flag1=true;
				}
			}while(flag1);
			
			do {
				System.out.println("Enter the phone_Number");
				String  check=sc.nextLine();
				if (check.matches("[0-9]{10}")&&check!="")
				{
				
				flag1=false;
				phone_Number=Long.parseLong(check);
				break;
				}
				else
				{
				System.out.println("invalid");
				flag1=true;
				}

				} while(flag1);
			
			
			do {
				System.out.println("Enter Your City");
				 city = sc.nextLine();
				if (city.trim() .matches("[a-zA-Z ]+"))
				{
				 flag1=false;
				}
				else 
				{
					System.out.println("invalid");
					flag1=true;
				}
			}while(flag1);
			
			do {
				System.out.println("Enter the email id");
				mail_id =sc.nextLine();
				if (mail_id.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")&&mail_id!="")
				{
				
				flag1=false;
				}
				else
				{
				System.out.println("invalid");
				flag1=true;
				}}
				while(flag1);
			
		
			

			do {
				System.out.println("Enter the password");
				 pswd = sc.nextLine();
				if (pswd.matches("[a-zA-Z0-9@#]+")&&pswd!="")
				{
					
				 flag1=false;
				}
				else 
				{
					System.out.println("invalid");
					flag1=true;
				}
			}while(flag1);
			
			
			CompanyModel str1 = new CompanyModel(companyId,company_Name, user_Name,user_role,phone_Number, city, mail_id, pswd );
			//CompanyProfileDao obj2 = new CompanyProfileDao();
			obj2.insertCompanyProfile(str1);
			break;
			
		case 2:
			
			CompanyProfileDao ob = new CompanyProfileDao();
			ob.companyLogin();
			
			System.out.println("1).Update Company Profile 2).Post Job 3).View Applicants 4) Insert Application Status 5).Update Applicant Status 6).Delete Post Job with applicant status 7).Update Post Jobs");
			int choose= Integer.parseInt(sc.nextLine());
			
			switch(choose) {
			
			case 1:  //update company profile
				System.out.println("Enter Company Details");
				boolean flag11 =false;
				int companyId1 = 0;
				String companyName;
				String userName1;
				String userRole;
				long phoneNumber2=0;
				String cities;
				String mailid;
				String paswd;			
				
				do {
					System.out.println("Enter the Company-Id");
					String  check=sc.nextLine();
					if (check.matches("[0-9]{3}")&&check!="")
					{
					
					flag11=false;
					companyId1=Integer.parseInt(check);
					break;
					}
					else
					{
					System.out.println("invalid");
					flag11=true;
					}

					} while(flag11);
				
				do {
					System.out.println("Enter the Company Name");
					companyName = sc.nextLine();
					if (companyName.matches("[A-Za-z ]+"))
					{
						
					 flag11=false;
					}
					else 
					{
						System.out.println("invalid");
						flag11=true;
					}
				}while(flag11);
				
				do {
					System.out.println("Enter the userName");
				     	 userName1 = sc.nextLine();
					if (userName1.matches("[a-zA-Z., ]+"))
					{
						
					 flag11=false;
					}
					else 
					{
						System.out.println("invalid");
						flag11=true;
					}
				}while(flag11);
				
				do {
					System.out.println("Enter the user-Role");
				     	 userRole = sc.nextLine();
					if (userRole.trim().matches("[a-zA-Z ]+"))
					{
						
					 flag11=false;
					}
					else 
					{
						System.out.println("invalid");
						flag11=true;
					}
				}while(flag11);
				
				do {
					System.out.println("Enter the phone_Number");
					String  check=sc.nextLine();
					if (check.matches("[0-9]{10}")&&check!="")
					{
					
					flag11=false;
					phoneNumber2=Long.parseLong(check);
					break;
					}
					else
					{
					System.out.println("invalid");
					flag11=true;
					}

					} while(flag11);
				
				
				do {
					System.out.println("Enter Your City");
					 cities = sc.nextLine();
					if (cities.trim() .matches("[a-zA-Z ]+"))
					{
					 flag11=false;
					}
					else 
					{
						System.out.println("invalid");
						flag11=true;
					}
				}while(flag11);
				
				do {
					System.out.println("Enter the email id");
					mailid =sc.nextLine();
					if (mailid.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")&&mailid!="")
					{
					
					flag11=false;
					}
					else
					{
					System.out.println("invalid");
					flag11=true;
					}}
					while(flag11);
				

				do {
					System.out.println("Enter the password");
					 paswd = sc.nextLine();
					if (paswd.matches("[a-zA-Z0-9@#]+")&&paswd!="")
					{
						
					 flag11=false;
					}
					else 
					{
						System.out.println("invalid");
						flag11=true;
					}
				}while(flag11);
				
				
				CompanyModel str11 = new CompanyModel(companyId1,companyName, userName1,userRole,phoneNumber2, cities, mailid, paswd );
				
				obj2.updateCompanyProfile(str11);
				break;
				
			case 2: //post Job
				
				boolean flag2 =false;
				 int company_IdNo = 0;
				 String job_Title;
				 int salaryRs = 0;
				 String experience;
				 String category;
				
							
								
				 do {
						System.out.println("Enter the Company-Id");
						String  check=sc.nextLine();
						if (check.matches("[0-9]{3}")&&check!="")
						{
						
						flag2=false;
						company_IdNo=Integer.parseInt(check);
						break;
						}
						else
						{
						System.out.println("invalid");
						flag2=true;
						}

						} while(flag2);
				
				do {
					System.out.println("Enter the jobTitle");
					job_Title = sc.nextLine();
					if (job_Title.trim().matches("[a-zA-Z ]+"))
					{
						
					 flag2=false;
					}
					else 
					{
						System.out.println("invalid");
						flag2=true;
					}
				}while(flag2);
				
				do {
					System.out.println("Enter the Salary");
					String  check=sc.nextLine();
					if (check.matches("[0-9]+")&&check!="")
					{
					
					flag2=false;
					salaryRs=Integer.parseInt(check);
					break;
					}
					else
					{
					System.out.println("invalid");
					flag2=true;
					}

					} while(flag2);
				
				
				do {
					System.out.println("Enter Your Experience");
					experience = sc.nextLine();
					if (experience.trim().matches("[0-9a-zA-Z ]+"))
					{
					 flag2=false;
					}
					else 
					{
						System.out.println("invalid");
						flag2=true;
					}
				}while(flag2);
				
				do {
					System.out.println("Enter the Category of job");
					category = sc.nextLine();
					if (category.matches("[a-zA-Z]+")&&category!="")
					{
						
					 flag2=false;
					}
					else 
					{
						System.out.println("invalid");
						flag2=true;
					}
				}while(flag2);
				
			
				
				PostJobModel str2= new PostJobModel (company_IdNo,job_Title,salaryRs,experience,category);
				
				
				obj3.postJobs(str2);
				break;
				
			case 3: //View Applicant
				
				obj4.showApplicant();
				
				break;
				
			case 4:
				 //Insert Applicant Status
				boolean flag4 =false;
				 int postId = 0;
				 int applicantId = 0;
				 String status;
				
				do {
					System.out.println("Enter Job post ID");
					String  check=sc.nextLine();
					if (check.matches("[0-9]{4}")&&check!="")
					{
					
					flag4=false;
					postId=Integer.parseInt(check);
					break;
					}
					else
					{
					System.out.println("invalid");
					flag4=true;
					}

					} while(flag4);
				
				do {
					System.out.println("Enter Applicant ID");
					String  check=sc.nextLine();
					if (check.matches("[0-9]{3}")&&check!="")
					{
					
					flag4=false;
					applicantId=Integer.parseInt(check);
					break;
					}
					else
					{
					System.out.println("invalid");
					flag4=true;
					}

					} while(flag4);
				
				do {
					System.out.println("Update Job Status");
					status = sc.nextLine();
					if (status.trim().matches("[a-zA-Z,]+"))
					{
						
					 flag4=false;
					}
					else 
					{
						System.out.println("invalid");
						flag4=true;
					}
					} while(flag4);
				JobStatusModel pc = new JobStatusModel(postId,applicantId,status);
				
				
				obj5.jobStatus(pc);
					
				break;
				
			case 5:// Update Applicant Status
				
				boolean flag12 =false;
				int postId1=0;
				int applicantId2 = 0;
				String statuss;
								
				
				
				do {
					System.out.println("Enter the Applicant-Id");
					String  check=sc.nextLine();
					if (check.matches("[0-9]{3}")&&check!="")
					{
					
					flag12=false;
					applicantId2=Integer.parseInt(check);
					break;
					}
					else
					{
					System.out.println("invalid");
					flag12=true;
					}

					} while(flag12);
				
				
				
				do {
					System.out.println("Enter the Job Status");
					statuss = sc.nextLine();
					if (statuss.matches("[A-Za-z]+"))
					{
						
					 flag12=false;
					}
					else 
					{
						System.out.println("invalid");
						flag12=true;
					}
				}while(flag12);
				
				do {
					System.out.println("Enter the Post-Id");
					String  check=sc.nextLine();
					if (check.matches("[0-9]{4}")&&check!="")
					{
					
					flag12=false;
					postId1=Integer.parseInt(check);
					
					}
					else
					{
					System.out.println("invalid");
					flag12=true;
					}

					} while(flag12);
				
				JobStatusModel pc1 = new JobStatusModel( postId1,applicantId2 ,statuss);
				JobStatusDao obj8 = new JobStatusDao();
				obj8.updateJobStatusDao(pc1);
				break;
			
			case 6:  //.Delete Post Job with applicant status
				
				System.out.println("enter the post id");
				int postIds = Integer.parseInt(sc.nextLine());
				obj3.deletePostJob(postIds);
			break;
				
			case 7:   // Update Post Jobs
				
				System.out.println("Enter to update Post Job details");
				int CompanyId=0;
				String jobTitle;
				int income = 0;
				String service;
				String categories;
				
				do {
					System.out.println("Enter the jobTitle");
					jobTitle = sc.nextLine();
					if (jobTitle.trim().matches("[a-zA-Z ]+"))
					{
						
					 flag2=false;
					}
					else 
					{
						System.out.println("invalid");
						flag2=true;
					}
				}while(flag2);
				
				do {
					System.out.println("Enter the Salary");
					String  check=sc.nextLine();
					if (check.matches("[0-9]+")&&check!="")
					{
					
					flag2=false;
					income=Integer.parseInt(check);
					break;
					}
					else
					{
					System.out.println("invalid");
					flag2=true;
					}

					} while(flag2);
				
				
				do {
					System.out.println("Enter Your Experience");
					service = sc.nextLine();
					if (service.trim().matches("[0-9a-zA-Z ]+"))
					{
					 flag2=false;
					}
					else 
					{
						System.out.println("invalid");
						flag2=true;
					}
				}while(flag2);
				
				do {
					System.out.println("Enter the Category of job");
					categories = sc.nextLine();
					if (categories.matches("[a-zA-Z]+")&&categories!="")
					{
						
					 flag2=false;
					}
					else 
					{
						System.out.println("invalid");
						flag2=true;
					}
				}while(flag2);
				
				 do {
						System.out.println("Enter the Company-Id");
						String  check=sc.nextLine();
						if (check.matches("[0-9]{3}")&&check!="")
						{
						
						flag2=false;
						CompanyId=Integer.parseInt(check);
						break;
						}
						else
						{
						System.out.println("invalid");
						flag2=true;
						}

						} while(flag2);
				
				PostJobModel str21= new PostJobModel (CompanyId,jobTitle,income,service,categories);					
				obj3.insertPostJobDao(str21);
				break;
			
			}
			System.exit(0);
		case 3: //Candidate Register
			boolean flag =false;
			String firstName;
			String lastName;			
			String userName;
			String gender;
			String email_id;
			String password;	
			long phoneNumber=0;
			
			
			do {
				System.out.println("Enter the firstName");
				 firstName = sc.nextLine();
				if (firstName.matches("[a-zA-Z]+")&&firstName!="")
				{
					
				 flag=false;
				}
				else 
				{
					System.out.println("invalid");
					flag=true;
				}
			}while(flag);
			
			do {
				System.out.println("Enter the lastName");
				 lastName = sc.nextLine();
				if (lastName.matches("[a-zA-Z]+")&&lastName!="")
				{
					
				 flag=false;
				}
				else 
				{
					System.out.println("invalid");
					flag=true;
				}
			}while(flag);
			
			do {
				System.out.println("Enter the userName");
			     	 userName = sc.nextLine();
				if (userName.trim().matches("[A-za-z]+"))
				{
					
				 flag=false;
				}
				else 
				{
					System.out.println("invalid");
					flag=true;
				}
			}while(flag);
			
			do {
				System.out.println("Enter Your Gender");
				 gender = sc.nextLine();
				if (gender.matches("[a-zA-Z]+")&&gender!="")
				{
				 flag=false;
				}
				else 
				{
					System.out.println("invalid");
					flag=true;
				}
			}while(flag);
			
			do {
				System.out.println("Enter the email id");
				email_id =sc.nextLine();
				if (email_id.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")&&email_id!="")
				{
				
				flag=false;
				}
				else
				{
				System.out.println("invalid");
				flag=true;
				}}
				while(flag);
			
		
			

			do {
				System.out.println("Enter the password");
				 password = sc.nextLine();
				if (password.matches("[a-zA-Z0-9@#]+")&&password!="")
				{
					
				 flag=false;
				}
				else 
				{
					System.out.println("invalid");
					flag=true;
				}
			}while(flag);
			
			
			
			do {
				System.out.println("Enter the phoneNumber");
				String  check=sc.nextLine();
				if (check.matches("[0-9]{10}")&&check!="")
				{
				
				flag=false;
				phoneNumber=Long.parseLong(check);
				break;
				}
				else
				{
				System.out.println("invalid");
				flag=true;
				}

				} while(flag);

			User_Info str = new User_Info(firstName, lastName,userName,gender, email_id,  password, phoneNumber);
		User_InfoDAO obj = new User_InfoDAO();
		obj.insert(str);
		
		
		case 4://Candidate Login
	  
	   
		User_InfoDAO obj1 = new User_InfoDAO();
		obj1.login();
		
		System.out.println(" 1).view Post Job 2).Apply Job 3).View Applied Job Status 4).Search By Salary 5).Search By Experience 6).Search By Location 7).Search By Company");
		int userChoice = Integer.parseInt(sc.nextLine());
		
		switch(userChoice) {
		
		case 1:
		
			// view list of jobs post by recruiter
						obj3.postJob();
						break;
						
		case 2://Apply Job
			boolean flag3 =false;
			 int postIdNo = 0;
			 String candidateName;
			 String qualificationDegree;
			 String skills;
			 int age = 0;
			 String emailId;
			 String passname;
			 String location;
			 long phoneNumber1 = 0;
			
			
			do {
				System.out.println("Enter the Post Id");
				String  check=sc.nextLine();
				if (check.matches("[0-9]{4}")&&check!="")
				{
				
				flag3=false;
				postIdNo=Integer.parseInt(check);
				break;
				}
				else
				{
				System.out.println("invalid");
				flag3=true;
				}

				} while(flag3);
			
			do {
				System.out.println("Enter the Candidate Name");
				candidateName = sc.nextLine();
				if (candidateName.trim().matches("[a-zA-Z ]+"))
				{
					
				 flag3=false;
				}
				else 
				{
					System.out.println("invalid");
					flag3=true;
				}
			}while(flag3);
			
			do {
				System.out.println("Enter the qualificationDegree");
				qualificationDegree = sc.nextLine();
				if (qualificationDegree.trim().matches("[a-zA-Z., ]+"))
				{
					
				 flag3=false;
				}
				else 
				{
					System.out.println("invalid");
					flag3=true;
				}
			}while(flag3);
			
			do {
				System.out.println("Enter Your Skill");
				skills = sc.nextLine();
				if (skills.trim().matches("5]+"))
				{
					
				 flag3=false;
				}
				else 
				{
					System.out.println("invalid");
					flag3=true;
				}
			}while(flag3);
			
			do {
				System.out.println("Enter Your Age");
				String  check=sc.nextLine();
				if (check.matches("[0-9]{2}")&&check!="")
				{
				
				flag3=false;
				age=Integer.parseInt(check);
				break;
				}
				else
				{
				System.out.println("invalid");
				flag3=true;
				}

				} while(flag3);
			
			do {
				System.out.println("Enter the email id");
				emailId =sc.nextLine();
				if (emailId.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")&&emailId!="")
				{
				
				flag3=false;
				}
				else
				{
				System.out.println("invalid");
				flag3=true;
				}}
				while(flag3);
						

			do {
				System.out.println("Enter your password");
				 passname = sc.nextLine();
				if (passname.matches("[a-zA-Z0-9@#]+")&&passname!="")
				{
					
				 flag3=false;
				}
				else 
				{
					System.out.println("invalid");
					flag3=true;
				}
			}while(flag3);
			
			do {
				System.out.println("Enter Your location");
				 location = sc.nextLine();
				if (location.matches("[a-zA-Z 0-9 /,]+")&&location!="")
				{
				 flag3=false;
				}
				else 
				{
					System.out.println("invalid");
					flag3=true;
				}
			}while(flag3);
			
			do {
				System.out.println("Enter the phoneNumber");
				String  check=sc.nextLine();
				if (check.matches("[0-9]{10}")&&check!="")
				{
				
				flag3=false;
				phoneNumber1=Long.parseLong(check);
				break;
				}
				else
				{
				System.out.println("invalid");
				flag3=true;
				}

				} while(flag3);
			
			ApplyJob str3 = new ApplyJob(postIdNo,candidateName,qualificationDegree,skills,age,emailId,passname,location,phoneNumber1);
			
			
			obj4.applyJob(str3);
			break;
			
		case 3:
			
			//view Applied Job Status
			obj4.viewAppliedJobStatus();
			
			
		case 4: //Search By Salary
			
			boolean flag33 =false;
			int salary=0;
			do {
				System.out.println("Enter the Salary");
				String  check=sc.nextLine();
				if (check.matches("[0-9]+")&&check!="")
				{
				
				flag33=false;
				salary=Integer.parseInt(check);
				break;
				}
				else
				{
				System.out.println("invalid");
				flag33=true;
				}

				} while(flag33);
			//PostJobModel str22 = new PostJobModel();
			obj3.searchBySalary(salary);
		
		
		case 5: //Search By Experience
			
			boolean flag23 =false;
			String experience;
			do {
				System.out.println("Enter the Experience (like 1 year)");
				experience = sc.nextLine();
				if (experience.trim().matches("[0-9a-zA-Z ]+"))
				{
				 flag23=false;
				}
				else 
				{
					System.out.println("invalid");
					flag23=true;
				}
			}while(flag23);

			obj3.searchByExperience(experience);
			
			
	case 6: //Search By Location
			
			boolean flag24 =false;
			String location1;
			do {
				System.out.println("Enter the Location (like Madurai)");
				location1 = sc.nextLine();
				if (location1.trim().matches("[0-9a-zA-Z ]+"))
				{
				 flag24=false;
				}
				else 
				{
					System.out.println("invalid");
					flag24=true;
				}
			}while(flag24);

			obj3.searchByLocation(location1);
			
	case 7:
				// Search By Company
		
		boolean flag25=false;
		String CompanyName;
		do {
			System.out.println("Enter the Company Name (like Ford)");
			CompanyName = sc.nextLine();
			if (CompanyName.trim().matches("[0-9a-zA-Z ]+"))
			{
				flag25=false;
			}
			else 
			{
				System.out.println("invalid");
				flag25=true;
			}
		}while(flag25);

		obj3.searchByCompany(CompanyName);
			
		}
			
					default:
			System.out.println("enter the valid option");
			break;

		}

	}

}
