package ExerciciosAula8TrabalhandoComDatas;


import java.util.Date;
import java.util.Scanner;


public class Exercicio8_2 {

    /* Esse exercício consiste em alcançar os 3 seguintes objetivos:
     1: descobrir o timeInMillis da data de nascimento
     2: converter em um objeto Date
     3: verificar se a data é anterior ou posterior a 15 de maio de 2010
     */


    public static void main(String[] args) {

        int ano ;
        int mes ;
        int dia ;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o dia em que nasceu 'dd':");
        dia = ler.nextInt();// recebe o valor dia
        System.out.println("\nDigite o mes em que nasceu 'mm':");
        mes = ler.nextInt()-1; // por ser de 0 a 11 os meses, subtrai 1 para que corresponda o mes com a numeração convencional
        System.out.println("\nDigite o mes em que nasceu 'yyyy':");
        ano = ler.nextInt()-1900; //subtrai o ano que é adicionado automaticamente pela classe


    Date dataNascimento = new Date(ano, mes, dia);// passando as variaveis com o ano, mes e dia, tem se o objeto convertido em Date (objetivo 2)
    long timeInMillis =dataNascimento.getTime();// com o objeto Date da data de nascimento, obtemos o timeInMillis (objetivo 1 )
    Date confere = new Date (dataNascimento.getTime());

    System.out.println("o TimeInMillis da data " + dia +"/" + (mes+1) + "/" + (ano+1900) + " é:" + timeInMillis);
    /*Abaixo tem o teste de comparação, mostrando se a data de nascimento é posterior, anterior ou igual a data de comparação pré definida (objetivo 3 */
    Date dataCompara = new Date (110, 04,15);
    if(dataNascimento.after(dataCompara)){
        System.out.println("A data de nascimento é posterior a data: 15/05/2010");
    } else if (dataNascimento.equals(dataCompara)){
        System.out.println("A data de nascimento é igual a data: 15/05/2010") ;

    } else {
        System.out.println("A data de nascimento é anterior a data: 15/05/2010");

    }

    }
}
