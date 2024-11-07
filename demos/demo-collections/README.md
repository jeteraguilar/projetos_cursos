# Documentação de Coleções em Java

Este documento apresenta uma breve descrição das principais coleções em Java: `List`, `Map`, `Queue` e `Set`. Cada uma dessas interfaces possui características únicas que as tornam adequadas para diferentes cenários de uso na programação orientada a objetos (POO).

## List
Definição: Uma coleção ordenada que permite elementos duplicados.
Características: Mantém a ordem de inserção dos elementos e permite acesso por índice.
Implementações Comuns: `ArrayList`, `LinkedList`, `Vector`.

## Map
Definição: Uma coleção de pares chave-valor onde cada chave é única.
Características: Não permite chaves duplicadas, mas permite valores duplicados. Ideal para associar dados a uma chave única.
Implementações Comuns: `HashMap`, `TreeMap`, `LinkedHashMap`.

## Queue
Definição: Uma coleção que segue o princípio FIFO (First In, First Out).
Características: Elementos são adicionados no final e removidos do início da fila. Ideal para processamento em ordem de chegada.
Implementações Comuns: `LinkedList`, `PriorityQueue`, `ArrayDeque`.

## Set
Definição: Uma coleção que não permite elementos duplicados.
Características: Não possui ordem garantida (exceto em implementações específicas) e é útil para garantir unicidade dos elementos.
Implementações Comuns: `HashSet`, `LinkedHashSet`, `TreeSet`.

## Referências
Para mais informações sobre as coleções em Java, consulte a [documentação oficial](https://docs.oracle.com/javase/8/docs/).

