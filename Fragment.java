package sk.itsovy.studnicka.ProjectFragment;

public class Fragment {
    private int numerator;
    private int denominator;

    public Fragment(int numerator,int denominator) {
        if (denominator==0)
            denominator=1;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fragment(Fragment otherFragment) {
        numerator=otherFragment.getNumerator();
        denominator=otherFragment.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }



    public void changeToBasicShape() {
        int commonDivisor = getLargestDivisor();
        numerator=numerator/commonDivisor;
        denominator=denominator/commonDivisor;

    }

    private int getLargestDivisor(){
        /* if(numerator<denominator)
                min=numerator;
                    else
                        min=denominator

                        namiesto if pouzijem ternany operator
         */
        int absNumerator= Math.abs(numerator);
        int absDenominator= Math.abs(denominator);

        int commonDivisor=absNumerator<absDenominator?absNumerator:absDenominator;
        while (absNumerator % commonDivisor !=0 || absDenominator % commonDivisor !=0) {
            commonDivisor--;
        }
        return commonDivisor;
    }

    public void extendFragment(int value) {
        if (value!=0) {
            numerator = numerator * value;
            denominator = denominator * value;
        }

    }

    public double getRealValue() {
        double doubleNumerator = (double) numerator;
        return numerator / denominator;
    }

    public MixedNumber getMixedNumber() {
        int value = numerator/denominator; //23/10
                Fragment f =new Fragment(numerator%denominator,denominator); //=2 3/10
        return new MixedNumber(value,f);

    }

    public void reverse() {
        int temp=numerator;
        numerator=denominator;
        denominator=temp;

    }

    public void opposite() {
        numerator *= -1;


    }

    public Fragment copy() {
        Fragment newFragment = new Fragment(numerator, denominator);
        return newFragment;

    }

    public boolean isFragmentInBasicShape() {
        if (getLargestDivisor()==1) {
            return true;
        }
        else
            return  false;
    }

    @Override
    public String toString(){
        return numerator+" / "+denominator;

    }




}
