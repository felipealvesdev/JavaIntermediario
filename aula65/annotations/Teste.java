package aula65.annotations;

@InformacaoAula(
        autor = "Loiane",
        aulaNumero = 65,
        blog = "loiane.com"
)
public class Teste {
    @InformacaoAula(
            autor = "Loiane",
            aulaNumero = 65,
            blog = "loiane.com"
    )
    public static void main(String[] args){

    }
}
