import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Cost Price ");
        int CP = sc.nextInt();
        System.out.println("Enter A Selling Price ");
        int SP = sc.nextInt();
        if (SP > CP) {
            System.out.println("Your is Profit ");
            int Profit = SP - CP;
            System.out.println(Profit);
        } else {
            System.out.println("Your Incurred Loss");
            int Loss = CP - SP;
            System.out.println(Loss);
        }
    }
}