<%--
  Created by IntelliJ IDEA.
  User: liyag
  Date: 2020/2/25
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">测试查询所有</a>
<hr>
<span style="color: red">通过id查询账户</span>
<form action="account/findById">

id:  <input type="text" name="id"/>
    <input type="submit" value="提交"/>

</form>
<hr>
<span style="color: red">通过id删除账户</span>
<form action="account/delById">

id: <input type="text" name="id"/>
    <input type="submit" value="提交"/>

</form>
<hr>
<span style="color: red">增加账户</span>
<form action="account/saveAccount">

账户名： <input type="text" name="name"/><br>
金额：  <input type="text" name="money"/><br>
    <input type="submit" value="提交"/><br>

</form>
<hr>
<span style="color: red">修改账户</span>
<form action="account/updateAccount">

id： <input type="text" name="id"/><br>
修改后的账户名：<input type="text" name="name"/><br>
修改后的金额：<input type="text" name="money"/><br>
    <input type="submit" value="提交"/><br>

</form>
</form>
<hr>
<span style="color: red">通过id转账</span>
<form action="account/transferAccount">

原账户：<input type="text" name="sourceId"/><br>
目标账户：<input type="text" name="targetId"/><br>
转账金额：<input type="text" name="money"/><br>
    <input type="submit" value="提交"/><br>

</form>
</body>
</html>
