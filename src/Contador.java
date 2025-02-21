package com.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Apresentação inicial
        System.out.println("🎉 Bem-vindo ao Contador Divertido! 🎉");
        System.out.println("Hoje vamos brincar de contagem, vamos lá?");

        // Solicitar o primeiro parâmetro
        System.out.println("👉 Por favor, digite o primeiro número:");
        int parametroUm = terminal.nextInt();

        // Solicitar o segundo parâmetro
        System.out.println("👉 Agora, digite o segundo número:");
        int parametroDois = terminal.nextInt();

        try {
            // Chamar o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Mensagem de erro personalizada
            System.out.println("❗ Ops! " + exception.getMessage() + " Tente novamente.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é MAIOR que o segundo e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        // Realizar a contagem correta
        System.out.println("🔢 Vamos contar de " + parametroUm + " até " + parametroDois + "! Preparado?");
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("🎈 Imprimindo o número " + i + " 🎈");
        }
        System.out.println("✨ Contagem concluída com sucesso! Obrigado por participar! ✨");
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
