package codealpha_javaapp_gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testCapitalizeName() {

        App app = new App();

        String result = app.capitalizeName("krish");

        assertEquals("Krish", result);

    }
}