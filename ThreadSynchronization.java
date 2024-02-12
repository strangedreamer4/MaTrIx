import java.lang.*;

class Table{
    public synchronized void printTable(int n){
        for(int i=1;i<=n;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadSynchronization{
    public static void main(String[] args){
        Table obj = new Table();
        Thread t1 = new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                obj.printTable(10);
            }
        };

        t1.start();
        t2.start();
    }
}