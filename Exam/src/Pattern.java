public class Pattern {
    public static void main(String[] args) {

        System.out.println("answer number 40 ");

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <=i ;j++ )
                System.out.print(j);
            System.out.println("");

        }



        System.out.println("answer number 41 : ");

        for(int i =5; i>=1 ; i--)
        {
            for(int j= i ; j>0; j--)
                System.out.print(j);
            System.out.println("");
        }
    }



}
