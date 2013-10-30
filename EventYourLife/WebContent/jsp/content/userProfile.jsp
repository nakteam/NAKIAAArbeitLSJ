<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:div>
	<h1>Mein Profil</h1>
</s:div>
<s:form>
	<s:div>
		<s:submit value="Password ändern" action="CallChangePasswordForm"></s:submit>
		<s:submit value="Meine Daten ändern"
			action="CallChangeProfileDataForm"></s:submit>
	</s:div>
	<s:div>
		<!-- TODO: Image -->
		<s:label name="user.lastName" label="Name" />
		<s:label name="user.firstName" label="Vorname" />
		<s:label name="user.gender" label="Geschlecht" />
		<s:label name="user.dateOfBirth" label="Geburtsdatum" />
		<s:label name="user.hometown" label="Stadt" />
		<s:label name="user.aboutMeText" label="Über mich" />
		<s:label name="user.averageRating" label="Durchschnittsbewertung" />
	</s:div>

</s:form>

<s:div>
	<h2>Meine Bewertungen:</h2>
	<s:iterator value="user.ratings" />
	<s:property value="creationDate" />
	<s:property value="ratingPoint" />
	<s:property value="ratingText" />
</s:div>
