public class MyThread extends Thread{
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        start();
        System.out.println(name + ": Создан.");
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ": Привет!");
            }
        } catch (InterruptedException e){
//            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + ": Завершен.");
        }
    }
}
