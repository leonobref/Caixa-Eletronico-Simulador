import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um valor para ser sacado: ");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();

        int notasde100 = num1 / 100;
        int resto = num1 % 100;
        int notasde50 = 0, notasde20 = 0, notasde10 = 0, notasde5 = 0, notasde2 = 0, notasde1 = 0;
        if (resto != 0){
            notasde50 = resto / 50;
            resto = resto % 50;
        }
        if (resto != 0){
            notasde20 = resto / 20;
            resto = resto % 20;
        }
        if (resto != 0){
            notasde10 = resto / 10;
            resto = resto % 10;
        }
        if (resto != 0){
            notasde5 = resto / 5;
            resto = resto % 5;
        }
        if (resto != 0){
            notasde2 = resto / 2;
            resto = resto % 2;
        }
        if (resto != 0){
            notasde1 = resto / 1;
            resto = resto % 1;
        }
        if(notasde100 != 0)
            System.out.println("Notas de 100: " + notasde100);
        if(notasde50 != 0)
            System.out.println("Notas de 50: " + notasde50);
        if(notasde20 != 0)
            System.out.println("Notas de 20: " + notasde20);
        if(notasde10 != 0)
            System.out.println("Notas de 10: " + notasde10);
        if(notasde5 != 0)
            System.out.println("Notas de 5: " + notasde5);
        if(notasde2 != 0)
            System.out.println("Notas de 2: " + notasde2);
        if(notasde1 != 0)
            System.out.println("Notas de 1: " + notasde1);
    }
}