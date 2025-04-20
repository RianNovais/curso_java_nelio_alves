package secao4_estrutura_sequencial;

//4 - Processamento de Dados

public class processamento_de_dados_casting {
    public static void main(String[] args) {
        /* O Processamento de Dados no Java é descrito pela função de termos operações acontecendo e sendo armazenadas
        em variáveis.

        O operador de "=" no Java significa atribuição, ou seja, algo recebe outro.

        <variável> = <expressão>; - o "=" lê se “recebe”

        */

        int a = 10;
        int b = 20;
        int c;

        //Processamento de Dados, a variável C vai receber o valor da operação a + b

        c = a + b;

        System.out.println(c);

        /*Temos também o conceito de Casting que é transformar um tipo de dado em outro, desde que sejam compatíveis.

        -> Imagine que temos um valor double e queremos transformar ele em um inteiro, você supõe que ele vai perder a parte
        flutuante né, e manter somente a parte inteira, se fizermos isso normal atribuindo uma variavel a outra, não vai funcionar

        */

        double d = 1.78;

        //int numeroInteiro = d; <- vai dar erro, pois o java nao faz o casting automaticamente
        //pra isso temos que converter antes

        int numeroInteiro = (int) d; //o fluxo é, ele primeiro converte o D pra inteiro e depois passa pra variavel.




    }
}
