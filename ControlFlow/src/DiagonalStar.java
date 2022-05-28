public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number<5)
            System.out.println("Invalid Value");
        else{
            int rows = number;
            int columns=number;
            for (int i=1;i<=rows;i++){
                for (int j=1;j<=columns;j++){
                    if (i==1 || i==rows){
                        System.out.print("*");
                        continue;
                    }
                    if (j==1 || j==columns){
                        System.out.print("*");
                        continue;
                    }
                    if (i==j){
                        System.out.print("*");
                        continue;
                    }
                    if (j==rows-i+1){
                        System.out.print("*");
                        continue;
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }
    }
}
