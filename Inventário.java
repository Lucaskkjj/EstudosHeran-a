public class Inventário{

    String Nome_Livro;
    int Ano_Publicação;
    String Nome_Autor;


    void InfoLivro(){
        this.Nome_Livro = "O Pequeno Príncipe";
        this.Ano_Publicação = 1943;
        this.Nome_Autor = "Antoine de Sant-Exupéry";
        System.out.println("\n Nome do livro: "+ this.Nome_Livro + "\n Ano de publicação: " + this.Ano_Publicação + "\n Escrito por: " + this.Nome_Autor);


    }

















    public void setAno_Publicação(int ano_Publicação) {
        Ano_Publicação = Ano_Publicação;

    }

    public void setNome_Autor(String nome_Autor) {
        Nome_Autor = nome_Autor;

    }

    public void setNome_Livro(String nome_Livro) {
        Nome_Livro = nome_Livro;

    }
}


