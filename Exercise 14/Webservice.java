*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.sql.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "Ex14")
public class Ex14 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public String search(@WebParam(name = "pid") String id) {
        //TODO write your implementation code here:
        boolean flag=false;
        try{
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/Products");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from product");
            while(rs.next()){
                String id1=rs.getString("Pid");
                if(id1.equals(id)){
                    flag=true;
                    break;
                }
            }
           
            if(flag){
             
                return "true";
            }
            else
                return "false";
        }
        catch(Exception e){
            return "can't established connection";
        }
       
    }
       
    }
