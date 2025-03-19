# Projeto de Abstração em POO

Este é um projeto simples para praticar conceitos de Programação Orientada a Objetos (POO) em Java, focado na abstração de um serviço de empréstimo. O objetivo é aprender como estruturar classes, aplicar boas práticas de encapsulamento e trabalhar com pacotes.

## Tecnologias Utilizadas

- **Java**
- **IntelliJ IDEA** (ou qualquer outra IDE de preferência)

## Estrutura do Projeto

```
Abstracao-POO/
├── src/
│   ├── service/
│   │   ├── EmprestimoService.java
│   ├── Main.java
├── README.md
```

## Como Executar o Projeto

1. Clone ou baixe este repositório.
2. Abra o projeto em sua IDE.
3. Certifique-se de que os arquivos estão organizados corretamente, com a classe `EmprestimoService` dentro do pacote `service`.
4. Compile e execute `Main.java`.

## Possíveis Erros e Soluções

### Erro: `package service does not exist`

**Solução:** Verifique se a classe `EmprestimoService` está realmente dentro do pacote `service`. Se não estiver, mova o arquivo para a pasta correta e adicione `package service;` no início do código.

### Erro: `cannot find symbol class EmprestimoService`

**Solução:** No `Main.java`, importe corretamente a classe com `import service.EmprestimoService;` antes de usá-la.

## Objetivo do Projeto

Este projeto foi desenvolvido como parte de um estudo universitário sobre abstração em POO. O foco é entender como estruturar um sistema simples e aplicar boas práticas de programação.



