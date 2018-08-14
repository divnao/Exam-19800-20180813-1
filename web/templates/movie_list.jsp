<%--
  Created by IntelliJ IDEA.
  User: huh
  Date: 18-8-13
  Time: 下午5:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>电影列表</title>
</head>
<%--<link type="text/css" rel="stylesheet" href="../static/css/first_page.css"/>--%>
<script src="../static/js/jquery-3.3.1.min.js"></script>
<style>
    /*page medium content style*/
    #page_medium {
        padding-top: 10px;
    }

    /*button style*/
    #btn_movie_add, #btn_movie_modify, #btn_movie_delete {
        border-radius: 5px;
        float: left;
        margin-right: 20px;
    }

    #add_new_movie {
        margin-left: 150px;
        margin-top: 30px;
    }

    #movie_list {
        text-align: center;
        border: black solid 2px;
        width: 1000px;
    }

    table, td, th
    {
        border:1px solid black;
        border-collapse: collapse;
    }

    .movie_items {
        text-align: center;
    }

</style>

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

    #page_medium{
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
        position:absolute;
        bottom:0px;
    }

</style>

<body>
<!--page head-->
<div id="page_head">
    <div id="head_line">
        <strong>电影租赁管理系统</strong>
    </div>
</div>

<!--page medium button-->
<div id="page_medium">
    <div id="add_new_movie">
        <table id="movie_list">
            <tr id="list_head">
                <td>电影ID</td>
                <td>电影名</td>
                <td width="400px">描述</td>
                <td>语言</td>
                <td colspan="2" >操作</td>
            </tr>
            <tr class="movie_items">
                <td>1</td>
                <td>卧虎藏龙</td>
                <td>武侠</td>
                <td>中文</td>
                <td align="center" width="150px">
                    <button id="btn_movie_modify" style="border-radius: 5px">编辑</button>
                    <button id="btn_movie_delete" style="border-radius: 5px">删除</button>
                </td>
            </tr>
            <tr>
                <td colspan="5" align="center">
                    <button id="btn_movie_list" style="border-radius: 5px">新增</button>
                </td>
            </tr>
        </table>
            电影列表:<%= request.getAttribute("data") %>
    </div>
</div>

<!--page foot-->
<div id="page_foot">
    <hr/>
    <div id=page_foot_content">
        <span>如有问题，请联系系统管理员: </span><span id="administrator">huhao</span>
        <p>&copy; xxxxx</p>
    </div>
</div>
</body>
</html>