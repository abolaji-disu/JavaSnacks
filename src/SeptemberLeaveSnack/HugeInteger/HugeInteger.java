package SeptemberLeaveSnack.HugeInteger;

public class HugeInteger {
    private final int maxLength = 40;
    private final int[] hugeInteger = new int[maxLength];

    public HugeInteger(String parseString) {
        validateAllStringsAreCharacters(parseString);
        validateStringLength(parseString);
        parse(parseString);
    }

    public HugeInteger(){};

    private void validateStringLength(String parseString) {
        if (parseString.length()>maxLength)
            throw new HugeIntegerOutOfBoundsExceptionError("String length should be at most 40");
    }

    private void validateAllStringsAreCharacters(String parseString){
        for (int i = 0; i < parseString.length(); i++) {
            if(!Character.isDigit(parseString.charAt(i)))
                throw new HugeIntegerMismatchException("All Strings must be a digits");
        }
    }

    public int[] getDigitsArray() {
        return hugeInteger;
    }

    public void parse(String parseString) {
        validateAllStringsAreCharacters(parseString);
        for (int i = 0; i < parseString.length(); i++) {
            int digits = Integer.parseInt(String.valueOf(parseString.charAt(i)));
            hugeInteger[i] = digits;
        }
    }

    public int[] getHugeInteger(){
        return hugeInteger;
    }

    public HugeInteger add(HugeInteger hugeInteger) {
        int sum = 0;
        int remainder= 0;
        int carry = 0;

        int[] hugeInt1 = hugeInteger.getDigitsArray();
        int[] hugeInt2 = this.getDigitsArray();

        HugeInteger hugeInt3 = new HugeInteger();
        int[] result = hugeInt3.getDigitsArray();

        addHugeIntegerOrder(carry, hugeInt1, hugeInt2, result);
        return hugeInt3;
    }

    private void addHugeIntegerOrder(int carry, int[] hugeInt1, int[] hugeInt2, int[] result) {
        int sum;
        int remainder;
        for (int i = maxLength-1; i >= 0 ; i--) {
            sum = hugeInt1[i] + hugeInt2[i] + carry;
            if(sum > 9 && i == 0) {
                result[i] = sum;
                break;
            } if (sum > 9) {
                remainder = sum % 10;
                carry = sum/10;
                result[i] = remainder;
            }else {
                result[i] = sum;
                carry = 0;
            }
        }
    }


    public HugeInteger subtract(HugeInteger hugeInteger) {

        int[] hugInt1 = this.getDigitsArray();
        int[] hugInt2 = hugeInteger.getHugeInteger();

        HugeInteger hugInt3 = new HugeInteger();
        int[] result = hugInt3.getDigitsArray();

        if(this.isGreaterThan(hugeInteger))
            DefaultHugIntOrder(hugInt1, hugInt2, result);

        if (hugInt1[0] < hugInt2[0] )
            reverseHugIntOrder(hugInt2, hugInt1, result);

        return hugInt3;
    }

    private void DefaultHugIntOrder(int[] hugInt1, int[] hugInt2, int[] result) {
        for (int i = hugInt1.length-1; i >= 0; i--) {
            if(hugInt1[i] < hugInt2[i] && i == 0){
                result[i] = hugInt1[i] - hugInt2[i];
                break;
            }
            if(hugInt1[i] < hugInt2[i]){
                hugInt1[i] = hugInt1[i] + 10;
                hugInt1[i-1]--;
                result[i] = hugInt1[i] - hugInt2[i];
            }
            result[i]= hugInt1[i] - hugInt2[i];

        }
    }

    private void reverseHugIntOrder(int[] hugInt1, int[] hugInt2, int[] result) {
        for (int k = hugInt2.length-1; k >= 0; k--) {
            if(hugInt1[k] < hugInt2[k] && k == 0){
                result[k] = hugInt1[k] - hugInt2[k];
                break;
            }
            if(hugInt1[k] < hugInt2[k]){
                hugInt1[k] = hugInt1[k] + 10;
                hugInt1[k-1]--;
                result[k] = hugInt1[k] - hugInt2[k];
            }
            result[k]= hugInt1[k] - hugInt2[k];
            if (hugInt2[0] < hugInt1[0] && k == 0){
                result[k]= hugInt2[k] - hugInt1[k];
            }

        }
    }

    public Boolean isEqualTo(HugeInteger hugeInteger){
        int[] hugInt1 = this.getDigitsArray();
        int[] hugInt2 = hugeInteger.getHugeInteger();
        int countTrue = 0;

        for (int i = 0; i < hugInt1.length; i++)
            if(hugInt1[i] == hugInt2[i]){
                countTrue++;
            }
        return countTrue == 40;
    }

    public Boolean isNotEqualTo(HugeInteger hugeInteger){
         return !this.isEqualTo(hugeInteger);
    }

    public Boolean isGreaterThan(HugeInteger hugeInteger){
        int[] hugInt1 = this.getDigitsArray();
        int[] hugInt2 = hugeInteger.getHugeInteger();

        if (hugInt1[0] != hugInt2[0])
            return hugInt1[0] > hugInt2[0];

        int i = 0;
        boolean isGreater = false;
        while(!isGreater){
            if(i == 40)return false;
            isGreater = hugInt1[i] > hugInt2[i];
            i++;
        }
        return true;
    }
    public Boolean isLesserThan(HugeInteger hugeInteger){
        return !isGreaterThan(hugeInteger);
    }

    public Boolean isLesserThanOrEqualTo(HugeInteger hugeInteger){
        return (this.isLesserThan(hugeInteger) || this.isEqualTo(hugeInteger));
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger hugeInteger) {
        return (this.isGreaterThan(hugeInteger) || this.isEqualTo(hugeInteger));
    }
}
