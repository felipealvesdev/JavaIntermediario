package aula67.criandothreads;

public class Teste {
    public static void main(String[] args){
        MinhaThread thread = new MinhaThread("Thread #1", 600);
        //thread.start(); // aqui o metodo incia a thread, ele chama o metodo run()

        MinhaThread thread2 = new MinhaThread("Thread #2",900);
        MinhaThread thread3 = new MinhaThread("Thread #3",500);
        // conseguimos executar uma tarefa individual a cada tempo individual delas
        // cada thread segue independente da outra
    }
}
