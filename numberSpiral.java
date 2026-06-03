public class numberSpiral {
    public static void main(String[] args){
        int n = 4;
        for(int i = (2*n)-1 ; i >= 1 ; i--){
            for(int j = (2*n)-1 ; j >= 1 ; j--){
                int a = i;
                int b = j ;
                if(a<n){
                    a= (2*n)-i;
                }
                if(b<n){
                    b = (2*n)-j;
                }
                System.out.print(Math.max(a-(n-1),b-(n-1)));
            }
            System.out.println();
        }
    }
}
