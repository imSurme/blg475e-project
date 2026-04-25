package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task28Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: concatenate([]) should return empty string")
    void gemini_concatenate_empty() {
        solutions.gemini.Task28 s = new solutions.gemini.Task28();
        assertEquals("", s.concatenate(new ArrayList<>(List.of())));
    }

    @Test
    @DisplayName("Gemini: concatenate([x, y, z]) should return xyz")
    void gemini_concatenate_xyz() {
        solutions.gemini.Task28 s = new solutions.gemini.Task28();
        assertEquals("xyz", s.concatenate(new ArrayList<>(Arrays.asList("x", "y", "z"))));
    }

    @Test
    @DisplayName("Gemini: concatenate([x, y, z, w, k]) should return xyzwk")
    void gemini_concatenate_xyzwk() {
        solutions.gemini.Task28 s = new solutions.gemini.Task28();
        assertEquals("xyzwk", s.concatenate(new ArrayList<>(Arrays.asList("x", "y", "z", "w", "k"))));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: concatenate([]) should return empty string")
    void claude_concatenate_empty() {
        solutions.claude.Task28 s = new solutions.claude.Task28();
        assertEquals("", s.concatenate(new ArrayList<>(List.of())));
    }

    @Test
    @DisplayName("Claude: concatenate([x, y, z]) should return xyz")
    void claude_concatenate_xyz() {
        solutions.claude.Task28 s = new solutions.claude.Task28();
        assertEquals("xyz", s.concatenate(new ArrayList<>(Arrays.asList("x", "y", "z"))));
    }

    @Test
    @DisplayName("Claude: concatenate([x, y, z, w, k]) should return xyzwk")
    void claude_concatenate_xyzwk() {
        solutions.claude.Task28 s = new solutions.claude.Task28();
        assertEquals("xyzwk", s.concatenate(new ArrayList<>(Arrays.asList("x", "y", "z", "w", "k"))));
    }
}
