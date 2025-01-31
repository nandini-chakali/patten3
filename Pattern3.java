public class Pattern3{
    public static void main(String[] args) {
        int n = 5; 
        int mid = n / 2; 
        for (int i = 0; i < n; i++) {
 
            int spaces = Math.abs(mid - i); 
            int stars = n - 2 * spaces;  
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}