<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript">

/**
 * モジュールの入力フォームを追加する
 */
function addModuleForm() {
	
	var moduleListMaxIndex = $('.moduleList').size();
	var template = '<div id="moduleList' + moduleListMaxIndex + '" class="row moduleList">' + 
						'<div class="col-md-2">' + 
							'<div class="margin2Box"></div>' + 
						'</div>' + 
					    '<div class="col-md-4">' + 
							'<div class="margin2Box">' + 
								'<input class="form-control" name="moduleList[' + (moduleListMaxIndex) + '].overview" type="text" placeholder="モジュール概要" value="" maxlength="100"/>' + 
							'</div>' + 	
					    '</div>' + 
					    '<div class="col-md-4">' + 
							'<div class="margin2Box">' + 
								'<div class="input-group">' + 
								'<label class="input-group-btn" >' + 
									'<span class="btn btn-primary" >' + 
										'<span class="glyphicon glyphicon-file"></span>' + 
										'<input type="file" name="moduleList[' + {moduleListMaxIndex} + '].module" style="display:none">' + 
									'</span>' + 
								'</label>' + 
								'<input type="text" class="form-control" readonly="readonly">' + 
							'</div>' + 
					 	'</div>' + 
				   '</div>'; 
	$('#moduleList' + (moduleListMaxIndex - 1)).after(template);
}

/**
 * 参考文献の入力フォームを追加する
 */
function addBibliographyForm(){
	
	var bibliographyListMaxIndex = $('.bibliographyList').size();
	var template = '<div id="bibliographyList' + bibliographyListMaxIndex + '" class="row bibliographyList">' + 
						'<div class="col-md-2">' + 
							'<div class="margin2Box"></div>' + 
						'</div>' + 	
						'<div class="col-md-5">' + 
							'<div class="margin2Box">' + 
							'<input class="form-control" name="bibliographyList[' + (bibliographyListMaxIndex) + '].name" type="text" placeholder="文献名）xxxの本" value="" maxlength="100"/>' + 
							'</div>' + 
						'</div>' + 
						'<div class="col-md-3">' + 
							'<div class="margin2Box">' + 
							'<input class="form-control" name="bibliographyList[' + (bibliographyListMaxIndex) + '].publisher" type="text" placeholder="出版社名）xxx社" value="" maxlength="20"/>' + 
							'</div>' + 
						'</div>' + 
					'</div>'; 
	$('#bibliographyList' + (bibliographyListMaxIndex - 1)).after(template);
}

/**
 * 参考サイトの入力フォームを追加する
 */
function addWebSiteForm(){
	
	var webSiteListMaxIndex = $('.webSiteList').size();
	var template = '<div id="webSiteList' + webSiteListMaxIndex + '" class="row webSiteList">' + 
						'<div class="col-md-2">' + 
							'<div class="margin2Box"></div>' + 
						'</div>' + 	
						'<div class="col-md-5">' + 
							'<div class="margin2Box">' + 
							'<input class="form-control" name="webSiteList[' + (webSiteListMaxIndex) + '].overview" type="text" placeholder="サイト概要" value="" maxlength="100"/>' + 
							'</div>' + 
						'</div>' + 
						'<div class="col-md-3">' + 
							'<div class="margin2Box">' + 
							'<input class="form-control" name="bibliographyList[' + (webSiteListMaxIndex) + '].url" type="text" placeholder="サイトURL）http://www.sample.com" value="" maxlength="1000"/>' + 
							'</div>' + 
						'</div>' + 
					'</div>'; 
	$('#webSiteList' + (webSiteListMaxIndex - 1)).after(template);
}

/**
 * 参考資料の入力フォームを追加する
 */
function addDocumentForm(){
	
	var documentListMaxIndex = $('.documentList').size();
	var template = '<div id="documentList' + documentListMaxIndex + '" class="row documentList">' + 
						'<div class="col-md-2">' + 
							'<div class="margin2Box"></div>' + 
						'</div>' + 
					    '<div class="col-md-4">' + 
							'<div class="margin2Box">' + 
								'<input class="form-control" name="documentList[' + (documentListMaxIndex) + '].overview" type="text" placeholder="資料概要" value="" maxlength="100"/>' + 
							'</div>' + 	
					    '</div>' + 
					    '<div class="col-md-4">' + 
							'<div class="margin2Box">' + 
								'<div class="input-group">' + 
								'<label class="input-group-btn" >' + 
									'<span class="btn btn-primary" >' + 
										'<span class="glyphicon glyphicon-file"></span>' + 
										'<input type="file" name="documentList[' + {documentListMaxIndex} + '].document" style="display:none">' + 
									'</span>' + 
								'</label>' + 
								'<input type="text" class="form-control" readonly="readonly">' + 
							'</div>' + 
					 	'</div>' + 
				   '</div>'; 
	$('#documentList' + (documentListMaxIndex - 1)).after(template);
}




</script>
<title>サンプル登録</title>
</head>
<body>
<form:form modelAttribute="SC_01_01_01_practiceDetailInputForm" method="POST"
	action="${pageContext.request.contextPath}/SC_01_01_01/practiceDetailInput" enctype="multipart/form-data">
	
	<form:errors path="*" element="div" cssClass="alert alert-danger" />
	
	
    <div class="panel panel-primary">
			<div class="panel-heading">
				<a data-toggle="collapse" href="#practiceInputForm">
					<h5 class="panel-title">サンプル情報</h5>
				</a>
			</div>
			
			<div id="practiceInputForm" class="panel-body panel-collapse collapse in">
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">サンプルNO</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">${f:h(SC_01_01_01_practiceDetailInputForm.practiceMngNo)}</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">概要<span class="required"> ※</span></div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">
							<form:input id="overview" class="form-control" path="overview" maxlength="100"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">カテゴリ</div>
					</div>
					<div class="col-md-4">
						<div class="margin2Box">
							<form:select class="form-control" path="category">
								<form:options items="${SC_01_01_01_practiceDetailInputForm.categoryList}" itemLabel="kubunName" itemValue="kubunCd" />
							</form:select>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">詳細</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">
							<form:textarea id="detail" class="form-control" path="detail" rows="10" maxlength="1000"/>
						</div>					
					</div>
				</div>
				
				<!-- モジュール  -->
				<c:forEach items="${SC_01_01_01_practiceDetailInputForm.moduleList}" var="moduleList" varStatus="status">
					<div id="moduleList${status.index}" class="row moduleList">
						<div class="col-md-2">
							<div class="margin2Box">
								<c:if test="${status.first}">モジュール&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span onClick="addModuleForm();" class="glyphicon glyphicon-plus"></span>
								</c:if>
							</div>
						</div>
						<div class="col-md-4">
							<div class="margin2Box">
								<form:input class="form-control" placeholder="モジュール概要" path="moduleList[${status.index}].overview" maxlength="100"/>
							</div>
						</div>
						<div class="col-md-4">
							<div class="margin2Box">
								<div class="input-group">
							    <label class="input-group-btn" >
							        <span class="btn btn-primary" >
							        	<span class="glyphicon glyphicon-file"></span>
							        	<form:input type="file" path="moduleList[${status.index}].module" style="display:none"/>
							        </span>
							    </label>
							    <input class="form-control" type="text" readonly="readonly">
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				
				<!-- 参考文献 -->
				<c:forEach items="${SC_01_01_01_practiceDetailInputForm.bibliographyList}" var="bibliographyList" varStatus="status">
					<div id="bibliographyList${status.index}" class="row bibliographyList">
						<div class="col-md-2">
							<div class="margin2Box">
								<c:if test="${status.first}">参考文献&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span onClick="addBibliographyForm();" class="glyphicon glyphicon-plus"></span>
								</c:if>
							</div>
						</div>
						<div class="col-md-5">
							<div class="margin2Box">
								<form:input class="form-control" placeholder="文献名）xxxの本" path="bibliographyList[${status.index}].name" maxlength="100"/>
							</div>
						</div>
						<div class="col-md-3">
							<div class="margin2Box">
								<form:input class="form-control" placeholder="出版社名）xxx社" path="bibliographyList[${status.index}].publisher" maxlength="20"/>
							</div>
						</div>
					</div>
				</c:forEach>
				
				<!-- 参考サイト -->
				<c:forEach items="${SC_01_01_01_practiceDetailInputForm.webSiteList}" var="webSiteList" varStatus="status">
					<div id="webSiteList${status.index}" class="row webSiteList">
						<div class="col-md-2">
							<div class="margin2Box">
								<c:if test="${status.first}">参考サイト&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span onClick="addWebSiteForm();" class="glyphicon glyphicon-plus"></span>
								</c:if>
							</div>
						</div>
						<div class="col-md-5">
							<div class="margin2Box">
								<form:input class="form-control" placeholder="サイト概要" path="webSiteList[${status.index}].overview" maxlength="100"/>
							</div>
						</div>
						<div class="col-md-3">
							<div class="margin2Box">
								<form:input class="form-control" placeholder="サイトURL）http://www.sample.com" path="webSiteList[${status.index}].url" maxlength="1000"/>
							</div>
						</div>
					</div>
				</c:forEach>
				
				<!-- 参考資料 -->
				<c:forEach items="${SC_01_01_01_practiceDetailInputForm.documentList}" var="documentList" varStatus="status">
					<div id="documentList${status.index}" class="row documentList">
						<div class="col-md-2">
							<div class="margin2Box">
								<c:if test="${status.first}">参考資料&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span onClick="addDocumentForm();" class="glyphicon glyphicon-plus"></span>
								</c:if>
							</div>
						</div>
						<div class="col-md-4">
							<div class="margin2Box">
								<form:input class="form-control" placeholder="資料概要" path="documentList[${status.index}].overview" maxlength="100"/>
							</div>
						</div>
						<div class="col-md-4">
							<div class="margin2Box">
								<div class="input-group">
							    <label class="input-group-btn" >
							        <span class="btn btn-primary" >
							        	<span class="glyphicon glyphicon-file"></span>
							        	<form:input type="file" path="documentList[${status.index}].document" style="display:none"/>
							        </span>
							    </label>
							    <input class="form-control" type="text" readonly="readonly">
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">メモ</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">
							<form:textarea id="memo" class="form-control" path="memo" rows="10" maxlength="1000"/>
						</div>					
					</div>
				</div>
				
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-2 col-md-offset-5">
				<div class="margin30Box harmosExecuteButton">
					<input type="submit" name="commit" value="登録" class="btn btn-primary harmos_w_120"/>
				</div>
			</div>
		</div>
		
</form:form>
<script>
/**
 * ファイル入力フォームへファイル名を反映する
 */
$(document).on('change', ':file', function() {
    var input = $(this),
    numFiles = input.get(0).files ? input.get(0).files.length : 1,
    label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
    input.parent().parent().next(':text').val(label);
});
</script>
</body>
</html>

