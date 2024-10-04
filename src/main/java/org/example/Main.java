package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPerfectNumber(6));
        System.out.println(numberToWords(123));
    }
    public static boolean isPalindrome(int number) {
        String original = Integer.toString(Math.abs(number));
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
    public static boolean isPerfectNumber(int perfectNumber) {
if (perfectNumber < 1) {
    return false;
}
int sum = 0;
for (int i =1; i <= perfectNumber / 2; i++){
    if (perfectNumber % i == 0){
        sum += i;
    }
} return sum == perfectNumber;

    }

    public static String numberToWords(int number) {
        // Negatif sayı kontrolü
        if (number < 0) {
            return "Invalid Value";
        }

        // Sıfır sayısı özel durumu
        if (number == 0) {
            return "Zero";
        }

        // Sayıyı String'e çevir
        String numberStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        // Sayının her bir rakamı için kelime karşılıklarını yaz
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            result.append(printWordForDigit(digit));
            if (i < numberStr.length() - 1) {
                result.append(" ");  // Rakamlar arasında boşluk ekle
            }
        }
        return result.toString();
    }

    private static String printWordForDigit(int digit) {
        switch (digit) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }

}
