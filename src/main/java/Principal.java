public class Principal {
    public static void main(String[] args) {
        AlunoEnsinoMedio a = new AlunoEnsinoMedio();
        a.setNome("Carlos");
        a.setMatricula("6666666");
        a.setNotaPrimeira(6);
        a.setNotaSegunda(5.9f);
        a.verificaAprovacao();
        System.out.println("O aluno " + a.getNome() + " de matricula " + a.getMatricula() + " foi " + a.getSituacao());
    }
}
