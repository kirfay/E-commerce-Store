<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>E-commerce Store</title>
    <!--main css-->
    <link href="/pub/css/global.css" rel="stylesheet">
    <!--font awesome css--->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer"/>

</head>
<body>
<div class="topnav">
    <a href="/">Home</a>
    <a href="/product">Services</a>

    <li class="nav-item">
        <div class="dropdown">
            <button class="btn dropdown-toggle" type="button" id="admin-dropdown" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Admin
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a href="/admin/productlist" class="dropdown-item">Products</a>
                <a href="/admin/createproduct" class="dropdown-item">Create Products</a>
                <a href="/admin/orderlist" class="dropdown-item">Change Orders</a>
            </div>
        </div>
    </li>
    <a href="/check-out" class="split">Check out</a>
    <a href="/log-in" class="split">Log In</a>
    <a href="/sign-up" class="split">Sign Up</a>
</div>
