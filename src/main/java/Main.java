public class Main {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MainGroup");
        System.out.println("Создание потоков ...");
        Thread th1 = new MyThread(group, "Поток_1");
        Thread th2 = new MyThread(group, "Поток_2");
        Thread th3 = new MyThread(group, "Поток_3");
        Thread th4 = new MyThread(group, "Поток_4");
        Thread th5 = new MyThread(group, "Поток_5");
        System.out.println("Создание потоков завершено.");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потоков ...");
        group.interrupt();
    }
}
