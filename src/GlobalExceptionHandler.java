public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Uncaught exception occurred in thread " + t.getName() + " : "+ e.getMessage());
    }
}
