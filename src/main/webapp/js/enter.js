/**
 * 回车键focus定位
 */

$('body')
.on(
		'keyup',
		'input, select, textarea',
		function(e) {
			var self = $(this), form = self.parents('form:eq(0)'), focusable, next, prev;
	        var eCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
	        //shift+enter 光标向上个元素移动
	        if (e.shiftKey) {
	        	 if (e.keyCode == 13) {
//	 				排除只读,disabled元素
	        	     focusable =   form.find('input,a,select,textarea').filter(':visible').not(':input[readonly]').not(':input[disabled]');
//	        		 focusable =   form.find('input,a,select,textarea').filter(':visible');
	        		 prev = focusable.eq(focusable.index(this)-1); 

	        	     if (prev.length) {
	        	        prev.focus();
	        	     } 
//	        	     else {
//	        	        form.submit();
//	        	    }
	        	  }
	        	}
	        	  else
	        //enter 光标向下个元素移动
			if (eCode == 13) {
				//this.context.css("background-color","#b3d7f4");
//				排除只读,disabled元素
				focusable = form.find('input,select,textarea')
						.filter(':visible').not(':input[readonly]').not(':input[disabled]');
//				focusable = form.find('input,select,textarea').filter(':visible');

				next = focusable.eq(focusable.index(this) + 1);

				//下个元素存在
				if (next.length) {
					// 	    console.log(this.id +"   "+ next[0].id);
					//var nid = next[0].id;
//					$("#" + nid).css("background-color", "#b3d7f4");
//					$("#" + this.id).css("background-color", "");

					next.focus();

				}

				return false;
			}
		});