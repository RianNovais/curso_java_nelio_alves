package secao4_estrutura_sequencial;

// 2 - Variáveis e Tipos Básicos em Java

/*

Variáveis são basicamente porções de memória no nosso código, em que podemos armazenar itens, ela é fundamental
para o funcionamento de qualquer código.

essas variáveis podem armazenar diversos tipos de dados, que é o que chamamos de "tipos"

a sintaxe de declaração de variáveis no Java é <tipo> <nome> = <valor_inicial>, sendo que o valor inicial é opcional
    Ex:
        int idade = 24;
        int idade;

        int é o tipo, idade é o nome e 24 é o valor inicial.

        !! A variável deve ser declarada antes de ser utilizada, e ela só vai aceitar dados do tipo especificado

 */
public class variaveis {
    public static void main(String[] args) {
        //Definindo variáveis

        int idade_com_valor_inicial = 25; // int, byte, long, short = numeros inteiros
        int idade_sem_valor_inicial;

        String nome = "Rian"; // String = caracteres
        char sexo = 'M'; // Char = apenas 1 caracter

        double altura = 1.68; // double, float = numeros de ponto flutuante

        boolean is_sexy = true; // boolean = valores da tabela verdade, true ou false.

    }

}
