<%--
  Created by IntelliJ IDEA.
  User: huh
  Date: 18-8-13
  Time: 下午5:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页-电影租赁管理系统</title>
    <link type="text/css" rel="stylesheet" href="../static/css/first_page.css"/>
    <script src="../static/js/jquery-3.3.1.min.js"></script>
    <!--<script src="../static/js/first_page.js"></script>-->

</head>
<body>

<!--page head-->
<div id="page_head">
    <div id="head_line"><strong>电影租赁管理系统</strong> </div>
</div>

<!--head medium-->
<div id="page_medium">
    <!-- the image located in the first page-->
    <img id="img_1" src="../static/img/1.png">

    <!--log in module-->
    <div id="login">
        <p ><strong>电影租赁管理系统</strong></p>
        <form id="user_info" name="user_info" action="www.baidu.com" method="post">
            <input id="user_id" name="user_name" class="login_item" type="text" placeholder="用户名">
            <input id="login_btn" type="submit" class="login_item" value="立即登录">
        </form>
        <!--<button id="login_btn" class="login_item">立即登录</button>-->
    </div>
</div>
<!--<hr/>-->

<!--page foot-->
<div id="page_foot">
    <hr/>
    <div id=page_foot_content">
        <span>如有问题，请联系系统管理员: </span><span id="administrator">huhao</span>
        <p>&copy; xxxxx</p>
    </div>
</div>
</body>

<script>
    $(document).ready(function () {
        $("#login_btn").bind("click", getUserInfo);
    });

    function getUserInfo() {
        var user_id = $("#user_id").val();
        if (user_id == "") {
            alert("用户名为空， 请填写完整！");
        } else {
            var user_login_info = {};
            user_login_info.user_id = $("#user_id").val();
            var data = JSON.stringify(user_login_info);
            logIn(data);
        }
    }

    function logIn(data) {
        $.post('http://localhost:8888', data, function (res) {
            console.log(res);
        });
    }
</script>

</html>
