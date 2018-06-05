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
						<div class="margin2Box">サンプルNO</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<input class="form-control" id="firstNameKanji" placeholder="FROM" type="text">
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<input class="form-control" id="lastNameKanji" placeholder="TO" type="text">
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box">概要</div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" type="text">
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
						<div class="margin2Box">カテゴリ</div>
					</div>
					<div class="col-md-4">
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
							<input class="form-control" id="nickName" type="text">
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
								<label><input type="checkbox" value="checkboxA"> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><input type="checkbox" value="checkboxA"> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="概要" type="text">
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
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="モジュール名" type="text">
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
						<div class="margin2Box">参考文献</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><input type="checkbox" value="checkboxA"> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><input type="checkbox" value="checkboxA"> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box"></div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="文献名" type="text">
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
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="出版社" type="text">
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
						<div class="margin2Box">参考サイト</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><input type="checkbox" value="checkboxA"> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><input type="checkbox" value="checkboxA"> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box"></div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="概要" type="text">
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
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="URL" type="text">
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
						<div class="margin2Box">参考資料</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><input type="checkbox" value="checkboxA"> 登録あり</label>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="margin2Box">
							<div class="checkbox">
								<label><input type="checkbox" value="checkboxA"> 登録なし</label>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">
						<div class="margin2Box"></div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="概要" type="text">
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
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="nickName" placeholder="資料名" type="text">
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
						<div class="margin2Box">メモ</div>
					</div>
					<div class="col-md-6">
						<div class="margin2Box">
							<input class="form-control" id="address" type="text">
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
					<button class="btn btn-primary harmos_w_120">検索</button>
				</div>
			</div>
		</div>
	
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
						<th>登録日</th>
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
						<td>2018/04/26</td>
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
						<td>2018/04/26</td>
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
						<td>2018/04/26</td>
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
						<td>2018/04/26</td>
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
						<td>2018/04/26</td>
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

