# Sistema de Cálculo de Impostos em Java

Este projeto foi desenvolvido em **Java** utilizando a IDE **IntelliJ IDEA**, com o objetivo de praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como **herança** e **polimorfismo**.

## Descrição do Projeto

O programa realiza a leitura de dados de **N contribuintes**, informados pelo usuário através do terminal. Esses contribuintes podem ser de dois tipos:

* **Pessoa Física**
* **Pessoa Jurídica**

Após a inserção das informações, o sistema calcula e exibe o **valor de imposto pago por cada contribuinte**, além de apresentar o **total de impostos arrecadados**.

## Regras de Cálculo

### Pessoa Física

Para contribuintes do tipo pessoa física, o cálculo do imposto segue as seguintes regras:

* Renda anual **abaixo de 20.000,00** → imposto de **15%**
* Renda anual **a partir de 20.000,00** → imposto de **25%**
* Caso existam **gastos com saúde**, 50% desses gastos são **descontados do imposto calculado**.

### Pessoa Jurídica

Para empresas, o cálculo do imposto funciona da seguinte forma:

* **16% de imposto** sobre a renda anual
* Caso a empresa possua **mais de 10 funcionários**, o imposto reduz para **14%**

## Conceitos de Programação Utilizados

Este projeto aplica alguns dos principais conceitos de **Programação Orientada a Objetos**:

**Herança:**
Foi criada uma classe base chamada `User`, que representa um contribuinte genérico. As classes `UserIndividual` (Pessoa Física) e `UserCompany` (Pessoa Jurídica) herdam suas características.

**Polimorfismo:**
Cada tipo de contribuinte possui sua própria implementação do método `tax()`, responsável por calcular o imposto de acordo com as regras específicas de cada tipo.

**Coleções (List):**
Foi utilizada uma `List<User>` para armazenar diferentes tipos de contribuintes na mesma estrutura de dados.

## Tecnologias Utilizadas

* **Java**
* **IntelliJ IDEA**
* **Programação Orientada a Objetos (POO)**

## Objetivo do Projeto

O principal objetivo deste projeto é demonstrar na prática a aplicação de **herança, polimorfismo e organização de código em Java**, simulando um pequeno sistema de cálculo de impostos.

---

Projeto desenvolvido para fins de **aprendizado em Java e Programação Orientada a Objetos**.
