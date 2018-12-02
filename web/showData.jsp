<%-- 
    Document   : showData
    Created on : 28 Nov, 2018, 2:16:51 PM
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
        <%@page import="java.util.ArrayList, Modal.*"%>
        <%
            ApartmentDao adao = new ApartmentDao();
            ArrayList <AppartMentBean> arr = adao.showApp();
        %>
        <table>
                <tr>
                    <th> RoomId </th>
                    <th> Email ID </th>
                    <th> Address </th>
                    <th> State </th>
                </tr>
            <%
            for(AppartMentBean a : arr)
            {
            %>
                <tr>
                    <td><%=a.getRoomId()%></td>
                    <td><%=a.getEmail()%></td>
                    <td><%=a.getAddress()%></td>
                    <td><%=a.getState()%></td>
                </tr>
            <%
            }
            %>
        </table>
    </body>
</html>
