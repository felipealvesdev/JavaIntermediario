package aula63.printf;

public class ExemploPrintf {
    public static void main(String[] args){

        // feito lingugagem C, informa o tipo de dado
        System.out.printf("Hello %s", "Olá, mundo!");// s é de string
        System.out.printf("Hello %S", "Olá, mundo!");// S maiusculo tudo vira caixa alta
        // PRINTF EH PARA FORMATAR AS COISAS

        System.out.printf("%c" , 'c');
        System.out.println();
        System.out.printf("%C" , 'c');
        System.out.println();
        System.out.println("%n");

        int valor = 123456789;
        System.out.printf("%d", valor);
        System.out.println();

        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);
        System.out.println();

        String olaMundo = "Olá, mundo!";
        System.out.printf("%20s", olaMundo);
        System.out.println();

        String olaMundo2 = "Olá, mundo!";
        System.out.printf("%-20s", olaMundo2);
        System.out.println();

        System.out.printf("%+d", valor);// o + faz com que apareça se o numero eh positivo ou negativo
        System.out.println();
        System.out.printf("%015d", valor);
        System.out.println();
        System.out.printf("%,d", valor);// para colocar virgula entre cada milhar

        System.out.println();
        int valor2 = -123456789;
        System.out.printf("% d", valor2);// COM ESPACO NAO MOSTRA O SINAL DE POSITIVO, SOMENTE O NEGATIVO
        System.out.println();
        System.out.printf("% d", valor);
        System.out.println();
        System.out.printf("R$%.2f", pontoFlutuante);
        System.out.println();

    }

    private static void testeMaisCompleto(){
        double[] precos = {1000, 123.54, 7843.567, 1, 4.56789};

        for(int i=0; i<precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }
    }
}
