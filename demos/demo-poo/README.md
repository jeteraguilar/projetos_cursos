# Conceitos de Programação Orientada a Objetos

---

## Abstração
É o processo de simplificar um sistema ao destacar apenas os aspectos essenciais de um
objeto, ocultando detalhes complexos de implementação para focar no que é relevante para o uso desse objeto.

### Benefícios
- Reduz a complexidade ao permitir que o desenvolvedor trabalhe com conceitos de alto nível, sem se preocupar 
 com detalhes internos.
- Isso facilita a manutenção, o entendimento do código e a reutilização de componentes.
- Permite mudanças na implementação sem impactar outras partes do sistema.

---

## Encapsulamento
Os atributos são `private` e a forma de obter ou definir esses atributos é feita apenas 
através de métodos públicos `get` e `set` criados na mesma classe.

### Benefícios
- Protege os dados.
- Facilita a manutenção.
- Permite alterações internas sem afetar o código que utiliza a classe.

---

## Herança
Permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse).

### Benefícios
- Reutilização de código.
- Organização.
- Facilidade de manutenção.
- Extensibilidade.

---

## Polimorfismo
É a capacidade de um objeto assumir diferentes formas, dependendo do contexto em que é utilizado.

### Benefícios
- Flexibilidade ao tratar diferentes tipos de objetos de maneira uniforme.
- Reutilização de métodos em diferentes contextos.
- Extensibilidade, pois novas classes podem ser adicionadas sem alterar o código existente.



## Modificadores de Acesso

### 1. `public`
- **Acesso**: Visível em qualquer lugar, ou seja, acessível de qualquer classe, seja no mesmo 
- pacote ou em outros pacotes.
- **Usado em**: Classes, métodos e atributos que precisam ser acessíveis em toda a aplicação.
- **Exemplo**:
  ```java
  public class MinhaClasse {
    public int numeroPublico; // Acessível de qualquer classe
  }

### 2. `private`
- **Acesso**: Visível apenas dentro da própria classe. Não pode ser acessado por classes externas, 
- nem mesmo por subclasses.
- **Usado em**: Atributos e métodos que devem ser encapsulados e acessíveis apenas pela própria classe.
- **Exemplo**:
  ```java
  public class MinhaClasse {
    private int numeroPrivado; // Acessível apenas dentro de MinhaClasse
  }

### 3. `protected`
- **Acesso**: Visível dentro do mesmo pacote e também para subclasses (mesmo que estejam em pacotes diferentes).
- **Usado em**: Atributos e métodos que precisam ser acessados por subclasses, mas não devem ser totalmente públicos.
- **Exemplo**:
  ```java
  public class MinhaClasse {
    protected int numeroProtegido; // Acessível por classes do mesmo pacote e subclasses
  }

### 4. `package protected`
- **Acesso**: Visível apenas para classes no mesmo pacote. Não é acessível fora do pacote, mesmo para subclasses.
- **Usado em**: Membros que devem ser visíveis apenas para classes relacionadas dentro do mesmo pacote, sem expô-los fora.
- **Exemplo**:
  ```java
  class MinhaClasse {
    int numeroPadrao; // Acessível apenas dentro do pacote
  }

# Tabela Modificadores de Acesso em Java

| Modificador       | Mesma Classe   | Subclasses (mesmo pacote) | Subclasses (outros pacotes)   | Outras Classes (mesmo pacote) | Outras Classes (outro pacote)  |
|-------------------|----------------|---------------------------|-------------------------------|-------------------------------|--------------------------------|
| `public`          | Sim            | Sim                       | Sim                           | Sim                           | Sim                            |
| `protected`       | Sim            | Sim                       | Sim                           | Sim                           | Não                            |
| `Package-Private` | Sim            | Sim                       | Não                           | Sim                           | Não                            |
| `private`         | Sim            | Não                       | Não                           | Não                           | Não                            |










# Diferença entre `""` e `new String("")` em Java

Em Java, existem duas maneiras comuns de criar strings: usando literais (`""`) ou instanciando com `new String("")`. Embora ambos representem uma string vazia, há diferenças importantes em como o Java trata essas abordagens na memória.

## 1. Usando Literais: `""`

Quando usamos `""` para representar uma string, o Java utiliza o *pool de strings*, uma área de memória dedicada a armazenar strings imutáveis. Isso significa que:

- **Reutilização de Instâncias**: Se uma string literal já existe no pool, Java reutiliza a mesma instância em vez de criar uma nova. Por exemplo, `"abc"` sempre apontará para a mesma instância da string `"abc"` no pool.
- **Desempenho**: A reutilização de strings literais economiza memória e melhora o desempenho, pois evita a criação de objetos duplicados.

Exemplo:

String s1 = "";    // Referência ao mesmo objeto no pool de strings
String s2 = "";    // Reutiliza o mesmo objeto no pool
System.out.println(s1 == s2); // true, pois ambas as referências apontam para o mesmo objeto



## 2. Usando new String("") `new String("")`

Quando usamos new String(""), uma nova instância de String é criada na memória heap, independente do conteúdo ou de outras strings no pool. Isso significa que:

- **Instância Separada**: new String("") cria um novo objeto, mesmo que uma string com o mesmo conteúdo exista no pool. Assim, new String("abc") não será igual a "abc" no pool de strings.
- **Necessidade Rara**: Em geral, new String("") é evitado em favor de literais para aproveitar o pool de strings e reduzir o uso desnecessário de memória.
Exemplo:

String s1 = "";             // Reutiliza o objeto no pool de strings
String s2 = new String(""); // Cria um novo objeto na heap
System.out.println(s1 == s2); // false, pois s1 e s2 referem-se a objetos diferentes


