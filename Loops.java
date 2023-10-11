import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       //for (int i = 0; i < n; i++) {
        //    for (int j = 0; j < n; j++) {
         //       System.out.print("*");
           // }
            //System.out.println("");
        //}

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                //if (k == 0 || k == n - 1 || l == 0 || l == n - 1) {
                if (k+l == n-1)
                //if (k == l || l == (n-1)/2 || k == (n-1)/2 ||){
               // if (k == l || k+l==n-1 || k == 0 || k == n - 1 || l == 0 || l == n - 1 ||  k+l==(n-1)/2 || l-k==(n-1)/2 ||
                 //        k-l==(n-1)/2 || k+l==n-1 + (n-1)/2 )

                  //  if (k==0 && l<=(n-1)/2 || l==0 && k<=(n-1)/2 || k+l<=(n-1)/2
                    //        || l>=n-1 && k<=(n-1)/2 || l-k>=(n-1)/2 ||
                      //      k-l>=(n-1)/2 || k+l>=n-1 + (n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            } System.out.println(" ");
        }
    }
}