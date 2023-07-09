public class BitwiseEncodeDecode {
public static void main(String[]args)
    {
        String message = "Hello World";
        int key = 17;
        String encoded_message = encode(message,key);
        System.out.println("Encoded Message: "+encoded_message);
        String decoded_message = decode(encoded_message,key);
        System.out.println("Decoded Message: "+decoded_message);
    }

public static String encode(String message,int key)
{
    char [] characters = message.toCharArray();
    for (int i=0;i<characters.length;i++)
    {
        characters[i] = (char)(characters[i]^key);
    }
    return new String(characters);
}
public static String decode(String message,int key)
{
    return encode(message,key);
}   
}
