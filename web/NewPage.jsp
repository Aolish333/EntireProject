<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/4/9
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="lib/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>新分页功能</title>
    <style type="text/css">
        #vessel{
            width:100%;
            height:100%;
        }
        #lpage{
            width:20%;
            background-color: bisque;
            height:100%;
            float: left;
        }
        #rpage{
            width:80%;
            background-color: azure;
            height:100%;
            float: right;
        }
    </style>
    <script type="text/javascript">
        $(function(){
            $(".first").click(function(){
                $(".con_1").css("display","block");
                $(".con_2").css("display","none");
            });
            $(".two").click(function(){
                $(".con_1").css("display","none");
                $(".con_2").css("display","block");
            });
        })

    </script>
</head>
<body>
<div id="vessel">
    <div id="lpage">
        <ul>
            <li ><a class="first"  href="#">管理中心</a></li>
            <li ><a class="two"  href="#">新闻中心</a></li>
        </ul>
    </div>
    <div id="rpage">
        <div class="con_1 content ">
            <jsp:include page="ShowPage.jsp"/>
        </div>
        <div class="con_2 content" >
        </div>
    </div>
</div>
</body>
</html>
