import java.util.Scanner;

// public class NnaturalNo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a natural no value : ");

//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             System.out.println(i + " ");
//         }
//     }
// }

public class NnaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
            sum += i;

        }
        System.out.println("Sum: " + sum);
    }
}
