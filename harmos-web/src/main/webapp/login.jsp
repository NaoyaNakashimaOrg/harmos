<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/harmosCommon.css">
</head>
<body>
    <div id="wrapper">

        <!-- (1) -->
        <c:if test="${param.containsKey('error')}">
            <!-- (2) -->
            <t:messagesPanel messagesType="error"
                messagesAttributeName="SPRING_SECURITY_LAST_EXCEPTION" />
        </c:if>
		
		<div class="bs-docs-section">
			<div class="row">
				<div class="col-sm-6 col-sm-offset-3">
					<div class="page-header">
						<h1 id="forms">Wilcome To Harmos</h1>
					</div>
				</div>
			</div>
		
			<div class="row">
				<div class="col-sm-6 col-sm-offset-3">
					<div class="well">
						<form:form class="form-horizontal" action="${pageContext.request.contextPath}/login">
							<fieldset>
								<div class="form-group">
									<label for="inputEmail" class="col-sm-2 control-label left">Id</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="username"
	                       							 name="username" value='X0001' placeholder="Id">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">Password</label>
									<div class="col-sm-10">
										<input type="password" class="form-control" id="password"
	                       							 name="password" value="harmosSys01" placeholder="Password">
										<div class="checkbox">
											<label> <input type="checkbox"> Remember</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-6 col-sm-offset-3">
										<div class="col-sm-6 col-sm-offset-3">
											<form:form action="${pageContext.request.contextPath}/login">
											<button type="submit" value="Login" class="btn btn-block btn-primary">LogIn</button>
											</form:form>
										</div>
									</div>
								</div>
							</fieldset>
						</form:form>
					</div>
				</div>
			</div>
		</div>
    </div>
    
<script src="${pageContext.request.contextPath}/resources/app/javaScript/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/app/javaScript/bootstrap.min.js"></script>

</body>
</html>