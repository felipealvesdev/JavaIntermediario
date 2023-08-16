package aula60.escopovariaveis;

public class EscopoVariaveis {

    private int valor;

    public int getValor(){
        return this.valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int calculaValor(int valor){
        valor = valor + 10;
        return valor; // O java cria uma variavel local chamada valor apenas para esse bloco
        // esse valor é o parametro e nao o atributo da classe lá em cima.
    }

    public int teste(){
        int valor = 5;

        if(true){
            valor--;
        }
       // valor é uma variavel local, e vai decrementar 1 de valor = 5;
        return valor;
    }

    public void outroTeste(){
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        int j;
        for(j=0; j<10; j++){
            System.out.println(j);
        }
        System.out.println(j);// j tem valor 10
    }
    public void maisUmTeste(){
        boolean flag = true;
        if(flag){
            int umaVariavel = 0;
            umaVariavel++;
            System.out.println(umaVariavel);
        }
        //System.out.println(umaVariavel); // erro de compilacao porque
        // umaVariavel esta dentro do escopo do if
    }

    public void maisUmOutroTeste(int num){
        int total = 0;

        try{
            int outroNum = 0;
            total = num/outroNum;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            total++;
            //outroNum++; //erro de compilacao
            //e.printStackTrace();// erro de compilacao
        }
        num++;
        //outroNum++; //erro de compilacao
        //e.printStackTrace();// erro de compilacao
    }
}
