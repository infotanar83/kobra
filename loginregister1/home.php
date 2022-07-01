<?php

// We should always remember to use sessions. Te code statement belows start should always be used to start sessions.

session_start();

// A user not actively logged-in is redirected to the main login page...

if (!isset($_SESSION['loggedin'])) {

header('Location: index.html');

exit;

}

?>
<!DOCTYPE html>

<html>

<head>

<metacharset="utf-8">

<title>FossLinux Home Page</title>

<linkhref="style.css"rel="stylesheet"type="text/css">

<linkrel="stylesheet"href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">

</head>

<bodyclass="loggedin">

<navclass="navtop">

<div>

<h1>FossLinux Login Tutorial</h1>

<ahref="logout.php"><iclass="fas fa-sign-out-alt"></i>Logout</a>

</div>

</nav>

<divclass="content">

<h2>FossLinux Home Page</h2>

<p>Welcome back, <?=$_SESSION['name']?>!</p>

</div>

</body>

</html>