import java.util.Scanner;
public class Contabilidade extends Biblioteca {

    int Emprestimo_curto;
    int Emprestimo_longo;
    String Multa_Atraso_curto;

    String Multa_Atraso_longo;

    int Dias;

    Scanner scanner = new Scanner(System.in);

    void Empréstimo(){

        System.out.println("\n Por quantos dias deseja alugar este livro? \n");
        this.Dias = scanner.nextInt();
        scanner.nextLine();

        this.Emprestimo_curto = this.Dias;
        this.Emprestimo_longo = this.Dias;


        this.Multa_Atraso_curto = "R$8,47";
        this.Multa_Atraso_longo = "R$16,94";

        if (this.Emprestimo_curto<=15){
            System.out.println("\n Tudo Certo! Tenha um bom dia! \n Em caso de atraso, a multa será de " + this.Multa_Atraso_curto + " por dia.");
        }


        if (Emprestimo_longo>=16){
            System.out.println("\n Tudo Certo! Tenha um bom dia! \n Em caso de atraso, multa será de " + this.Multa_Atraso_longo + " por dia.");



        }

    }









    public void setEmprestimo_curto(int emprestimoCurto){
        Emprestimo_curto = Emprestimo_curto;
    }

    public void setEmprestimo_longo(int emprestimo_longo) {
        Emprestimo_longo = emprestimo_longo;
    }

    public void setMulta_Atraso_curto(String multa_Atraso_curto) {
        Multa_Atraso_curto = multa_Atraso_curto;

    }

    public void setMulta_Atraso_longo(String multa_Atraso_longo) {
        Multa_Atraso_longo = multa_Atraso_longo;
    }

    public void setDias(int dias) {
        Dias = dias;
    }
}


