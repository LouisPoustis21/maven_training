package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {

    @Test
    void testAddition() {
        // Utilise la méthode "op" avec ADD
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD, 2, 3);
        assertThat(result).isEqualTo(5); // Teste 2 + 3 = 5
    }

    @Test
    void testMultiplication() {
        // Utilise la méthode "op" avec MULT
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT, 2, 3);
        assertThat(result).isEqualTo(6); // Teste 2 * 3 = 6
    }

    @Test
    void testFactorial() {
        // Teste la méthode fact pour 5!
        Sample sample = new Sample();
        int result = sample.fact(5);
        assertThat(result).isEqualTo(120); // Teste 5! = 120
    }

    @Test
    void testFactorialNegative() {
        // Vérifie qu'une exception est levée pour un cas négatif
        Sample sample = new Sample();
        IllegalArgumentException exception = null;
        try {
            sample.fact(-1); // Appelle fact avec un argument négatif
        } catch (IllegalArgumentException e) {
            exception = e; // Capture l'exception
        }
        assertThat(exception).isNotNull(); // Vérifie qu'une exception est levée
        assertThat(exception.getMessage()).isEqualTo("N should be positive"); // Vérifie le message
    }
}
