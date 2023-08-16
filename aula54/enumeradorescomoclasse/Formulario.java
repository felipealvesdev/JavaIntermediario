package aula54.enumeradorescomoclasse;

public class Formulario {

    enum Genero{
        FEMININO('F'), MASCULINO('M');
// aspas duplas significa string, aspas simples significa tipo char
        private char valor;
        Genero(char valor){
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero;
}
