$.ajax({
	url : '/website/Login/getAA1.action',
	success : function(date) {
		$('#organizerAccount').text(date.organizerAccount);
		$('#organizerPdname').text(date.organizerPdname);
	}
});
$('#menu-tree1').tree({
	url : 'Data/tree2.json',
	animate : true,
	onClick : function(node) {
		if ($('#menu-tree1').tree('isLeaf', node.target)) { // 判断是否是叶子节点
			showcontent(node.text, node.attributes.url);
		} else {
			$('#menu-tree1').tree('toggle', node.target);
		}
	}
});
$('#content1').tabs({
	fit : true
});
$('#content1').tabs('add', {
	title : '首页',
	iconCls : 'icon-home',
	content : '<h1>欢迎！</h1>'+'<p>参赛选手报名</p>'+'<p>1.在线报名</p>'+
	'<p>(1)每项内容需填写完整。</p>'+'<p>(2)每项内容不能有空格。</p>'+'<p>2.Excel导入报名</p>'+'<p>(1)每项内容需填写完整。</p>'+'<p>(2)每项内容不能有空格。</p>'+
	'<p>(3)组别需填写完整（组别：小学1组（小学1至3年级学生），小学2组（小学4至6年级学生），中学组，职校组，智障组，</p>'+
	'<p>残疾组（含聋哑人），青年组（35岁以下），中年组（36-59岁），老年组（60岁及以上），农民中年组（36-59岁），农</p>'+
	'<p>民老年组（60岁及以上），教师组，共12个组别）。</p>'+
	'<p>(4)每个省中每个组别最多10个人报名参加。</p>'+'<p>(5)Excel表格中所有内容以文本形式保存（可以直接复制模板中对应列的数据）。</p>'+
	'<p>团长领队报名</p>'+'<p>1.在线报名</p>'+
	'<p>(1)每项内容需填写完整。</p>'+'<p>(2)每项内容不能有空格。</p>'+'<p>2.Excel导入报名</p>'+'<p>(1)每项内容需填写完整。</p>'+'<p>(2)每项内容不能有空格。</p>'+
	'<p>(3)类别只能为团长或领队。</p>'+'<p>(4)Excel表格中所有内容以文本形式保存（可以直接复制模板中对应列的数据）。</p>',
	closable : false
});
function showcontent(text, url) {
	if ($('#content1').tabs('exists', text)) {
		$('#content1').tabs('select', text);
	} else {
		$('#content1').tabs('add', {
			title : text,
			href : url,
			closable : true
		});
	}
}