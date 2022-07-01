<?php
$servername = "127.0.0.1";
$username = "root";
$password = "m8AL5wuL";
$dbname = "myDB2";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$sql = "INSERT INTO coords (x, y)
VALUES ('3', '3');";
$sql .= "INSERT INTO coords (x, y)
VALUES ('3', '1');";
$sql .= "INSERT INTO coords (x, y)
VALUES ('3', '4', 'julie@example.com')";

if ($conn->multi_query($sql) === TRUE) {
  echo "New records created successfully";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>