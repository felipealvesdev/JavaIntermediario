package aula68.threadinterfacerunnable;

public class Teste {

    public static void main(String[] args){
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        //Thread t1 = new Thread(thread1);
        //t1.start();
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);
        //SE NAO FOR SOBREPOR QUALQUER OUTRO METODO DA CLASSE THREAD, PODE SER MELHOR USAR A CLASSE
        //RUNNABLE
        //SE EXTENDER THREAD, CLASSE EM JAVA SO PODE SER EXTENDIDA UMA VEZ

    }
}
