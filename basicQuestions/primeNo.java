import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        int count = 0;

        if (number > 1) {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if(count>2){
                System.out.println(number+" is not prime number");
            }else{
                System.out.println(number+" is prime number");
            }

        }else{
            System.out.println(number+" is not prime number");
        }
        sc.close();
    }
}
