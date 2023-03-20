<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,th,td{
               border:2px solid white; 
               border-collapse: collapse;
               padding:20px;
               
            }
            body{
                background-image:url('bg1.jpg');
                background-size:cover;
                margin-left:400px;
                margin-top:200px;
                color:white;
            }
        </style>
    </head>
    <body>
        <h1 STYLE="margin-left:-50px;">DETAILS FROM THE BOOKS DATABASE</h1><BR>
        <table>
        <% 
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/books");
            Statement st = c.createStatement();;
            //To find total no. of books in the database
            ResultSet rs = st.executeQuery("select count(*) from books");
            rs.next();
            int count = rs.getInt(1);
            out.println("<tr><td>Total Number of Books in database</td><td> " + count+"</td></tr>");
            //To find Average price of books
            ResultSet rs1=st.executeQuery("select avg(price) from books");
            rs1.next();
            double avg=rs1.getDouble(1);
            out.print("<tr><td>Average price of all books </td><td> "+String.format("%.2f", avg)+"</td></tr>");
            //To find the book with highest price
            ResultSet rs2=st.executeQuery("select max(price) from books");
            rs2.next();
            double max=rs2.getDouble(1);
            ResultSet rs3=st.executeQuery("select title from books where price="+max);
            rs3.next();
            String name=rs3.getString(1);
            out.println("<tr><td>Highest priced book in the database </td><td>  "+name+"</td></tr></table>");
        %>
    </body>
</html>
