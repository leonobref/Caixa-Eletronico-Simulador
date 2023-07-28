import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um valor para ser sacado: ");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();

       Calculo calculo = new Calculo(num1);

        if((calculo.getNotade100()) != 0)
            System.out.println("Notas de 100: " + calculo.getNotade100());
        if((calculo.getNotade50()) != 0)
            System.out.println("Notas de 50: " + calculo.getNotade50());
        if((calculo.getNotade20()) != 0)
            System.out.println("Notas de 20: " + calculo.getNotade20());
        if((calculo.getNotade10()) != 0)
            System.out.println("Notas de 10: " + calculo.getNotade10());
        if((calculo.getNotade5()) != 0)
            System.out.println("Notas de 5: " + calculo.getNotade5());
        if((calculo.getNotade2()) != 0)
            System.out.println("Notas de 2: " + calculo.getNotade2());
        if((calculo.getNotade1()) != 0)
            System.out.println("Notas de 1: " + calculo.getNotade1());
    }
}