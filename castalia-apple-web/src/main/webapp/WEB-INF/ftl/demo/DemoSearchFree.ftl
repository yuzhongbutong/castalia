<#assign ctx = rc.contextPath>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo -- Velocity > Hibernate Search</title>
<link href="${ctx}/css/common/exterior/jquery-ui-1.10.4.custom.css" rel="stylesheet">
<script src="${ctx}/js/common/exterior/jquery-1.10.2.js"></script>
<script src="${ctx}/js/common/exterior/jquery-ui-1.10.4.custom.js"></script>
<script type="text/javascript" src="${ctx}/js/common/common.js"></script>
<style type="text/css">
body {
	font: 62.5% "Trebuchet MS", sans-serif;
	margin: 50px;
}
</style>
<script type="text/javascript">
	$(function() {
		$.ajax({
			type : "post",
			url : "${ctx}/demo/vm/get/user",
			error : function(error){},
			success : function(list) {
				$("#name_cdtID").autocomplete({
					source : list
				});
			}
		});
		
		$("#velocitySearch").button();

		$("#velocitySearch").click(function() {
			$("#demoFormID").submit();
		});
	});
</script>
</head>
<body>
	<form id="demoFormID" name="demoForm" action="${ctx}/demo/ftl/operate/search" method="post">
		<fieldset>
			<legend>查询条件</legend>
		<table style="width: 50%;">
			<tr align="center">
				<td width="40%"><input
					id="name_cdtID" name="userName_cdt" value="<#if userName??>${userName}</#if>" style="width: 98%"></td>
				<td width="60%"><button
						id="velocitySearch">Search</button></td>
			</tr>
		</table>
		</fieldset>
		<fieldset>
			<legend>查询结果</legend>
		<table style="width: 100%;">
			<tr align="center" style="background-color: #cccccc">
				<td width="10%" style="border-style: double;">ID</td>
				<td width="13%" style="border-style: double;">用户名</td>
				<td width="13%" style="border-style: double;">密码</td>
				<td width="16%" style="border-style: double;">创建时间</td>
				<td width="16%" style="border-style: double;">创建用户</td>
				<td width="16%" style="border-style: double;">更新时间</td>
				<td width="16%" style="border-style: double;">更新用户</td>
			</tr>
			<#if demoEOList??>
			<#list demoEOList as demo>
			<tr align="center">
				<td style="border-style: double;">${demo.id}</td>
				<td style="border-style: double;">${demo.userName}</td>
				<td style="border-style: double;">${demo.password}</td>
				<td style="border-style: double;">${demo.createDate}</td>
				<td style="border-style: double;">${demo.createUser}</td>
				<td style="border-style: double;">${demo.updateDate}</td>
				<td style="border-style: double;">${demo.updateUser}</td>
			</tr>
			</#list>
			</#if>
		</table>
		</fieldset>
	</form>
</body>
</html>