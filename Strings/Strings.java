/*
public class Strings {
    public static void main(String[] args) {
        // String Declaration

        String name = "Shubham";
        String FullName = "Shubham Bhagwan bhople";
        String sentence = "my name is Shubham ";
    }
}
 */

/*
//  User throgh String 
import java.util.Scanner;

public class Strings {
   public static void main(String[] args) {
    // Taking Input
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       System.out.println("Your name is: " + name);
   }
}
*/

/*
// Concatenation 
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String firstName = "Shubham";
        String LastName = "Bhople";
        String FullName = firstName +" "+ LastName;
        System.out.println("Full Name: " + FullName);
    }
}
 */

/*
// Print length of a String

import java.util.Scanner;

public class Strings {
   public static void main(String[] args) {
       String firstName = "Shubham";
       String LastName = "Bhople";
       String FullName = firstName + " " + LastName;
       System.out.println("String Length: " + FullName.length());

       Access characters of a string 
       for (int i = 0; i < FullName.length(); i++) {
           System.out.println(FullName.charAt(i));
       }
   }
}
*/

public class Strings {
    public static void main(String[] args) {
        // Compare
        String Name1 = "Shubham";
        String Name2 = "Shubham";

        // s1 > s2 : +ve
        // s1 < s2 : -ve
        // s1 == s2 : 0
        if (Name1.compareTo(Name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

    }
}

/*
 * // SubString
 * import java.util.*;
 * 
 * public class Strings {
 * public static void main(String[] args) {
 * String sentence = "My name is Tony";
 * 
 * // Substring(begin index, end index)
 * String name = sentence.substring(11, sentence.length());
 * System.out.println(name);
 * }
 * }
 * 
 */
