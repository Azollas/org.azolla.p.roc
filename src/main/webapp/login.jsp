<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="Viewport" content="width=device-width, initial-scale=1.0" />
<meta name="keywords" content="Azolla" />
<meta name="Description" content="Azolla" />
<meta name="Author" content="ShaneKing,sk@azolla.org" />
<link rel="shortcut icon" href="/img/favicon.png" />
<link href="/3th/ProwerV4/style.css" rel="stylesheet" />
</head>
<body>
	<div id="wrap">
		<div id="header">
			<div id="logo">
				<a href="http://shaneking.org">ShaneKing</a>
			</div>
		</div>
		<div id="descr">
			<ul>
				<li>
					<a id="rss_icon" href="http://shaneking.org">RSS Feed</a>
				</li>
			</ul>
			有梦才有精彩！
		</div>
		<div id="content">
			<div id="loginpage">
				<h1>Login</h1>
				<div id="login">
					<form id="loginform" method="get" action="http://shaneking.org">
						<input type="text" placeholder="Email address" required autofocus />
						<input type="password" placeholder="Password" required />
						<button type="submit">Submit</button>
					</form>
					<!-- <button id="loginsubmit" type="submit">Login</button> -->
				</div>
			</div>
		</div>
		<jsp:include page="/footer.html"></jsp:include>
	</div>
</body>
</html>