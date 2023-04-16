<?php
include('db.php');
$sql = "select * from login;";

// insert in database 
$rs = mysqli_query($con, $sql);

while($row = mysqli_fetch_assoc($result))
		{
			echo $row['u_id'];
		}
  ?>