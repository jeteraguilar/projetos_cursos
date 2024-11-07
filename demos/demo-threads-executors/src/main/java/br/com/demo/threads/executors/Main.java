package br.com.demo.threads.executors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de tarefas com diferentes tempos de duração
        List<Task> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            tasks.add(new Task(i, i * 1000)); // Tarefas com durações de 1 a 5 segundos
        }

        // Inicializando o serviço de tarefas com um pool de 3 threads
        TaskService taskService = new TaskService(3);

        System.out.println("Enviando tarefas para execução...");
        taskService.submitTasks(tasks);

        // Aguardando conclusão
        taskService.shutdown();
        System.out.println("Todas as tarefas foram concluídas.");
    }
}