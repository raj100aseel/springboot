<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body>
	<h3>Student Registration Form</h3>
	
	<form:form action="save" modelAttribute="student" method="POST">
		<table>
			<tr>
					<td>Student Name : </td>
					<td><form:input path="studentName"/></td>
			</tr>
			<tr>
					<td>Student Email : </td>
					<td><form:input path="studentEmail"/></td>
			</tr>
			<tr>
					<td>Student Gender : </td>
					<td><form:radiobutton path="studentGender"/></td>
			</tr>
			<tr>
					<td>Course : </td>
					<td><form:select path="course">
						<form:option value="">-Select-</form:option>
						<form:options items="${courses}"/>
					</form:select></td>
			</tr>
			<tr>
				<td>Preferred Timings:</td>
				<td><form:checkboxes items="${timings}" path="preferredTimings"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save Student"/></td>
			</tr>
		</table>
	</form:form>
</body>
	