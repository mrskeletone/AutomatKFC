import java.util.Scanner;

public class Main {
    public static double D=5,H=25,plotnosty=1000;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите диаметр бака:");
        D=sc.nextDouble();
        System.out.print("Введите Высоту бака:");
        H=sc.nextDouble();
        System.out.print("Введите плотность жидкости:");
        plotnosty=sc.nextDouble();
        double nozzleDiameter = 0.65*Math.sqrt(D/H);
        double g=9.8;
        double P=plotnosty*g*H;
        double v=Math.sqrt((2*(P))/plotnosty);
        double l=D*0.3;
        int N=(int)Math.ceil((Math.PI*H)/(nozzleDiameter*l));
        double h=H-l;
        double angle=Math.atan(h/(D/2));
        double Q=(N*Math.PI*Math.pow(nozzleDiameter,2)*v)/4;
        System.out.println(String.format("Диаметр d=%.4f м.\nДавление P=%.4f Па\nКоличество сопел N=%d \nВысота сопел h=%.4f м\nУгол сопел angle=%.4f град.\n" +
                "Расход жидкости Q=%.4f",nozzleDiameter,P,N,H-h,angle,Q));
    }}