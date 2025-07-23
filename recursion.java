public class recursion {

     static int facto(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n *facto(n-1);
        }
     }
     static int factorial_iterative(int n){
        if (n== 0 || n == 1) {
            return 1;
            
        }
        else {
            int product = 1;
            for(int i =1;i<=n;i++){
                product *=i;
            }
            return product;
        }
     }
     public static void main(String[] args) {
        System.out.println("factorial is " + facto(5));
        System.out.println("factorial is " + factorial_iterative(5));
     }
}
