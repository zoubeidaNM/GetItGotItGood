public class GetItGotItGood {

    public static void main(String args[])
    {

       //Print the Get it Got it Good numbers
         printNumbers();

    }
    // check if a number is multiple of three
    public static boolean chekMultOfThree(int num) {
       if((num%3) == 0)
           return true;
       else
           return false;
    }

    // check if a number is multiple of five
    public static boolean chekMultOfFive(int num) {
        if((num%5) == 0)
            return true;
        else
            return false;
    }

    // check if a number is multiple of ten
    public static boolean chekMultOfTen(int num) {
        if((num%10) == 0)
            return true;
        else
            return false;
    }


    public static void printNumbers() {
        for (int counter = 1; counter <= 100; counter++) {


            // check if multiple of three
            if (chekMultOfThree(counter)) {
                System.out.print("Get it ");
                // check if multiple of five
            }

            // check if multiple of five
            if (chekMultOfFive(counter)) {
                // multiple of five and three
                System.out.print("Got it ");
            }

            //check if multiple of 10
            if (chekMultOfTen(counter)) {
                System.out.print("Good!");
            }

            // if not multiple of 3, 5 print counter
            if (chekMultOfThree(counter) == false) {
                if(chekMultOfFive(counter) == false){
                        System.out.print(counter);
                }
            }
            System.out.print("\n");

        }

    }
}


