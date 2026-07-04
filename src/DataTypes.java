public class DataTypes {
    static void main() {

        //Numeric DT = byte, short, int, long
        byte num1 = 127;                        //Value ranges from -128 to 127
        System.out.println("num1: " + num1);
        short num2 = 32767;                     //Value ranges from -32768 to 32767
        System.out.println("num2: " + num2);
        int  num3 = 500000000;                  //Value ranges from -2147483648 to 2147483647
        System.out.println("num3: " + num3);
        long num4 = 1234567890;                 //Value ranges from -2^63 to (2^63 - 1)
        System.out.println("num4: " + num4);

        //Floating DTs
        float num5 = 3.1424346f;                //Single precision decimal. Ranges: ~+-3.4 x 10^38 (~6-7 decimal digits precision)
        System.out.println("num5: " + num5);
        double num6 = 12.12345678947475555;
        System.out.println("num6: " + num6);    //Double precision decimal. Ranges: ~+-1.7 x 10^308 (~15 decimal digits precision)

        //other - Char, Boolean
        boolean eligibleToVote = true;          //Stores true/false, No fixed range (logical values only)
        System.out.println("eligibleToVote: " + eligibleToVote);

        char firstCharacter = 'a';              // Stores Unicode character. Range: 0 to 65535 (\u0000 to \uffff)
        System.out.println("my first Character is: " + (char)(firstCharacter+2)); //Converting to ASCII values and printing Characters

    }
}
