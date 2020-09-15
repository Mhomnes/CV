
public class CalculationOfPi {

    public static void main(String[] args) {

        double sum = 0;
        String inputText = " ledd i rekken er verdien av pi: ";

        for( int i = 1; i <= 100000; i++){
            sum += Math.pow(-1,i + 1)/((2*i) - 1);

            if ( i == 10000 && i % 10000 == 0)
                System.out.printf("For 10.000" + inputText + sum*4.0);
            else if (i == 20000 && i % 20000 == 0)
                System.out.print("\nFor 20.000 " + inputText + sum*4.0);
            else if (i == 30000 && i % 30000 == 0)
                System.out.print("\nFor 30.000 " + inputText + sum*4.0);
            else if (i == 40000 && i % 40000 == 0)
                System.out.print("\nFor 40.000 " + inputText + sum*4.0);
            else if (i == 50000 && i % 50000 == 0)
                System.out.print("\nFor 50.000 " + inputText + sum*4.0);
            else if (i == 60000 && i % 60000 == 0)
                System.out.print("\nFor 60.000 " + inputText + sum*4.0);
            else if (i == 70000 && i % 70000 == 0)
                System.out.print("\nFor 70.000 " + inputText + sum*4.0);
            else if (i == 80000 && i % 80000 == 0)
                System.out.print("\nFor 80.000 " + inputText + sum*4.0);
            else if (i == 90000 && i % 90000 == 0)
                System.out.print("\nFor 90.000 " + inputText + sum*4.0);
            else if (i == 100000 && i % 100000 == 0)
                System.out.print("\nFor 100.000 " + inputText + sum*4.0);
        }






    }


}












