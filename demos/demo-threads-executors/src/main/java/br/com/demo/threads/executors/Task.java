package br.com.demo.threads.executors;

public class Task {
    private final int id;
    private final int duration;

    public Task(int id, int duration) {
        this.id = id;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", duration=" + duration +
                " ms}";
    }
}
