<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>学生界面</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="/css/dashboard.css" rel="stylesheet">


    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script type="text/javascript">
        function test() {
            window.location.href = "/findSections"
        }
    </script>

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">选课系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">个人信息</a></li>
                <li><a href="#">相关设置</a></li>
                <li><a href="#">相关资料</a></li>
                <li><a href="#">帮助</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="搜索课程...">
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">学生选课 <span class="sr-only">(current)</span></a></li>
                <li><a href="/findGrades">成绩查询</a></li>
                <li ><a href="/findSelectSection">已选课程查询</a></li>
                <%--<li><a href="#">Export</a></li>--%>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="sub-header">课程列表</h1>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>课程名称</th>
                        <th>日期</th>
                        <th>时间</th>
                        <th>教室</th>
                        <th>授课教师</th>
                        <button type="submit" class="btn btn-default" onclick="test()">查询课程</button>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="section" items="${sections}" varStatus="status">
                    <tr>
                        <td>${section.course.name}</td>
                        <td>${section.dayofweek}</td>
                        <td>${section.timeofday}</td>
                        <td>${section.room}</td>
                        <td>${section.professor.name}</td>
                        <td>
                            <form action="/studentSelectSections">
                                <input type="hidden" value="${section.sectionid}" name="sectionid">
                                <input type="hidden" value="${section.course.courseid}" name="course.courseid">
                                <input type="hidden" value="${section.course.name}" name="course.name">
                                <input type="hidden" value="${section.dayofweek}" name="dayofweek">
                                <input type="hidden" value="${section.timeofday}" name="timeofday">
                                <input type="hidden" value="${section.room}" name="room">
                                <input type="hidden" value="${section.professor.name}" name="professor.name">
                                <input type="hidden" value="${section.capacity}" name="capacity">
                            </form>
                        </td>
                    </tr>
                    </tbody>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

</body>
</html>