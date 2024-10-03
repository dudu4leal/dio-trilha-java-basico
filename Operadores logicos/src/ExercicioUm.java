import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero do mes: ");
        int numeroMes = scanner.nextInt();

        if(numeroMes==1){
            System.out.println("Janeiro");
            System.out.println("Eba! Voce esta de ferias!");
        }else if(numeroMes==2){
            System.out.println("Fevereiro");
        }else if(numeroMes==3){
            System.out.println("Marco");
        }else if(numeroMes==4){
            System.out.println("Abril");
        }else if(numeroMes==5){
            System.out.println("Maio");
        }else if(numeroMes==6){
            System.out.println("Junho");
        }else if(numeroMes==7){
            System.out.println("Julho");
            System.out.println("Eba! Voce esta de ferias!");
        }else if(numeroMes==8){
            System.out.println("Agosto");
        }else if(numeroMes==9){
            System.out.println("Setembro");
        }else if(numeroMes==10){
            System.out.println("Outubro");
        }else if(numeroMes==11){
            System.out.println("Novembro");
        }else if(numeroMes==12){
            System.out.println("Dezembro");
            System.out.println("Eba! Voce esta de ferias!");
        }else{
            System.out.println("Mes invalido");
        }
        

    }
}
