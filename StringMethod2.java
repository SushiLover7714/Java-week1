public class StringMethod2{
 public static void main(String [] args) {
    String str = "Hello";
    String str2 = "Welcome";
   // String str3 = str.concat(str2);
   String str3 = str+str2;
    System.out.println(str3);
    String address= "19 ward,thinganyun street,thuwanna township";
    System.out.println(address.contains("Sanchaung"));
    String str4 = "Sanchaung";
    String str5 = "sanchaung";
    System.out.println(str4.equalsIgnoreCase(str5));

 }  
}
