public class Aluno extends Pessoa {
    private float notaPrimeira,notaSegunda;
    private String matricula;
    private String situacao;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNotaPrimeira() {
        return notaPrimeira;
    }

    public void setNotaPrimeira(float notaPrimeira) {
        this.notaPrimeira = notaPrimeira;
    }

    public float getNotaSegunda() {
        return this.notaSegunda;
    }

    public void setNotaSegunda(float notaSegunda) {
        this.notaSegunda = notaSegunda;
    }

    public float calculaMedia(){
            return ((this.getNotaPrimeira() + this.getNotaSegunda())/2);
    }


}
