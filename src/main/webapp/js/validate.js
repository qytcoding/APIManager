$.extend($.fn.validatebox.defaults.rules, {
	/* 验证手机号码 */
	phone : {
		validator : function(value) {
			var reg = new RegExp(/^1[3|4|5|8|9]\d{9}$/);/*验证手机号码的正则表达式*/
			return reg.test(value);
		},
		message : '输入手机号码格式不准确'
	},
	
	
/* 验证用户名 */
	username:{
		validator:function(value,param){
			var reg=new RegExp(/^[\w]+$/);/*验证用户名格式的正则表达式*/
			if(!reg.test(value)){/*用户名只能由数字、字母、下划线构成.*/
					$.fn.validatebox.defaults.rules.username.message="用户名只能数字、字母、下划线构成.";
					return false;
			}
			else{
				if(value.length<param[0]||value.length>param[1]){/*用户名的长度限制在参数数组元素param[0]和param[1]之间*/
					$.fn.validatebox.defaults.rules.username.message="用户名的长度必须在"+param[0]+"和"+param[1]+"之间";
					return false;
				}
				else{
					return true;
				}
				
			}
		},
	message:""
	},
	passwordequal: {
			validator: function(value,param){
				return value == $(param[0]).val();
			},
			message: '两次输入不相同，请重新输入.'
	    },
	price: {
			validator : function(value) {
				var reg = new RegExp(/^[1-9]\d*(,\d{3})*(\.\d{2})?$/);/*验证人民币的正则表达式*/
				return reg.test(value);
			},
			message : '输入价格格式不准确'
		},
	number: {
			validator : function(value) {
				var reg = new RegExp(/^[0-9]*$/);/*验证数字的正则表达式*/
				return reg.test(value);
			},
			message : '请输入数字'
		},
		idcard: {
			validator : function(value) {
				var reg = new RegExp((/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/));/*验证身份证的正则表达式*/
				return reg.test(value);
			},
			message : '请输入正确的身份证号码'
		},
		zip: {
			validator : function(value) {
				var reg = new RegExp((/^[1-9][0-9]{5}$/));/*验证邮编的正则表达式*/
				return reg.test(value);
			},
			message : '请输入正确的邮编'
		}
		 
	    
});

   
