public class jaaava {
    public static void main(String[] args) {
        
        int n = 5;
        for(int i = 0; i<=(n+1)/2; i++ ){
            for(int j = 0; j <= n-i; j++ ){
                System.out.print(" ");

            }
            for(int k = 0; k <=(i - 1) *2; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = ((n+1)/2)-1; i>=0; i--){
            for(int j = 0; j <= n-i; j++ ){
                System.out.print(" ");

            }
            for(int k = 0; k <=(i - 1) *2; k++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}