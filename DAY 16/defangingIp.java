/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".*/

import java.util.Scanner;
public class defangingIp{
    public String defangIPaddr(String address) {
       
        String adress=address.replace(".","[.]");
        return adress;
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        defangingIp s=new defangingIp();
        System.out.println(s.defangIPaddr(str));
        io.close();

    }
}