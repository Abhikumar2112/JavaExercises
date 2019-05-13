
class Thread1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread One");

                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class Thread2 implements Runnable{
    public void run()
    {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Thread Two");

                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class Exercise4
{
    public static void main(String[] args)
    {

        {
            Thread obj1 = new Thread(new Thread1());
            obj1.start();
            Thread obj2 = new Thread(new Thread2());
            obj2.start();
        }
    }
}
