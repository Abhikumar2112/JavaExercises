
class Exercise3 implements Runnable {
    private String message;

    public Exercise3() {

    }
    public void run() {
        System.out.println(" (begin) message = "+message);
        processmessage();
        System.out.println(" (End) message = "+message);
    }
    private void processmessage() {
        try {  Thread.sleep(3000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public static void main(String[] args){
        Thread first = new Thread(new Exercise3());
        first.start();
    }
}


