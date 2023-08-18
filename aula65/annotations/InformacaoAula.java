package aula65.annotations;

@interface InformacaoAula { // isso define como uma anotacao
    String autor();

    int aulaNumero();
    String blog() default "https://loiane.com";
    String site() default "https://loiane.training";
}
