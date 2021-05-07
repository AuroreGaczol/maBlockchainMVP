
<%--
  Created by IntelliJ IDEA.
  User: aurore
  Date: 06/04/2021
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenue !</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<main>
<header>
    <p>Bienvenue sur le site du stage d'Aurore dans la Blockchain !</p>
</header>
    <p><a href="login.jsp">Je suis déja inscrit</a></p>
    <container>
        <form action="signin" method="post">
            <fieldset>
                <legend>Bienvenue !</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>
                <label for="login">Login <span class="requis">*</span></label>
                <input type="text" id="login" name="login" value="" size="20" maxlength="60" />
                <br />

                <label for="password">Password <span class="requis">*</span></label>
                <input type="password" id="password" name="password" value="" size="20" maxlength="20" />
                <br />

                <label for="email">Email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="100" />
                <br />

            <input type="submit" value="Submit"/>
            </fieldset>
        </form>
    </container>
    <footer>

    </footer>
</main>
</body>
</html>
