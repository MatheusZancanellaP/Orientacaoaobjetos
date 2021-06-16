import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {
    @Test
    void deveRetornarAprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNotaPrimeira(6f);
        aluno.setNotaSegunda(6f);
        aluno.verificaAprovacao();
        assertEquals("aprovado", aluno.getSituacao());

    }

    @Test
    void deveRetornarReprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNotaPrimeira(5.9f);
        aluno.setNotaSegunda(5.9f);
        aluno.verificaAprovacao();
        assertEquals("reprovado", aluno.getSituacao());
    }

}
