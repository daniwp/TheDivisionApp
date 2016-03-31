<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container">

                <!-- Logo -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mainNavBar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.jsp" class="navbar-brand">The Division</a>
                </div>

                <!-- Menu Items -->
                <div class="collapse navbar-collapse" id="mainNavBar">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">Home</a></li>

                        <!-- drop down menu -->
                        <% if (session.getAttribute("loggedIn") != null) {%>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">My Agent <span class="caret"></span></a>
                            <ul class="dropdown-menu">

                                <li><a href="#">Gear</a></li>
                                <li><a href="#">Agent Profile</a></li>

                            </ul>
                        </li> 
                        <% } %>

                    </ul>

                    <!-- Login --> 
                    <% if (session.getAttribute("loggedIn") == null) {%>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="login.jsp">Login</a></li>
                    </ul>
                    <% } else {%>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a onclick="<% request.getSession().invalidate(); %> <% request.getSession().removeAttribute("loggedIn"); %> <% request.getSession().removeAttribute("successLogin"); %>" href="index.jsp">Logout</a></li>
                    </ul>
                    <% }%>
                </div>



            </div>
        </nav>
