    <?php
    $id=$_POST['eid'];
    $age=$_POST['eage'];
    $name=$_POST['ename'];
    $address=$_POST['ead'];
    $contact=$_POST['contact'];
    $dob=$_POST['edob'];
    $area=$_POST['aoi'];
    $year=$_POST['yoe'];
    if(strlen($id)==6){
        if(preg_match("/^[0-9]*$/",$age)){
            if(preg_match("/^[a-zA-Z]*$/",$name)){
                if(strlen($address)>25){
                    if(preg_match("/^[0-9]*$/",$contact) && strlen($contact)==10){
                        if(preg_match("/^(((0|1)[0-9]|2[0-9]|3[0-1])\/(0[1-9]|1[0-2])\/((19|20)\d\d))*$/",$dob)){
                            if(preg_match("/^([a-zA-Z])*$/",$area)){
                                if(preg_match("/^[0-9]*$/",$year)){
                                    echo  '<script>alert("REGISTERED SUCCESSFULLY");</script>';
                            }
                            else{
                                echo '<script>alert("INVALID YEAR OF EXPERIENCE");</script>';
                            }
                        }
                        else{
                            echo '<script>alert("INVALID AREA OF INTEREST");</script>';
                        }
                    }
                    else{
                        echo '<script>alert("INVALID DATE OF BIRTH");</script>';
                    }
                }
                else{
                    echo '<script>alert("INVALID CONTACT");</script>';
                }
            }
            else{
            echo '<script>alert("INVALID ADDRESS");</script>';}
        }
        else{
            echo '<script>alert("INVALID NAME");</script>';
        }
}
    else{
        echo '<script>alert("INVALID AGE");</script>';
    }
}
else{
echo '<script>alert("INVALID ID");</script>';
    }
?>
