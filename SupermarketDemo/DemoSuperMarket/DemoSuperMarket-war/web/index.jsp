<%-- 
    Document   : index
    Created on : Mar 16, 2017, 5:47:53 PM
    Author     : Dang Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"/>        
        <link rel="icon" href="resources/images/sites/favicon.png" type="image/x-icon" />

        <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
        <script type="text/javascript" src="resources/jquery/jquery.js"></script>
        <script type="text/javascript" src="resources/bootstrap/js/bootstrap.js"></script>
        <title>Product List</title>
    </head>
    <body>
        <div class="container-fluid">
            <!--header-->
            <c:import url="header.jsp"/>
            <!--end of header-->
            <!--contents-->
            <div id='contents-container' class="container">
                <h1>Product List</h1>
                <table class="table table-condensed table-responsive table-hover">
                    <thead>
                        <tr>
                            <th>Product ID</th>
                            <th>Product Name</th>
                            <th>Price</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="p" items="${list}">
                            <tr>
                                <td>${p.productID}</td>
                                <td>${p.productNameVn}</td>
                                <td><sup>$</sup>${p.productPrice}</td>
                                <td><a href="AddToCart?proID=${p.productID}" class="btn btn-default"><span class='glyphicon glyphicon-shopping-cart'></span> Add to Cart</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>                    
                </table>
            </div>                    
            <!--end of contents-->
        </div>

    </body>
</html>