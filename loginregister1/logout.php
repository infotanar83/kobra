<?php

session_start();

session_destroy();

// Redirects the user to the index.html login page:

header('Location: index.html');

?>