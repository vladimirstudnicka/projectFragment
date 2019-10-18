package sk.itsovy.studnicka.ProjectFragment;

public class Rectangle {
    private int a;
    private int b;
    private char character;
    private boolean fill;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        character = '#';
        fill=false;


    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int calcArea(){ //obsah
        return a*b;
    }

    public int calcPerimeter(){ //obvod
        return 2 * ( a + b);

    }

    public double calcDiagonale(){
        return Math.sqrt((a*a) + (b*b)); //alebo, return Match.sqrt(Math.pow(a,2)+Math.pow(b,2))
    }

    public void showRectangle() {
        System.out.println();
        for (int row = 1; row <= b; row++) {

            for (int column = 1; column <= a; column++) {
                if (row == 1 || row == b || column == 1 || column == a) {
                    System.out.print(character);
                }
                else if (fill) {
                    System.out.print(character);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public void print() {
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return "Rectangle: a="+a+" b="+b;

    }

}