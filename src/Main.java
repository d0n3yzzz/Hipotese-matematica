import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("escolha um numero :");
        int c0 = scan.nextInt();
        int numeroetapas = 0;
        if (c0 != 0) {

            while (c0 != 1) {


                if (c0 % 2 == 0) {

                    c0 = c0 / 2;

                    System.out.println(c0);


                    numeroetapas++;
                }

                else {

                    c0 = 3 * c0 + 1 ;

                    System.out.println(c0);


                    numeroetapas++;

                }




        }

            System.out.println("numero de etapas : " + numeroetapas);
        }
else System.out.println("escreva um numero diferente de 0" );














    }
}