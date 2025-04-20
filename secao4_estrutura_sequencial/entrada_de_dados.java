package secao4_estrutura_sequencial;

//Importação ESSENCIAL da classe Scanner
import java.util.Scanner;

//5 - Entrada de Dados

/*
Entrada de Dados corresponde ao usuário inserir dados no nosso código por meio do teclado.
ex: o usuário quer inserir o nome dele e esse nome ir para uma variável.

para isso veremos a entrada de dados utilizando a classe Scanner no java.

 */
public class entrada_de_dados {
    public static void main(String[] args){
        //Instanciaremos um objeto do tipo Scanner, e com esse objeto poderemos pegar as entradas do usuário
        Scanner sc = new Scanner(System.in); // Um objeto do tipo Scanner com o nome sc (pode ser qualquer nome)

        //Agora com esse objeto podemos pegar as entradas do usuário por meio de varios metodos

        String nome;
        int idade;
        double altura;
        char sexo;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine(); //Fica esperando o usuario inserir uma entrada via terminal, pega o valor e coloca na variavel nome
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt(); //Fica esperando o usuario inserir uma entrada via terminal, pega o valor e coloca na variavel idade
        System.out.println("Digite seu altura: ");
        altura = sc.nextDouble(); //Fica esperando o usuario inserir uma entrada via terminal, pega o valor e coloca na variavel altura
        System.out.println("Digite seu sexo: ");
        sexo = sc.next().charAt(0); //Fica esperando o usuario inserir uma entrada via terminal, pega o valor e coloca na variavel sexo

        System.out.printf("Olá %s, você possui a idade %d e a altura %.2f metros com o sexo %c", nome, idade, altura, sexo);


        /*Como você pode ver existe varios metodos para capturar os dados, cada um pra um determinado tipo de valor
        se passarmos um valor errado pra um nextInt por exemplo, ele vai lançar um erro.
        */
    }
}
