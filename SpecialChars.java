public class SpecialChars {
    public static void main(String[] args) {
        // String text = "We are the so-called "Vikings" from the north.";
        String text = "We are the so-called \"Vikings\" from the north.";
        /*
         * String text2 = "We are the
         * so-called \"Vikings\"
         * from the north."
         */
        String text2 = "We are the so-called \n \"Vikings\" \n from the north.";
        String text3 = "We are the so \r \"Vikings\"\r from the north.";
        // System.out.println(text);
        // System.out.println(text2);
        System.out.println(text3);
    }
}
