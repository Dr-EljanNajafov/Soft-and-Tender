<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Soft and Tender</title>
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

        h1 {
            margin: 0;
        }

        .container {
            width: 80%;
            margin: 20px auto;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .company-info h2 {
            color: #565656;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
        /* Стилизация кнопки */
        .button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #807f7f;
            color: #ffffff; /* Белый цвет текста */
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        /* При наведении */
        .button:hover {
            background-color: #5d5c5c;
        }
    </style>
</head>
<body>
<header>
    <h1>Soft and Tender</h1>
    <p>Working with tender</p>
</header>

<div class="container">
    <h2>All Products</h2>
    <br>
    <table>
        <tr>
            <th>Product name</th>
            <th>Description</th>
            <th>Stock quantity</th>
            <th>Price</th>
            <th>Operations</th>
        </tr>

        <c:forEach var="product" items="${allProduct}">

            <c:url var="updateButton" value="/updateInfo">
                <c:param name="productId" value="${product.id}"/>
            </c:url>

            <c:url var="deleteButton" value="/deleteProduct">
                <c:param name="productId" value="${product.id}"/>
            </c:url>

            <tr>
                <td>${product.product_name}</td>
                <td>${product.product_description}</td>
                <td>${product.stock_quantity}</td>
                <td>${product.product_price}</td>
                <td>
                    <input type="button" value="Update" class="button"
                           onclick="window.location.href = '${updateButton}'">
                    <input type="button" value="Delete" class="button"
                           onclick="window.location.href = '${deleteButton}'">
                </td>
            </tr>
        </c:forEach>
    </table>

    <br>

    <input type="button" value="Add" class="button"
           onclick="window.location.href='addNewProduct'"/>

</div>

<!-- Добавьте теги для вставки изображения логотипа компании и других элементов дизайна по вашему желанию -->

</body>
</html>