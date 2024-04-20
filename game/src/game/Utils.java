package game;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class Utils {
    public static String digest256(String s) throws NoSuchAlgorithmException { // It calculates the SHA256 from a string
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(s.getBytes(StandardCharsets.UTF_8));
        final StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            final String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    public static double toLog(Double d){ // Returns a logarithmic based double from another
        double min = 0, max = 1;;

        double b = Math.log(max/min)/(max-min);
        double a = max / Math.exp(b * max);
        double tempAnswer = a * Math.exp(b*d);

        return Math.max(Math.round(tempAnswer), 0);
    }

    //public static void main(String[] args) throws NoSuchAlgorithmException {System.out.println(digest256("1234"));}
}
