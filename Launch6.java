class Library implements Runnable{
    String java =  new String("JAVA");
    String  devops = new String("DEVOPS");
    String aws = new String("AWS");

    public void run()
    {   
        String name = Thread.currentThread().getName();
        if(name.equals("Kapil"))
        {
            try {
                System.out.println("Kapil got into library");
                Thread.sleep(5000);
                synchronized(java)
                {
                    System.out.println("Kapil acquired java");
                    Thread.sleep(5000);
                    synchronized (devops) {
                        System.out.println("Kapil acquired devops");
                        Thread.sleep(5000);
                        synchronized (aws) {
                            System.out.println("Kapil acquired aws");
                            Thread.sleep(5000);
                            
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                System.out.println("Dinesh got into library");
                Thread.sleep(5000);
                synchronized(java)
                {
                    System.out.println("Dinesh acquired java");
                    Thread.sleep(5000);
                    synchronized (devops) {
                        System.out.println("Dinesh acquired devops");
                        Thread.sleep(5000);
                        synchronized (aws) {
                            System.out.println("Dinesh acquired aws");
                            Thread.sleep(5000);
                            
                        }
                    }
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
public class Launch6 {
    public static void main(String[] args) {
        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);
        
        t1.setName("Kapil");
        t2.setName("Dinesh");
        t1.start();
        t2.start();
        
    }
}
