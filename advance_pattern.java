import java.util.*;
public class advance_pattern {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
//        for(int i = 1 ; i<=r ; i++){
//            for (int j =1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            for (int j =1 ; j<=2*(r-i) ; j++){
//                System.out.print(" ");
//            }
//            for (int j=1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        for(int i = r ; i>=1 ; i--){
//            for (int j =1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            for (int j =1 ; j<=2*(r-i) ; j++){
//                System.out.print(" ");
//            }
//            for (int j=1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//        for (int i =1  ; i<=r ; i++){
//            for(int j =1 ; j<=r-i ; j++){
//                System.out.print(" ");
//            }
//            for (int j =1 ; j<=i ; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }


//        for (int i = 1 ; i<=r ; i++){
//            for (int j =1 ; j<=r-i ; j++){
//                System.out.print(" ");
//            }
//            for(int j = i; j>=1 ; j--){
//                System.out.print(j);
//            }
//            for(int j = 2 ; j<=i ; j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }

        for (int i =1 ; i<=r ; i++){
            for (int j = 1 ; j<=r-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1  ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i =r ; i>=1 ; i--){
            for (int j = 1 ; j<=r-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1  ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
