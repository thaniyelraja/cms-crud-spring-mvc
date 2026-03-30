<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Add Course</title>

<style>
body {
    font-family: Arial;
    background: #f4f6f9;
}

.container {
    width: 350px;
    margin: 100px auto;
    background: white;
    padding: 25px;
    border-radius: 8px;
    box-shadow: 0px 4px 10px rgba(0,0,0,0.1);
}

h1 {
    text-align: center;
}

form {
    display: flex;
    flex-direction: column;
}

label {
    margin-top: 10px;
}

input {
    padding: 10px;
    margin-top: 5px;
    border-radius: 5px;
    border: 1px solid #ccc;
}

button {
    margin-top: 15px;
    padding: 10px;
    background: #007bff;
    color: white;
    border: none;
    border-radius: 5px;
}

button:hover {
    background: #0056b3;
}

.back {
    display: block;
    text-align: center;
    margin-top: 10px;
}
</style>

</head>
<body>

<div class="container">

<h1>${course.id == 0 ? 'Add Course' : 'Edit Course'}</h1>

<form action="${course.id == 0 ? 'save' : 'update'}" method="post">

<input type="hidden" name="id" value="${course.id}">

<label>Course Name:</label>
<input type="text" name="name" value="${course.name}" required>

<label>Instructor:</label>
<input type="text" name="instructor" value="${course.instructor}" required>

<button type="submit">
${course.id == 0 ? 'Save' : 'Update'}
</button>

</form>

<a href="${pageContext.request.contextPath}/" class="back">Back</a>

</div>

</body>
</html>


