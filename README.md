# 🚀 Desafio Controle de Fluxo

Bem-vindo ao **Desafio Controle de Fluxo**! Este projeto foi desenvolvido como parte do módulo de Controle de Fluxo da [DIO](https://www.dio.me). O objetivo é praticar condicionais, loops e exceções em Java de uma forma divertida e envolvente. 🌟

## 📖 Sobre o Projeto

O sistema recebe dois parâmetros via terminal que representam dois números inteiros. Com estes dois números, o programa imprime os números incrementados entre eles. Se o primeiro parâmetro for maior que o segundo, uma exceção customizada chamada `ParametrosInvalidosException` é lançada.

### 🧩 Funcionalidades

- **Entrada de Dados**: Recebe dois parâmetros via terminal.
- **Validação**: Verifica se o primeiro parâmetro é maior que o segundo e lança exceção.
- **Contagem**: Imprime os números incrementados entre os parâmetros fornecidos.
- **Personalização**: Mensagens interativas e emojis para uma experiência divertida.

### 🛠️ Tecnologias Utilizadas

- Java 8 ou superior
- IDE (Codespaces do Git Hub)

## 📂 Estrutura do Projeto

O projeto está organizado da seguinte maneira:

    DesafioControleFluxo
    
        src
        
            Contador.java
            
                ParametrosInvalidosException.java
                
                    README.md


### 📄 Contador.java

A classe `Contador` é a principal do projeto e contém o método `main` que inicia a execução do programa. Aqui está o código com explicações detalhadas:

```java
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

    /**
     * Método que realiza a contagem dos números entre os dois parâmetros fornecidos.
     * Lança uma exceção se o primeiro parâmetro for maior que o segundo.
     *
     * @param parametroUm   O primeiro número fornecido pelo usuário.
     * @param parametroDois O segundo número fornecido pelo usuário.
     * @throws ParametrosInvalidosException Se o primeiro parâmetro for maior que o segundo.
     */
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
```


## Explicação do Contador.java

1. Importação da Classe Scanner: Necessária para ler a entrada do usuário pelo terminal.

2. Método main: Método principal que inicia a execução do programa.

3. Apresentação Inicial: Mensagens de boas-vindas e explicação sobre o programa.

4. Solicitação de Parâmetros: Solicita ao usuário dois números inteiros via terminal.

5. Tratamento de Exceção: Tenta chamar o método contar e trata a exceção ParametrosInvalidosException caso seja lançada.

6. Método contar: Realiza a contagem entre os dois parâmetros fornecidos.

7. Validação: Verifica se o primeiro parâmetro é maior que o segundo e lança a exceção ParametrosInvalidosException se necessário.

8. Loop for: Imprime os números incrementados entre os dois parâmetros.

## 📄 ParametrosInvalidosException.java
A classe ParametrosInvalidosException é uma exceção customizada que estende a classe Exception. Aqui está o código com explicações detalhadas:

```java
package com.desafiocontrolefluxo;

public class ParametrosInvalidosException extends Exception {
    /**
     * Construtor da exceção customizada que recebe uma mensagem.
     *
     * @param mensagem A mensagem de erro que será exibida quando a exceção for lançada.
     */
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
```


## 👨‍💻 Como Contribuir
Fique à vontade para contribuir com melhorias, sugestões ou correções. Siga os passos abaixo para contribuir:

1. Faça um fork deste repositório.

2. Crie um branch para sua feature (git checkout -b feature/nova-feature).

3. Commit suas alterações (git commit -m 'Adiciona nova feature').

4. Faça um push para o branch (git push origin feature/nova-feature).

5. Abra um Pull Request.