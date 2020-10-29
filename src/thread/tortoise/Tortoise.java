package thread.tortoise;

public class Tortoise implements Runnable {

    private static final int MILESTONES = 5;

    private final Thread tortoise;

    public Tortoise(Thread tortoise) {
        this.tortoise = new Thread(this, "Tortoise");


    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {

    }
}
