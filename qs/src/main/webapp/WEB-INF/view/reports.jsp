<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reports list</title>
    </head>
    <body>
        <h1>Reports list</h1>
        
         <ul>
            <c:forEach var="report" items="${list}">
                <li>
                    ${report.idreport}

                    ${report.reportnumber}
                    
                       ${report.part}

                    ${report.ponumber}
                    
                     ${report.date}
                     
                      ${report.user}
                      
                       ${report.supplier}
                    
                          
                </li>
            </c:forEach> 
        </ul>
        <a href="<%=application.getContextPath()%>/">Back</a>
    </body>
</html>
