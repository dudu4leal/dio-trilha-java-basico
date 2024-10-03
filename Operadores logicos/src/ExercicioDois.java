import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int variavelInteira;
        System.out.print("Digite o dia da semana: ");
        String diaSemana = scanner.nextLine();
        //System.out.println(diaSemana);

        switch (diaSemana) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terca":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":    
                System.out.println(1);
                break;
            default:
                System.out.println("dia inexistente");
                break;
        }
        
        System.out.print("Digite um numero: ");
        variavelInteira = scanner.nextInt();

        switch (variavelInteira) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }




    }
}
