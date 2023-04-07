<head>
    <link rel="stylesheet" href="form.css">
</head>
<body>
<center><h1>LOGIN</h1></center>
<div class="container">
<div class="a"><div class="c">
<form action= "new.php" method="post">
<label> User Name: &nbsp;&nbsp;&nbsp;</label>
<input type="text" name="t1"><br><br>
<label>Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
<input type="password" name="t2"><br><br>
<center><input type="submit" class="b"></center>
</form>
</div></div>
</div>
</body>
<?php
$name=$_REQUEST['t1'];
$pw=$_REQUEST['t2'];
$host="127.0.0.1";
$user="root";
$pass="";
$db='usersdb';
$conn=new mysqli($host,$user,$pass,$db);
if(strlen($name)==0 && strlen($pw)==0){
echo "<center><h2 style='color:red'>**Enter username and password</h2></center>";
}
else if(strlen($pw)<8)
echo "<center><h2 style='color:red'>**Password must be greater than 8 characters</h2></center>";
if(strlen($pw)>=8 && strlen($name)>0){
$sql="insert into users values('$name','$pw')";
if ($conn->query($sql) === TRUE) {
     echo  "<script>alert('User details Inserted Successfully');</script>";
}
}
$conn->close();
?>