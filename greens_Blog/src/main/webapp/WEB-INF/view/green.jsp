<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
}

.all {
}

.header {
	background-image: url('https://picsum.photos/200/300?grayscale');
	display: flex;
}

.header h1 {
	flex: 5;
}

#header-icon {
	flex:1;
	display: flex;
	justify-content: center;
	align-items: center;
}

#header-icon > span {
	margin-right: 5px;
}	

h1 {
	padding: 5px;
}

.main {
	display: flex;
	padding: 10px;
}

.navigation {
	border: 2px solid #ccc;
	width: 170px;
	border-radius: 10px;
	height: 300px;
}

.nav-menu {
	display: flex;
}

.menu-all {
	margin-right: 60px;
}

.navigation ul {
	padding-left: 10px;
}

.navigation li {
	list-style: none;
	color: gray;
}

.title span {
	margin-left: 580px;
}

.navigation a {
	text-decoration: none;
	color: gray;
}

.navigation a:hover {
	color: black;
}

.content {
	width: 730px;
	margin-left: 50px;
}

.img {
	display: flex;
	flex-wrap: wrap;
}

.img div {
	width: 25%;
}

.page {
	display:flex;
	justify-content: center;
}
.page a {
	text-decoration: none;
	margin: 5px;
	color: balck;
}
</style>
</head>
<body>
	<div class = "all">
		<div class="header">
			<h1>Green's Blog</h1>
			<div id="header-icon">
				<span class="material-symbols-outlined">photo_camera</span>
				<span class="material-symbols-outlined">youtube_activity</span>
			</div>
		</div>
		<div class=main>
			<div class="navigation">
				<ul class="nav-menu">
					<li><span class=menu-all><a href="#">전체보기</a></span></li>
					<li><span class="material-symbols-outlined">settings</span></li>
				</ul>
				<ul>
					<li><a href="#">Python</a></li>
					<li><a href="#">Java</a></li>
					<li><a href="#">Ios</a></li>
					<li><a href="#">소프트웨어 자료</a></li>
					<li><a href="#">자료구조</a></li>
					<li><a href="#">리눅스</a></li>
					<li><a href="#">Git</a></li>
					<li><a href="#">자기계발</a></li>
					<li><a href="#">경영전략</a></li>
					<li><a href="#">리더쉽</a></li>
				</ul>
			</div>
			<div class=content>
				<div class="title">
					경영전략 
					<span class="material-symbols-outlined">edit_square</span>
				</div>
				<div class="img">
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
					<div>
						<img src="https://picsum.photos/seed/picsum/150/150">
						<p>안녕하이</p>
					</div>
				</div>
				<div class = "page">
					<a href="#">1</a>
					<a href="#">2</a>
					<a href="#">3</a>
					<a href="#">4</a>
					<a href="#">5</a>
					<a href="#">6</a>
					<a href="#">7</a>
					<a href="#">8</a>
					<a href="#">9</a>
					<a href="#">10</a>
					<a href="#">다음<i class="xi-angle-right"></i></a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>