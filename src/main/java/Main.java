import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создание потоков ...");
        Callable<Integer> c1 = new MCallable("Поток_1");
        Callable<Integer> c2 = new MCallable("Поток_2");
        Callable<Integer> c3 = new MCallable("Поток_3");
        Callable<Integer> c4 = new MCallable("Поток_4");
        Callable<Integer> c5 = new MCallable("Поток_5");
        ExecutorService ths = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Future<Integer> t1 = ths.submit(c1);
        Future<Integer> t2 = ths.submit(c2);
        Future<Integer> t3 = ths.submit(c3);
        Future<Integer> t4 = ths.submit(c4);
        Future<Integer> t5 = ths.submit(c5);
        System.out.println("Создание потоков завершено.");
        try {
            System.out.println(c1 + ": счет - " + t1.get());
            System.out.println(c2 + ": счет - " + t2.get());
            System.out.println(c3 + ": счет - " + t3.get());
            System.out.println(c4 + ": счет - " + t4.get());
            System.out.println(c5 + ": счет - " + t5.get());
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потоков ...");
        ths.shutdown();
    }
}
