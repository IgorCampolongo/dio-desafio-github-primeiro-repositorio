package ExerciciosAula8TrabalhandoComDatas;

import java.time.LocalDateTime;

public class Exercicio8_5 {

    /*          Exercicio LocalDateTime
    Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00


     */

    public static void main(String[] args) {
        LocalDateTime dataDefinida = LocalDateTime.of(2010,05,15,10,00,00);

        System.out.println(dataDefinida);


        LocalDateTime dataModificada = dataDefinida.plusHours(13).plusMonths(6).plusYears(4); // aqui é adicionado os anos, meses e horas que é pedido no exercicio

        System.out.println(dataModificada);

    }
}
