package secao6_estrutura_repetitiva;
import java.util.Scanner;

//1 - Estrutura While
public class estrutura_while {
    public static void main(String[] args) {
        /*
        A estrutura while ela é uma repetição, ou seja. Teremos uma condição, e o codigo sempre vai cair no bloco
        de execução, ENQUANTO a condição não for verdadeira, ou seja, o codigo é um loop até a condição for verdadeira.
        podemos quebrar a execução antes com o break.

        a sintaxe é:

        while ( <condição> ) {
            <comandos>
        }
         */

        //Imagine um codigo que vai ler varios numeros e ao final somar eles, a condição de parada vai ser quando o
        //digitar zero.

        int soma = 0;
        int numero_informado;

        Scanner sc = new Scanner(System.in);

        numero_informado = sc.nextInt();

        // Enquanto o numero informado for diferente de 0 ele vai ir acrescentando o numero a variavel soma
        // e vai pedir um novo numero pro usuario. Quando for 0 ele sai do loop e mostra a soma.
        while (numero_informado != 0) {
            soma += numero_informado;
            numero_informado = sc.nextInt();
        }
        System.out.printf("A soma é %d", soma);
    }
}
