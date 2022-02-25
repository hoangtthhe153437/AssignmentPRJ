<%-- 
    Document   : Favorite
    Created on : Oct 14, 2020, 4:20:45 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Favorite</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">

    </head>
    <body>
        <div class="container">
            <!--begin of menu-->
             <jsp:include page="Menu.jsp"/>
            <!--end of menu-->
            <!--begin of list article-->
            <h2>My favorite article</h2>
            <c:forEach items="${listFavorites}" var="F">
            <div class="row">
                <div class="col-sm-4">
                    <a href="#" class="">
                        <img class="col-sm-12" src="${F.imageLink}">
                    </a>
                </div>
                <div class="col-sm-8">
                    <h3 class="title">${F.title}</h3>
                    <p>${F.description}</p>
                    <span class="text-muted">Author: <a href="#">Ellen Richey</a></span>
                </div>
            </div>
            </c:forEach>
            <!--end of list article-->
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

    </body>
</html>
