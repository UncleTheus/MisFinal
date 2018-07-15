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

    <title>教师界面</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="/css/dashboard.css" rel="stylesheet">

    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script type="text/javascript">
        function test() {
            window.location.href = "/findSectionsPro"
        }
    </script>
    <script type="text/javascript">

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
                <li class="active"><a href="#">课程列表<span class="sr-only">(current)</span></a></li>
                <%--<li><a href="/findGrades">成绩查询</a></li>--%>
                <%--<li><a href="#">Analytics</a></li>--%>
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
                        <button type="button" class="btn btn-default" onclick="" data-toggle="modal" data-target="#myModal1">添加课程</button>
                        <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                        </button>
                                        <h4 class="modal-title" id="myModalLabel">
                                            添加课程
                                        </h4>
                                    </div>
                                    <div class="modal-body">

                                            <label class="sr-only">课程名称</label>
                                            <input type="text" name="id" class="form-control" placeholder="请输入课程名称" required autofocus>
                                            <label class="sr-only">周次</label>
                                            <input type="password" name="password" class="form-control" placeholder="请输入周次" required>
                                            <label for="name" class="sr-only">时间</label>
                                            <input type="text" name="name" class="form-control" placeholder="请输入时间" required>
                                            <label for="degree" class="sr-only">上课地点</label>
                                            <input type="text" name="degree" id="degree" class="form-control" placeholder="请输入上课地点" required>
                                            <label for="major" class="sr-only">授课教师</label>
                                            <input type="text" name="major" id="major" class="form-control" placeholder="请输入授课教师" required>

                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                        </button>
                                        <button type="button" class="btn btn-primary">
                                            提交更改
                                        </button>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal -->
                        </div>

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
                            <%--<form action="/studentSelectSections">--%>
                                <%--<input type="hidden" value="${section.sectionid}" name="sectionid">--%>
                                <%--<input type="hidden" value="${section.course.courseid}" name="course.courseid">--%>
                                <%--<input type="hidden" value="${section.course.name}" name="course.name">--%>
                                <%--<input type="hidden" value="${section.dayofweek}" name="dayofweek">--%>
                                <%--<input type="hidden" value="${section.timeofday}" name="timeofday">--%>
                                <%--<input type="hidden" value="${section.room}" name="room">--%>
                                <%--<input type="hidden" value="${section.professor.name}" name="professor.name">--%>
                                <%--<input type="hidden" value="${section.capacity}" name="capacity">--%>
                                <button type="submit" class="btn btn-info btn-sm glyphicon glyphicon-pencil" data-toggle="modal" data-target="#myModal" role="button">编辑</button>
                                <button type="submit" class="delete btn btn-danger btn-sm glyphicon glyphicon-trash" role="button">删除</button>
                                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                                    &times;
                                                </button>
                                                <h4 class="modal-title" id="myModalLabel">
                                                    编辑课程
                                                </h4>
                                            </div>
                                            <div class="modal-body">
                                                <form>
                                                    <label class="sr-only">课程名称</label>
                                                    <input type="text" name="id" class="form-control" placeholder="请输入课程名称" required autofocus>
                                                    <label class="sr-only">周次</label>
                                                    <input type="password" name="password" class="form-control" placeholder="请输入周次" required>
                                                    <label for="name" class="sr-only">时间</label>
                                                    <input type="text" name="name" class="form-control" placeholder="请输入时间" required>
                                                    <label for="degree" class="sr-only">上课地点</label>
                                                    <input type="text" name="degree" id="degree" class="form-control" placeholder="请输入上课地点" required>
                                                    <label for="major" class="sr-only">授课教师</label>
                                                    <input type="text" name="major" class="form-control" placeholder="请输入授课教师" required>
                                                </form>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                                </button>
                                                <button type="button" class="btn btn-primary">
                                                    提交更改
                                                </button>
                                            </div>
                                        </div><!-- /.modal-content -->
                                    </div><!-- /.modal -->
                                </div>
                            <%--</form>--%>
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