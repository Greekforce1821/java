import java.util.Scanner;

public class IntDivisor {
    
    public static int quotient(int numerator, int denominator ) { // διαιρετέος, διαιρέτης
        return numerator/denominator;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exceptionFlag = true; // συνέβη σφάλμα;
        do {
            try {
                System.out.print("Δώσε διαιρετεό: ");
                int n = sc.nextInt();
                
                System.out.print("Δώσε διαιρέτη: ");
                int d = sc.nextInt();
                
                System.out.println("Πηλίκο: "+ quotient(n, d));
                exceptionFlag = false;
            }
            catch (java.util.InputMismatchException imex) {
                System.out.println("\nΣυνέβη ένα InputMismatchException: "+ imex);
                System.out.println("Δοκιμάστε πάλι... και αυτή τη φορά δώστε δύο ΑΚΕΡΑΙΟΥΣ!\n");
                sc.nextLine(); // Παραβλέπουμε τη λάθος είσοδο.
            }
            catch (ArithmeticException aex) {
                System.out.println("\nΣυνέβη ένα ArithmeticException: "+ aex);
                System.out.println("Δοκιμάστε πάλι. Θυμηθείτε! Δεν διαιρούμε με το μηδέν.\n");
            }
            catch (Exception ex) {
                System.out.println("\nΣυνέβη ένα σφάλμα, δεν έχω ιδέα τι!");
            }
            
        } while (exceptionFlag);
        
        
    }
}