<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

</head>
<body>

    <form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName" />

    <br><br>

    Last name: <form:input path="lastName" />

    <br><br>

    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}" />
    </form:select>

    <br><br>

    Favorite Language:
    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />

    <br><br>

    Operating Systems:

    Linux <form:checkbox path="operatingSystems" value="Linux" />
    MacOS <form:checkbox path="operatingSystems" value="MacOS" />
    Windows <form:checkbox path="operatingSystems" value="Windows" />


    <br><br>

    <input type="submit" value="Submit" />

    </form:form>


</body>

</html>
