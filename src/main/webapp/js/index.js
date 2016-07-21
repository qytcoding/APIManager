$.ajax({
	url : '/website/Login/getAA.action',
	success : function(date) {
		$('#managerAccount').text(date.managerAccount);
	}
});
$('#menu-tree').tree({
	url : 'Data/tree1.json',
	animate : true,
	onClick : function(node) {
		if ($('#menu-tree').tree('isLeaf', node.target)) { // 判断是否是叶子节点
			showcontent(node.text, node.attributes.url);
		} else {
			$('#menu-tree').tree('toggle', node.target);
		}
	}
});
$('#content').tabs({
	fit : true
});
$('#content').tabs('add', {
	title : '首页',
	iconCls : 'icon-home',
	content : '<h1>欢迎！</h1>',
	closable : false
});
function showcontent(text, url) {
	if ($('#content').tabs('exists', text)) {
		$('#content').tabs('select', text);
	} else {
		$('#content').tabs('add', {
			title : text,
			href : url,
			closable : true
		});
	}
}