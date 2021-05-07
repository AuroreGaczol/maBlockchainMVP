<%--
  Created by IntelliJ IDEA.
  User: aurore
  Date: 16/04/2021
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<container>
    <form action="login" method="post">
        <fieldset>
            <legend>Bonjour !</legend>
            <p>Renseignez vos logins</p>
            <label for="login">Login <span class="requis">*</span></label>
            <input type="text" id="login" name="login" value="" size="20" maxlength="60" />
            <br />

            <label for="password">Password <span class="requis">*</span></label>
            <input type="password" id="password" name="password" value="" size="20" maxlength="20" />
            <br />
            <div class="checkbox mb-3">
                <label> <input type="checkbox" name="remember"
                               value="remember"> Se souvenir de moi
                </label>
            </div>

            <input type="submit" value="Submit"/>
        </fieldset>
    </form>


</container>
</body>
</html>
