import java.util.Scanner;

public class SumOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. : ");
        int number = sc.nextInt();
        int sum=0;

        for(int i=0;i<=number;i++){
            sum +=i;
        }
        System.out.println("Sum of Given Numbers : "+sum);
        sc.close();
    }
}
