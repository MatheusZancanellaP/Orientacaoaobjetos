import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void getMatricula() {
        Aluno aluno = new Aluno();
        aluno.setMatricula("202034332");
        assertEquals("202034332",aluno.getMatricula());
    }
}