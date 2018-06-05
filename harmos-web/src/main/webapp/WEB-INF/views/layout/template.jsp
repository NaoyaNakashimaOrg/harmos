<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width" />
<script type="text/javascript">
    
</script>
<c:set var="titleKey">
  <tiles:insertAttribute name="title" ignore="true" />
</c:set>
<title><spring:message code="${titleKey}" text="harmos" /></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/harmosCommon.css">
<script src="${pageContext.request.contextPath}/resources/app/javaScript/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/app/javaScript/bootstrap.min.js"></script>
</head>
<sec:authentication property="principal.userAccount" var="account" />

<!-- navbarをトップ固定するため、bodyはパディングする（cssファイル指定だとなぜか効かない） -->
<body style="padding-top: 70px;">
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a href="${pageContext.request.contextPath}/" class="navbar-brand">Harmos</a>
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target="#navbar-main">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#" id="menus">サンプル <span
							class="caret"></span></a>
						<ul class="dropdown-menu" aria-labelledby="themes">
							<li><a href="${pageContext.request.contextPath}/SC_01_01_01/practiceDetailInput?registerForm">サンプルの登録</a></li>
							<li><a href="${pageContext.request.contextPath}/SC_01_02_01/practiceSearch?searchForm">サンプルの検索</a></li>
						</ul>
					</li>
					<li><a href="#">Help</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<p class="navbar-text">
						ようこそ <a href="#" class="navbar-link">${f:h(account.userNameKanjiSei)} ${f:h(account.userNameKanjiMei)}</a> さん
					</p>
					<p class="navbar-text">
	                	<a href="${pageContext.request.contextPath}/logout" class="navbar-link">ログアウト</a>
					</p>
				</ul>
			</div>
		</div>
	</div>
	
	<div class="container">
	
	  <tiles:insertAttribute name="header" />
	  
	  <tiles:insertAttribute name="body" />
	  
	  <hr>
	  <p>
      	<form:form action="${pageContext.request.contextPath}/logout">
        	<button type="submit">Logout</button>
        </form:form>
      </p>
	  
	</div>
	
	<p style="text-align: center; background: #e5eCf9;">Copyright&copy; 2017 HarmosProject Team</p>



</body>
</html>