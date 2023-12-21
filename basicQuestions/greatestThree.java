import java.util.Scanner;

public class greatestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three no. : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            System.out.println(a+" is greater no.");

        }else if(b>c){
            System.out.println(b+" is greater no.");
        }else{
            System.out.println(c+" is greater no.");
        }
        sc.close();
        
    }
}
