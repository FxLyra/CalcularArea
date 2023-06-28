import java.util.Scanner;

import static java.lang.Thread.sleep;

public class CalcularAreas {
    public static void main(String[] args) throws InterruptedException {
        double area, d1, d2, base, alt, raio, bmaior, bmenor, opc2;
        int opc, cont;

        for (cont=0;cont<2;)
        {
            System.out.println("Cálculos de áreas\n\nEscolha a forma geométrica que deseja cálcular a área\n");
            System.out.println("1)Triângulo\n2)Trapézio\n3)Círculo\n4)Losango\nInforme o " +
                    "número que representa a forma " +
                    "geométrica que você deseja saber a área:" +
                    "\nOu aperte 0(ZERO) para sair ");
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 0-> {
                    System.out.println("Obrigado por participar...");
                    sleep(4000);
                    cont=4;
                    break;
                }
                case 1 -> {
                    System.out.println("Informe a base do triângulo:");
                    base = new Scanner(System.in).nextDouble();
                    System.out.println("Informe a altura do triângulo:");
                    alt = new Scanner(System.in).nextDouble();
                    area = base * alt;
                    System.out.println("A área do tringulo é " + area/2+("cm²"));
                    sleep(3000);
                }
                case 2 -> {
                    System.out.println("Informe a maior base do trapezio:");
                    bmaior = new Scanner(System.in).nextDouble();
                    System.out.println("Informe a menor base do trápezio:");
                    bmenor = new Scanner(System.in).nextDouble();
                    System.out.println("Informe a altura do trápezio:");
                    alt = new Scanner(System.in).nextDouble();
                    area = (bmaior + bmenor)*alt;
                    System.out.println("A área do tringulo é " + area / 2+"cm²");
                    sleep(3000);
                }
                case 3 -> {
                    System.out.println("Informe o raio do círculo:");
                    raio = new Scanner(System.in).nextDouble();
                    area = (raio*raio)*3.14;
                    System.out.println("A área é " + area+"cm²");
                    sleep(3000);
                }
                case 4 -> {
                    System.out.println("Informe uma diagonal do losango:");
                    d1 = new Scanner(System.in).nextDouble();
                    System.out.println("Informe outra diagonal do losango:");
                    d2 = new Scanner(System.in).nextDouble();
                    area = d1*d2;
                    System.out.println("A área do losango é " + area / 2+"cm²");
                    sleep(3000);
                }
                default -> {
                    System.out.println("Opção inválida");
                    cont=1;
                    sleep(3000);

                }
            }
        }
    }
}
