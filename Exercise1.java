
class FirstThread implements Runnable
{
    public void run()
    {
        System.out.println("Hello, World!!");
    }
}

class Exercise1
{
    public static void main( String args[] )
    {
        FirstThread ft = new FirstThread();
        Thread first = new Thread(ft);
        first.start();
    }
}
