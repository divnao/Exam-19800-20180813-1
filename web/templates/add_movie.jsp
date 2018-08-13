<%--
  Created by IntelliJ IDEA.
  User: huh
  Date: 18-8-13
  Time: 下午5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>新增电影</title>
</head>
<link type="text/css" rel="stylesheet" href="../static/css/first_page.css"/>
<script src="../static/js/jquery-3.3.1.min.js"></script>
<style>

    #page_medium {
        padding-left: 450px;
    }

    #add_new_movie {
        border: black solid 1px;
        border-radius: 3px;
        width: 400px;
        height: 300px;
    }

    #add_movie {
        padding-left: 50px;
    }

    tr {
        height: 50px;
    }

    #movie_title, #movie_desc {
        border-radius: 5px;
        height: 20px;
        width: 200px;
        border-color: lightblue;
    }

    #select_language {
        width: 120px;
        height: 30px;
        border-radius: 3px;
    }

    #confirm_add, #confirm_reset {
        margin-top: 10px;
        margin-left: 70px;
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
        <form id="add_movie" name="add_movie">
            <table id="movie_info">
                <tr>
                    <td colspan="2" align="center"><p><strong>新增电影信息</strong></p>
                    </td>
                </tr>

                <tr id="title">
                    <td>电影名称</td>
                    <td>
                        <input type="text" id="movie_title" name="movie_title">
                    </td>
                </tr>
                <tr id="desc">
                    <td>电影简介</td>
                    <td>
                        <input type="text" id="movie_desc" name="movie_desc">
                    </td>
                </tr>
                <tr id="language">
                    <td >语&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;言</td>
                    <td>
                        <select id="select_language" name="select_language">
                            <option id="choose_language" name="choose_language" value="0">语言</option>
                            <option id="chinese" name="chinese" value="1">简体中文</option>
                            <option id="english" name="english" value="2">English</option>
                        </select>
                    </td>
                </tr>
            </table>
            <input id="confirm_add" type="submit" style="border-radius: 5px" value="新增">
            <input id="confirm_reset" type="reset" style="border-radius: 5px" value="重置">
        </form>
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