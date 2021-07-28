package ExerciciosAula8TrabalhandoComDatas;


import java.util.Calendar;
import java.util.Scanner;


public class Exercicio8_3 {

    /* Um cliente tem 10 dias para pagar uma fatura após sua data
    de vencimento sem que os juros sejam cobrados.
    Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
    Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar

     */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia;


        Calendar dataVencimento = Calendar.getInstance();
        System.out.println(dataVencimento);
        System.out.println("Digite a data de vencimento:");
        dia = ler.nextInt();
        dataVencimento.set(dataVencimento.get(Calendar.YEAR), dataVencimento.get(Calendar.MONTH), dia);
        dataVencimento.add(dataVencimento.DATE, 10);
        if(dataVencimento.get(Calendar.DAY_OF_WEEK) == 7 ) {// se for igual a 7 = sabado - adicionar 2 dias de prazo pra cair na segunda
            dataVencimento.add(dataVencimento.DATE, 2);
            System.out.printf("Data limite para pagamento sem acrescentar juros: %tc", dataVencimento);

        }else if(dataVencimento.get(Calendar.DAY_OF_WEEK) == 1 ){// se for igual a 1 = Domingo - adicionar 2 dias de prazo pra cair na segunda
            dataVencimento.add(dataVencimento.DATE, 1);
            System.out.printf("Data limite para pagamento sem acrescentar juros: %tc", dataVencimento);
        } else { // se Cair em dia util, mostra apenas a data com 10 dias de acrescimo
            System.out.printf("Data limite para pagamento sem acrescentar juros: %tc", dataVencimento);
        }










    }
}
