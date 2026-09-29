<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
    $a=5;
    $b=10;
    function myTest(){
        global $a, $b;
        $b=$a+$b;
    }
    myTest();
    echo $b;
?>
</body>
</html>