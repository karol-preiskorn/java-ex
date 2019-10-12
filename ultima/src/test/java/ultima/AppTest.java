package ultima;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    private final App AppT = new App();


    @Test
    public void shouldAnswerWithTrue() {
        assumeTrue(AppT.run(true));
    }

}
