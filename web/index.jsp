<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/3/30
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>首页</title>

    <style type="text/css">
        #container {
            width: 100%;

        }

        #header {
            width: 1002px;
            height: 200px;
            /*background-color: red;*/
            background: url("./resource/about_banner.jpg");
        }

        #main {
            width: 1002px;
            height: 550px;
            /*background-color: green;*/
        }

        #lside {
            width: 690px;
            height: 550px;
            /*background-color: red;*/
            float: left;
            border: 1px #EEE solid;
        }

        #rside {
            width: 300px;
            height: 550px;
            float: right;
            border: 1px green solid;
        }

        #footer {
            width: 1002px;
            height: 100px;
            background-color: blue;
        }

        .news {
            width: 273px;
            height: 200px;
            /*background-color: red;*/
            float: left;
            border: 1px green solid;
            /*margin: 10px;*/
            margin-top: 10px;
            margin-right: 20px;
            /*margin:30px 0px 30px 10px;从上顺时针写*/
            margin-right: 10px;
            /*padding: 10px;*/
        }

        #limage {
            width: 179px;
            height: 145px;
            background: url("./resource/eshop_service.jpg");
            float: left;
            margin-right: 50px;
            margin: 20px;
        }

        #rlist ul {
            list-style: none;
            line-height: 30px;
        }

        #nav li {
            margin-right: 10px;
            list-style: none;
            float: left;
            margin-bottom: 10px;
        }

        #nav a:hover {
            /*a:.....  按顺序访问*/
            color: red;
        }

        a {
            text-decoration: none;
            /*去掉a的下标签*/
        }

        #nav {
            height: 128px;
            width: 1002px;
            background: url("./resource/top_bg.jpg");
        }

        #nav1 {
            list-style: none;
        }

        #nav1 a {
            text-decoration: none;
        }

        #nav1 li {
            float: left;
            width: 80px;
            height: 20px;
            margin-block-start: 10px;
        }

        #nav1 a:hover {
            color: red;
        }
    </style>
</head>

<body>
<div id="containar">
    <div id="header"></div>
    <div id="nav">
        <img src="./resource/logo.jpg">
        <ul id="nav1">
            <li><a href="#">首页</a></li>
            <li><a href="#">新闻</a></li>
            <li><a href="#">教学</a></li>
            <li><a href="#">学生</a></li>
        </ul><br>
    </div>
    <div id="main">
        <div id="lside">
            <div class="news">
                <div id="limage"></div>
                <div id="rlist">
                    <ul>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                    </ul>
                </div>
            </div>
            <div class="news">
                <div id="limage"></div>
                <div id="rlist">
                    <ul>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                    </ul>
                </div>
            </div>
            <div class="news">
                <div id="limage"></div>
                <div id="rlist">
                    <ul>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                    </ul>
                </div>
            </div>
            <div class="news">
                <div id="limage"></div>
                <div id="rlist">
                    <ul>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                        <li><a href="新闻.html" target="_blank">新闻</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="rside">
            <td style="background-color:cornflowerblue;width:100px;vertical-align:top;">
                <h3><b>用户登陆</b>
                    <form action="FindServlet" method="post" >
                        <table>
                            <tr>
                                <td>用户名：</td>
                                <td><input type="text" name="username" value=""></td>
                            </tr>
                            <tr>
                                <td>密码：</td>
                                <td><input type="password" name="password" value="" ></td>
                            </tr>
                            <tr>
                                <td>用户类型：</td>
                                <td><select name="type">
                                    <option value="普通用户">普通用户</option>
                                    <option value="管理员">管理员</option>
                                </select></td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="submit" name="" value="登陆">
                                </td>
                            </tr>
                        </table>
                    </form>
                    <br>
                    >每日新闻<br>
                    >直接推送<br>
                </h3>
            </td>
        </div>
    </div>
    <div id="footer">
        <tr>
            班级：15140Y01学号：1514010634 姓名：李晓津
        </tr>
    </div>
</div>

</body>
</html>
