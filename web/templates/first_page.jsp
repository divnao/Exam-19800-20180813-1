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
    <%--<link type="text/css" rel="stylesheet" href="../static/css/first_page.css"/>--%>
    <script src="../static/js/jquery-3.3.1.min.js"></script>
    <script src="../static/js/first_page.js"></script>
    <script type="text/javascript">
        function checkNull(form) {
            var user_name = document.forms.item(0).toString();
            if (user_name==null || user_name=="") {
                alert("用户名为空, 请重新填写!");
            }
        }
    </script>
    <style>
        #page_head {
            border: lightblue solid 1px;
            height: 80px;
            width: auto;
            text-align: center;
            border-radius: 5px;
            color: gainsboro;
            font-family: "AR PL UKai CN";
            font-size: large;
            background-color: darkslategray;
        }

        #head_line {
            font-size: xx-large;
            padding-top: 20px;
        }

        #page_medium {
            padding-top: 50px;
        }

        #page_medium_left {
            padding-left: 50px;
        }

        #img_1 {
            padding-left: 70px;
        }

        #login {
            float: right;
            border: 2px solid lightblue;
            width: 300px;
            height: 250px;
            margin-top: 35px;
            border-radius: 8px;
            margin-right: 150px;
            text-align: center;
            background-color: deepskyblue;
        }

        .login_item {
            width: 200px;
            height: 30px;
            border-radius: 10px;
            margin-top: 30px;
            border: aqua solid 2px;
        }

        #login_btn {
            background-color: aqua;
        }

        #page_foot {
            height: 80px;
            text-align: center;
            margin-bottom: 0px;
            color: dimgrey;
            font-size: small;

            width: 100%;
            position: absolute;
            bottom: 0px;
        }

    </style>
</head>
<body>

<!--page head-->
<div id="page_head">
    <div id="head_line"><strong>电影租赁管理系统</strong></div>
</div>

<!--head medium-->
<div id="page_medium">
    <!-- the image located in the first page-->
    <img id="img_1" src="../static/img/1.png">

    <!--log in module-->
    <div id="login">
        <p><strong>电影租赁管理系统</strong></p>
        <form id="user_info" name="userInfo" action="http://localhost:8080/login" method="post">
            <input id="user_id" name="user_name" class="login_item" type="text" placeholder="用户名">
            <input id="login_btn" type="submit" class="login_item" value="立即登录" onclick="checkNull(this);">
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
<%--<script>--%>
<%--$(document).ready(function () {--%>
<%--$("#login_btn").click(function () {--%>
<%--var user_id = $("#user_id").val();--%>
<%--if (user_id == "" || password == "") {--%>
<%--alert("用户名为空， 请填写完整！");--%>
<%--}--%>
<%--});--%>
<%--});--%>
<%--</script>--%>

</html>
