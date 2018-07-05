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
							<select class="form-control" id="searchKbn" name="searchKbn">
								<option value="bubunIcchi" selected>部分一致</option>
								<option value="zenpoIcchi">前方一致</option>
								<option value="kanzenIcchi">完全一致</option>
							</select>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">詳細</div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<form:input id="detail" class="form-control" placeholder="" path="searchCondition.detail"/>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<select class="form-control" id="searchKbn" name="searchKbn">
								<option value="bubunIcchi" selected>部分一致</option>
								<option value="zenpoIcchi">前方一致</option>
								<option value="kanzenIcchi">完全一致</option>
							</select>
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
								<label><form:checkbox name="module" path="searchCondition.existsModule" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="module" path="searchCondition.notExistsModule" /> 登録なし</label>
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
								<label><form:checkbox name="bibliography" path="searchCondition.existsBibliography" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="bibliography" path="searchCondition.notExistsBibliography" /> 登録なし</label>
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
								<label><form:checkbox name="webSite" path="searchCondition.existsWebSite" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="webSite" path="searchCondition.notExistsWebSite" /> 登録なし</label>
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
								<label><form:checkbox name="document" path="searchCondition.existsDocument" /> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><form:checkbox name="document" path="searchCondition.notExistsDocument" /> 登録なし</label>
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
							<select class="form-control" id="searchKbn" name="searchKbn">
								<option value="bubunIcchi" selected>部分一致</option>
								<option value="zenpoIcchi">前方一致</option>
								<option value="kanzenIcchi">完全一致</option>
							</select>
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
		
		<c:forEach var="article" items="searchResultList" varStatus="rowStatus">
			 +++ ${article.practiceNo} +++ 
		</c:forEach>
		
		
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>No.</th>
						<th>サンプルNO</th>
						<th>概要</th>
						<th>カテゴリ</th>
						<th>モジュール</th>
						<th>参考文献</th>
						<th>参考サイト</th>
						<th>参考資料</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>PR18042600145</td>
						<td>Tera ver5.x ファイルアップロード</td>
						<td>業務</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
					</tr>
					<tr>
						<td>1</td>
						<td>PR18042600145</td>
						<td>Tera ver5.x ファイルアップロード</td>
						<td>業務</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
					</tr>
					<tr>
						<td>1</td>
						<td>PR18042600145</td>
						<td>Tera ver5.x ファイルアップロード</td>
						<td>業務</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
					</tr>
					<tr>
						<td>1</td>
						<td>PR18042600145</td>
						<td>Tera ver5.x ファイルアップロード</td>
						<td>業務</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
					</tr>
					<tr>
						<td>1</td>
						<td>PR18042600145</td>
						<td>Tera ver5.x ファイルアップロード</td>
						<td>業務</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
						<td>〇</td>
					</tr>
				</tbody>
			</table>
		</div>
	
		<div class="row">
			<div class="harmosPagiNation">
				<nav>
				<ul class="pagination">
					<li><a href="#" aria-label="前のページへ"> <span aria-hidden="true">«</span>
					</a></li>
					<li><a href="#">1</a></li>
					<li class="active"><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li><a href="#">7</a></li>
					<li><a href="#">8</a></li>
					<li><a href="#">9</a></li>
					<li><a href="#">10</a></li>
					<li><a href="#" aria-label="次のページへ"> <span aria-hidden="true">»</span>
					</a></li>
				</ul>
				</nav>
			</div>
		</div>
		
</form:form>
</body>
</html>

