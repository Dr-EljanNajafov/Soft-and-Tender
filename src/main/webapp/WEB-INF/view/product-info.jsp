<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Info</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            color: #333;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #565656;
            color: #fff;
            text-align: center;
            padding: 15px;
        }

        h2 {
            margin-top: 20px;
            color: #565656;
        }

        form {
            width: 60%;
            margin: 0 auto;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #807f7f;
            color: #ffffff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #5d5c5c;
        }
    </style>
</head>
<body>
<h2>Product Info</h2>
<br>

<form:form action="saveProduct" modelAttribute="products">

    <form:hidden path="id"/>

    <label for="product_name">Product name</label>
    <form:input path="product_name" id="product_name"/>
    <br><br>

    <label for="product_description">Description</label>
    <form:input path="product_description" id="product_description"/>
    <br><br>

    <label for="stock_quantity">Stock quantity</label>
    <form:input path="stock_quantity" id="stock_quantity"/>
    <br><br>

    <label for="product_price">Price</label>
    <form:input path="product_price" id="product_price"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>

</body>
</html>
