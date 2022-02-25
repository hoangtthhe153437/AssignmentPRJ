<%-- 
    Document   : Creator
    Created on : Oct 14, 2020, 4:11:57 PM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creator</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">

    </head>
    <body>
        <div class="container">
             <!--begin of menu-->
             <jsp:include page="Menu.jsp"/>
            <!--end of menu-->
            <!--begin of form-->
            <form class="col-sm-12" action="creator" method="post">
                <h2>Create new article</h2>
                <div class="form-group">
                    <label for="exampleFormControlInput1">Link image</label>
                    <input name="imageLink" type="text" class="form-control" id="exampleFormControlInput1" placeholder="https://genk.mediacdn.vn/thumb_w/660/139269124445442048/2020/10/14/jxcvj-16026312062441713789234.jpg">
                </div>
                <div class="form-group">
                    <label for="exampleFormControlTextarea1">Tittle</label>
                    <textarea name="title" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                </div>
                <div class="form-group">
                    <label for="exampleFormControlTextarea1">Description</label>
                    <textarea name="description" class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Create</button>
            </form>
            <!--end of form-->
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

    </body>
</html>
