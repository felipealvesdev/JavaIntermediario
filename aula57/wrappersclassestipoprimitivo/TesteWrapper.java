package aula57.wrappersclassestipoprimitivo;

public class TesteWrapper {
    public static void main(String[] args){

        short num1 = 1;
        byte num2= 10;
        int num3 = 100;
        long num4 = 1000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        //Short num7 = new Short((short)1); não funciona mais, agora a forma atual é
        Short num7 = Short.valueOf((short)1);
        Byte num8 = Byte.valueOf((byte)10);
        Integer num9 = Integer.valueOf(100);
        Long num10 = Long.valueOf(10000l);
        Float num11 = Float.valueOf(3.5f);
        Double num12 = Double.valueOf(3.555);
        Boolean flag2 = Boolean.valueOf(true);
        Character b = Character.valueOf('b');

        Integer num13 = Integer.valueOf("100"); // nao da erro de compilacao mas da erro de execucao


        Long num15 = num13.longValue();
        int num16 = Integer.parseInt("100000");

        double num17 = Double.parseDouble("3.555");

        System.out.println(num9.equals(num13));
    }
}
