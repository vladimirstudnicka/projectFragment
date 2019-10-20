package sk.itsovy.studnicka.ProjectFragment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {

    private String name;

   /*public Bank(String name) { // prezistit
        this.name = name;
    }*/

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double convert() {

        double amount, code, forint, pound, franc, kuna, turkish;

        DecimalFormat f = new DecimalFormat("##.##"); // 2 desatinne miesta

        Scanner sc = new Scanner(System.in);

        System.out.println("This program convert Euro to this currencies. \nChoose your option:");
        System.out.println("1:Turkish \t2:Forint \t3:Pound \n4:Franc \t5:Kuna");
        code = sc.nextInt();

        System.out.println("Write your amount");
        amount = sc.nextFloat();


        if (code == 1 && amount > 0) {
            turkish = amount * 6.47;
            System.out.println(amount + " euro is : " + f.format(turkish) + " Turkish Lira");
        } else if (code == 2 && amount > 0) {
            forint = amount * 330.48;
            System.out.println(amount + " euro is : " + f.format(forint) + " Hungarian forint");
        } else if (code == 3 && amount > 0) {
            pound = amount * 0.90;
            System.out.println(amount + " euro is : " + f.format(pound) + " Pound");
        } else if (code == 4 && amount > 0) {
            franc = amount * 1.1;
            System.out.println(amount + " euro is : " + f.format(franc) + " Swiss franc");
        } else if (code == 5 && amount > 0) {
            kuna = amount * 7.44;
            System.out.println(amount + " euro is : " + f.format(kuna) + " Croatian Kuna");
        } else {
            System.out.println("-1");
        }
        return amount;
    }

    static double loan(double value, double interest, int months) {
        if (value > 0.00 && interest > 0.00 && months > 0) {
            return (value * (interest / 100) + value / months);
        }
        else
            return  -1;
    }
}
