<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav style="margin-bottom: 20px" class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="home">Home</a>
    <a class="navbar-brand" href="favorite">Favorite</a>
    <a class="navbar-brand" href="creator">Creator</a> 
    <c:choose>
        <c:when test="${sessionScope.account != null}">
            ${sessionScope.account.username}
            <a class="navbar-brand ml-3" href="logout">Logout</a>
        </c:when>
        <c:otherwise>
            <a class="navbar-brand" href="login">Login</a>

        </c:otherwise>
    </c:choose>



    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>