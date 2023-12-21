import java.util.Scanner;

public class rangePrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start point: ");
        int start = sc.nextInt();
        System.out.print("Enter start point: ");
        int end = sc.nextInt();

        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
        sc.close();
    }
    static boolean isPrime(int num){
            if(num<=1){
                return false;
            }

            for(int i=2; i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
}
}
