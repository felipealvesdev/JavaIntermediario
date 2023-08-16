package aula62.varargs;

public class ExemploVarargs {
    public static void main(String[] args){

        System.out.println(soma(1,2));
        System.out.println(soma(1,2, 3));

        int[] vetor = {1,2,3,4,5};
        System.out.println(soma(vetor));// aqui eu tenho 1 vetor

        System.out.println(soma(1,2,3,4,5,6,7,8,9,10));// aqui eu tenho varios parametros
    }
    static int soma(int a, int b){
        return a+b;
    }
    static int soma(int a, int b, int c){
        return a+b+c;
    }
    static int soma(int[] vetor){
        int total = 0;

        for(int i=0; i< vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }

    // a partir do java 5 foi adicionado o VARARGS

    static int soma(int a, int b, Integer... vetor){ // varargs geralmente deixa como o ultimo paramentro!!
        int total = 0;
        for(int i=0; i< vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }
}
