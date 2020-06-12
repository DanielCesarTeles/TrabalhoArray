import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Daniel
 * @version 1.0
 * @since 05/06/2020 - 18:29
 * @category Teste
 *
 */
class MembroDaBandaTest {

    private MembroDaBanda membroDaBanda = new MembroDaBanda();

    /**
     * recebe os valores de TempoDeInstrumento e Salario para teste
     */
    public MembroDaBandaTest() {
        membroDaBanda.setTempoDeInstrumento(10);
        membroDaBanda.setSalarioBase(1000.00);

    }

    /**
     *  testa se o metode verificarHabilidade funciona
     o metodo tem duas possibilidade, são elas, aceito na banda (se o tempo de instrumento for maior que 3)
     e Experiencia muito baixa para a banda
     */
    @org.junit.jupiter.api.Test
    void verificarHabilidade() {
        assertEquals("Aceito na banda", membroDaBanda.verificarHabilidade());
    }

    /**
     *
     */
    @org.junit.jupiter.api.Test
    void calcularSalrio() {
        assertEquals(1100.0, membroDaBanda.calcularSalario(), 0.0);
    }
}