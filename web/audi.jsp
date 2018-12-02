<%-- 
    Document   : show
    Created on : 27 Nov, 2018, 3:04:45 PM
    Author     : manu1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="java.util.ArrayList,Modal.audiinfo"%>
        <table>
            <tr>
                <th>
                    name
                </th>
                <th>
                    price
                </th>
            </tr>
            <% 
                ArrayList<audiinfo> p = (ArrayList<audiinfo>)session.getAttribute("audilist");
                
                for(int i=0;i<p.size();i++) {
            
            %>
            <tr>
                <td><%=p.get(i).car%></td>
                <td><%=p.get(i).price%></td>
            </tr>
            <%
                        }
                %>
        </table>
    </body>
</html>
