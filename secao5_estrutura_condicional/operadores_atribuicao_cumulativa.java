package secao5_estrutura_condicional;
import java.util.Scanner;

// 4 - Operadores de Atribuição Cumulativa
public class operadores_atribuicao_cumulativa {
    public static void main(String[] args) {
        /*
        No Java temos alguns operadores de atribuição cumulativa que nos ajudam a acumular valores em uma variavel
        imagine que temos o valor X e o X tem que ir sendo aumentado de acordo com as entradas do usuario
        usualmente usariamos um X = X+ENTRADA

        mas pra isso temos os operadores de atribuição cumulativa, que traz uma sintaxe simplificada disso.

        X+=Y -> X = X+Y
        X-=Y -> X = X-Y
        X*=Y -> X = X*Y
        X/=Y -> X = X/Y
        */

        Scanner sc = new Scanner(System.in);
        int variavel_acumuladora = 0;

        //A Cada valor inserido pelo usuario, é acrescentado na variavel com operadores de atribuição cumulativa

        System.out.println("Valor 1: ");
        // Equivalente a um variavel_acumuladora = variavel_acumuladora + sc.nextInt();
        variavel_acumuladora += sc.nextInt();

        System.out.println("Valor 2: ");
        variavel_acumuladora += sc.nextInt();

        System.out.println("Valor 3: ");
        variavel_acumuladora += sc.nextInt();

        // A Variavel vai sendo acumulada
        System.out.println(variavel_acumuladora);
    }
}
