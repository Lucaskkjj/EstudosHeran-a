import java.util.Scanner;
public class Biblioteca extends Inventário{



    public static void main(String[] args){

    Inventário livro = new Inventário();
    Contabilidade emprestimo = new Contabilidade();

    livro.InfoLivro();
    emprestimo.Empréstimo();
    }
}
