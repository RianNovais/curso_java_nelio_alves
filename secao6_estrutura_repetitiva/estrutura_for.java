package secao6_estrutura_repetitiva;

// 2 - Estrutura For
public class estrutura_for {
    public static void main(String[] args) {
        /*
        O for funciona da seguinte forma:

        for (inicialização; condição; incremento/decremento) {
            // Bloco de código a ser repetido
        }

        - Inicialização: executada uma única vez, no início
        - Condição: verificada antes de cada iteração
        - Incremento/decremento: executado ao final de cada iteração
        */

        // Exemplo 1: Contador simples de 1 a 5
        System.out.println("Exemplo 1: Contador de 1 a 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        // Exemplo 2: Contador regressivo
        System.out.println("\nExemplo 2: Contador regressivo de 10 a 1");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Contagem regressiva: " + i);
        }

        // Exemplo 3: Pulando números (de 2 em 2)
        System.out.println("\nExemplo 3: Números pares de 0 a 10");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Número par: " + i);
        }

        // Exemplo 4: Calculando a soma de números
        System.out.println("\nExemplo 4: Soma dos números de 1 a 10");
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
            System.out.println("Somando " + i + " ao total: " + soma);
        }
        System.out.println("Soma final: " + soma);

        // Exemplo 5: For aninhado (nested for) - tabuada
        System.out.println("\nExemplo 5: Tabuada do 1 ao 3");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nTabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        // Exemplo 6: For-each (enhanced for) - introduzido no Java 5
        System.out.println("\nExemplo 6: For-each com array");
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Manga"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // Exemplo 7: For com múltiplas variáveis
        System.out.println("\nExemplo 7: For com múltiplas variáveis");
        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // Exemplo 8: For com break
        System.out.println("\nExemplo 8: For com break");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Encontrou o número 6. Saindo do loop...");
                break;
            }
            System.out.println("Número: " + i);
        }

        // Exemplo 9: For com continue
        System.out.println("\nExemplo 9: For com continue");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Número " + i + " é par. Pulando para o próximo...");
                continue;
            }
            System.out.println("Processando número ímpar: " + i);
        }

        // Exemplo 10: For com inicialização externa
        System.out.println("\nExemplo 10: For com inicialização externa");
        int k = 1;
        for (; k <= 5; k++) {
            System.out.println("Valor de k: " + k);
        }
        System.out.println("Valor final de k após o loop: " + k);
    }
}