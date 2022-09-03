<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${investment}
<h1>Update investment</h1>
<form action="updateInvestment" method="post">
 <input type="hidden" name="planId" value="${investment.planId }"><br>
Name <input type="text" name="planName" value="${investment.planName }" readonly><br>
Entry Age <input type="text" name="entryAge" value="${investment.entryAge }" readonly><br>
Amount <input type="text" name="amount" value="${investment.amount }" ><br>
Term <input type="text" name="term" value="${investment.term }" readonly><br>
Risk <input type="radio" name="risk" value="low" >Low
     <input type="radio" name="risk" value="high">High
<br>
Purpose <select name="purpose" >
          <option value="${investment.purpose}">${investment.purpose}
          <option value="EDUCATION">Education
          <option value="MARRIAGE">Marriage
          <option value="RETIREMENT">Retirement
        </select><br>
Nominee <select name="nominee">
          <option value="${investment.nominee}">${investment.nominee}
          <option value="FATHER">Father
          <option value="MOTHER">Mother
          <option value="HUSBAND">Husband
          <option value="WIFE">Wife
          <option value="SON">Son
          <option value="DAUGHTER">Daughter
</select> 
Type<select name="type">
          <option value="Mutual Fund">Mutual Fund
          <option value="Public Provident Fund">PPF
          <option value="Unit Limited Investment Plan">ULIP
          <option value="Senior Pension Scheme">Senior Scheme
          <option value="Fixed Deposite">FD
</select> 
<input type="submit" value="Add investment">   

</form>


</body>
</html>