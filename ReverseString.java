public class ReverseString {
 public static void main(String [] args){
   String revStr = "Hello";
   System.out.println(ReverseString(revStr)); 
 }
 public static String ReverseString(String message){
    char[] ReverseCharacter = new char[message.length()];    
for(int i=message.length()-1;i>=0;i--){
    ReverseCharacter[message.length()-i-1] = message.charAt(i);
}
return new String (ReverseCharacter);
 }
}
