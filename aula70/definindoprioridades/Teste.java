package aula70.definindoprioridades;

import aula69.isalivejoin.MinhaThreadRunnable;

public class Teste {
    public static void main(String[] args){

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        //todas elas tem prioridades iguais
        // agora podemos modificar a prioridade de cada uma na fila de execucao
        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(1);
        // depende do SO, depende, talvz nem sempre seja respeitada a prioridade,
        // nao é algo definitivo

        t1.start();
        t2.start();
        t3.start();

    }
}
