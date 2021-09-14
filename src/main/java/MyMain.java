import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int x = Integer.parseInt(binary);
        int loop = 0;
        int sum = 0;
        while (x > 0){
            int lastDigit = x % 10;
            sum += lastDigit * Math.pow(2, loop);
            loop += 1;
            x = x / 10;

        }
        return sum;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        int x = 0;
        String str = "";
        if (decimal == 0){
        return "0";
        }
        while (decimal > 0) {
            x = decimal % 2;
            str = x + str;
            decimal = decimal / 2;
        }
        return str;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Type in a number in binary format:
//        1111111111
//        That is equal to the decimal value: 1023
//        Type in a number in decimal format:
//        13
//        That is equal to the binary value: 101
        System.out.println("Type in a number in binary format:");
        String binary = scan.next();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(binary));
        System.out.println("Type in a number in decimal format:");
        int decimal = scan.nextInt();
        System.out.println("This is equal to the binary value: " + decimalToBinary(decimal));
    }
}
