<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
    <title>多媒体文件预览</title>
    <link rel="icon" type="image/x-icon" href="images/logo.png" />
    <link rel="stylesheet" href="plyr/plyr.css">
</head>
<style>
    body{background-color: #262626}
    .m{ margin-left: auto; margin-right: auto; width:640px; margin-top: 100px; }
</style>
<body>
<div class="m">
    <video controls>
        <source src="${mediaUrl}">
    </video>
</div>
<script src="plyr/plyr.js"></script>
<script>
    plyr.setup();
</script>
</body>

</html>
