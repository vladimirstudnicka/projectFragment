package sk.itsovy.studnicka.ProjectFragment;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calCirclePerimeter( double r) {
        return 2 * Math.PI;
    }

    public double calCircleArea(double r) { // S=PI*r2 obsah
        return Math.PI * Math.pow(r, 2); //Math.pow namiesto (r*r)
    }
}
