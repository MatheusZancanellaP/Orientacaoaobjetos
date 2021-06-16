public class AlunoEnsinoMedio extends Aluno {

    public void verificaAprovacao(){
        if(calculaMedia()>=6){
            setSituacao("aprovado");
        }else{
            setSituacao("reprovado");}

    }

}
