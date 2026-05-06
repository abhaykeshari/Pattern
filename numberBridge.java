import java.util.Scanner;
public class numberBridge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt() ;
        int m = n-1;
        for(int i = 1 ; i <= 2*n-1; i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i = 1 ; i <= m ; i++){
            int a = 1;
            for(int j = 1 ; j <= m-i+1; j++){
                System.out.print(a);
                a++;
            }
            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print(" ");
                a++;
            }
            for(int j = 1 ; j<= m-i+1 ; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
}
