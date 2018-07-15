<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <title>注册界面</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">

    <form class="form-signin" action="/studentRegister" method="post">
        <h2 class="form-signin-heading">注册界面</h2>
        <label for="id" class="sr-only">学号/教职工号</label>
        <input type="text" name="id" id="id" class="form-control" placeholder="请输入学号/教职工号" required autofocus>
        <label for="password" class="sr-only">密码</label>
        <input type="password" name="password" id="password" class="form-control" placeholder="请输入密码" required>
        <label for="name" class="sr-only">姓名</label>
        <input type="text" name="name" id="name" class="form-control" placeholder="请输入姓名" required>
        <label for="degree" class="sr-only">年级</label>
        <input type="text" name="degree" id="degree" class="form-control" placeholder="请输入年级" required>
        <label for="major" class="sr-only">专业</label>
        <input type="text" name="major" id="major" class="form-control" placeholder="请输入专业" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
    </form>

</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>