import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {


    @Test
    void deveRetornarAprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaPrimeira(7f);
        aluno.setNotaSegunda(7f);
        aluno.verificaAprovacao();
        assertEquals("aprovado", aluno.getSituacao());

    }

    @Test
    void deveRetornarReprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaPrimeira(6.9f);
        aluno.setNotaSegunda(6.9f);
        aluno.verificaAprovacao();
        assertEquals("reprovado", aluno.getSituacao());
    }

}
