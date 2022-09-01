<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지입니다.</title>
</head>
<body>
<h1>회원가입 페이지입니다.</h1>
<form method="post" action="/member/join">
  닉네임 : <input type="text" name="username"/><br/>
  비밀번호 : <input type="password" name="password"/><br/>
  이메일 : <input type="text" name="email"/><br/>
  <button type="submit">회원가입 완료</button>
</form>
</body>
</html>