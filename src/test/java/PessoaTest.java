import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarCarlos() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        assertEquals("Carlos",pessoa.getNome());
    }
}