package aula55.enumvaluevalueof;

import aula53.enumeradoresenum.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args){

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}
