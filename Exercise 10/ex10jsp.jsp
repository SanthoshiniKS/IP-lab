<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="package1.Product"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Product p1 = new Product("Product 1", 10.99, "YES");
            Product p2 = new Product("Product 2", 5.99, "NO");
            Product p3 = new Product("Product 3", 20.50, "YES");
            ArrayList<Product> list = new ArrayList<Product>();
            list.add(p1);
            list.add(p2);
            list.add(p3);
            pageContext.setAttribute("obj", list);
           
%>

       
       
     
        <table border="2px"><tr><th>Name</th><th>Mail</th><th>Mark</th></tr>
                    <c:forEach items="${pageScope.obj}" var="i">
                <tr> <td>${i.name}</td>
                    <td>${i.getPrice()}</td>
                    <td>${i.getInstock()}</td>
                </tr>
            </c:forEach>  
        </table>
    </table>
</body>
</html>