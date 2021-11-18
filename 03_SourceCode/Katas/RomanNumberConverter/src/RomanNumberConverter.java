public class RomanNumberConverter {
    public static String toRoman(int arabicNumber){
        var romanNumber = "";
        for(var numeral : Numeral.values()){
            while(arabicNumber >= numeral.mArabic){
                romanNumber += numeral.mRoman;
                arabicNumber -= numeral.mArabic;
            }
        }
        return romanNumber;
    }
    public static int toArabic(String romanNumber){
        int arabic = 0;
        for (int i = 0; i < romanNumber.length(); i++){
            if(romanNumber.charAt(i) == 'X'){
                arabic += 10;
            }
            else if(romanNumber.charAt(i) == 'V'){
                arabic += 5;
            }
            else if (romanNumber.charAt(i) == 'I'){
                arabic += 1;
            }
        }
        return arabic;
    }

    enum Numeral {
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private final int mArabic;
        private final String mRoman;

        Numeral(int arabic, String roman) {
            mArabic = arabic;
            mRoman = roman;
        }
    }
}
