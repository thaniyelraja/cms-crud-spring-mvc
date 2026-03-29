<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Courses</title>

<style>
body {
    font-family: Arial;
    background: #f4f6f9;
    text-align: center;
}

h2 {
    margin-top: 30px;
}

a {
    text-decoration: none;
    color: white;
}

.add-btn {
    display: inline-block;
    margin: 20px;
    padding: 10px 15px;
    background: green;
    border-radius: 5px;
}

table {
    width: 80%;
    margin: auto;
    border-collapse: collapse;
    background: white;
}

th, td {
    padding: 12px;
    border: 1px solid #ddd;
}

th {
    background: #007bff;
    color: white;
}

.action a {
    color: #007bff;
}
</style>

</head>
<body>

<h2>Course List</h2>

<a href="addCourse" class="add-btn">Add Course</a>

<table>
<tr>
  <th>ID</th>
  <th>Name</th>
  <th>Instructor</th>
  <th>Action</th>
</tr>

<c:forEach var="c" items="${courses}">
<tr>
  <td>${c.id}</td>
  <td>${c.name}</td>
  <td>${c.instructor}</td>
  <td class="action">
    <a href="edit?id=${c.id}">Edit</a> |
    <a href="delete?id=${c.id}">Delete</a>
  </td>
</tr>
</c:forEach>

</table>

</body>
</html>