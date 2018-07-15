<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://cdn.bootcss.com/jquery/2.0.0/jquery.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <title>登录界面</title>


    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">



    <!-- Custom styles for this template -->
    <link href="/css/signin.css" rel="stylesheet">


    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>
<h1 class="text-center">选课系统</h1>
<div class="container">
    <div class="form-signin">
        <ul id="myTab" class="nav nav-tabs">
            <li class="active"><a href="#studentlogin" data-toggle="tab">学生登录</a></li>
            <li><a href="#teacherlogin" data-toggle="tab">教师登录</a></li>
        </ul>
    </div>
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane fade in active" id="studentlogin">
            <form action="/studentLogin" method="post" class="form-signin">
                <label for="id" class="sr-only">学号/教职工号</label>
                <input type="text" name="id" id="id" class="form-control" placeholder="请输入学号/教职工号" required autofocus>
                <label for="password" class="sr-only">密码</label>
                <input type="password" name="password" id="password" class="form-control" placeholder="请输入密码" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                <div class="text-center"><a href="/toRegister">点此注册</a></div>
            </form>
        </div>
        <div class="tab-pane fade" id="teacherlogin">
            <form action="/professorLogin" method="post" class="form-signin">
                <label for="id" class="sr-only">学号/教职工号</label>
                <input type="text" name="id"  class="form-control" placeholder="请输入学号/教职工号" required autofocus>
                <label for="password" class="sr-only">密码</label>
                <input type="password" name="password"  class="form-control" placeholder="请输入密码" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                <div class="text-center"><a href="/toRegister">点此注册</a></div>
            </form>
        </div>
    </div>
</div>

<script>
    $(function () {
        $('#myTab li:eq(0) a').tab('show');
    });
</script>
</body>
</html>