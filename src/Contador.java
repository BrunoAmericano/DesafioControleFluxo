import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Bem-vindo ao Contador Divertido!");
        System.out.println("Por favor, digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Agora, digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Ops! " + exception.getMessage());
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
        
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        System.out.println("Preparando para contar de " + parametroUm + " até " + parametroDois + "...");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("🎉 Imprimindo o número " + i + " 🎉");
        }
        System.out.println("Contagem concluída com sucesso!");
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
