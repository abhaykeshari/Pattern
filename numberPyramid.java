public class numberPyramid {
    public static void main(String[] args){
        int n =4 ;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j <= n -i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i; k++){
                System.out.print(k);
            }
            for(int l = i     ; l>=2;l--){
                System.out.print(l-1);
            }
            System.out.println();
        }
    }
}
