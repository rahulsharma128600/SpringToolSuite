<%@page import="java.util.*" %>
<html>
    <body>
        <ul>
        <% ArrayList<String> al = (ArrayList<String>)request.getAttribute("list");
        for(String s : al)
        {
        %>
            <li><%=s %></li>
        <%}%>
        </ul>        
    </body>
</html>