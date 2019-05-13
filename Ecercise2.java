

class FirstThread implements Runnable
{
    public void run()
    {
            try
            {

                System.out.println ("Hello, World");

            }
            catch (Exception e)
            {

                System.out.println ("Exception is caught");
            }
        }
}

class Exercise2
{
    public static void main( String args[] )
    {
        int n = 4;
        for (int i=0; i<4; i++)

        {
        Thread first = new Thread(new FirstThread());
        first.start();
        }

    }
}