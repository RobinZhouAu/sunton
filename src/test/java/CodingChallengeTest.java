import junit.framework.TestCase;
import org.junit.Test;

public class CodingChallengeTest extends TestCase {
    @Test(timeout = 500)
    public void testHello() {
        CodingChallenge codingChallenge = new CodingChallenge();
        assertEquals(codingChallenge.hello(), 0);
    }
}
