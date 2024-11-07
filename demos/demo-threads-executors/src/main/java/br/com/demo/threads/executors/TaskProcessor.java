package br.com.demo.threads.executors;

public class TaskProcessor implements Runnable{
    private final Task task;

    public TaskProcessor(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("Iniciando " + task);
        try {
            Thread.sleep(task.getDuration()); // Simulando o tempo de execução da tarefa
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("A execução da tarefa foi interrompida.");
        }
        System.out.println("Concluída " + task);
    }
}
