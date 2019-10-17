package sk.itsovy.studnicka.ProjectFragment;

public class MyMath {

    private Fragment fragment;

    public Fragment add(Fragment a, Fragment b) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
        result.changeToBasicShape();

        return result;
    }

    public static Fragment sub(Fragment a, Fragment b) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getDenominator() - a.getDenominator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
        result.changeToBasicShape();

        return result;
    }

    public Fragment mul(Fragment a, Fragment b) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
        result.changeToBasicShape();

        return result;
    }

    public Fragment div(Fragment a, Fragment b) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
        result.changeToBasicShape();

        return result;
    }

    //polymorfizmus
    public Fragment mul(int value, Fragment a) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * value, a.getDenominator());
        result.changeToBasicShape();

        return result;
    }

    //polymorfizmus
    public Fragment add(int value, Fragment b) {
        Fragment temp = new Fragment(value, 1);
        return add(temp, b);

    }

}
