import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarDoutor() {
        Professor professor = new Professor();
        professor.setTitulacao("doutor");
        assertEquals("doutor",professor.getTitulacao());

    }
}