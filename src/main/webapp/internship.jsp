<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
<%--    <title>JSP Page</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Hello World!</h1>--%>
<%--</body>--%>
<%--</html>--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="style.css">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $( function() {
            $( "#accordion" ).accordion();
        } );
    </script>
</head>
<body>
<main >
    <header class="col-10">
        <img src="${pageContext.request.contextPath}/img/the-blockchain-group-tbg.svg" width="33%" alt="logo">
    </header>
    <container>
        <div id="accordion" class="bg-white container-fluid">

              <h3>etape 1</h3>
            <div class="mauve">
                <p>Bienvenue</p>
               <p>${param.login}</p>
            </div>

                <h3>etape 2</h3>
            <div class="">
            <p>Les voitures au parking :</p>

                <table>
                    <tr>
                        <th>Make</th>
                        <th>Model</th>
                        <th>Model</th>
                        <th>Owner</th>
                    </tr>
                    <c:forEach items="${cars}" var="c" >
                        <tr>
                            <td>${c.make} </td>
                            <td>${c.model} </td>
                            <td>${c.colour} </td>
                            <td>${c.owner} </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </container>
    <footer>
       By @Oror404
    </footer>
</main>
</body>
</html>