public class first {

    public static void main(String [] args){
        int r = 4;
        int c = 5;
        for(int i = 0 ; i < r ; i++ ){
            for(int j = 0 ; j < c ; j++){
                if(i == 0 || i == 3 || j == 0|| j == 4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
