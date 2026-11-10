# LP2 — Programação Orientada a Objetos

Projeto desenvolvido para a disciplina **Linguagem de Programação II (LP2)**, com o objetivo de praticar os conceitos de Programação Orientada a Objetos utilizando Java.

##  Estrutura do Projeto

O projeto será único, com os exercícios organizados em pacotes separados:

```text
src/main/java/
└── edu/fatec/lp2/
    ├── exercicio1/
    └── exercicio2/
```

##  Exercício 1 — Contatos e Mensagens

**Pacote:** `edu.fatec.lp2.exercicio1`

Implementação das classes e abstrações conforme o diagrama UML, respeitando os seguintes requisitos:

- Todos os atributos devem ser privados.
- Contatos e mensagens devem utilizar arrays, sem `ArrayList`.
- Os arrays devem ser inicializados pelos construtores.
- A classe abstrata `Mensagem` deve possuir o método `sendMessage(String)`.
- O método deve retornar sua própria instância (`this`).

##  Exercício 2 — Sistema de Compras

**Pacote:** `edu.fatec.lp2.exercicio2`

Implementação de um sistema simplificado de supermercado, contemplando:

- Representação do supermercado e dos produtos.
- Cadastro de itens de compra com quantidade e desconto.
- Associação de apenas um produto por item.
- Cálculo individual do preço de cada item.
- Lista de compras com limite máximo de itens.
- Adição de itens respeitando o limite estabelecido.
- Cálculo do valor total da compra.
- Interface comum para `Item de Compra` e `Lista de Compras`.
- Implementação de getters e setters em todas as classes, utilizando Lombok ou a IDE.

##  Tecnologias

- Java
- Programação Orientada a Objetos
- IntelliJ IDEA
- Git e GitHub
- Lombok (opcional)
