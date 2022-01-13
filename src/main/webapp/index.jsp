<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
.topnav {
  background-color: #333;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
  width: 16%;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}




/* Hide the link that should open and close the topnav on small screens */
.topnav .icon {
  display: none;
}
* {box-sizing:border-box}

/* Slideshow container */
.slideshow-container {
  max-width: 900px;
  position: relative;
  margin: auto;
}

/* Hide the images by default */
.mySlides {
  display: none;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  margin-top: 102px;
  padding: 16px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 50%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}
hr.new2 {
  border-top: 1px dashed #333;
}

</style>
</head>
<body>
<h1 style="background-color: black; font-size: 31px; color: DarkOrange; back" align="left" >JOB PORTAL &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="CompanyRegister.jsp" style="color: DarkOrange">Recruiter</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<a href="UserRegister.jsp" style="color: DarkOrange">Candidate</a></h1>



<h1 style="size: 50px;text-align: center;color:DarkOrange ;">Welcome to Profesional Community</h1>
<p style="size: 25px;text-align: center;color:black ;font-size: 20px">This is one of the fastest growing networks. Hire skilled people or get hired by the top companies. </p>
<div class="slideshow-container">

    <!-- Full-width images with number and caption text -->

    
    <div class="mySlides fade" style="display: none;">
      <div class="numbertext"></div>
      <img src="Assets/3.jpg" style="width:100%;height: 430px;">
      <div class="text"></div>
    </div>
  
    <div class="mySlides fade" style="display: none;">
      <div class="numbertext"></div>
      <img src="Assets/5.jpg" style="width:100%">
      <div class="text"></div>
    </div>
  
    <div class="mySlides fade" style="display: block;">
      <div class="numbertext"></div>
      <img src="Assets/career-header.jpg" style="width:100%;height: 430px;">
      <div class="text"></div>
    </div>
  
    <!-- Next and previous buttons -->
    <a class="prev" onclick="plusSlides(-1)"></a>
    <a class="next" onclick="plusSlides(1)"></a>
  </div>
  <br>
  
  <!-- The dots/circles -->
  <div style="text-align:center">
    <span class="dot" onclick="currentSlide(1)"></span> 
    <span class="dot" onclick="currentSlide(2)"></span> 
    <span class="dot" onclick="currentSlide(3)"></span> 
  </div>
<br>
<div>
					
				<i>	<p style="font-size: 25px"><span style="color: DarkOrange">Job Seeker : </span>Technology has changed the way job seekers search for jobs and employers find qualified employees. 
					While employers still advertise job openings through traditional advertising mediums, such as local newspapers and magazines,
					 today employers and job seekers turn to online job portals to find employment matches. Job seekers can advertise their skills and search for available positions, 
					 and employers can announce employment openings through job portals such as Monster, Career Builders and USA Jobs, for federal government positions.</p>
				</i>
</b>
<h2 style="text-align: center;color:black;">
    Create economic opportunity for every member of the global workforce.
</h2>
<h2 style="text-align: center;color: black;">The mission is simple connect the world's professionals to make them more productive and
     successful.</h2>
     <hr class="new2">
     <p></p><h2 style="font-size:5vw;text-align: center;color:Indigo;);">About Us</h2><p></p>
  <b>  <p style=" color:black ;">Jobs by Skill-Call Center Jobs | Mechanical Engineering Jobs | Biotechnology Jobs | Nursing Jobs | BPO Jobs | Networking Jobs | MBA Jobs | Java Jobs | SEO Jobs | SAP Jobs<br>
			Jobs by Location-Jobs in Delhi | Jobs in Bangalore | Jobs in Mumbai |  Jobs in Chennai | Jobs in Hyderabad | Jobs in Kolkata | Jobs in Pune | Jobs in Chandigarh | Jobs in Lucknow | Jobs in Coimbatore<br>
			Jobs by Function-Banking Jobs | Biotech Jobs | Airlines Jobs | HR Jobs | Accounts Jobs | Supply Chain Jobs | Legal Jobs | Marketing Jobs | Telecom Jobs | Hotels Jobs<br>
			Jobs by Industry-IT Jobs | Pharmaceuticals Jobs | Travel Jobs | Oil and Gas Jobs | FMCG Jobs | Construction Jobs | Chemicals Jobs | Media Jobs | Retailing Jobs | PR Jobs<br>
			Career Courses-Technology Courses | Management Courses | Accounting Courses | Marketing Courses | Law & Security Courses | Quality Testing Courses | Recruitment Course<br>
			Career Center-Career Management Tips | Interview Tips | Work Life Balanace Tips | Resume Cover & Letters | Salary Negotiation | How to Job Search | Career Tips for Women | How to Save Tax<br>
			Govt. Jobs-Teaching Jobs | Defence Jobs | Bank Jobs | Railway Jobs | UPSC Jobs | SSC Jobs | Law Jobs | Engineering Jobs | Post Graduate Jobs | Ph.D Jobs<br>
			Career Services-Xpress Resume+ | Right Resume | Career Booster | Resume Highlighter<br>
			All Jobs-Walkin Jobs | Contract Jobs | Placement Jobs | Jobs for Women | Startup Jobs | International Jobs</p>
      <br>
      </b>
   <footer>
   <p style="text-align: center;background-color: #333;color: white;"><b>copyrights</b><br>
 <b>Email: info@JobPortal.com</b>  <br>
  <b> Phone_No: +91-40-66116611</b></p>
   </footer>

 

<script>
    var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none"; 
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1} 
  slides[slideIndex-1].style.display = "block"; 
  setTimeout(showSlides, 2000); // Change image every 2 seconds
}

</script>


</body>
</html>