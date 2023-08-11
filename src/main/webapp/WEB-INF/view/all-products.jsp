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

        .content {
            width: 80%;
            margin: 20px auto;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .company-info {
            padding: 20px;
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
        #Login {
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
        #Login:hover {
            background-color: #5d5c5c;
        }

    </style>

    <script>
        document.addEventListener("DOMContentLoaded", function () {
            // Получаем ссылку на кнопку "Log in"
            var loginButton = document.getElementById("Login");

            // Добавляем обработчик клика на кнопку
            loginButton.addEventListener("click", function () {
                // Выполняем перенаправление на указанный URL
                window.location.href = "http://localhost:8055/SecurityServer_war_exploded/login";
            });
        });
    </script>
</head>
<body>
<header>
    <h1>Soft and Tender</h1>
    <p>Working with tender</p>
</header>

<div class="container">
    <div class="company-info">
        <h2>Welcome to our Napkin Company! We are passionate about providing high-quality and eco-friendly napkin
            solutions for every occasion. Our mission is to bring convenience and elegance to your dining experience
            while minimizing our environmental footprint.
        </h2>
        <p>
            At our Napkin Company, we take pride in offering a wide range of napkin options, from classic white and
            colorful patterns to custom-designed napkins for special events. We carefully source our materials, ensuring
            that they are biodegradable and made from sustainable resources, so you can enjoy your meals with peace of
            mind.

            Whether you are hosting an intimate gathering or a grand celebration, our napkins are designed to add a
            touch of sophistication to any table setting. From cocktail parties to weddings, our napkins are the perfect
            companion for your memorable moments.

            We believe that every detail matters, and that's why we pay close attention to the craftsmanship of our
            napkins. Our team of skilled artisans ensures that each napkin is carefully cut, folded, and finished to
            perfection.

            As a socially responsible company, we actively participate in environmental initiatives, striving to make a
            positive impact on the world. With our eco-friendly napkins, you can indulge in culinary delights while
            contributing to a greener and more sustainable future.

            Thank you for choosing our Napkin Company to be a part of your dining experience. We are committed to
            excellence and dedicated to making your moments truly special. Join us in our journey towards a cleaner,
            greener, and more beautiful world, one napkin at a time.
        </p>
    </div>

    <h2>All Products</h2>
    <br>

    <table>
        <tr>
            <th>Product name</th>
            <th>Description</th>
            <th>Stock quantity</th>
            <th>Price</th>
            <th>Category</th>
        </tr>

        <c:forEach var="category" items="${allCategory}">
            <c:forEach var="product" items="${category.productsList}">
                <tr>
                    <td>${product.product_name}</td>
                    <td>${product.product_description}</td>
                    <td>${product.stock_quantity}</td>
                    <td>${product.product_price}</td>
                    <td>${category.category_name}</td>
                </tr>
            </c:forEach>
        </c:forEach>
    </table>

</div>

<div class="content">
    <button id="Login">Log in</button>
</div>

</body>
</html>