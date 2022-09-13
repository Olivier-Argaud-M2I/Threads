package threads;


public class MonThread extends Thread{

    private Long millis;
    private String text;

    public MonThread(Long millis,String text){
        this.millis = millis;
        this.text = text;

    }


    @Override
    public void run(){
        while(true){
            System.out.println(this.text);

            try {
                Thread.sleep(this.millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
