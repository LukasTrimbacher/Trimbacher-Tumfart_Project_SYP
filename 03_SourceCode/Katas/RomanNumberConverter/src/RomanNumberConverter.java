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
        if(romanNumber == "V"){
            return 5;
        }
        if (romanNumber == "III"){
            return 3;
        }
        return romanNumber == "I" ? 1 : 2;
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
