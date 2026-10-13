class Mycar implements Runnable{

    synchronized public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered parking lot");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " started driving the car");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " stopped the car");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Launch4 {
    public static void main(String[] args) {
        Mycar car = new Mycar();
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("Ramesh");
        t2.setName("Suresh");
        t3.setName("Mukesh");

        t1.start();
        t2.start();
        t3.start();


    }
}
