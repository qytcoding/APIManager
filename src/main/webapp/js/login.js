//显示当先系统时间
$(function() {
	setInterval(function() {
		$("#currenttime").val(new Date().toLocaleString());
	}, 10);
});
$('#username').focus();
function testUsername() {
	if (/^$/.test($('#username').val())) {
		$.messager.alert('警告', '账号不能为空！');
		$('#username').css('border', '1px solid #ff0000');
		$('#username').focus();
	} else if (!/^[0-9a-zA-Z]+$/.test($('#username').val())) {
		$.messager.alert('警告', '账号输入有误！');
		$('#username').css('border', '1px solid #ff0000');
		$('#username').focus();
	} else {
		$('#username').css('border', '1px solid #3CB371');
		return true;
	}
	return false;
}
function testLogin() {
	if (/^$/.test($('#username').val())) {
		$.messager.alert('警告', '账号不能为空！');
		$('#username').css('border', '1px solid #ff0000');
	} else if (/^$/.test($('#password').val())) {
		$.messager.alert('警告', '密码不能为空！');
		$('#password').css('border', '1px solid #ff0000');
	}
	else {
		return true;
	}
	return false;
}
function testselect(){
	if($("#type").val()==0){
		$.messager.alert('警告', '请选择用户类型！');
		return false;
	}
	else {
		return true;
	}
}
$('#password').focus(function() {
	testUsername();
});
$('#password').keyup(function() {
	$('#password').css('border', '1px solid #3CB371');
});
$('#submitBtn').click(function() {
	if (testUsername() && testLogin()&&testselect()) {
		var form = $("#loginForm");
		$.ajax({
			   url:'/website/Login/login.action',
			   type:'POST',
			   data:form.serialize(),
			   dataType:"json",
			   success:function(map){
				   if(map.flag == 1){
					   location.replace(map.result);
				   }else {
						$.messager.alert('提示', map.result);
					}
			   } 
		   });
		/*$("#loginForm").form('submit', {
			url :'/website/Login/login.action',
			success : function(date) {
				var date = $.parseJSON(date);
				if (date.flag == 1) {
					location.replace(date.result);
				} else {
					$.messager.alert('提示', date.result);
				}
			}
		})*/
	}
});