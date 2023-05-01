package client;
import java.util.*;
public class clientside {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int id=obj.nextInt();
        System.out.println(getDetails(id));
    }

    private static String getDetails(int id) {
        lab.Ex14_Service service = new lab.Ex14_Service();
        lab.Ex14 port = service.getEx14Port();
        return port.getDetails(id);
    }
    
}