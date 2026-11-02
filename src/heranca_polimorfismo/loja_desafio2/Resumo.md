# Herança e Polimorfismo em Java

## 1. Herança (`extends`)
Permite que uma classe filha herde atributos e métodos de uma classe pai, evitando repetição de código.

```java
public class UsedProduct extends Product {
}
```

- `extends`: estabelece a relação de herança.
- `super()`: chama o construtor da classe pai.
- Atributos `private` não são acessados diretamente pela classe filha; podemos utilizar getters e setters.

## 2. Sobrescrita (`@Override`)
Acontece quando uma classe filha fornece sua própria implementação de um método herdado.

```java
@Override
public String priceTag() {
    // Implementação específica
}
```

Se a classe filha não sobrescrever o método, poderá utilizar a implementação herdada da classe pai.

## 3. Polimorfismo
Permite tratar objetos de diferentes subclasses por meio de uma referência de um tipo comum.

```java
List<Product> products = new ArrayList<>();

products.add(new Product(...));
products.add(new UsedProduct(...));
products.add(new ImportedProduct(...));
```

Ao chamar um método sobrescrito, o Java executa a implementação correspondente à classe real do objeto.

## 4. Tipo da referência e tipo do objeto

```java
Product product = new UsedProduct();
```

- **Tipo da referência:** `Product`. Determina quais métodos podem ser chamados.
- **Tipo real do objeto:** `UsedProduct`. Determina qual implementação de um método sobrescrito será executada.

## 5. Outros recursos utilizados

- `String.format()`: formata textos e valores. `%s` representa texto, `%d` inteiro e `%.2f` decimal com duas casas.
- `+`: soma números ou concatena textos.
- `,`: separa argumentos em chamadas de métodos.
- `LocalDate`: representa uma data sem horário.
- `DateTimeFormatter`: define o padrão de leitura e exibição de datas.
- `Scanner`: recebe dados digitados pelo usuário. Ao misturar `nextDouble()` ou `nextInt()` com `nextLine()`, pode ser necessário consumir a quebra de linha pendente.

## 6. Ideia principal

A herança permite reutilizar características e comportamentos. A sobrescrita permite especializar métodos nas classes filhas. O polimorfismo permite trabalhar com diferentes tipos de objetos por meio de um tipo comum, mantendo seus comportamentos específicos.