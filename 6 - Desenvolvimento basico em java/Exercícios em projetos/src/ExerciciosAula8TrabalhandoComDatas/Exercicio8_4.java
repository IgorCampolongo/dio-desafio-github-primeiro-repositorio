package ExerciciosAula8TrabalhandoComDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio8_4 {

    /*
                        Exercicio classe SimpleDateFormat
    Converta a Data atual no formado DD/MM/YYY HH:MM:SS:MMM

     */

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");

        String dataFormatada = formatador.format(agora);

        System.out.println(dataFormatada);

        /* o exercicio, mostra o formato com letras maiusculas erradas de propósito, para que
        seja feita de forma obrigatória uma visita a documentação:


        https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html

            Letter	Date or Time Component	Presentation	Examples
            G	Era designator	Text	AD
            y	Year	Year	1996; 96
            Y	Week year	Year	2009; 09
            M	Month in year (context sensitive)	Month	July; Jul; 07
            L	Month in year (standalone form)	Month	July; Jul; 07
            w	Week in year	Number	27
            W	Week in month	Number	2
            D	Day in year	Number	189
            d	Day in month	Number	10
            F	Day of week in month	Number	2
            E	Day name in week	Text	Tuesday; Tue
            u	Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
            a	Am/pm marker	Text	PM
            H	Hour in day (0-23)	Number	0
            k	Hour in day (1-24)	Number	24
            K	Hour in am/pm (0-11)	Number	0
            h	Hour in am/pm (1-12)	Number	12
            m	Minute in hour	Number	30
            s	Second in minute	Number	55
            S	Millisecond	Number	978
            z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
            Z	Time zone	RFC 822 time zone	-0800
            X	Time zone	ISO 8601 time zone	-08; -0800; -08:00


         */

    }
}
