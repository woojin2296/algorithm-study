import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (char c : a.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            else {
                c = Character.toLowerCase(c);
            }
            System.out.printf("%s",c);
        }
        
    }
}