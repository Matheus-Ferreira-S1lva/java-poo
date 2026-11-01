# POO — Herança, Casting e Polimorfismo

### 1. Upcasting

É quando uma referência de uma classe filha é armazenada em uma variável do tipo da classe pai.

```
Account acc = new BusinessAccount(...);
```

- É uma conversão implícita.
- Permite tratar objetos de classes diferentes como objetos da classe pai.
- Não perde as características do objeto original.

### 2. Downcasting

É quando convertemos uma referência do tipo pai para o tipo de uma classe filha.

```
BusinessAccount acc = (BusinessAccount) acc2;
```

- É uma conversão explícita.
- Permite acessar métodos específicos da classe filha, como `loan()`.
- Só funciona se o objeto realmente for compatível com o tipo convertido.

### 3. instanceof

É utilizado para verificar se um objeto pertence a determinado tipo antes de realizar um downcasting.

```
if (acc3 instanceof SavingsAccount) {
    SavingsAccount acc = (SavingsAccount) acc3;
}
```

Retorna `true` se o objeto for compatível com o tipo verificado e `false` caso contrário.

### 4. Sobreposição (Override)

Acontece quando uma classe filha redefine um método herdado da classe pai, oferecendo um comportamento próprio.

```
@Override
public void withdraw(double amount) {
    // Nova implementação
}
```

- `@Override`: indica que o método está sendo sobrescrito.
- Permite que classes filhas tenham comportamentos diferentes para um mesmo método.

### 5. Palavra super

É utilizada para acessar membros da classe pai, inclusive chamar uma implementação original de um método sobrescrito.

```
super.withdraw(amount);
```

Executa a implementação de `withdraw()` existente na classe pai.

### 6. Polimorfismo

Permite que uma referência do tipo da classe pai aponte para objetos de classes filhas, executando o comportamento correspondente ao objeto real.

```
Account x = new Account(...);
Account y = new SavingsAccount(...);

x.withdraw(50.0);
y.withdraw(50.0);
```

Embora as duas referências sejam do tipo `Account`, cada objeto pode executar uma implementação diferente de `withdraw()`.

## Diferenças importantes

| Conceito     | Ideia principal                         |
| ------------ | --------------------------------------- |
| Upcasting    | Filho → Pai                             |
| Downcasting  | Pai → Filho                             |
| `instanceof` | Verifica o tipo do objeto               |
| `@Override`  | Sobrescreve um método                   |
| `super`      | Acessa a implementação da classe pai    |
| Polimorfismo | Mesmo método, comportamentos diferentes |
