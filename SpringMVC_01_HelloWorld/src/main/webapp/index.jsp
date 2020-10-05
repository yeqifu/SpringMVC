<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="/handle/handle01">handle01</a>
<form action="/handle/handle01" method="post">
    <input type="submit">
</form>
<a href="/handle/handle02">handle02：必须携带param</a><br>
<a href="/handle/handle03">handle03：不携带param</a><br>
<a href="/handle/handle05">handle05：请求必须包含username和gender</a><br>
<a href="/handle/handle06">handle06：火狐能访问而谷歌不能访问</a><br>
<h4>ant风格的@RequestMapping</h4>
<a href="/ant/antTest01">?匹配一个字符</a><br>
<a href="/ant/pathVariableTest/luoyi">测试@PathVariable</a>

</body>
</html>
