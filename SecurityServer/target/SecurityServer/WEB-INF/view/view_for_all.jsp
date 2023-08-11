<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Access Control Page</title>
    <link rel="stylesheet" href="styles.css">

    <style>
        /* Стили контейнера */
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background-color: #f5f5f5; /* Светло-серый фон */
            font-family: Arial, sans-serif;
            text-align: center;
        }

        /* Стили кнопки */
        .styled-button {
            padding: 10px 20px;
            background-color: #3498db; /* Голубой цвет */
            color: #ffffff; /* Белый цвет текста */
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            margin-bottom: 10px;
        }

        .styled-button:hover {
            background-color: #2980b9; /* Более темный голубой цвет при наведении */
        }

        /* Стили сообщения о роли */
        .role-message {
            font-size: 18px;
            color: #555555; /* Темно-серый цвет текста */
        }

    </style>
</head>
<body>
<div class="container">
    <h3>Access Control Page</h3>

    <!-- Доступ только авторизированным USER'ам -->
    <security:authorize access="hasRole('USER')">
        <button class="styled-button" onclick="redirectToUserInfo()">View</button>
    </security:authorize>

    <!-- Доступ только авторизированным DEVELOPER'ам -->
    <security:authorize access="hasRole('DEVELOPER')">
        <button class="styled-button" onclick="redirectToDeveloperInfo()">Performance</button>
    </security:authorize>
</div>

<script>
    function redirectToUserInfo() {
        window.location.href = 'http://localhost:8050/SoftAndTender_war_exploded/user_info';
    }

    function redirectToDeveloperInfo() {
        window.location.href = 'http://localhost:8050/SoftAndTender_war_exploded/developer_info';
    }
</script>
</body>
</html>
