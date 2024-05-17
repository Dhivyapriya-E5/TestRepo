public class ArmstrongNumbers {
    
    static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }


    public static void main(String[] args) {
        int count = 0;
        int currentNumber = 1;
        while (count < 10) {
            if (isArmstrong(currentNumber)) {
                System.out.println(currentNumber);
                count++;
            }
            currentNumber++;
        }
    }

}