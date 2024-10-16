import org.example.StringProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StringProcessorTest {
    StringProcessor processor = new StringProcessor();

    @Test
    public void testIsStrongPassword() {
        assertTrue(processor.isStrongPassword("Meka123!"));  // Should return true
        assertFalse(processor.isStrongPassword("meka123!")); // No uppercase
        assertFalse(processor.isStrongPassword("MEKA123!")); // No lowercase
        assertFalse(processor.isStrongPassword("Meka!"));    // Too short
        assertFalse(processor.isStrongPassword("Meka o123!"));// Contains space
    }

    @Test
    public void testCalculateDigits() {
        assertEquals(2, processor.calculateDigits("1 cat and 5 dogs")); // 1 and 5
        assertEquals(9, processor.calculateDigits("123456789")); // All digits
        assertEquals(0, processor.calculateDigits("Hello world!")); // No digits
        assertEquals(1, processor.calculateDigits("hi 1")); // 1 digit
        assertEquals(0, processor.calculateDigits("")); // Empty string
    }

    @Test
    public void testCalculateWords() {
        assertEquals(2, processor.calculateWords("Hello cat"));
        assertEquals(0, processor.calculateWords("   ")); // Only spaces
        assertEquals(2, processor.calculateWords("One two"));
        assertEquals(1, processor.calculateWords("Cyber"));
        assertEquals(3, processor.calculateWords("Java is good"));
    }

    @Test
    public void testCalculateExpression() {
        assertEquals(534.0, processor.calculateExpression("3 +59*9"), 0.001); // Considering precedence
        assertEquals(16.0, processor.calculateExpression("10+6"), 0.001);
        assertEquals(212.0, processor.calculateExpression("100 * 2 + 12"), 0.001);
        assertEquals(900.0, processor.calculateExpression("100 * 9"), 0.001);
    }
}
