# Tela de Login TDD

Este projeto implementa uma tela de login simples com funcionalidades básicas de autenticação e adição de usuários. Ele também inclui uma suíte de testes para garantir que as funcionalidades estejam funcionando conforme esperado.

## Descrição

A classe `TelaLogin` fornece métodos para autenticar usuários e adicionar novos usuários a um banco de dados simulado. O banco de dados de usuários é representado por um `HashMap`, onde as chaves são os nomes de usuário e os valores são as senhas.

## Funcionalidades

- **Autenticação de Usuário**: Verifica se um par de nome de usuário e senha é válido.
- **Adição de Usuário**: Permite adicionar novos usuários ao banco de dados de usuários.

## Estrutura do Projeto

O projeto é estruturado da seguinte forma:

- **TelaLogin.java**: Implementação da classe principal com métodos de login e adição de usuários.
- **LoginScreenTest.java**: Classe de teste para validar as funcionalidades da classe `TelaLogin`.

## Como Executar

### Requisitos

- JDK 8 ou superior
- Apache NetBeans (ou outra IDE de sua preferência)
- JUnit 4.13.2
- Hamcrest 1.3

### Passos

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto na sua IDE.
3. Verifique se as bibliotecas JUnit e Hamcrest estão corretamente adicionadas ao projeto.
4. Execute os testes para verificar se todas as funcionalidades estão funcionando conforme esperado.

### Executar Testes no NetBeans

1. Clique com o botão direito no seu projeto e selecione `Test`.
2. Ou clique com o botão direito na classe de teste (`LoginScreenTest.java`) e selecione `Run File`.

## Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão, sinta-se à vontade para abrir uma issue ou enviar um pull request.



