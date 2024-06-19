package oneinside.task1.Task3;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(multiplynuumbers(12,3));
        System.out.println(multiplynuumbers(12,-3));
    }

   public static int multiplynuumbers(int number1, int number2){
        if(number1 == 0 || number2 == 0) return 0;


        if(number2 < 0) return -multiplynuumbers(number1, -number2);
        return number1 + multiplynuumbers(number1, number2 - 1);
    }
}
