<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
<title>问题发布</title>
<link rel="stylesheet" href="/dist/css/weui.css"/>
<link rel="stylesheet" href="/dist/css/example.css"/>
</head>
<body ontouchstart>
<div class="weui-cells weui-cells_form">
    <div class="weui-cell">
        <div class="weui-cell__bd">
            <textarea class="weui-textarea" placeholder="描述一下你的问题吧！" rows="3"></textarea>
            <div class="weui-textarea-counter"><span>0</span>/500</div>
        </div>
    </div>
</div>
<div class="weui-cells__title">技术类型</div>
<div class="weui-cells weui-cells_radio">
    <label class="weui-cell weui-check__label" for="x11">
        <div class="weui-cell__bd">
            <p>java web</p>
        </div>
        <div class="weui-cell__ft">
            <input type="radio" class="weui-check" name="radio1" id="x11" checked="checked"/>
            <span class="weui-icon-checked"></span>
        </div>
    </label>
    <label class="weui-cell weui-check__label" for="x12">
        <div class="weui-cell__bd">
            <p>java script</p>
        </div>
        <div class="weui-cell__ft">
            <input type="radio" name="radio1" class="weui-check" id="x12" />
            <span class="weui-icon-checked"></span>
        </div>
    </label>
</div>
<div class="weui-cells__title">难易程度</div>
<div class="weui-cells weui-cells_radio">
    <label class="weui-cell weui-check__label" for="s11">
        <div class="weui-cell__bd">
            <p>基础&nbsp;&nbsp;<span style="color:red;">(38.00元/次)</span></p>
        </div>
        <div class="weui-cell__ft">
            <input type="radio" class="weui-check" name="radio12" id="s11" checked="checked"/>
            <span class="weui-icon-checked"></span>
        </div>
    </label>
    <!--
    <label class="weui-cell weui-check__label" for="s12">
        <div class="weui-cell__bd">
            <p>中级&nbsp;&nbsp;<span style="color:red;">(98.00元/次)</span></p>
        </div>
        <div class="weui-cell__ft">
            <input type="radio" name="radio12" class="weui-check" id="s12"/>
            <span class="weui-icon-checked"></span>
        </div>
    </label>
    <label class="weui-cell weui-check__label" for="s13">
        <div class="weui-cell__bd">
            <p>高级&nbsp;&nbsp;<span>(内测中)</span></p>
        </div>
        <div class="weui-cell__ft">
            <input type="radio" name="radio12" class="weui-check" id="s13"/>
            <span class="weui-icon-checked"></span>
        </div>
    </label>-->
</div>
<div class="weui-btn-area">
    <a class="weui-btn weui-btn_primary" href="javascript:" id="showTooltips">发布问题</a>
</div>
</body>
</html>