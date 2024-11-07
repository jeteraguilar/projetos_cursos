package br.com.demo.threads.executors;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskService {
    private final ExecutorService executor;

    public TaskService(int poolSize) {
        this.executor = Executors.newFixedThreadPool(poolSize);
    }

    public void submitTasks(List<Task> tasks) {
        for (Task task : tasks) {
            executor.submit(new TaskProcessor(task));
        }
    }

    public void shutdown() {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}
