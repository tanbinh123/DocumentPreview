<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>office图片预览</title>
    <link rel="icon" type="image/x-icon" href="images/logo.png" />
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
    <script src="js/lazyload.js"></script>
    <style>
        .container{
            width: 100%;
            height: 100%;
        }
        .img-area{
            text-align: center
        }

    </style>
</head>
<body bgcolor="#404040">
<div class="container">
    <#list imgurls as img>
        <div class="img-area">
            <img class="my-photo" alt="loading" title="查看大图" style="cursor: pointer;" data-src="${img}" src="images/loading.gif" onclick="changePreviewType('allImages')">
        </div>
    </#list>
</div>
<#--<img src="images/right.png" style="position: fixed; cursor: pointer; top: 40%; right: 60px; z-index: 999;" alt="使用PDF预览" title="使用PDF预览" onclick="changePreviewType('pdf')"/>-->
<span class="fa fa-file-pdf-o fa-5x" style="position: fixed; cursor: pointer; top: 40%; right: 50px; z-index: 999;" title="使用PDF预览" onclick="changePreviewType('pdf')"></span>
<script>
    window.onload=checkImgs;
    window.onscroll = throttle(checkImgs);
    function changePreviewType(previewType) {
        var url = window.location.href;
        if (url.indexOf("officePreviewType=image") != -1) {
            url = url.replace("officePreviewType=image", "officePreviewType="+previewType);
        } else {
            url = url + "&officePreviewType="+previewType;
        }
        if ('allImages' == previewType) {
            window.open(url)
        } else {
            window.location.href = url;
        }
    }
</script>
</body>
</html>