public class AlunoGraduacao extends Aluno{
    public void verificaAprovacao(){
        if(calculaMedia()>=7){
            setSituacao("aprovado");
        }else{
            setSituacao("reprovado");}

    }
}
