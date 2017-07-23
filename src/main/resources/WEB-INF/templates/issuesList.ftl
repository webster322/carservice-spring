<#import "/spring.ftl" as spring>
<@spring.bind "issueForm"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/carservice/issue/save" method="POST">
<@spring.formInput "issueForm.title" /> <br/>
<@spring.showErrors "<br/>" />

<@spring.formInput "issueForm.content" /> <br/>
<@spring.showErrors "<br/>" />

<input type="submit" value="submit" />
</body>
</html>