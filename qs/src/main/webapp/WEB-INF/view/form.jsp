<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>register form</title>

   <!-- custom css file link  -->
   <link  rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"> 

</head>
<body>
   
<div class="form-container">

   <form action="" method="post">
       
        <form method="POST" action="<%=application.getContextPath()%>/report/save">
            <c:if test="${value != null}">
                <input type="hidden" name="idreport" value="${value.idreport}">
            </c:if>
      <h3>INPUT FORM</h3>
     
      <input type="text" name="reportnumber" required placeholder="enter report number" value="${value.reportnumber}">
      <input type="text" name="drawing" required placeholder="enter drawing number" value="${value.drawing}">
      <input type="text" name="partname" required placeholder="enter part name" value="${value.parname}">
      <input type="text" name="revision" required placeholder="enter part revision" value="${value.revision}">
       <input type="text" name="ponumber" required placeholder="enter ponumber" value="${value.ponumber}">
        <input type="text" name="date" required placeholder="enter date" value="${value.date}">
         <input type="text" name="quantity" required placeholder="enter quantity" value="${value.quantaty}">
          <input type="text" name="user" required placeholder="enter user" value="${value.iduser}">
           <input type="text" name="supplier" required placeholder="enter supplier" value="${value.idsupplier}">
    <!--  <select name="user_type">
         <option value="user">user</option>
         <option value="admin">admin</option>
      </select> -->
      <input type="submit" name="submit" value="input now" class="form-btn">
     
   </form>

</div>

</body>
</html>