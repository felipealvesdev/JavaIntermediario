package aula69.isalivejoin;

public class Teste3 {

    public static void main(String[] args){
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // COLOCAR OS 3 JOINS NO TRY CATCH É A MELHOR OPCAO
//        t1.start();
//        try{
//            t1.join(200);// A THREAD 2 SÓ VAI INICIAR APOS A THREAD 1 ACABAR OU ENTAO
//            //200 MS DEPOIS DA THREAD 1 TER INICIADO, O QUE VIER PRIMEIRO
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        t2.start();
//        try{
//            t2.join(200);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        // A THREAD 3 SÓ INICIA DEPOIS QUE A THREAD 2 TERMINAR A EXECUCAO
//        t3.start();
        t1.start();
        t2.start();
        t3.start();
        // O ERRO ERA TER T.START() DENTRO DO MINHATHREAD, POR ISSO REPETIA DUAS VEZES
        // VAI INICIAR AS 3 THREADS
        // VAI PEDIR PRA ESPERAR AS 3 THREADS
        // E SO DEPOIS DAS THREADS TERMINAREM QUE SEGUE O FLUXO E O PROGRAMA FINALIZA
        // ESSA É A MANEIRA MAIS USADA----------------------

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Programa finalizado");

    }
}
