package threads;


public class MonThreadAvecInterface implements Runnable{

    private Long time;
    private String text;

    public MonThreadAvecInterface(Long time,String text){
        this.time = time;
        this.text = text;
    }

    @Override
    public void run() {

        while (true){
            System.out.println(this.text);
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
