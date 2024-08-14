<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>My Resume</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 80%;
            margin: auto;
            overflow: hidden;
        }
        header {
            background: #333;
            color: #fff;
            padding-top: 30px;
            min-height: 70px;
            border-bottom: #ccc 1px solid;
            text-align: center;
        }
        header h1 {
            margin: 0;
            font-size: 2em;
        }
        .content {
            display: flex;
            flex-direction: column;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .section {
            margin-bottom: 20px;
        }
        .section h2 {
            background: #333;
            color: #fff;
            padding: 10px;
            border-radius: 4px;
        }
        .section p {
            margin: 10px 0;
        }
        .skills ul {
            list-style: none;
            padding: 0;
        }
        .skills li {
            background: #e2e2e2;
            margin: 5px 0;
            padding: 10px;
            border-radius: 4px;
        }
        footer {
            text-align: center;
            padding: 10px;
            background: #333;
            color: #fff;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>Bibin</h1>
        <p> Developer | Designer | Problem Solver</p>
    </header>

    <div class="container">
        <div class="content">
            <div class="section">
                <h2>About Me</h2>
                <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
				Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit 
				in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, 
				sunt in culpa qui officia deserunt mollit anim id est laborum. </p></div>

            <div class="section">
                <h2>Experience</h2>
                <p><strong>Junior Software Developer</strong> - Zoho Corporation (2024 - Present)</p>
                <p>Responsibilities include leading development projects, collaborating with design teams, and ensuring high-quality code.</p>

            </div>

            <div class="section">
                <h2>Education</h2>
                <p><strong>Bachelor of Technology in Information Technology</strong> - Anna University (2020 - 2024)</p>
                <p>Graduated with honors, focusing on Software development and software engineering.</p>
            </div>

            <div class="section skills">
                <h2>Skills</h2>
                <ul>
					<li>Java & Python</li>
                    <li>HTML & CSS</li>
                    <li>JavaScript & jQuery</li>
                    <li>Servlets & JSP</li>
                    <li>Responsive Design</li>
                </ul>
            </div>

            <div class="section">
                <h2>Contact</h2>
                <p>Email: <a href="mailto:ceolbosco@gmail.com">MAIL</a></p>
                <p>LinkedIn: <a href="https://www.linkedin.com/in/bibin" target="_blank">linkedin.com</a></p>
            </div>
        </div>
    </div>

    <footer>
        <p>&copy; 2024 Bibin</p>
    </footer>
</body>
</html>
