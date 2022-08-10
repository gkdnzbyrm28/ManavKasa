import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00,x,c,v,b,n, toplam;

        Scanner utp = new Scanner(System.in);

        System.out.print("Armut kac kilo?");
        x= utp.nextDouble();
        System.out.print("Elma kac kilo?");
        c= utp.nextDouble();
        System.out.print("Domates kac kilo?");
        v= utp.nextDouble();
        System.out.print("Muz kac kilo?");
        b= utp.nextDouble();
        System.out.print("Patlican kac kilo?");
        n= utp.nextDouble();

        toplam=(armut*x)+(elma*c)+(domates*v)+(muz*b)+(patlican*n);
        System.out.print("Toplam tutar="+ toplam);

    }
}
