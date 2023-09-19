public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("******************************");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("******************************");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    //Palindrom Sayıyı Bulma +
    public static boolean isPalindrome(int num) {
        int temp = num, reverseNumber = 0, lastNumber;
        if(num < 0){
            temp = temp * -1;
            num = num * -1;
        }
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        System.out.println("Bu num: " + num);
        System.out.println("Bu reverse: "+ reverseNumber);

        if(num == reverseNumber) return true;
        return false;
    }


    //Mükemmel Sayıları Bulma +
    public static boolean isPerfectNumber(int numPerfect) {
        if (numPerfect < 0) return false;
        int divided = 0;
        for (int i = 1; i <= numPerfect / 2; i++) {
            if (numPerfect % i == 0) {
                divided += i;
            }
        }
        if (divided == numPerfect) return true;
        else return false;
    }

    //Sayıları Kelimelere Dök +
    public static String numberToWords(int numWord) {
        if (numWord < 0) return "Invalid Value";

        String everyNum = String.valueOf(numWord);
        String[] numNum = everyNum.split("");
        for (String n : numNum) {
            switch (n) {
                case "0":
                    System.out.printf(" zero");
                    break;
                case "1":
                    System.out.printf(" one");
                    break;
                case "2":
                    System.out.printf(" two");
                    break;
                case "3":
                    System.out.printf(" three");
                    break;
            }
        }
        return " " + everyNum;
    }


}