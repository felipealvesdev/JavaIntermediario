package aula74.deadlocks.exercicio;

public enum CorSemaforo {
    VERDE(5000), AMARELO(300), VERMELHO(2000);

    private int tempoEspera;

    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera(){
        return tempoEspera;
    }
}
