<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="forms.css">
</head>
<body>
    <div class="container">
        <form action="validate.php" method="post"> 
            <div class="head">EMPLOYEE DETAILS</div>
            <div class="input-group">
                <label>Employee ID:</label>
                <input type="text" name="eid" placeholder="eg: aa0000" >
                <span id="iderror"></span>
            </div>
            <div class="input-group">
                <label>Employee Name:</label>
                <input type="text" name="ename" placeholder="Enter your name" >
                <span id="nameerror"></span>
            </div>
            <div class="input-group">
                <label>Dob :</label>
                <input type="text" name="edob" placeholder="dd/mm/yyyy" >
                <span id="doberror"></span>
            </div>
            <div class="input-group">
                <label id="ge" name="g">Gender: </label>
                <div class="input-group gen">
                <input type="radio" id="m" name="g"><label>Male</label>
                <input type="radio" id="f" name="g"><label>Female</label>
                </div>
            </div>
            <div class="input-group">
                <label>Age:</label>
                <input type="text" name="eage" placeholder="Enter age" >
                <span id="ageerror"></span>
            </div>
            <div class="input-group add">
                <label>Address</label>
                <textarea rows="10" columns="50" name="ead" placeholder="Enter your address" ></textarea>
                <span id="aderror"></span>
                <span id="adcrt"></span>
            </div>
            <div class="input-group">
                <label>Qualification :</label>
                <select id="quali">
                    <option value="B.E">B.E</option>
                    <option value="B.Tech">B.TECH</option>
                    <option value="Bsc">BSc</option>
                    <option value="Others">Others</option>
                </select>
            </div>
            <div class="input-group">
                <label>Contact Number :</label>
                <input group="text" name="contact" >
                <span id="contacterror"></span>
            </div>
            <div class="input-group">
                <label>Area of Interest :</label>
                <input group="text" name="aoi" >
                <span id="aoierror"></span>
            </div>
            <div class="input-group">
                <label>Year of Experience :</label>
                <input group="text" name="yoe" >
                <span id="yerror"></span>
            </div>
            <div class="buttons">
            <button>Submit</button>
            <span id="submiterror"></span>
            <button onclick="clear()">Clear</button>
            </div>
        </form>
    </div>
</body>
</html>