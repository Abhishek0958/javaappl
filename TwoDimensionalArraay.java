import java.util.Scanner;

public class TwoDimensionalArraay {
    public static void main(String[] args) {

                Scanner sc =new Scanner(System.in);
                int [][] Arr1= new int [3][3];
                int [][] Arr2= new int [3][3];
                int [][] result= new int [3][3];

                System.out.println("enter value for array1");
                for(int i=0;i< Arr1.length;i++){
                    for(int j=0;j<Arr1[0].length;j++){
                        System.out.println("enter value-");
                        Arr1[i][j]=sc.nextInt();
                    }
                }

                System.out.println("enter value for array2");
                for(int i=0;i< Arr2.length;i++){
                    for(int j=0;j<Arr2[0].length;j++){
                        System.out.println("enter value-");
                        Arr2[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Array1");
                for(int i=0;i< Arr1.length;i++){
                    for(int j=0;j<Arr1[0].length;j++){
                        System.out.print(Arr1[i][j]+ " ");

                    }
                    System.out.println();
                }
                System.out.println("Array2");
                for(int i=0;i< Arr2.length;i++){
                    for(int j=0;j<Arr2[0].length;j++){
                        System.out.print(Arr2[i][j]+ " ");

                    }
                    System.out.println();
                }


                for(int i=0;i< result.length;i++){
                    for(int j=0;j<result[0].length;j++){

                        result[i][j]=Arr1[i][j]+ Arr2[i][j];
                    }
                }

                System.out.println("result of adding Array and Array2 is");
                for(int i=0;i< result.length;i++){
                    for(int j=0;j<result[0].length;j++){
                        System.out.print(result[i][j]+ " ");

                    }
                    System.out.println();
                }


            }
        }


