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
		
		$("#tbl_demoID").jqGrid(
				{
					datatype : "local",
					height : 250,
					colNames : [ '选项', '用户名', '密码', '创建时间', '创建用户', '更新时间', '更新用户' ],
					colModel : [ {
						name : 'id',
						index : 'id',
						width : 60,
						sorttype : "int"
					}, {
						name : 'invdate',
						index : 'invdate',
						width : 90,
						sorttype : "date"
					}, {
						name : 'name',
						index : 'name',
						width : 100
					}, {
						name : 'amount',
						index : 'amount',
						width : 80,
						align : "right",
						sorttype : "float"
					}, {
						name : 'tax',
						index : 'tax',
						width : 80,
						align : "right",
						sorttype : "float"
					}, {
						name : 'total',
						index : 'total',
						width : 80,
						align : "right",
						sorttype : "float"
					}, {
						name : 'note',
						index : 'note',
						width : 150,
						sortable : false
					} ],
					multiselect : true,
					caption : "Manipulating Array Data"
				});
		var mydata = [ {
			id : "1",
			invdate : "2007-10-01",
			name : "test",
			note : "note",
			amount : "200.00",
			tax : "10.00",
			total : "210.00"
		}, {
			id : "2",
			invdate : "2007-10-02",
			name : "test2",
			note : "note2",
			amount : "300.00",
			tax : "20.00",
			total : "320.00"
		}, {
			id : "3",
			invdate : "2007-09-01",
			name : "test3",
			note : "note3",
			amount : "400.00",
			tax : "30.00",
			total : "430.00"
		}, {
			id : "4",
			invdate : "2007-10-04",
			name : "test",
			note : "note",
			amount : "200.00",
			tax : "10.00",
			total : "210.00"
		}, {
			id : "5",
			invdate : "2007-10-05",
			name : "test2",
			note : "note2",
			amount : "300.00",
			tax : "20.00",
			total : "320.00"
		}, {
			id : "6",
			invdate : "2007-09-06",
			name : "test3",
			note : "note3",
			amount : "400.00",
			tax : "30.00",
			total : "430.00"
		}, {
			id : "7",
			invdate : "2007-10-04",
			name : "test",
			note : "note",
			amount : "200.00",
			tax : "10.00",
			total : "210.00"
		}, {
			id : "8",
			invdate : "2007-10-03",
			name : "test2",
			note : "note2",
			amount : "300.00",
			tax : "20.00",
			total : "320.00"
		}, {
			id : "9",
			invdate : "2007-09-01",
			name : "test3",
			note : "note3",
			amount : "400.00",
			tax : "30.00",
			total : "430.00"
		} ];
		for (var i = 0; i <= mydata.length; i++) {
			alert()
			$("#tbl_demoID").jqGrid('addRowData', i + 1, mydata[i]);
		}
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
				<th width="10%" style="border-style: double;">ID</th>
				<th width="13%" style="border-style: double;">用户名</th>
				<th width="13%" style="border-style: double;">密码</th>
				<th width="16%" style="border-style: double;">创建时间</th>
				<th width="16%" style="border-style: double;">创建用户</th>
				<th width="16%" style="border-style: double;">更新时间</th>
				<th width="16%" style="border-style: double;">更新用户</th>
			</tr>
			<#if demoEOList??>
			<#list demoEOList as demo>
			<tr align="center">
				<td style="border-style: double;">${demo.demoId}</td>
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