package secao5_estrutura_condicional;
import java.util.Scanner;

// 3 - Estrutura Condicional

/*
A estrutura condicional é uma das coisas mais importantes da lógica de programação, ela permite que o nosso código
não funcione apenas de forma sequencial, mas entre em blocos especificos de comandos de acordo com condições

a lógica funciona usando o "SE (IF) " e o "SENÃO (ELSE) assim ramificando nosso código:

a síntaxe de uma condição simples no java é:
    if ( <condição> ) {
        <comando1>
        <comando2>
    }

e uma condição composta é:
   if ( <condição> ) {
        <comando1>
        <comando2>
    } else {
        <comando3>
    }

e também temos como ter multiplas condições com o else if (SENÃO SE)
    if ( <condição> ) {
        <comando1>
        <comando2>
    } else if ( <condição2> ) {
        <comando3>
    } else {
        <comando4>
    }

a lógica funciona verificando as condições e caso seja verdadeira ela executa o bloco de comandos relacionado.
e quando nao cai, sempre cai no else, ou entao no else if para ser verificada outra condição.


 */

public class estrutura_condicional {
    public static void main(String[] args) {
        //Exemplo de um código que de acordo com o horário do dia, ele dá bom dia, boa tarde ou boa noite, com estrutura condicional

        int hora;

        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();

        /*
        A lógica aqui é a seguinte, ele verifica se a hora < 12, se a condição for verdadeira ele mostra bom dia, e sai
        da condicional, agora caso seja falsa, ele cai no else if, que vai verificar outra condição, e verificar se a
        hora<18, ai mostrando o boa tarde, e caso essa condição ainda não seja verdadeira, ele cai no ELSE mostrando o boa noite
        o else significa que nenhuma das condições acima foi satisfeita.

         */

        if (hora < 12){
            System.out.printf("Bom dia, agora são %d horas\n", hora);
        } else if (hora < 18){
            System.out.printf("Boa tarde, agora são %d horas\n", hora);
        } else {
            System.out.printf("Boa noite, agora são %d horas\n", hora);
        }

        // Vale salientar que podemos ter um if sem else.

        String nome = "Rian";

        //Equals é um jeito similar ao == para verificarmos igualdade em strings
        if (nome.equals("Rian")){
            System.out.println("Condição simples, o nome é Rian");
        }




    }
}
