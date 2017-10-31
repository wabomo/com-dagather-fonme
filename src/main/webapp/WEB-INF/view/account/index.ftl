<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
<title>用户注册</title>
<link rel="stylesheet" href="/dist/css/weui.css"/>
<link rel="stylesheet" href="/dist/css/example.css"/>
</head>
<body ontouchstart>
<div class="weui-cells__title">用户信息</div>
<div class="weui-cells">
    <div class="weui-cell">
        <div class="weui-cell__bd">
            <input class="weui-input" type="text" placeholder="请输入姓名"/>
        </div>
    </div>
    <div class="weui-cell weui-cell_select weui-cell_select-before">
        <div class="weui-cell__bd">
            <input class="weui-input" type="number" pattern="[0-9]*" placeholder="请输入手机号码"/>
        </div>
        <div class="weui-cell__ft">
            <button class="weui-vcode-btn">获取验证码</button>
        </div>
    </div>
    <div class="weui-cell">
        <div class="weui-cell__bd">
            <input class="weui-input" type="text" placeholder="请输入验证码"/>
        </div>
    </div>
</div>
<div class="weui-cells__title">技术类型</div>
<div class="weui-cells weui-cells_checkbox">
    <label class="weui-cell weui-check__label" for="s11">
        <div class="weui-cell__hd">
            <input type="checkbox" class="weui-check" name="checkbox1" id="s11" checked="checked"/>
            <i class="weui-icon-checked"></i>
        </div>
        <div class="weui-cell__bd">
            <p>java web</p>
        </div>
    </label>
    <label class="weui-cell weui-check__label" for="s12">
        <div class="weui-cell__hd">
            <input type="checkbox" name="checkbox1" class="weui-check" id="s12"/>
            <i class="weui-icon-checked"></i>
        </div>
        <div class="weui-cell__bd">
            <p>java script</p>
        </div>
    </label>
    <a href="javascript:void(0);" class="weui-cell weui-cell_link">
        <div class="weui-cell__bd">添加更多</div>
    </a>
</div>
<label for="weuiAgree" class="weui-agree">
    <input id="weuiAgree" type="checkbox" class="weui-agree__checkbox" checked="checked"/>
    <span class="weui-agree__text">
        阅读并同意<a href="javascript:void(0);">《相关条款》</a>
    </span>
</label>
<div class="weui-btn-area">
    <a class="weui-btn weui-btn_primary" href="javascript:" id="showTooltips">成为AmCore用户</a>
</div>
</body>
</html>