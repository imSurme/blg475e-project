package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task89ImprovedTest {

    // ==================== GEMINI CONSTANTS (NO MAGIC NUMBERS) ====================
    private static final String INPUT_LOWERCASE = "hi";
    private static final String EXPECTED_LOWERCASE = "lm";

    private static final String INPUT_MIXED = "asdfghjkl";
    private static final String EXPECTED_MIXED = "ewhjklnop";

    private static final String INPUT_UPPERCASE = "HELLO";
    private static final String EXPECTED_UPPERCASE = "LIPPS";

    private static final String INPUT_WITH_SYMBOLS = "aB1! ";
    private static final String EXPECTED_WITH_SYMBOLS = "eF1! ";

    private static final String INPUT_EMPTY = "";
    private static final String EXPECTED_EMPTY = "";

    // ==================== CLAUDE CONSTANTS ====================

    private static final String LOWERCASE_INPUT           = "abcd";
    private static final String LOWERCASE_EXPECTED        = "efgh";

    private static final String LOWERCASE_WRAP_INPUT      = "wxyz";
    private static final String LOWERCASE_WRAP_EXPECTED   = "abcd";

    private static final String UPPERCASE_INPUT           = "ABCD";
    private static final String UPPERCASE_EXPECTED        = "EFGH";

    private static final String UPPERCASE_WRAP_INPUT      = "WXYZ";
    private static final String UPPERCASE_WRAP_EXPECTED   = "ABCD";

    private static final String DIGITS_INPUT              = "1234567890";
    private static final String DIGITS_EXPECTED           = "1234567890";

    private static final String SYMBOLS_INPUT             = "!@#$%^&*()";
    private static final String SYMBOLS_EXPECTED          = "!@#$%^&*()";

    private static final String MIXED_INPUT               = "aZ3!bY4@";
    private static final String MIXED_EXPECTED            = "eD3!fC4@";

    private static final String EMPTY_INPUT               = "";
    private static final String EMPTY_EXPECTED            = "";

    private static final String SINGLE_LOWER_INPUT        = "h";
    private static final String SINGLE_LOWER_EXPECTED     = "l";

    private static final String SINGLE_UPPER_INPUT        = "H";
    private static final String SINGLE_UPPER_EXPECTED     = "L";

    private static final String SINGLE_DIGIT_INPUT        = "5";
    private static final String SINGLE_DIGIT_EXPECTED     = "5";

    private static final String BOUNDARY_Z_INPUT          = "zZ";
    private static final String BOUNDARY_Z_EXPECTED       = "dD";

    private static final String FULL_LOWER_INPUT          = "abcdefghijklmnopqrstuvwxyz";
    private static final String FULL_LOWER_EXPECTED       = "efghijklmnopqrstuvwxyzabcd";

    private static final String FULL_UPPER_INPUT          = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String FULL_UPPER_EXPECTED       = "EFGHIJKLMNOPQRSTUVWXYZABCD";
    
    
    
    // ==================== GEMINI TESTS ====================

  @Test
    @DisplayName("Gemini: Should encrypt lowercase letters with 4-step shift")
    void gemini_encrypt_lowercase() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals(EXPECTED_LOWERCASE, s.encrypt(INPUT_LOWERCASE),
            "Failed on lowercase input");
    }

    @Test
    @DisplayName("Gemini: Should encrypt mixed alphabetic characters and leave symbols alone")
    void gemini_encrypt_fullCoverage() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals(EXPECTED_WITH_SYMBOLS, s.encrypt(INPUT_WITH_SYMBOLS),
            "Failed on mixed/symbol input");
    }

    @Test
    @DisplayName("Gemini: Should encrypt mixed alphabetic string correctly")
    void gemini_encrypt_mixed() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals(EXPECTED_MIXED, s.encrypt(INPUT_MIXED),
            "Failed on mixed alphabetic input");
    }

    @Test
    @DisplayName("Gemini: Should encrypt uppercase letters correctly")
    void gemini_encrypt_uppercase() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals(EXPECTED_UPPERCASE, s.encrypt(INPUT_UPPERCASE),
            "Failed on uppercase input");
    }

    @Test
    @DisplayName("Gemini: Should return empty string for empty input")
    void gemini_encrypt_empty() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals(EXPECTED_EMPTY, s.encrypt(INPUT_EMPTY),
            "Failed on empty string input");
    }
    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: encrypt should shift lowercase letters by 4")
    void claude_encrypt_lowercaseNormal() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(LOWERCASE_EXPECTED, s.encrypt(LOWERCASE_INPUT),
            "Lowercase letters should be shifted by 4: " + LOWERCASE_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should wrap lowercase letters past 'z'")
    void claude_encrypt_lowercaseWrap() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(LOWERCASE_WRAP_EXPECTED, s.encrypt(LOWERCASE_WRAP_INPUT),
            "Lowercase wrap-around failed for input: " + LOWERCASE_WRAP_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should shift uppercase letters by 4")
    void claude_encrypt_uppercaseNormal() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(UPPERCASE_EXPECTED, s.encrypt(UPPERCASE_INPUT),
            "Uppercase letters should be shifted by 4: " + UPPERCASE_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should wrap uppercase letters past 'Z'")
    void claude_encrypt_uppercaseWrap() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(UPPERCASE_WRAP_EXPECTED, s.encrypt(UPPERCASE_WRAP_INPUT),
            "Uppercase wrap-around failed for input: " + UPPERCASE_WRAP_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should leave digit characters unchanged")
    void claude_encrypt_digits() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(DIGITS_EXPECTED, s.encrypt(DIGITS_INPUT),
            "Digits should not be modified by encrypt");
    }

    @Test
    @DisplayName("Claude: encrypt should leave symbol characters unchanged")
    void claude_encrypt_symbols() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(SYMBOLS_EXPECTED, s.encrypt(SYMBOLS_INPUT),
            "Symbols should not be modified by encrypt");
    }

    @Test
    @DisplayName("Claude: encrypt should handle mixed lowercase, uppercase, digits and symbols")
    void claude_encrypt_mixed() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(MIXED_EXPECTED, s.encrypt(MIXED_INPUT),
            "Mixed input encryption failed for: " + MIXED_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should return empty string for empty input")
    void claude_encrypt_emptyString() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(EMPTY_EXPECTED, s.encrypt(EMPTY_INPUT),
            "Empty string input should return empty string");
    }

    @Test
    @DisplayName("Claude: encrypt should shift single lowercase letter correctly")
    void claude_encrypt_singleLowercase() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(SINGLE_LOWER_EXPECTED, s.encrypt(SINGLE_LOWER_INPUT),
            "Single lowercase letter shift failed for: " + SINGLE_LOWER_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should shift single uppercase letter correctly")
    void claude_encrypt_singleUppercase() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(SINGLE_UPPER_EXPECTED, s.encrypt(SINGLE_UPPER_INPUT),
            "Single uppercase letter shift failed for: " + SINGLE_UPPER_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should leave single digit unchanged")
    void claude_encrypt_singleDigit() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(SINGLE_DIGIT_EXPECTED, s.encrypt(SINGLE_DIGIT_INPUT),
            "Single digit should remain unchanged");
    }

    @Test
    @DisplayName("Claude: encrypt should correctly wrap z to d and Z to D")
    void claude_encrypt_boundaryZ() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(BOUNDARY_Z_EXPECTED, s.encrypt(BOUNDARY_Z_INPUT),
            "Boundary wrap for z/Z failed: " + BOUNDARY_Z_INPUT);
    }

    @Test
    @DisplayName("Claude: encrypt should correctly shift full lowercase alphabet")
    void claude_encrypt_fullLowerAlphabet() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(FULL_LOWER_EXPECTED, s.encrypt(FULL_LOWER_INPUT),
            "Full lowercase alphabet shift failed");
    }

    @Test
    @DisplayName("Claude: encrypt should correctly shift full uppercase alphabet")
    void claude_encrypt_fullUpperAlphabet() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals(FULL_UPPER_EXPECTED, s.encrypt(FULL_UPPER_INPUT),
            "Full uppercase alphabet shift failed");
    }
}