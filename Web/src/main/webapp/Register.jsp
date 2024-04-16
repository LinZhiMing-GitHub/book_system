<%--
  Created by IntelliJ IDEA.
  User: 86136
  Date: 2024/4/16
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录页面</title>
    <link rel="stylesheet" href="Login.css">
</head>

<body>
<div class="container right-panel-active">
    <!-- 注册 -->
    <div class="container__form container--signup">
        <!--action:url地址; method:请求方法-->
        <form action="RegisterServlet" method="post" class="form" id="form1">
            <h2 class="form__title">注册</h2>
            <div id="errorMsg">${register_msg}</div>
            <input type="text" placeholder="用户" class="input" name="username"/>
            <input type="email" placeholder="邮箱" class="input" name="email"/>
            <input type="password" placeholder="密码" class="input" name="password"/>

            <input type="submit" placeholder="注册" class="btn" value="注册"/>

        </form>
    </div>

    <!-- 登录 -->
    <div class="container__form container--signin">
        <form action="LoginServlet" class="form" id="form2" method="post">
            <h2 class="form__title">登录</h2>
            <input type="email" placeholder="邮箱" class="input" name="email1"/>
            <input type="password" placeholder="密码" class="input" name="password1"/>
            <a href="#" class="link">忘记你的密码?</a>
            <button class="btn" id="btn2">登录</button>
        </form>
    </div>

    <!-- 转换覆盖 -->
    <div class="container__overlay">
        <div class="overlay">
            <div class="overlay__panel overlay--left">
                <button class="btn" id="signIn">登录</button>
            </div>
            <div class="overlay__panel overlay--right">
                <button class="btn" id="signUp">注册</button>
            </div>
        </div>
    </div>
</div>

<script src="Login.js"></script>
</body>
</html>
