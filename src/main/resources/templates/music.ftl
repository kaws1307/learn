<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>我的歌单</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
    <style>
        .table {
            width: 30%;
            margin: 20px;
        }
        tr:nth-child(even) {
            background: #dff0d8;
        }
    </style>
  </head>
  <body>
    <ul class="nav nav-tabs">
        <li role="presentation"><a href="#">首页</a></li>
        <li role="presentation" class="active"><a href="/music/list">我的音乐</a></li>
        <li role="presentation"><a href="/music/add">新增</a></li>
        <li role="presentation"><a href="#">推荐</a></li>
    </ul>
    <table class="table">
        <thead>
            <th>ID</th>
            <th>歌手</th>
            <th>歌曲</th>
            <th colspan="2" text-align="center">操作</th>
        </thead>
        <tbody>
        <#list music as music1>
        <tr>
            <td> ${music1.id} </td>
            <td> ${music1.author} </td>
            <td> ${music1.song} </td>
            <td> <a href="/music/modify/${music1.id}">修改</a> </td>
            <td> <a href="/music/delete/${music1.id}">删除</a> </td>
        </tr>
        </#list>
        </tbody>
    </table>


    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
  </body>
</html>