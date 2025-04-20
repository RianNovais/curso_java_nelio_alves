package secao4_estrutura_sequencial;

// 3 - Saída de Dados em Java

/*
Saída de Dados é basicamente mostrarmos ao usuário algo que queremos, seja um valor fixo, ou uma variável.

a saída de dados para mostrar os dados ao usuário no terminal, ocorre por meio dos comandos de print, e dentre eles
existem 3 tipos.

System.out.print() <- recebe uma string ou variavel como parametro e exibe na tela
System.out.println() <- recebe uma string ou variavel como parametro e exibe na tela pulando uma linha no final
System.out.printf() <- aqui nós conseguimos colocar máscaras de formatação.

 */
public class saida_de_dados {
    public static void main(String[] args){
        String nome = "Rian Novais";
        int idade = 25;
        double altura = 1.68;
        char sexo = 'M';


        //Agora veremos como mostrar na tela esses diversos tipos de dados.

        //Print Normal, passando uma variavel

        System.out.println(nome);

        //Podemos concatenar um texto que quisermos com o valor da variável usando o "+"

        System.out.println("Seu nome é " + nome + " Bem vindo"); // Com o + juntando a variável ao texto

        /*Podemos concatenar usando o printf, que é a maneira mais inteligente.

        Onde no printf ele recebe dois parametros, primeiro é a nossa formatação de acordo com as máscaras que queremos
        e depois as variáveis em ordem, ele vai realocar e colocar os valores das variáveis onde queremos
        isso é muito util pra prints grandes. Ele deixa mais organizado

        Máscaras padrão:
        %f - ponto flutuante
        %d - inteiro
        %s - texto
        %n- quebra de linha

        temos também o .2f para por exemplo, arredondar pra 2 casas decimais, temos o \n para pular linha, simulando um println, etc.

        para lembrar isso temos alguns macetes
        "Formatar Dados Simples Na linha" → %f, %d, %s, %n

        Flutuante - %f (F de Flutuante)
        Dígito/inteiro - %d (D de Dígito)
        String/texto - %s (S de String)
        New line/quebra de linha - %n (N de New line)

        */

        //Substituiu nas máscaras os valores das variáveis
        System.out.printf("Olá %s você possui %d anos e %.2f de altura%n", nome, idade, altura);

        //Como vimos tem como arrendondarmos casas decimais também.

        //Sendo o %f a máscara de flutuante e o .2 a máscara para cortar pra dois, e o %n no final pra pular linha

        System.out.printf("%.2f%n", altura);





    }
}
