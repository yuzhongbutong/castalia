<#assign ctx = rc.contextPath>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo -- FreeMarker > Mybatis Insert</title>
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
		var availableTags = [ "张三", "李四", "王五", "赵六", "张七", "李八" ];
		$("#nameID").autocomplete({
			source : availableTags
		});

		$("#velocitySubmit").button();

		$("#velocitySubmit").click(function() {
			$("#demoFormID").submit();
		});
		
		$( "#successDialogID" ).dialog({
			autoOpen: false,
			modal:true,
			width: 300,
			buttons: [
				{
					text: "Ok",
					click: function() {
						$( this ).dialog( "close" );
					}
				}
			]
		});
		<#if flag?? && flag>
			$( "#successDialogID" ).dialog( "open" );
		</#if>
	});
</script>
</head>
<body>
	<form id="demoFormID" name="demoForm" action="${ctx}/demo/ftl/operate/save" method="post">
		<table style="width: 50%;">
			<tr align="center">
				<td width="40%" style="border-style: double;"><input
					id="nameID" name="userName" style="width: 98%" value="王五"></td>
				<td width="40%" style="border-style: double;"><input
					name="password" type="password" style="width: 98%" value="bb"></td>
				<td width="20%" style="border-style: double;"><button
						id="velocitySubmit">Submit</button></td>
			</tr>
		</table>
		<div id="successDialogID" title="Dialog">
			<p>Save success!</p>
		</div>
	</form>
</body>
</html>