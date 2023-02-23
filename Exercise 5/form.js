var idError = document.getElementById('iderror');
var nameError = document.getElementById('nameerror');
var dobError = document.getElementById('doberror');
var ageError = document.getElementById('ageerror');
var adError = document.getElementById('aderror');
var adCrt = document.getElementById('adcrt');
var contactError=document.getElementById('contacterror');
var aoiError=document.getElementById('aoierror');
var yoeError=document.getElementById('yerror');
var submit=document.getElementById('submiterror');
function namevalid() {
    var n = document.getElementById("ename").value;
    if (n.length == 0) {
        nameError.innerHTML = 'Error: Name is required';
        return false;
    }
    if (!n.match(/^[A-z a-z]*\s{1}[A-Z a-z]/)) {
        nameError.innerHTML = 'Error: Enter Valid Name';
        return false;
    }
    nameError.innerHTML = '<i class="fa fa-check-circle"></i>';
    return true;
}
function idvalid() {
    var i = document.getElementById("eid").value;
    if (i.length == 0) {
        idError.innerHTML = 'Error: ID is required';
        return false;
    }
    if (!i.match(/^[a-zA-z]{2}[0-9]{4}/) || i.length>6) {
        idError.innerHTML = 'Error: Enter Valid Employee ID';
        return false;
    }
    idError.innerHTML = '<i class="fa fa-check-circle"></i>';
    return true;
}
function datevalid() {
        var dateString = document.getElementById("edob").value;
        var regex = /(((0|1)[0-9]|2[0-9]|3[0-1])\/(0[1-9]|1[0-2])\/((19|20)\d\d))$/;
        if (regex.test(dateString)) {
            var parts = dateString.split("/");
            var dtDOB = new Date(parts[1] + "/" + parts[0] + "/" + parts[2]);
            var dtCurrent = new Date();
            dobError.innerHTML = "Eligibility 21 years ONLY."
            if (dtCurrent.getFullYear() - dtDOB.getFullYear() < 21) {
                return false;
            }
 
            if (dtCurrent.getFullYear() - dtDOB.getFullYear() == 21) {
                if (dtCurrent.getMonth() < dtDOB.getMonth()) {
                    return false;
                }
                if (dtCurrent.getMonth() == dtDOB.getMonth()) {
                    if (dtCurrent.getDate() < dtDOB.getDate()) {
                        return false;
                    }
                }
            }
            var age=dtCurrent.getFullYear() - dtDOB.getFullYear();
            dobError.innerHTML = '<i class="fa fa-check-circle"></i>';
            document.getElementById("eage").value=age;
            agevalid();
            ageError.innerHTML='<i class="fa fa-check-circle"></i>';
            return true;
        } else {
            dobError.innerHTML = "Enter date in dd/MM/yyyy format ONLY."
            return false;
        }
}
function agevalid(){
    document.getElementById('eage').onkeydown = function(e){
        e.preventDefault();
    }
}
function advalid()
{
    var ad=document.getElementById("ead").value;
    var required=25;
    var left=required-ad.length;

    if(ad.length==0){
        adError.innerHTML="Error: Enter Address";
        return false;
    }
    if(left>0)
    {
        adError.innerHTML=left+" characters required";
        return false;
    }
    else{
    adError.innerHTML=" ";
    }
    adCrt.innerHTML='<i class="fa fa-check-circle"></i>';
    return true;
}
function contactvalid(){
    var c=document.getElementById("contact").value;
    if(c.length==0)
    {
        contactError.innerHTML="Enter Contact Number";
        return false;
    }
    if(c.length>10)
    {
        contactError.innerHTML="Contact Number should be 10 digits";
        return false;
    }
    if(!c.match(/^[0-9]{10}/) || c.length>10)
    {
        contactError.innerHTML="Enter Valid Contact Number";
        return false;
    }
    contactError.innerHTML='<i class="fa fa-check-circle"></i>';
    return true;
}
function aoivalid(){
    var ai=document.getElementById("aoi").value;
    if(ai.length==0)
    {
        aoiError.innerHTML="Enter Area of Interest";
        return false;
    }
    if(!ai.match(/^[A-Z a-z]/))
    {
        aoiError.innerHTML="Enter Valid area of Interest";
        return false;
    }
    aoiError.innerHTML='<i class="fa fa-check-circle"></i>';
    return true;
}
function yoevalid(){
    var y=document.getElementById("yoe").value;
    if(y.length==0)
    {
        yoeError.innerHTML="Enter Year of Experiencce";
        return false;
    }
    yoeError.innerHTML='<i class="fa fa-check-circle"></i>';
    return true;
}
function submitvalid()
{
    if(namevalid()==true && idvalid()==true && datevalid()==true && advalid()==true && aoivalid()==true && yoevalid()==true && contactvalid()==true)
    {
        alert("REGISTERED SUCCESSFULLY");
    }
    else{
        alert("Enter all the details to submit");
        return;
    }
}
function clear()
{
    document.getElementById("form").reset();
}