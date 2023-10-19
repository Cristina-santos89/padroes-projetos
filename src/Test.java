import acoes.Atividades;
import acoes.Rotinas;

public class Test {
    
    public static void main(String[] args) {

        Atividades duranteASemana = new Atividades();

        Rotinas rotinas = new Rotinas();
        System.out.println("---- Sugestão de programação Segunda a Sexta ---- ");
        rotinas.setLista(duranteASemana);
        rotinas.acordar();
        rotinas.sergrata();
        rotinas.tomaragua();
        rotinas.tomarbanho();
        rotinas.tomarcafedamanha();
        rotinas.olharagenda();
        rotinas.trabalhar();
        rotinas.tomaragua();
        rotinas.praticarexercicios();
        rotinas.tomaragua();
        rotinas.almocar();
        rotinas.tomaragua();
        rotinas.jantar();
        rotinas.fazertarefasdecasa();
        rotinas.tomarbanho();
        rotinas.estudar();
        rotinas.anotaroqueaprendeu();
        rotinas.sergrata();
        rotinas.dormir();    
        
}
}


       