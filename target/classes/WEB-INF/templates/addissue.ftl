<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<#list issues?reverse as issue>
<tr>
<td>${issue.id}</td>
<td>${issue.title}</td>
<td>${issue.content[0..*20]}<#if issue.content?length &gt; 20> ...</#if></td>
<td>${issue.date?date}</td>
</tr>
</#list>
</table>
</body>
</html>