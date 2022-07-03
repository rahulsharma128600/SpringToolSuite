<html>
    <body>
    <form action="save" method="POST">
        <fieldset>
        <div align="center">
            <h1 style="color:aqua; background-color:violet">Input Page</h1><br/><br/>
            Enter First Name    : <input type="text" name="fname" placeholder="First name" /><br/><br/>
            Enter Last Name     : <input type="text" name="lname" placeholder="Last name" /><br/><br/>
            Enter Date of Birth : <input type="date" name="dob" placeholder="yyyy-mm-dd" /><br/><br/>
            <input type="submit" name="save" value="SAVE" /><br/>
        </fieldset>
            <br/><br/>
            <% if(request.getAttribute("id") != null) {%>
                <h3 align="center" style="color:chocolate">Last Input ID : <%= request.getAttribute("id") %></h3>
                <% } %>
        </div>
    </form>
    </body>
</html>