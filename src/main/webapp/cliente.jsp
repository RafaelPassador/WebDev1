<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autenticação de Usuário</title>
        <link href="${pageContext.request.contextPath}/layout.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action="adm">
            <h1>Bem vindo Admin</h1>
                <input type="submit" name="regLoja" value="Cadastrar Loja"/> <br>
                <input type="submit" name="regClient" value="Cadastrar Cliente"/> <br>
                <input type="submit" name="regClient" value="Cadastrar Cliente2"/> <br>
        </form>
    </body>
</html>