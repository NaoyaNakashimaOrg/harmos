<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
<form:form modelAttribute="SC_01_01_02_practiceDetailInquiryForm" method="POST"
	action="${pageContext.request.contextPath}/SC_01_01_02/practiceDetailInquiry">
	
    <div class="panel panel-primary">
			<div class="panel-heading">
				<a data-toggle="collapse" href="#practiceInputForm">
					<h5 class="panel-title">サンプル情報</h5>
				</a>
			</div>
			
			<div id="practiceInputForm" class="panel-body panel-collapse collapse in">
				
				<div class="row harmosTextBorder">
					<div class="col-md-2">
						<div class="margin2Box">サンプルNO</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">${f:h(SC_01_01_02_practiceDetailInquiryForm.practiceMngNo)}</div>
					</div>
				</div>
				<div class="row harmosTextBorder">
					<div class="col-md-2">
						<div class="margin2Box">概要</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">${f:h(SC_01_01_02_practiceDetailInquiryForm.overview)}</div>
					</div>
				</div>
				<div class="row harmosTextBorder">
					<div class="col-md-2">
						<div class="margin2Box">カテゴリ</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">${f:h(SC_01_01_02_practiceDetailInquiryForm.category)}</div>
					</div>
				</div>
				<div class="row harmosTextBorder">
					<div class="col-md-2">
						<div class="margin2Box">詳細</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">${f:h(SC_01_01_02_practiceDetailInquiryForm.detail)}</div>
					</div>
				</div>
				
				<!-- モジュール -->
				<c:forEach items="${SC_01_01_02_practiceDetailInquiryForm.moduleList}" var="moduleList" varStatus="status">
					<c:choose>
						<c:when test="${ fn:length( SC_01_01_02_practiceDetailInquiryForm.moduleList ) == 1}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box">モジュール</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.moduleName)}</div>
									</div>
								</div>
						</c:when>
						<c:otherwise>
							<c:if test="${status.first}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box">モジュール</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.moduleName)}</div>
									</div>
								</div>
							</c:if>
							<c:if test="${!status.first && !status.last}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.moduleName)}</div>
									</div>
								</div>
							</c:if>
							<c:if test="${status.last}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(moduleList.moduleName)}</div>
									</div>
								</div>
							</c:if>
						</c:otherwise>
					</c:choose>
					
				</c:forEach>
				
				<!-- 参考文献 -->
				<c:forEach items="${SC_01_01_02_practiceDetailInquiryForm.bibliographyList}" var="bibliographyList" varStatus="status">
					<c:choose>
						<c:when test="${ fn:length( SC_01_01_02_practiceDetailInquiryForm.bibliographyList ) == 1}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box">参考文献</div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(bibliographyList.name)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box">${f:h(bibliographyList.publisher)}</div>
									</div>
								</div>
						</c:when>
						<c:otherwise>
							<c:if test="${status.first}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box">参考文献</div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(bibliographyList.name)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box">${f:h(bibliographyList.publisher)}</div>
									</div>
								</div>
							</c:if>
							<c:if test="${!status.first && !status.last}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(bibliographyList.name)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box">${f:h(bibliographyList.publisher)}</div>
									</div>
								</div>
							</c:if>
							<c:if test="${status.last}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(bibliographyList.name)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box">${f:h(bibliographyList.publisher)}</div>
									</div>
								</div>
							</c:if>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				
				<!-- 参考サイト -->
				<c:forEach items="${SC_01_01_02_practiceDetailInquiryForm.webSiteList}" var="webSiteList" varStatus="status">
					<c:choose>
						<c:when test="${ fn:length( SC_01_01_02_practiceDetailInquiryForm.webSiteList ) == 1}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box">参考サイト</div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(webSiteList.overview)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box"><a href="${f:h(webSiteList.url)}" target="_blank">${f:h(webSiteList.url)}</a></div>
									</div>
								</div>
						</c:when>
						<c:otherwise>
							<c:if test="${status.first}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box">参考サイト</div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(webSiteList.overview)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box"><a href="${f:h(webSiteList.url)}" target="_blank">${f:h(webSiteList.url)}</a></div>
									</div>
								</div>
							</c:if>
							<c:if test="${!status.first && !status.last}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(webSiteList.overview)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box"><a href="${f:h(webSiteList.url)}" target="_blank">${f:h(webSiteList.url)}</a></div>
									</div>
								</div>
							</c:if>
							<c:if test="${status.last}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-5">
										<div class="margin2Box">${f:h(webSiteList.overview)}</div>
									</div>
									<div class="col-md-3">
										<div class="margin2Box"><a href="${f:h(webSiteList.url)}" target="_blank">${f:h(webSiteList.url)}</a></div>
									</div>
								</div>
							</c:if>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				
				<!-- 参考資料 -->
				<c:forEach items="${SC_01_01_02_practiceDetailInquiryForm.documentList}" var="documentList" varStatus="status">
					<c:choose>
						<c:when test="${ fn:length( SC_01_01_02_practiceDetailInquiryForm.documentList ) == 1}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box">参考資料</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.documentName)}</div>
									</div>
								</div>
						</c:when>
						<c:otherwise>
							<c:if test="${status.first}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box">参考資料</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.documentName)}</div>
									</div>
								</div>
							</c:if>
							<c:if test="${!status.first && !status.last}">
								<div class="row harmosTextBorderNone">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.documentName)}</div>
									</div>
								</div>
							</c:if>
							<c:if test="${status.last}">
								<div class="row harmosTextBorder">
									<div class="col-md-2">
										<div class="margin2Box"></div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.overview)}</div>
									</div>
									<div class="col-md-4">
										<div class="margin2Box">${f:h(documentList.documentName)}</div>
									</div>
								</div>
							</c:if>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				
				<div class="row harmosTextBorderNone">
					<div class="col-md-2">
						<div class="margin2Box">メモ</div>
					</div>
					<div class="col-md-8">
						<div class="margin2Box">${f:h(SC_01_01_02_practiceDetailInquiryForm.memo)}
						</div>
					</div>
				</div>
				
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-2 col-md-offset-5">
				<div class="margin30Box harmosExecuteButton">
					<input type="submit" name="inputForm" value="訂正" class="btn btn-primary harmos_w_120"/>
				</div>
			</div>
		</div>
		
</form:form>
</body>
</html>

