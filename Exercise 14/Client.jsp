<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Product Details</h1>
        <form action = "Exp.jsp" method = "GET">
        Enter Product Id:<input type="text" name="t1">
        <input type="submit">
        </form>
    <%-- start web service invocation --%>
    <%
       
    try {
lab.Ex14_Service service = new lab.Ex14_Service();
lab.Ex14 port = service.getEx14Port();
// TODO initialize WS operation arguments here
java.lang.String pid = request.getParameter("t1");
// TODO process result here
java.lang.String result = port.search(pid);
out.println("Result = "+result);
if(result=="true")
{
 Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/Products");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from product");
            while(rs.next()){
                int id=rs.getInt("Pid");
                String name=rs.getString("name");
                Double price=rs.getDouble("price");
                String des=rs.getString("description");
               out.print("<center><h1>PRODUCT DETAILS</h1><table width=2>"
               + "<tr><th>ID</th><th>Name</th><th>Price</th><th>Description</th></tr>"
               + "<tr><td>'id'</td><td>'name'</td><td>'price'</td><td>'des'</td></tr>"
               + "</table></center>");
            }
        }
    } catch (Exception ex) {
// TODO handle custom exceptions here
    }
    %></center>
    <%-- end web service invocation --%>
    </body>
</html>

