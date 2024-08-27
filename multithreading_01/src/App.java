public class App {
    public static void main(String[] args) throws Exception {
        Table obj= new Table();
        MyThread1 t1= new MyThread1(obj);
        MyThread2 t2= new MyThread2();
        t1.start();
        t2.start();
    } }
class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
        System.out.println(n*i);
        try{
            Thread.sleep(400);
        }catch(Exception e)
    {
        System.out.println(e);
    }
 }
    } 
}
class MyThread1 extends Thread{
    Table t;
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread2 extends Thread{
    Table t;
}
