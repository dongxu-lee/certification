(function ($) {
	window['swUtil'] = $.swUtil = {
		/**
		 * 为表单中的input添加校验事件
		 * formId  需要验证的表单form的id
		 * obj     校验的数组：
		 * 		使用说明：
		 * 			var headFormValidate = [
		 *				{ name: 'voyageNo', type : 'code', require : true, maxLength: 17 },
		 *				{ name: 'shipId', type : 'code', require : true, maxLength: 25 },
		 *				{ name: 'shipName', type : 'code', require : true, maxLength: 35  }
		 *			];
		 *			swUtil.addFocusoutListener('org_mtf_m_head_form', headFormValidate);
		 *
		 *			name为input的name，type为期望的字符类型，require为必填项，maxLength为最大长度
		 *			type目前的可选值有  1.number 数字
		 *								2.int 正整数数字
		 *								3.code 非中文字符串
		 *			其他的校验项	1.require 此项为必填项
		 *							2.length 长度为length位
		 *							3.minLength 最小位数，不得少于minLength位
		 *							4.maxLength 最大位数，不得超过maxLength位（汉字占2位）,';
		 *							5.min 最小值，不得小于min;
		 *							6.max 最大值，不得大于max;
		 * @author panlei
		 *
		 */
		addFocusoutListener : function(formId, obj) {
			$.each(obj, function(i, v) {
				$('#' + formId + ' input[name=' + v.name + ']').focusout(function(event) {
					swUtil.validateField(formId, v)
				});
			});
		},
		/**
		 * 表单提交之前的校验
		 * formId  需要验证的表单form的id
		 * obj     校验的数组：
		 * 		使用说明：
		 * 			var headFormValidate = [
		 *				{ name: 'voyageNo', type : 'code', require : true, maxLength: 17 },
		 *				{ name: 'shipId', type : 'code', require : true, maxLength: 25 },
		 *				{ name: 'shipName', type : 'code', require : true, maxLength: 35  }
		 *			];
		 *			swUtil.validate('org_mtf_m_head_form', headFormValidate);
		 *		参数信息见addFocusoutListener的说明
		 * @author panlei
		 *
		 */
		validate : function (formId, obj){
			var validate = true;
			$.each(obj, function(i, v){
				if(!swUtil.validateField(formId, v)){
					validate = false;
				}
				/*
				// onblur事件
				if(v.maxLength || v.type == 'number'){
					
				}*/
			});
			return validate;
		},
		/**
		 * 表单校验公共方法
		 * @param formId  需要校验的表单的id
		 * @param obj  需要校验的字段的数组
		 * @returns {Boolean}   返回校验是否通过：true为通过；false为未通过
		 * @author panlei
		 *
		 */
		validateField : function(formId, validate){
			var $input = $('#' + formId + ' input[name=' + validate.name + ']');
			var value = $input.val() || '';
			var valueLength = swUtil.getLength(value);
			var message = '';
			var result = true;
			// 校验非空
			if(validate.require && valueLength <= 0){
				message = message + '此项为必填项,';
				result = false;
			}
			// 校验长度
			if(validate.length && validate.length != valueLength){
				message = message + '长度为' + validate.length + '位,';
				result = false;
			}
			
			// 校验长度最值
			if(validate.minLength && valueLength != 0 && validate.minLength > valueLength){
				message = message + '不得少于' + validate.minLength + '位,';
				result = false;
			}
			if(validate.maxLength && valueLength != 0 && validate.maxLength < valueLength){
				message = message + '不得超过' + validate.maxLength + '位（汉字占2位）,';
				result = false;
			}
			
			// 校验大小最值
			if(validate.min && validate.min > parseFloat(value)){
				message = message + '不得小于' + validate.min + ',';
				result = false;
			}
			if(validate.max && validate.max < parseFloat(value)){
				message = message + '不得大于' + validate.max + ',';
				result = false;
			}
			// 校验类型 默认string类型
			// 默认string类型
			if(!validate.type){
				validate.type = 'string';
			}
			// number
			if(validate.type == 'number' && valueLength != 0 && !swUtil.isNumber(value)){
				message = message + '应该为数字,';
				result = false;
			}
			// int
			if(validate.type == 'int' && length != 0 && !CEB.isInt(value)){
				message = message + '应该为正整数数字,';
				result = false;
			}
			// 非中文字符串
			if(validate.type == 'code' && swUtil.isChinese(value)){
				message = message + '应该为非中文字符串,';
				result = false;
			}
			if(!result){
				layer.tips(message.substring(0, message.length - 1), '#' + formId + ' input[name=' + validate.name + ']', {
					tips:[3, 'DC143C'],
					tipsMore:true,
					time:1500
				});
			}
			return result;
		},
		/**
		 * 获取字符串长度（中英文混合）
		 * @author panlei
		 *
		 */
		getLength : function(str) { 
			var l = 0; 
			var a = str.split(''); 
			for (var i = 0; i < a.length; i += 1) { 
				if (a[i].charCodeAt(0) < 299) { 
					l += 1; 
				} else { 
					l += 2; 
				} 
			} 
			return l; 
		},
		/**
		 * 是否为中文字符
		 * @author panlei
		 *
		 */
		isChinese :	function (str) { 
			//if(str == '') return true;
			var pattern = /[\u4E00-\u9FA5]/g;
			if(pattern.test(str)){                 
				return true;
			}else{
				return false;
			} 
		},
		/**
		 * 是否为数值类型
		 * @author panlei
		 *
		 */
		isNumber : function (str) {
			if(str == '') return true;
			var regx = /^\d{n}(\.\d{n})?$/;
			if(regx.test(str)){
				return true;
			}
			return false;
		},
		/**
		 * 初始化bootstrap-suggest下拉框
		 * 	使用方法：
		 * 		swUtil.selection({
		 * 			fieldId : 'billTypeSelection',
		 * 			fieldName : 'billType',
		 *			idField : 'code',
		 *			keyField : 'name',
		 *			url : basePath + 'sw/mft/querybiz/msgTypes',
		 *			getDataMethod : 'firstByUrl'// 获取数据的方式，url：一直从url请求；data：从 options.data
		 * 		},{
		 *			indexId: 0,  
		 *	        indexKey: 0,   
		 * 		});
		 *  使用说明：
		 *  	传入的参数为两个json object，
		 *  		第一个参数为必须的选项，这个对象中包括的参数有
		 *  			1.idField 不传，固定值为code
		 *  			2.keyField 不传，固定值为name
		 *  			3.url 必须传的参数，请求的url地址
		 *  			4.autoSelect 可不传，默认值为true
		 *  			5.getDataMethod 可不传，默认值为url
		 *  			6.processData 可不传，默认值为组件自己的processData方法
		 *  			7.fieldId 必须传的参数，需要显示下拉框的input的id
		 *  			8.fieldName 必须传的参数，下拉框选择值以后赋值的隐藏input的name
		 *  			9.onSetSelectValueCallBack 可不传，为隐藏input赋值后的回调函数
		 *  			10.allowNoKeyword可不传，默认值为false
		 *  			initCodeName: 选填，初始化显示的名称
		 * 				initCodeValue： 选填，初始化填入的值
		 * 				rowNum:选填，显示最大条数，默认全部
		 * 				filterCon:选填，过滤条件，默认不过滤,级联过滤时先销毁搜索框绑定再创建新的搜索框
		 * 							1）$("#" + required.fieldId).bsSuggest("destroy");
		 * 							2）swUtil.selection...
		 * 				isDisable:选填，是否禁用搜索框，默认不禁用
		 * 				isReadonly:选填，是否只读搜索框，默认不只读
		 * 				isEditable:选填，是否搜索框可编辑，默认不可编辑
		 *  		第二个参数为可选项，当此方法封装的参数不能满足要求是可以自行传入相关参数
		 *  			这个对象中的参数为所有bootstrap-suggest支持的参数
		 *  	此方法中封装的参数包括：idField、keyField、url、autoSelect、getDataMethod、processData
		 * @author panlei
		 *
		 */
		selection : function (required){
			var basePath = swProxyBasePath;
			var data=[];
		    var firstCode = required.initCodeValue || '';
		    var firstName = required.initCodeName || '';
		    var conditionFilter = required.filterCon || '';
		    var editFlag = required.isEditable || false;
		    if(editFlag){
		    	if(firstCode!=''){
		    		//回填name
				    $.ajax({
			    		url : basePath+'sw/base/para/depParaMap?tableName='+required.url+'&keyValue='+firstCode,
			    	    method: 'get',
			    	    data:data,
			    	    dataType: "json",
			    	    success: function (data) {
			    	    	if(data.codeName!=""&&data.codeName!=" "&&data.codeName!=null){
				    	    	$("#" + required.fieldId).val(data.codeName);
				    	    	$("#" + required.fieldName).val(data.codeValue);
			    	    	}else{
			    	    		$("#" + required.fieldId).val(firstCode);
			    	    		$("#" + required.fieldName).val(firstCode);
			    	    	}
			    	    }
			    	});
		    	}else{
			    	$("#" + required.fieldId).val('');
		    		$("#" + required.fieldName).val('');
			    }
		    }else{
		    	if(firstCode!=''){
			    	//回填name
				    $.ajax({
			    		url : basePath+'sw/base/para/depParaMap?tableName='+required.url+'&keyValue='+firstCode,
			    	    method: 'get',
			    	    data:data,
			    	    dataType: "json",
			    	    success: function (data) {
			    	    	if(data.codeName!=""&&data.codeName!=" "&&data.codeName!=null){
				    	    	$("#" + required.fieldId).val(data.codeName);
				    	    	$("#" + required.fieldName).val(data.codeValue);
			    	    	}else{
			    	    		$("#" + required.fieldId).val('');
			    	    		$("#" + required.fieldName).val('');
			    	    	}
			    	    }
			    	});
			    }else{
			    	$("#" + required.fieldId).val('');
		    		$("#" + required.fieldName).val('');
			    }
		    }
		    
//		    required.getDataMethod='url';
//		    required.getDataMethod='firstByUrl';
		    
		    //判断是否使用缓存
		    $.ajax({
				url : swProxyBasePath+"/sw/base/para/getParaInfo?tableName="+required.url,
				data : "",
				dataType : "json",
				type : "get",
				contentType : "application/json;charset=utf-8",  
				success : function(data) {
//					console.log(data.isUseCache);
					//判断该代码是否使用页面缓存。
					if("false"==data.isUseCache){
						required.getDataMethod="url";
					}else if("true"===data.isUseCache){
						required.getDataMethod="firstByUrl";
					}else{
						required.getDataMethod="url";
					}
					$("#" + required.fieldId).bsSuggest({
						idField : 'code',
						keyField : 'name',
						url : basePath+'sw/base/para/depParaList?tableName='+required.url+'&rowNum='+(required.rowNum||'100')+'&filterCon='+conditionFilter+'&keyValue=',
						// ignorecase: true, //前端搜索匹配时，是否忽略大小写
						autoSelect : required.autoSelect || true, // 键盘向上/下方向键时，是否自动选择值
//						getDataMethod : required.getDataMethod || 'firstByUrl', // 获取数据的方式，url：一直从url请求；data：从 required.data
								// 获取；firstByUrl：第一次从Url获取全部数据，之后从required.data获取
						getDataMethod : required.getDataMethod,//默认使用实时查询。
						allowNoKeyword: required.allowNoKeyword || true, //是否允许无关键字时请求数据
						autoDropup: true,//选择菜单是否自动判断向上展开
						isEditable: editFlag,
						processData : function(e) {
							//在firstByUrl时，每次的e都没有返回值，只有在url时才有返回，当无返回数据时，输入框置空
							if('url'==required.getDataMethod&&!editFlag){
								if(e.length==0 || e.value.length==0){
									$("#" + required.fieldId).val('');
									$("#" + required.fieldName).val('');
								}
							}
//							console.log(e);
//							if(e.length==0 || e.value.length==0){
//								$("#" + required.fieldId).val('');
//								$("#" + required.fieldName).val('');
//							}
							return e;
						}
					}).on("onSetSelectValue", function(e, keyword, data) {
						$("#" + required.fieldName).val(keyword.id);
						if( required.onSetSelectValueCallBack && typeof required.onSetSelectValueCallBack == 'function'){
							required.onSetSelectValueCallBack(e, keyword, data);
						}
					}).on("keydown", function(c){
						if(c.keyCode == 8){
							$("#" + required.fieldName).val('');
							$("#" + required.fieldId).val('');
						}
					});
					
					var disableFlag = required.isDisable || false;
					if(disableFlag){
						$("#" + required.fieldId).bsSuggest("disable");
					}
					
					var readonlyFlag = required.isReadonly || false;
					if(readonlyFlag){
						$("#" + required.fieldId).bsSuggest("readonly");
					}
					
					$("#" + required.fieldId).focus(function(){
						this.select();
					});
					$("#" + required.fieldId).blur(function(){
						//不可编辑搜索框当失去焦点时清空未选中的情况
						//可编辑搜索框当失去焦点时判断值和显示的name是否一致，不一致按照name赋值
						if(!editFlag){
							if($("#" + required.fieldId).val()==''||$("#" + required.fieldId).val()==null){
								$("#" + required.fieldName).val('');
							} 
							if($("#" + required.fieldName).val()==''||$("#" + required.fieldName).val()==null){
								$("#" + required.fieldId).val('');
							}
						}else{
							if($("#" + required.fieldName).val()!=''&&$("#" + required.fieldName).val()!=null){
								$.ajax({
						    		url : basePath+'sw/base/para/depParaMap?tableName='+required.url+'&keyValue='+$("#" + required.fieldName).val(),
						    	    method: 'get',
						    	    data:data,
						    	    dataType: "json",
						    	    success: function (data) {
						    	    	if(data.codeName!=""&&data.codeName!=" "&&data.codeName!=null){
						    	    		if(data.codeName == $("#" + required.fieldId).val()){
								    	    	$("#" + required.fieldId).val(data.codeName);
								    	    	$("#" + required.fieldName).val(data.codeValue);
						    	    		}else{
						    	    			$("#" + required.fieldName).val($("#" + required.fieldId).val());
						    	    		}
						    	    	}else{
						    	    		$("#" + required.fieldName).val($("#" + required.fieldId).val());
						    	    	}
						    	    }
						    	});
							}else{
								$("#" + required.fieldName).val($("#" + required.fieldId).val());
							}
						}
					});
					
					
				}

			});
		    

		},
		/**
		 * 输入框回填inputBackfill
		 * 
		 * 使用方法：
		 *  swUtil.inputBackfill({ 
		 * 		fieldId :'cusInputName',
		 * 		fieldName :'cusInput',
		 * 		url : 'CUS_BUSI_TYPE',
		 * 		initCodeName : '餐饮娱乐',
		 * 		initCodeValue: '11'	
		 * });
		 * 
		 * 使用参数：
		 * fieldId:必填，为要显示回填结果的输入框id
		 * fieldName：必填，为要储存回填结果CODE的元素id
		 * url：必填，请求的同义词表名
		 * initCodeName: 选填，初始化显示的名称
		 * initCodeValue： 选填，初始化填入的值
		 * 
		 */
		inputBackfill : function (required){
			var basePath = swProxyBasePath;
		    
		    var firstCode = required.initCodeValue || $("#" + required.fieldName).val() || '';
		    var data=[];
		    if(firstCode!=''){
		    	//回填name
			    $.ajax({
		    		url : basePath+'sw/base/para/depParaMap?tableName='+required.url+'&keyValue='+firstCode,
		    	    method: 'get',
		    	    data:data,
		    	    dataType: "json",
		    	    success: function (data) {
		    	    	if(data.codeName!=""&&data.codeName!=" "&&data.codeName!=null){
			    	    	$("#" + required.fieldId).val(data.codeName);
			    	    	$("#" + required.fieldName).val(data.codeValue);
		    	    	}else{
		    	    		$("#" + required.fieldId).val('');
		    	    		$("#" + required.fieldName).val('');
		    	    	}
		    	    }
		    	});
		    }
		    
		    $("#" + required.fieldId).blur(function(){
		    	$.ajax({
		    		url : basePath+'sw/base/para/depParaMap?tableName='+required.url+'&keyValue='+encodeURI(encodeURI($("#" + required.fieldId).val())),
		    	    method: 'get',
		    	    data:data,
		    	    dataType: "json",
		    	    success: function (data) {
		    	    	if(data.codeName!=""&&data.codeName!=" "&&data.codeName!=null){
			    	    	$("#" + required.fieldId).val(data.codeName);
			    	    	$("#" + required.fieldName).val(data.codeValue);
		    	    	}else{
//		    	    		layer.tips("找不到对应信息",  //所需提醒的信息
//		    	    			  $("#" + required.fieldId),{		//所需提醒的元素
//    							  tips: [2,'#DC143C'], //在元素的下面出现 1上面，2右边 3下面
//    							  tipsMore: true, //允许同时存在多个
//    							  time:2000 //tips自动关闭时间，毫秒
//    						});
		    	    		$("#" + required.fieldId).val('');
		    	    		$("#" + required.fieldName).val('');
		    	    	}
		    	    }
		    	});
		    });
		    $("#" + required.fieldId).keypress(function(e){
		        var eCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
		        if (eCode == 13){
		        	$.ajax({
			    		url : basePath+'sw/base/para/depParaMap?tableName='+required.url+'&keyValue='+encodeURI(encodeURI($("#" + required.fieldId).val())),
			    		method: 'get',
			    		data:data,
			    		dataType: "json",
			    	    success: function (data) {
			    	    	if(data.codeName!=""&&data.codeName!=" "&&data.codeName!=null){
			    	    		$("#" + required.fieldId).val(data.codeName);
				    	    	$("#" + required.fieldName).val(data.codeValue);
			    	    	}else{
//			    	    		layer.tips("找不到对应信息",  //所需提醒的信息
//			    	    			  $("#" + required.fieldId),{		//所需提醒的元素
//	    							  tips: [2,'#DC143C'], //在元素的下面出现 1上面，2右边 3下面
//	    							  tipsMore: true, //允许同时存在多个
//	    							  time:2000 //tips自动关闭时间，毫秒
//	    						});
			    	    		$("#" + required.fieldId).val('');
			    	    		$("#" + required.fieldName).val('');
			    	    	}
			    	    }
			    	});
		        }
		    });
		},
		/**
		 * 按指定格式传入日期字符串，计算出间隔days后的日期，以相同格式返回
		 * @param dateStr format格式的字符串
		 * @param days    计算dateStr日期之后days天，传正整数；计算dateStr日期之前days天，传负整数
		 * @param format  默认'YYYY-MM-DD hh:mm:ss'， 必须是：年y，月M，日d，时h，分m，秒s
		 * @returns {String}
		 * @author panlei
		 */
		strDateCalculation : function (dateStr, days, format){
			format = format || 'YYYY-MM-DD hh:mm:ss';
			if(!days){
				return dateStr;
			}
			var result = swUtil.str2Date(dateStr,format).getTime(); 
			result += days*24*3600*1000;
			result = new Date(result);
			return swUtil.date2Str(result, format);
		},
		/**
		 * 比较两个日期之间相差的天数，下取整，不足一天按0计算
		 * @param dateStr1 format格式的字符串1
		 * @param dateStr2 format格式的字符串2
		 * @param format   默认'YYYY-MM-DD hh:mm:ss'， 必须是：年y，月M，日d，时h，分m，秒s
		 * @returns
		 */
		strDateDiff : function (dateStr1, dateStr2, format){
			format = format || 'YYYY-MM-DD hh:mm:ss';
			var time1 = swUtil.str2Date(dateStr1,format).getTime(); 
			var time2 = swUtil.str2Date(dateStr2,format).getTime(); 
			return Math.floor(Math.abs(time1-time2)/24/3600/1000);
		},
		/**
		 * 将字符串按照指定的格式转化为日期
		 * @param str format格式的字符串
		 * @param format 必须是：年Y，月M，日D，时h，分m，秒s
		 * @returns 按照指定的格式转化后的日期，为Date类型
		 * @author panlei
		 */
		str2Date : function (str, format){
			return new Date(str.substring(format.indexOf('Y'),format.lastIndexOf('Y')+1),
					parseInt(str.substring(format.indexOf('M'),format.lastIndexOf('M')+1))-1,
					str.substring(format.indexOf('D'),format.lastIndexOf('D')+1),
					str.substring(format.indexOf('h'),format.lastIndexOf('h')+1),
					str.substring(format.indexOf('m'),format.lastIndexOf('m')+1),
					str.substring(format.indexOf('s'),format.lastIndexOf('s')+1));
		},
		/**
		 * 将 Date 转化为指定格式的String
		 * @param date  日期类型
		 * @param format  格式字符串，必须是：年Y，月M，日D，时h，分m，秒s，季度q，毫秒S
		 * 				其中M、D、h、m、s、q可以用1-2个占位符， Y可以用1-4个占位符,S只能用 1 个占位符(是1-3位的数字) 
		 * @returns 按指定format格式化后的字符串
		 * @author panlei
		 */
		date2Str : function (date, format) { // author: meizz
			var dateObj = {
				"M+" : date.getMonth() + 1,
				"D+" : date.getDate(),
				"h+" : date.getHours(),
				"m+" : date.getMinutes(),
				"s+" : date.getSeconds(),
				"q+" : Math.floor((date.getMonth() + 3) / 3),
				"S" : date.getMilliseconds()
			};
			if (/(Y+)/.test(format)){
				format = format.replace(RegExp.$1, (date.getFullYear() + "").substr(4 - RegExp.$1.length));
			}
			for (var key in dateObj){
				if (new RegExp("(" + key + ")").test(format)){
					format = format.replace(RegExp.$1, (RegExp.$1.length == 1) ? (dateObj[key])
							: (("00" + dateObj[key]).substr(("" + dateObj[key]).length)));
				}
			}
			return format;
		}
	}
	
	/** 
	 * 校验中英文混合值的长度，中文占两位字符
	 * 使用方法：定义validateRules时直接定义 {cnLength：10}
	 * 			可以自定义validateMsgs{cnLength："自定义"}，默认为[最大长度为{0}位字符（中文占两位）.]
	 */
	jQuery.validator.addMethod("cnLength", function(value, element, param) {  
		var length = $.isArray( value ) ? value.length : swUtil.getLength(value);
		return this.optional( element ) || length <= param;
	}, $.validator.format( "最大长度为{0}位字符（中文占两位）." )); 
	
	/** 
	 * 校验number类型数据的整数和小数部分长度
	 * 使用方法：定义validateRules时直接定义 {decimalLength：[10,2]} ,参数为数组形式，其中10表示整数部分不超过10位，2表示小数部分不超过2位
	 * 			可以自定义validateMsgs{decimalLength："自定义"}，默认为[整数部分不能超过{0}位，小数部分不能超过{1}位.]
	 */
	jQuery.validator.addMethod("decimalLength", function(value, element, param) {
		var regex = new RegExp("^\\d{1,"+param[ 0 ]+"}(\\.\\d{1,"+param[ 1 ]+"}){0,1}$")
		return this.optional( element ) || regex.test(value);
	}, $.validator.format( "整数部分不能超过{0}位，小数部分不能超过{1}位." )); 
	/** 
	 * 校验正整数类型数据长度
	 * 使用方法：定义validateRules时直接定义 {intLength：10,2}
	 * 			可以自定义validateMsgs{intLength："自定义"}，默认为[最大为{0}位整数.]
	 */
	jQuery.validator.addMethod("intLength", function(value, element, param) {
		var regex = new RegExp("^(\\d{0," + param + "})$");
		return this.optional( element ) || regex.test(value);
	}, $.validator.format( "最大为{0}位整数." )); 
	
	/** 
	 * 传入自定义正则表达式和提示信息
	 * 使用方法：定义validateRules时直接定义 {customizeRegex：自定义正则表达式} ,参数为正则表达式，如果传入的正则表达式格式有误，不会抛出错误，直接认为校验未通过
	 * 			可以自定义validateMsgs{customizeRegex："自定义"}，默认为[参数校验未通过]
	 */
	jQuery.validator.addMethod("customizeRegex", function(value, element, param) {
		var regex = "";
		try{
			regex = new RegExp(param)
		}catch(e){
			return false;
		}
		return this.optional( element ) || regex.test(value);
	}, "参数校验未通过"); 
	/** 
	 * 必须为中文字符
	 * 使用方法：定义validateRules时直接定义 {isChinese：true}
	 * 			可以自定义validateMsgs{isChinese："自定义"}，默认为[必须为中文字符]
	 */
	jQuery.validator.addMethod("isChinese", function(value, element, param) {
		var pattern = /[\u4E00-\u9FA5]/g;
		return this.optional( element ) || pattern.test(value);
	}, "必须为中文字符"); 
	/** 
	 * 必须不是中文字符
	 * 使用方法：定义validateRules时直接定义 {nonChinese：true}
	 * 			可以自定义validateMsgs{nonChinese："自定义"}，默认为[不能包含中文字符]
	 * 			如果校验的元素有title属性，validateMsgs必须自定义，否则会显示title属性的值
	 */
	jQuery.validator.addMethod("nonChinese", function(value, element, param) {
		var pattern = /[\u4E00-\u9FA5]/g;
		return this.optional( element ) || !pattern.test(value);;
	}, "不能包含中文字符"); 
	
	/**
	 * 通用的字段校验方法
	 * param 为正则  可以写为 /^([A-Za-z0-9]{13}|[A-Za-z0-9]{18})$/ 这种 也可以写为'^([A-Za-z0-9]{13}|[A-Za-z0-9]{18})$'
	 * 
	 * '无法匹配' 为提示信息 建议 重写提示信息
	 *   declCode:{pattern:/^([A-Za-z0-9]{13}|[A-Za-z0-9]{18})$/},
	 *   declCode:{pattern:'必须为13位或18位数字或字母'},
	 * 
	 * 
	 */
	 jQuery.validator.addMethod("pattern", function( value, element, param ) {
			return new RegExp(param).test(value);
		}, "无法匹配"); 


})(jQuery);

/**
 * 描述：为元素绑定时间控件
 * 
 * format：为需要显示的日期格式 可不传 何映 修改
 * 
 */
function createDate(nodeId,format){
	var _format = format || 'YYYY-MM-DD';
	return {
            elem: nodeId,
            format: _format,           
            max: '2099-06-16 23:59:59',
            istime: true,
            istoday: true
    }
}


/**
 * 描述：设置开始时间和结束时间
 */
function date(startDateCode,endDateCode,format){
	var startDate = createDate(startDateCode,format);
	var endDate = createDate(endDateCode,format);
	laydate(startDate);
	laydate(endDate);
	startDate.choose=function(datas){
		endDate.min = datas
		endDate.start = datas
	}
	endDate.choose=function(datas){
		startDate.max = datas;
	}
}
/**
 * 描述：获取url中的参数
 */
function getUrlVars() {
	var vars = {};
	var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
	for (var i = 0; i < hashes.length; i++) {
		hash = hashes[i].split('=');
		vars[hash[0]] = hash[1];
	}
	return vars;
}

/**
 * 描述：获取AJAX错误信息并提示
 */
$(function () {
    $.ajaxSetup({
        error: function (jqXHR, status, error) {
        	var msg="";
        	 if (jqXHR.status === 0) {
                 msg = '网络连接失败,请检查您的网络设置';
             } else if (jqXHR.status == 403) {
                 msg = '没有访问权限,请联系运维人员';
             } else if (jqXHR.status == 404) {
                 msg = '页面找不到,请联系运维人员';
             } else if (jqXHR.status == 500) {
                 msg = '内部服务器错误,请联系运维人员';    
             } else if (jqXHR.status == 550) {
                 msg = '内部服务器错误,请联系运维人员';
             } else if (error === 'parsererror') {
                 msg = '请求的数据解析失败,请联系运维人员';
             } else if (error === 'timeout') {
                 msg = '访问超时,请联系运维人员';
             } else if (error === 'abort') {
                 msg = '请求已取消,请联系运维人员';
             } else {
                 msg = '未知错误类型,' + jqXHR.responseText;
             }
            //prompt a alert window
        	 layer.alert(msg);
        }
    });
});

/**
 * 描述：打开新的框架tab页并传参
 * 作者：焦登报
 **/ 
function openTab(menuName,menuNameCN, url,tabParamJson) {
	var paramStr=JSON.stringify(tabParamJson);
	if(url.indexOf("?")>-1){
		url = url + "&ngBasePath=" + swProxyBasePath;
	}else{
		url = url + "?ngBasePath=" + swProxyBasePath;
	}
	if (top.$(".J_menuItem").length > 0) {
		if (top.$('a#' + menuName).length > 0) {
			top.$('a#' + menuName)[0].setAttribute("data",paramStr);
			var aElements= top.document.getElementsByTagName('iframe');
		    var aEle=[];
		    for(var i=0;i<aElements.length;i++)
		    {
		        if(aElements[i].getAttribute('data-id')==url)
		            aEle.push( aElements[i] );
		    }
		    if(aEle[0]){
		    	aEle[0].contentWindow.location.reload(true);
		    }
		    top.$('a#' + menuName)[0].click();
		} else {
			var dataIndex = top.$(".J_menuItem").length;
			var hrefEle = '<a id ="' + menuName + '" title="' + menuNameCN
					+ '" class="J_menuItem" href="' + url + '" data-index="'
					+ dataIndex + '" style="display:none;" data='+paramStr+'>' + menuNameCN
					+ '</a>';
			top.$('body').append(hrefEle);
			var contabsUrl =  swProxyBasePath + "static/js/contabs.js";
			top.$.getScript(contabsUrl).done(function() {
				top.$('a#' + menuName)[0].click();
			}).fail(function() {
				layer.alert("打开详情失败", {
					skin : 'layui-layer-lan',
					closeBtn : 1,
					anim : 0
				// 动画类型
				});
			});
		}
	} else {
		window.location.href = url;
	}
}

/**
 * 描述：获取新的框架tab页中传的参数
 * 作者：焦登报
 **/ 
function getTabParam(){
	var aElements= top.document.getElementsByTagName('a');
    var aEle=[];
    for(var i=0;i<aElements.length;i++)
    {
    	var attrHref = aElements[i].getAttribute('href')+"";
    	var strTemp = "";
    	if(window.location.port==""||window.location.port=="80"||window.location.port=="443"){
    		strTemp = attrHref.replace(":80","").replace(":443","");
    	}else{
    		strTemp = attrHref;
    	}
        if(strTemp== window.location.href){
        	aEle.push( aElements[i] );
        }
            
    }
    if(!aEle[0]){
    	return null;
    }
    var urlParams=aEle[0].getAttribute("data");
	if(urlParams){
		return JSON.parse(urlParams);
	}else{
		return null;
	}
}
/**
 * 控制输入中英文字符长度，一个中文当做2个长度来控制
 * @param inpt
 * @param maxlen
 */

function checklen(inpt, maxlen) {
	var str = inpt.value;
	var len = str.length;
	//utf-8字节长度
	var realLength = 0;
	for (var i = 0; i < len; i++) {
		charCode = str.charCodeAt(i);
		if (charCode >= 0 && charCode <= 128) {
			realLength += 1;
		} else {
			// 如果是中文则长度加2
			realLength += 2;
		}
		if (realLength > maxlen) {
			inpt.value = str.substr(0, i);
			return;
		}
	}
}
/**
 * 控制输入数字格式，maxlen长度，flmax精度
 */
function checkflaot(inpt, maxlen, flmax) {

	var val = inpt.value;
	
	//检查是否是非数字值    
	if (isNaN(val)) {
		inpt.value = 0;
		return;
	}
	//当不足flmax位小数时，自动补0
	var s_x = val.toString();
	var pos_decimal = s_x.indexOf('.');

	if (pos_decimal < 0) {
		pos_decimal = s_x.length;
		s_x += '.';
	}
	while (s_x.length <= pos_decimal + flmax) {
		s_x += '0';
	}
	//整数位最大长度
	var intmax=maxlen-flmax;
	var num=s_x.split(".");
	//整数位截取
	var intnum = num[0].substr(-intmax);
	//小数位截取
	var bitnum = num[1].substr(0,flmax);
	inpt.value = intnum+'.'+bitnum;
}

/**
 * 日期输入控件
 * @param id
 */
function dateInput(id) {
	//var inputs = $(".hhm-dateInputer");
	var dateStr = "____-__-__";

	var input = $("#" + id);
	input.on("keydown", function(event) {
		var that = this; //当前触发事件的输入框。
		var key = event.keyCode;
		var cursorIndex = getCursor(that);
		//输入数字
		if (key >= 48 && key <= 57) {
			//光标在日期末尾或光标的下一个字符是"-",返回false,阻止字符显示。
			if (cursorIndex == dateStr.length
					|| that.value.charAt(cursorIndex) === "-") {
				return false;
			}
			//字符串中无下划线时，返回false
			if (that.value.search(/_/) === -1) {
				return false;
			}
			var fron = that.value.substring(0, cursorIndex); //光标之前的文本
			var reg = /(\d)_/;
			setTimeout(function() { //setTimeout后字符已经输入到文本中
				//光标之后的文本
				var end = that.value.substring(cursorIndex,
						that.value.length);
				//去掉新插入数字后面的下划线_
				that.value = fron + end.replace(reg, "$1");
				//寻找合适的位置插入光标。
				resetCursor(that);
			}, 1);
			return true;
			//"Backspace" 删除键
		} else if (key == 8) {
			//光标在最前面时不能删除。  但是考虑全部文本被选中下的删除情况
			if (!cursorIndex && !getSelection(that).length) {
				return false;
			}
			//删除时遇到中划线的处理
			if (that.value.charAt(cursorIndex - 1) == "-") {
				var ar = that.value.split("");
				ar.splice(cursorIndex - 2, 1, "_");
				that.value = ar.join("");
				resetCursor(that);
				return false;
			}
			setTimeout(function() {
				//值为空时重置
				if (that.value === "") {
					that.value = "____-__-__";
					resetCursor(that);
				}
				//删除的位置加上下划线
				var cursor = getCursor(that);
				var ar = that.value.split("");
				ar.splice(cursor, 0, "_");
				that.value = ar.join("");
				resetCursor(that);
			}, 1);
			return true;
		}
		return false;
	});
	input.on("focus", function() {
		if (!this.value) {
			this.value = "____-__-__";
		}
		resetCursor(this);
	});
	input.on("blur", function() {
		if (this.value === "____-__-__") {
			this.value = "";
		}
	});

}

//设置光标到正确的位置
function resetCursor(elem) {
	var dateStr = "____-__-__";
	var value = elem.value;
	var index = value.length;
	//当用户通过选中部分文字并删除时，此时只能将内容置为初始格式洛。
	if (elem.value.length !== dateStr.length) {
		elem.value = dateStr;
	}
	var temp = value.search(/_/);
	index = temp > -1 ? temp : index;
	setCursor(elem, index);
	//把光标放到第一个_下划线的前面
	//没找到下划线就放到末尾
}

function getCursor(elem) {
	//IE 9 ，10，其他浏览器
	if (elem.selectionStart !== undefined) {
		return elem.selectionStart;
	} else { //IE 6,7,8
		var range = document.selection.createRange();
		range.moveStart("character", -elem.value.length);
		var len = range.text.length;
		return len;
	}
}
function setCursor(elem, index) {
	//IE 9 ，10，其他浏览器
	if (elem.selectionStart !== undefined) {
		elem.selectionStart = index;
		elem.selectionEnd = index;
	} else {//IE 6,7,8
		var range = elem.createTextRange();
		range.moveStart("character", -elem.value.length); //左边界移动到起点
		range.move("character", index); //光标放到index位置
		range.select();
	}
}
function getSelection(elem) {
	//IE 9 ，10，其他浏览器
	if (elem.selectionStart !== undefined) {
		return elem.value.substring(elem.selectionStart,
				elem.selectionEnd);
	} else { //IE 6,7,8
		var range = document.selection.createRange();
		return range.text;
	}
}
function setSelection(elem, leftIndex, rightIndex) {
	if (elem.selectionStart !== undefined) { //IE 9 ，10，其他浏览器
		elem.selectionStart = leftIndex;
		elem.selectionEnd = rightIndex;
	} else {//IE 6,7,8
		var range = elem.createTextRange();
		range.move("character", -elem.value.length); //光标移到0位置。
		//这里一定是先moveEnd再moveStart
		//因为如果设置了左边界大于了右边界，那么浏览器会自动让右边界等于左边界。
		range.moveEnd("character", rightIndex);
		range.moveStart("character", leftIndex);
		range.select();
	}
}

/**
 * 描述：切换多选下拉框 
 * 作者：焦登报
 */
function bootStrapSelectSwitch(selectId,optionArray,disabledArray,removeDisabledArray){
	if(removeDisabledArray){
		for(var i=0;i<removeDisabledArray.length;i++){
			$("#"+removeDisabledArray[i]).removeAttr("disabled");
		}		
	}
	if(disabledArray){
		for(var i=0;i<disabledArray.length;i++){
			$("#"+disabledArray[i]).attr("disabled", "disabled");
		}		
	}
	$("button[data-id='"+selectId+"']").next().find(".actions-btn.bs-deselect-all").click();
	$("#"+selectId+" option").attr("style","display:none");
	$("button[data-id='"+selectId+"']").next().find("a").attr("style","display:none");
	if(optionArray){
		for(var i=0;i<optionArray.length;i++){
			$("#"+selectId+" option[value='"+optionArray[i]+"']").removeAttr("style");
			$("button[data-id='"+selectId+"']").next().find("a."+optionArray[i]).removeAttr("style");
		}
	}
}

/**
 * 描述：配置数据高亮
 * 作者：焦登报
 */
function highLight(selectId,formId,JsonObj){
	$("#"+formId+" label").removeAttr("style");
	$("#"+formId+" label i").remove();
	var arr={};
	debugger;
	switch ($("#"+selectId).val()) {
	case "CUS":
		$("#"+formId+" label.CUS").attr("style","color:blue;font-weight: bold;");
		arr=JsonObj.CUS==undefined?{}:JsonObj.CUS;
		for(var i=0;i<arr.length;i++){
			$("label[for='"+arr[i]+"']label[CUS='1']").prepend('<i style="color:red">*&nbsp;</i>')
		}
		break;
	case "MSA":
		$("#"+formId+" label.MSA").attr("style","color:blue;font-weight: bold;");
		arr=JsonObj.MSA==undefined?{}:JsonObj.MSA;
		for(var i=0;i<arr.length;i++){
			$("label[for='"+arr[i]+"']label[MSA='1']").prepend('<i style="color:red">*&nbsp;</i>')
		}
		break;
	case "CIQ":
		$("#"+formId+" label.CIQ").attr("style","color:blue;font-weight: bold;");
		arr=JsonObj.CIQ==undefined?{}:JsonObj.CIQ;
		for(var i=0;i<arr.length;i++){
			$("label[for='"+arr[i]+"']label[CIQ='1']").prepend('<i style="color:red">*&nbsp;</i>')
		}
		break;
	case "CII":
		$("#"+formId+" label.CII").attr("style","color:blue;font-weight: bold;");
		arr=JsonObj.CII==undefined?{}:JsonObj.CII;
		for(var i=0;i<arr.length;i++){
			$("label[for='"+arr[i]+"']label[CII='1']").prepend('<i style="color:red">*&nbsp;</i>')
		}
		break;
	default:
		break;
	}
	
}

/**
 * 描述：时间格式化，去除时分秒
 * 作者：焦登报
 */
function formatDateTime(str) {
	var date=new Date(str.replace(new RegExp(/-/g),'/'));
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    m = m < 10 ? ('0' + m) : m;
    var d = date.getDate();
    d = d < 10 ? ('0' + d) : d;
    return y + '-' + m + '-' + d;
}
