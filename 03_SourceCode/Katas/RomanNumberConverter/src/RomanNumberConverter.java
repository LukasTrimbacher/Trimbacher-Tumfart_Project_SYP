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
        var arabic = 0;
        while(romanNumber.length() > 0){
            for (var Numeral : Numeral.values()){
                if (romanNumber.startsWith(Numeral.mRoman)){
                    arabic += Numeral.mArabic;
                    romanNumber = romanNumber.substring(Numeral.mRoman.length());
                }
            }
        }
        return arabic;
    }

    enum Numeral {
        FIFTY(50, "L"),
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
