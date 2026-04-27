package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task89ManualTest {

    @Test
    @DisplayName("Both: remove all boundary (empty string)")
    void both_emptyString() {
        solutions.gemini.Task89 g = new solutions.gemini.Task89();
        solutions.claude.Task89 c = new solutions.claude.Task89();
        assertEquals("", g.encrypt(""));
        assertEquals("", c.encrypt(""));
    }

    @Test
    @DisplayName("Gemini: to uppercase mutation")
    void gemini_toUppercase() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        // "HI" harflerinin 4 birim kaydırılmış hali "LM" olmalı
        assertEquals("LM", s.encrypt("HI"));
    }

    @Test
    @DisplayName("Claude: add symbols mutation")
    void claude_addSymbols() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        // Semboller ve sayılar değişmemeli
        assertEquals("lm123!", s.encrypt("hi123!"));
    }
}