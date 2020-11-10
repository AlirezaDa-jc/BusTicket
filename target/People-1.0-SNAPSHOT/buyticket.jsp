<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BuyTicket</title>
</head>
<body>
<form method="POST" id="my_form" action="buyticket"></form>

<table class="table">

    <tr>
        <th scope=row>Name</th>
        <td><input form="my_form" type="text" name="Name"></td>
    </tr>
    <tr>
        <th scope=row>Gender</th>
        <td>
            <label>
                <input form="my_form" type="radio" value="Male" name="gender">
            </label>Male
            <label>
                <input form="my_form" name="gender" type="radio" value="Female">
            </label>Female
        </td>
    </tr>
    <tr>
        <td colspan="3" style="text-align: center"><input form="my_form" type="submit" value="select"></td>
    </tr>






</table>
<!--Form show table to add name and radio button gender TODO-->
</body>
</html>