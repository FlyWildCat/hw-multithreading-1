public class MCallable implements java.util.concurrent.Callable<Integer> {
    private final String name;

    public MCallable(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        int cnt = 0;
        Thread.currentThread().setName(name);
        while (cnt<5) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + ": работаем.");
            cnt++;
        }
        return cnt;
    }

    @Override
    public String toString() {
        return name;
    }
}
