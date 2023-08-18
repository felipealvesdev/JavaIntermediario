package aula71.metodoseblocossincronizados;

public class Calculadora {
    private int soma;
    public synchronized int somaArray(int[] array){ // syncronized permite somente uma thread acessar
        //por vez
        soma=0;
        for(int i=0; i<array.length;i++){
            soma+= array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName()+
                    " somando o valor " + array[i] + " com total de " + soma);

            try{
                Thread.sleep(100);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return soma;
    }
}
