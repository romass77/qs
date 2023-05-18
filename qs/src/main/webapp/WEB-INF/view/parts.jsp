<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Parts list</title>
    </head>
    <body>
        <h1>Parts list</h1>
        
         <ul>
            <c:forEach var="part" items="${list}">
                <li>
                    ${part.idpart}

                    ${part.drawing}
                    
                       ${part.partname}

                    ${part.revision}

                 
                </li>
            </c:forEach> 
        </ul>
        <a href="<%=application.getContextPath()%>/">Back</a>
    </body>
</html>
