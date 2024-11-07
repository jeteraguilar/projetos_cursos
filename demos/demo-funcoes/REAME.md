# Funções em Java

As funções em Java são interfaces funcionais que permitem manipular e transformar dados de maneira concisa e 
expressiva. Abaixo estão as definições simples e objetivas das funções mais comuns:

## 1. `Consumer<T>`
- **Definição**: Uma função que aceita um único argumento e não retorna nenhum resultado.
- **Uso**: Usado principalmente para realizar operações que consomem dados, como imprimir ou modificar um objeto.
- **Exemplo**:
  ```java
  Consumer<String> printConsumer = str -> System.out.println(str);

## 2. `Supplier<T>`
- **Definição**: Uma função que não aceita argumentos e retorna um resultado.
- **Uso**: Usado para fornecer objetos ou valores, frequentemente utilizado em situações onde um valor é 
necessário, mas não pode ser calculado diretamente.
- **Exemplo**:
  ```java
  Supplier<Double> randomSupplier = () -> Math.random();

## 3. `Function<T, R>`
- **Definição**: Uma função que aceita um argumento e retorna um resultado, onde T é o tipo de entrada e R é o tipo de saída.
- **Uso**: Usado para transformar dados, como converter um valor de um tipo para outro.
- **Exemplo**:
  ```java
  Function<Integer, String> intToString = num -> String.valueOf(num);




# Finalidade das Threads em Java

As threads em Java são uma ferramenta fundamental para a programação concorrente e paralela. Elas permitem que 
várias tarefas sejam executadas simultaneamente dentro de um único aplicativo. Abaixo estão algumas finalidades 
e benefícios das threads em Java:

## 1. Concurrência
As threads permitem que um aplicativo execute várias operações ao mesmo tempo. Isso é particularmente útil em 
aplicativos que precisam realizar múltiplas tarefas simultaneamente, como responder a solicitações de usuários 
enquanto processam dados em segundo plano.

## 2. Melhor Uso de Recursos
Em sistemas com múltiplos núcleos de CPU, as threads podem ser distribuídas entre diferentes núcleos, permitindo 
que o aplicativo aproveite melhor os recursos do sistema. Isso pode resultar em melhor desempenho e maior
eficiência.

## 3. Responsividade
Threads são frequentemente usadas em interfaces gráficas (GUIs) para manter a responsividade do aplicativo.
Por exemplo, uma thread pode ser usada para executar tarefas longas (como carregar dados ou realizar cálculos)
sem bloquear a interface do usuário, permitindo que o usuário continue interagindo com o aplicativo.

## 4. Processamento em Segundo Plano
Threads podem ser usadas para realizar operações em segundo plano, como fazer chamadas de rede, ler e escrever 
arquivos ou processar dados, sem interferir na execução do código principal.

## 5. Facilidade de Manutenção
Ao dividir um aplicativo em diferentes threads, é possível organizar melhor o código, tornando-o mais modular e 
fácil de entender. Cada thread pode ser responsável por uma tarefa específica, facilitando a manutenção e a 
escalabilidade do código.

## 6. Sincronização
As threads podem se comunicar e coordenar entre si através de mecanismos de sincronização, permitindo que 
compartilhem recursos de forma segura. Isso é especialmente importante em ambientes onde várias threads podem 
acessar ou modificar dados compartilhados.

## 7. Simulações e Modelagem
Em aplicações que requerem simulações complexas ou modelagens, como simulações de sistemas físicos ou de tráfego,
as threads podem ser usadas para simular múltiplos agentes ou entidades que operam de forma independente, mas que
precisam interagir entre si.

## 8. Execução de Tarefas Programadas
Threads podem ser usadas para agendar tarefas que precisam ser executadas periodicamente, como atualizações de 
estado ou monitoramento de eventos, utilizando classes como `ScheduledThreadPoolExecutor`.

## Exemplo Prático
Um exemplo prático do uso de threads é em um servidor web. Um servidor pode criar uma nova thread para cada 
olicitação de cliente, permitindo que várias solicitações sejam processadas ao mesmo tempo, em vez de 
sequencialmente. Isso melhora a capacidade de resposta do servidor e a experiência do usuário.

## Conclusão
Em resumo, as threads em Java desempenham um papel crucial na criação de aplicativos eficientes, responsivos e 
escaláveis. Elas permitem que os desenvolvedores aproveitem ao máximo os recursos disponíveis do sistema e 
melhorem a experiência do usuário em aplicações complexas.
