package secao5_estrutura_condicional;
import java.util.Scanner;

// 5 - Estrutura Switch-Case
/*

A estrutura switch case serve para ser uma outra possibilidade ao invés de usarmos diversos if e else encadeados.

->É bom utilizar quando estamos comparando uma unica variavel com varios valores constantes. Mas nem sempre é a melhor
alternativa

 */

public class switch_case {
    public static void main(String[] args) {
        // Imagine que queremos um codigo que o usuario insira o numero do dia, e seja retornado o nome do dia
        // é bem mais válido usarmos o switch case do que o if else

        int numero_dia;
        String nome_dia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número do dia: ");
        numero_dia = sc.nextInt();

        //A Sintaxe é switch (variavel){}
        //E temos os cases caso a variavel caia em algum desses valores ele faz algo e da um break obrigatorio
        //e tem o default que é quando a variavel nao se encaixou em nenhum dos casos.


        switch (numero_dia){
            case 1:
                nome_dia = "Domingo";
                System.out.println(nome_dia);
                break;
            case 2:
                nome_dia = "Segunda";
                System.out.println(nome_dia);
                break;
            case 3:
                nome_dia = "Segunda";
                System.out.println(nome_dia);
                break;
            case 4:
                nome_dia = "Segunda";
                System.out.println(nome_dia);
                break;
            case 5:
                nome_dia = "Segunda";
                System.out.println(nome_dia);
                break;
            default:
                nome_dia = "Não Definido";
                System.out.println(nome_dia);
            }



        //Tem também a nova sintaxe do case

        //Desde o Java 12, existe também o switch expressions com sintaxe mais moderna:
        //java// Com lambda (Java 12+)
        String resultado = switch (numero_dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };
    }
}
