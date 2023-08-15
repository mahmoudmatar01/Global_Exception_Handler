public class Main {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());



        try {
//            int x = 3 / 0;
            String s = "";
            s.charAt(5);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("RunTime");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}