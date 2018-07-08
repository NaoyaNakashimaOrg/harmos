<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript">
</script>
<title>サンプル検索</title>
</head>
<body>
<form:form modelAttribute="SC_01_02_01_practiceSearchForm" method="POST"
	action="${pageContext.request.contextPath}/SC_01_02_01/practiceSearch">
	
	<form:errors path="*" element="div" cssClass="alert alert-danger" />
	
	<div class="panel panel-primary">
			<div class="panel-heading">
				<a data-toggle="collapse" href="#searchCondition">
					<h5 class="panel-title">検索条件</h5>
				</a>
			</div>
			
			<div id="searchCondition" class="panel-body panel-collapse collapse in">
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">サンプルNo</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<form:input id="practiceNoFrom" class="form-control" placeholder="FROM" path="searchCondition.practiceNoFrom"/>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<form:input id="practiceNoTo" class="form-control" placeholder="FROM" path="searchCondition.practiceNoTo"/>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">概要</div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<form:input id="overview" class="form-control" placeholder="" path="searchCondition.overview"/>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<form:select cssClass="form-control" path="searchCondition.icchiKbnGaiyo">
							  <form:options items="${SC_01_02_01_practiceSearchForm.icchiKbnList}" itemLabel="kubunName" itemValue="kubunCd" />
							</form:select>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">モジュール</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="module" path="searchCondition.registModule" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="module" path="searchCondition.notRegistModule" /> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">参考文献</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="bibliography" path="searchCondition.registBibliography" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="bibliography" path="searchCondition.notRegistBibliography" /> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">参考サイト</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="webSite" path="searchCondition.registWebSite" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="webSite" path="searchCondition.notRegistWebSite" /> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">参考資料</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="document" path="searchCondition.registDocument" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="document" path="searchCondition.notRegistDocument" /> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">メモ</div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<form:input id="memo" class="form-control" placeholder="" path="searchCondition.memo"/>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<form:select cssClass="form-control" path="searchCondition.icchiKbnMemo">
							  <form:options items="${SC_01_02_01_practiceSearchForm.icchiKbnList}" itemLabel="kubunName" itemValue="kubunCd" />
							</form:select>
						</div>
					</div>
				</div>
				
			</div>
		</div>

		<div class="row">
			<div class="col-md-2 col-md-offset-5">
				<div class="margin30Box harmosSearchButton">
					<input type="submit" name="search" value="検索" class="btn btn-primary harmos_w_120"/>
				</div>
			</div>
		</div>
		
		<c:if test="${page != null && page.totalPages != 0}">
			<div class="row">
				<div class="harmosPagiNation">
					<t:pagination page="${page}"
						queryTmpl="search&page={page}&size={size}"
					    outerElementClass="pagination"/>
			    </div>
			</div>
			
			<div class="table-responsive">
				<table class="table table-striped table-hover">
					<colgroup>
						<col span="1" width="50">
						<col span="1" width="130">
						<col span="1" width="300">
						<col span="1" width="90">
						<col span="1" width="90">
						<col span="1" width="90">
						<col span="1" width="90">
						<col span="1" width="300">
					</colgroup>
					<thead>
						<tr>
							<th>No.</th>
							<th>サンプルNO</th>
							<th>概要</th>
							<th>モジュール</th>
							<th>参考文献</th>
							<th>参考サイト</th>
							<th>参考資料</th>
							<th>メモ</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="article" items="${page.content}" varStatus="rowStatus">
							<tr>
								<td>${f:h(article.no)}</td>
								<td><a href="${pageContext.request.contextPath}/SC_01_01_02/practiceDetailInquiry?inquiryForm&key=${f:h(article.practiceMngNo)}" target="_blank">${f:h(article.practiceMngNo)}</a></td>
								<td><span data-toggle="tooltip" title="${f:h(article.overview)}" data-placement="left">${f:h(article.overview)}</span></td>
								<td>${f:h(article.registModule)}</td>
								<td>${f:h(article.registBibliography)}</td>
								<td>${f:h(article.registWebSite)}</td>
								<td>${f:h(article.registDocument)}</td>
								<td><span data-toggle="tooltip" title="${f:h(article.memo)}" data-placement="left">${f:h(article.memo)}</span></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
	        <div class="row">
				<div class="harmosPagiNation">
					<t:pagination page="${page}"
						queryTmpl="search&page={page}&size={size}"
					    outerElementClass="pagination"/>
			    </div>
			</div>
		</c:if>
		
</form:form>
</body>
</html>

