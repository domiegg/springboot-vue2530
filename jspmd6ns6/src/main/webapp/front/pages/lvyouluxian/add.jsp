<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册</title>
		<!-- bootstrap样式，地图插件使用 -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<style>
		html::after {
			position: fixed;
			top: 0;
			right: 0;
			left: 0;
			bottom: 0;
			content: '';
			display: block;
			background-attachment: fixed;
			background-size: cover;
			background-position: center;
			z-index: -1;
		}
		#swiper {
			overflow: hidden;
			margin: 0 auto;
		}
		#swiper .layui-carousel-ind li {
			width: 16px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 50px;
			background-color: rgba(16, 41, 60, 1);
			box-shadow: 0 0 0px rgba(110,22,64,1);
		}
		#swiper .layui-carousel-ind li.layui-this {
			width: 24px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 50px;
			background-color: rgba(255, 255, 255, 1);
			box-shadow: 0 0 0px rgba(110,22,64,.8);
		}
		
		button, button:focus {
			outline: none;
		}
		
		.data-add-container .add .layui-select-title .layui-unselect {
			padding: 0 12px;
			height: 40px;
			font-size: 14px;
			color: #333;
			border-radius: 4px;
			border-width: 1px;
			border-style: solid;
			border-color: rgba(156, 187, 252, 1);
			background-color: #fff;
			box-shadow: 0 0 6px rgba(110,22,64,0);
			text-align: left;
		}
		.data-add-container .add .layui-form-item {
			display: flex;
			align-items: center;
			justify-content: center;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-form-label {
			margin: 0;
			position: inherit;
			background: transparent;
			border: 0;
		}
		.data-add-container .add .layui-input-block {
			margin: 0;
			flex: 1;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-input-inline {
			margin: 0;
			flex: 1;
			display: flex;
		}
	</style>
	<body>


		<div id="app">
		
			<!-- 轮播图 -->
			<!-- <div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div> -->
			<div class="layui-carousel" id="swiper" :style='{"boxShadow":"0 0 0px  rgba(110,22,64,.8)","margin":"0 auto","borderColor":"rgba(0,0,0,.3)","borderRadius":"0px","borderWidth":"0","width":"100%","borderStyle":"solid"}'>
			  <div carousel-item id="swiper-item">
				<div v-for="(item,index) in swiperList" :key="index">
					<img style="width: 100%;height: 100%;object-fit:cover;" :src="item.img" />
				</div>
			  </div>
			</div>
			<!-- 轮播图 -->
		
			<div class="data-add-container" :style='{"padding":"20px","boxShadow":"1px 1px 6px rgba(110,22,64,0)","margin":"30px auto","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"10px","borderWidth":"1px","borderStyle":"solid"}'>
		
				<form class="layui-form layui-form-pane add" lay-filter="myForm">
					
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">路线名称：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.luxianmingcheng" type="text" :readonly="ro.luxianmingcheng" name="luxianmingcheng" id="luxianmingcheng" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
		                <label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">标签分类</label>
		                <div class="layui-input-block">
		                    <select name="biaoqianfenlei" id="biaoqianfenlei" lay-filter="biaoqianfenlei"  >
		                        <option value="">请选择</option>
		                        <option v-for="(item,index) in biaoqianfenlei" v-bind:key="index" :value="item">{{item}}</option>
		                    </select>
		                </div>
		            </div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">起点：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.qidian" type="text" :readonly="ro.qidian" name="qidian" id="qidian" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">终点：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.zhongdian" type="text" :readonly="ro.zhongdian" name="zhongdian" id="zhongdian" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">全程距离：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.quanchengjuli" type="text" :readonly="ro.quanchengjuli" name="quanchengjuli" id="quanchengjuli" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">旅行天数：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.lvxingtianshu" type="text" :readonly="ro.lvxingtianshu" name="lvxingtianshu" id="lvxingtianshu" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">路线图片：</label>
						<div v-if="detail.luxiantupian" class="layui-input-block">
							<img id="luxiantupianImg" style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;" :src="baseurl+detail.luxiantupian">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' type="hidden" :value="detail.luxiantupian" id="luxiantupian" name="luxiantupian" />
						</div>
						<div class="layui-input-block">
							<button v-if="!ro.luxiantupian" :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 10px 0 0","borderColor":"#ccc","backgroundColor":"rgba(156, 187, 252, 1)","color":"#fff","borderRadius":"8px","borderWidth":"0","width":"auto","fontSize":"14px","borderStyle":"solid","height":"44px"}' type="button" class="layui-btn btn-theme" id="luxiantupianUpload">
								<i v-if="true" :style='{"color":"#fff","show":true,"fontSize":"14px"}' class="layui-icon">&#xe67c;</i>上传路线图片
							</button>
						</div>
					</div>
		            
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">路线详情：</label>
						<div class="layui-input-block">
							<textarea name="luxianxiangqing" id="luxianxiangqing">请输入路线详情</textarea>
						</div>
					</div>
		
					<div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item">
						<div class="layui-input-block" style="text-align: right;margin-right: 30px;">
							<button :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 10px","borderColor":"#ccc","backgroundColor":"rgba(156, 187, 252, 1)","color":"#fff","borderRadius":"8px","borderWidth":"0","width":"25%","fontSize":"14px","borderStyle":"solid","height":"44px"}'  class="layui-btn btn-submit" lay-submit lay-filter="*">提交</button>
							<button :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 10px","borderColor":"#ccc","backgroundColor":"rgba(156, 187, 252, 1)","color":"rgba(255, 255, 255, 1)","borderRadius":"8px","borderWidth":"0","width":"25%","fontSize":"14px","borderStyle":"solid","height":"44px"}' type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>
		<!-- 地图 -->
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
		<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

		<script>
			var jquery = $;
			
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					baseurl: '',
					dataList: [],
					ro:{
                                        luxianmingcheng : false,
                                        biaoqianfenlei : false,
                                        qidian : false,
                                        zhongdian : false,
                                        quanchengjuli : false,
                                        lvxingtianshu : false,
                                        luxianxiangqing : false,
                                        luxiantupian : false,
                                        thumbsupnum : false,
                                        crazilynum : false,
                                        clicktime : false,
                                        clicknum : false,
					},
                    detail: {
                        luxianmingcheng: '',
                        biaoqianfenlei: '',
                        qidian: '',
                        zhongdian: '',
                        quanchengjuli: '',
                        lvxingtianshu: '',
                        luxianxiangqing: '',
                        luxiantupian: '',
                        thumbsupnum: '',
                        crazilynum: '',
                        clicktime: '',
                        clicknum: '',
                    },
					biaoqianfenlei: [],
					centerMenu: centerMenu
				},
				updated: function() {
					layui.form.render('select', 'myForm');
				},
                computed: {



                },
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})


			layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;
				var upload = layui.upload;
				var laydate = layui.laydate;
				var tinymce = layui.tinymce;
				vue.baseurl = http.baseurl;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img style="width: 100%;height: 100%;object-fit:cover;" class="swiper-item" src="' + http.baseurl+item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						vue.$nextTick(() => {
						  carousel.render({
						  	elem: '#swiper',
							width: '100%',
						  	height: '450px',
						  	arrow: 'hover',
						  	anim: 'default',
						  	autoplay: 'true',
						  	interval: '3000',
						  	indicator: 'inside'
						  });
						
						})
					}
				});

				http.request(`option/biaoqianfenlei/leixing`,'get',{},(res)=>{
					vue.biaoqianfenlei = res.data
				});
                var edit = tinymce.render({
                    elem: "#luxianxiangqing",
                    height: 600,
                    images_upload_handler: function(blobInfo, succFun, failFun) {
                        var xhr, formData;
                        var file = blobInfo.blob(); //转化为易于理解的file对象
                        xhr = new XMLHttpRequest();
                        xhr.withCredentials = false;
                        xhr.open('POST', http.baseurl + 'file/upload');
                        xhr.setRequestHeader("Token", localStorage.getItem('Token')); //设置请求头
                        xhr.onload = function() {
                            var json;
                            if (xhr.status != 200) {
                                failFun('HTTP Error: ' + xhr.status);
                                return;
                            }
                            json = JSON.parse(xhr.responseText);
                            if (!json || typeof json.file != 'string') {
                                failFun('Invalid JSON: ' + xhr.responseText);
                                return;
                            }
                            succFun(http.baseurl + '/upload/' + json.file);
                        };
                        formData = new FormData();
                        formData.append('file', file, file.name); //此处与源文档不一样
                        xhr.send(formData);
                    }
                }, (opt) => {

                });
				// 上传图片
				var luxiantupianUpload = upload.render({
					//绑定元素
					elem: '#luxiantupianUpload',
					//上传接口
					url: http.baseurl + 'file/upload',
					// 请求头
					headers: {
						Token: localStorage.getItem('Token')
					},
					// 允许上传时校验的文件类型
					accept: 'images',
					before: function() {
						//loading层
						var index = layer.load(1, {
							shade: [0.1, '#fff'] //0.1透明度的白色背景
						});
					},
					// 上传成功
					done: function(res) {
						console.log(res);
						layer.closeAll();
						if (res.code == 0) {
							layer.msg("上传成功", {
								time: 2000,
								icon: 6
							})
							var url = 'upload/' + res.file;
							jquery('#luxiantupian').val(url);
							jquery('#luxiantupianImg').attr('src', http.baseurl +url)
							vue.detail.luxiantupian = url;
						} else {
							layer.msg(res.msg, {
								time: 2000,
								icon: 5
							})
						}
					},
					//请求异常回调
					error: function() {
						layer.closeAll();
						layer.msg("请求接口异常", {
							time: 2000,
							icon: 5
						})
					}
				});
				laydate.render({
					elem: '#clicktime',
					type: 'datetime'
				});
				
                // session独取
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					// 表单赋值
					//form.val("myForm", data.data);
					data = data.data
					for(var key in data){
					}
				});

                // 跨表计算
                if(http.getParam('corss')){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					//form.val("myForm", obj);
					for(var o in obj){
                                        if(o=='luxianmingcheng'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.luxianmingcheng = true;
                                                continue;
                                        }
                                        if(o=='biaoqianfenlei'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.biaoqianfenlei = true;
                                                continue;
                                        }
                                        if(o=='qidian'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.qidian = true;
                                                continue;
                                        }
                                        if(o=='zhongdian'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zhongdian = true;
                                                continue;
                                        }
                                        if(o=='quanchengjuli'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.quanchengjuli = true;
                                                continue;
                                        }
                                        if(o=='lvxingtianshu'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.lvxingtianshu = true;
                                                continue;
                                        }
                                        if(o=='luxianxiangqing'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.luxianxiangqing = true;
                                                continue;
                                        }
                                        if(o=='luxiantupian'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.luxiantupian = true;
                                                continue;
                                        }
                                        if(o=='thumbsupnum'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.thumbsupnum = true;
                                                continue;
                                        }
                                        if(o=='crazilynum'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.crazilynum = true;
                                                continue;
                                        }
                                        if(o=='clicktime'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.clicktime = true;
                                                jquery('#clicktime').val(obj[o]);
                                                continue;
                                        }
                                        if(o=='clicknum'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.clicknum = true;
                                                continue;
                                        }
					}
				}
				

				// 提交
				form.on('submit(*)', function(data) {
					data = data.field;
					
                    // 数据校验
                    if(!isIntNumer(data.lvxingtianshu)){
                        layer.msg('旅行天数应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
					var luxianxiangqing = tinymce.get('#luxianxiangqing').getContent()
					data.luxianxiangqing = luxianxiangqing;
                    if(!isIntNumer(data.thumbsupnum)){
                        layer.msg('赞应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isIntNumer(data.crazilynum)){
                        layer.msg('踩应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isIntNumer(data.clicknum)){
                        layer.msg('点击次数应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }

					// 跨表计算判断
					
                    // 比较大小

                //更新跨表属性
               var crossuserid;
               var crossrefid;
               var crossoptnum;
                if(http.getParam('corss')){
                        var statusColumnName = localStorage.getItem('statusColumnName');
                        var statusColumnValue = localStorage.getItem('statusColumnValue');
                        if(statusColumnName!='') {
                                var obj = JSON.parse(localStorage.getItem('crossObj'));
				if(!statusColumnName.startsWith("[")) {
					for (var o in obj){
						if(o==statusColumnName){
							obj[o] = statusColumnValue;
						}
					}
					var table = localStorage.getItem('crossTable');
					http.requestJson(`${table}/update`,'post',obj,(res)=>{});
				} else {
                                       crossuserid=Number(localStorage.getItem('userid'));
                                       crossrefid=obj['id'];
                                       crossoptnum=localStorage.getItem('statusColumnName');
                                       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
				}
                        }
                }
                        if(crossrefid && crossuserid) {
                                data.crossuserid=crossuserid;
                                data.crossrefid=crossrefid;
                                http.request('lvyouluxian/list', 'get', {
                                        page: 1,
                                        limit: 10,
                                        crossuserid:crossuserid,
                                        crossrefid:crossrefid,
                                }, function(res) {
                                        if(res.data.total>=crossoptnum) {
                                                layer.msg(localStorage.getItem('tips'), {
                                                        time: 2000,
                                                        icon: 6
                                                })
                                             return false;
                                        } else {
                                            // 跨表计算



                                            // 提交数据
                                            http.requestJson('lvyouluxian' + '/add', 'post', data, function(res) {
                                                    layer.msg('提交成功', {
                                                            time: 2000,
                                                            icon: 6
                                                    }, function() {
                                                            back();
                                                    });
                                             });
                                        }
                                });
                        } else {
                                // 跨表计算

                                // 提交数据
                                http.requestJson('lvyouluxian' + '/add', 'post', data, function(res) {
                                        layer.msg('提交成功', {
                                                time: 2000,
                                                icon: 6
                                        }, function() {
                                                back();
                                        });
                                 });
                        }
			return false
			});
		});
		</script>
	</body>
</html>
