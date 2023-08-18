package aula67.criandothreads;

public class MinhaThread extends Thread{

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    // para uma thread ser executada, precisamos sobrescrever o método run
    public void run(){

        try{
            for(int i = 0; i<6; i++){
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.nome + " Terminou a execução");


    }
}
