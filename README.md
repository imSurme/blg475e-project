# BLG 475E - Software Quality and Testing Project

## 2025-2026 Spring Term

### Project Description
This project evaluates LLM-based code and test generation capabilities using the HumanEval Java dataset. Two LLM models (Gemini 3.1 Pro and Claude Sonnet 4.6) are used to generate code and tests, which are then analyzed for correctness, coverage, and quality.

### Team Members
/* @Authors
* Student Names: İbrahim Mert Sürme, Başar Filizcan, Ahmet Atakan Çulban
* Student IDs: 150220052, 820220722, 820220342
*/

### Project Structure
```
475e_proje/
├── src/
│   ├── main/java/solutions/
│   │   ├── gemini/          # Gemini 3.1 Pro generated code
│   │   └── claude/          # Claude Sonnet 4.6 generated code
│   └── test/java/tests/
│       ├── base/            # Base tests from HumanEval dataset
│       ├── improved/        # Improved tests (after coverage analysis)
│       └── manual/          # Manual tests (equivalence partitioning)
├── logs/
│   ├── gemini/              # Gemini interaction logs
│   └── claude/              # Claude interaction logs
├── docs/                    # Step 4 manual assessment (ECP/BVA analysis)
├── humaneval_java.jsonl     # HumanEval Java dataset
├── pom.xml                  # Maven build, test (JUnit), and JaCoCo coverage configuration
└── README.md
```

### Selected Prompts (30 total)

#### Easy (10)
| Task ID | Description |
|---------|-------------|
| Java/2  | truncateNumber - Return decimal part |
| Java/23 | strlen - String length |
| Java/27 | flipCase - Flip upper/lower case |
| Java/28 | concatenate - Concatenate strings |
| Java/30 | getPositive - Filter positive numbers |
| Java/35 | maxElement - Find maximum element |
| Java/42 | incrList - Increment list elements |
| Java/45 | triangleArea - Calculate triangle area |
| Java/53 | add - Add two numbers |
| Java/60 | sumToN - Sum from 1 to n |

#### Medium (10)
| Task ID | Description |
|---------|-------------|
| Java/0  | hasCloseElements - Check threshold |
| Java/3  | belowZero - Check balance below zero |
| Java/7  | filterBySubstring - Filter by substring |
| Java/13 | greatestCommonDivisor - GCD |
| Java/14 | allPrefixes - All string prefixes |
| Java/18 | countSubstring - Count overlapping substrings |
| Java/26 | removeDuplicates - Remove duplicates |
| Java/31 | isPrime - Check prime number |
| Java/48 | isPalindrome - Check palindrome |
| Java/55 | fib - Fibonacci number |

#### Hard (10)
| Task ID | Description |
|---------|-------------|
| Java/1  | separateParenGroups - Separate parentheses groups |
| Java/10 | shortestPalindrome - Shortest palindrome |
| Java/32 | findZero - Find polynomial zero |
| Java/39 | primeFib - Prime Fibonacci number |
| Java/46 | fib4 - Fib4 sequence |
| Java/59 | largestPrimeFactor - Largest prime factor |
| Java/68 | fruitDistribution - Fruit distribution |
| Java/89 | encrypt - Caesar cipher encryption |
| Java/129| minPath - Minimum path in grid |
| Java/160| do_algebra - Evaluate algebra expression |

### LLM Models Used
1. **Gemini 3.1 Pro** - Google's latest language model
2. **Claude Sonnet 4.6** - Anthropic's language model

### Selection Criteria
- **Difficulty Distribution**: Based on algorithm complexity, number of loops, edge cases
- **Phase 2 Compatibility**: Includes #18, #23, #27 for BookScan class
- **Diversity**: Covers string, number, list, and math operations
- **Testability**: Suitable for equivalence partitioning and boundary testing

### How to Run

#### Prerequisites
- Java 17+
- Maven 3.8+

#### Build
```bash
mvn clean compile
```

#### Run Tests
```bash
mvn test
```

#### Generate Coverage Report
```bash
mvn test jacoco:report
```
Coverage report will be available at `target/site/jacoco/index.html`

### Log Format
All LLM interactions are logged in the `logs/` directory as one JSON file per task:
- Path format: `logs/{model}/Task{id}.json`
- Top-level fields:
  - `task_id` (e.g., `Java/1`)
  - `llm` (e.g., `Gemini 3.1 Pro`, `Claude Sonnet 4.6`)
  - `difficulty` (`easy`, `moderate`, `hard`)
  - `interactions` (array)
- Each item in `interactions` includes:
  - `step` (e.g., `code_generation`, `test_improvement`, `test_improvement_2`)
  - `date`
  - `prompt` (string array, full prompt lines)
  - `response` (string array, full unedited model response lines)
  - `modified` (`true` / `false`)
  - `notes` (manual edits, corrections, or usage notes)

---

## Phase 1 Results

### Base Test Results

#### Easy Tasks
| Task | Test File | Tests | Gemini | Claude | Owner |
|------|-----------|-------|--------|--------|-------|
| Java/2 | Task2Test.java | 6 | ✅ Pass | ✅ Pass | İbrahim |
| Java/23 | Task23Test.java | 6 | ✅ Pass | ✅ Pass | İbrahim |
| Java/27 | Task27Test.java | 6 | ✅ Pass | ✅ Pass | İbrahim |
| Java/28 | Task28Test.java | 6 | ✅ Pass | ✅ Pass | İbrahim |
| Java/30 | Task30Test.java | 8 | ✅ Pass | ✅ Pass | İbrahim |
| Java/35 | Task35Test.java | 12 | ✅ Pass | ✅ Pass | Başar |
| Java/42 | Task42Test.java | 11 | ✅ Pass | ✅ Pass | Başar |
| Java/45 | Task45Test.java | 11 | ✅ Pass| ✅ Pass | Başar |
| Java/53 | Task53Test.java | 11 | ✅ Pass | ✅ Pass | Başar |
| Java/60 | Task60Test.java | 11 | ✅ Pass | ✅ Pass | Başar |

#### Medium Tasks
| Task | Test File | Tests | Gemini | Claude | Owner |
|------|-----------|-------|--------|--------|-------|
| Java/0 | Task0Test.java | 7 | ✅ Pass | ✅ Pass | Ahmet |
| Java/3 | Task3Test.java | 6 | ✅ Pass | ✅ Pass | Ahmet |
| Java/7 | Task7Test.java | 4 | ✅ Pass | ✅ Pass | Ahmet |
| Java/13 | Task13Test.java | 4 | ✅ Pass | ✅ Pass | Ahmet |
| Java/14 | Task14Test.java | 3 | ✅ Pass | ✅ Pass | Ahmet |
| Java/18 | Task18Test.java | 4 | ✅ Pass | ✅ Pass | Ahmet |
| Java/26 | Task26Test.java | 3 | ✅ Pass | ✅ Pass | Ahmet |
| Java/31 | Task31Test.java | 13 | ✅ Pass | ✅ Pass | Ahmet |
| Java/48 | Task48Test.java | 7 | ✅ Pass | ✅ Pass | Ahmet |
| Java/55 | Task55Test.java | 5 | ✅ Pass | ✅ Pass | Ahmet |

#### Hard Tasks
| Task | Test File | Tests | Gemini | Claude | Owner |
|------|-----------|-------|--------|--------|-------|
| Java/1 | Task1Test.java | 8 | ✅ Pass | ✅ Pass | İbrahim |
| Java/10 | Task10Test.java | 10 | ✅ Pass | ✅ Pass | İbrahim |
| Java/32 | Task32Test.java | 2 | ✅ Pass | ✅ Pass | İbrahim |
| Java/39 | Task39Test.java | 20 | ✅ Pass | ✅ Pass | İbrahim |
| Java/46 | Task46Test.java | 8 | ✅ Pass | ✅ Pass | İbrahim |
| Java/59 | Task59Test.java | 11 | ✅ Pass | ✅ Pass | Başar |
| Java/68 | Task68Test.java | 11 | ✅ Pass | ✅ Pass | Başar |
| Java/89 | Task89Test.java | 11 | ✅ Pass | ✅ Pass | Başar |
| Java/129 | Task129Test.java | 11 | ✅ Pass | ✅ Pass | Başar |
| Java/160 | Task160Test.java | 11 | ✅ Pass | ✅ Pass | Başar |

#### Summary (İbrahim's Tasks)
| Metric | Value |
|--------|-------|
| Total Tests | 80 |
| Passed | 80 |
| Failed | 0 |

#### Summary (Başar's Tasks)
| Metric | Value |
|--------|-------|
| Total Tests | 111 |
| Passed | 111 |
| Failed | 0 |

#### Summary (Ahmet's Tasks)
| Metric | Value |
|--------|-------|
| Total Tests | 56 |
| Passed | 56 |
| Failed | 0 |

### Code Coverage (JaCoCo) - After Base Tests

| Package | Instruction Coverage | Branch Coverage |
|---------|---------------------|-----------------|
| solutions.claude | 98% | 91% |
| solutions.gemini | 99% | 93% |
| **Total** | **99%** | **92%** |

---

## Test Improvement Results

### Improved Tests Summary (İbrahim's Tasks)

Tests were improved using JaCoCo branch coverage analysis and JNose test smell detection.

| Task | Base Tests | Improved Tests | JaCoCo Issues Fixed | JNose Smells Fixed |
|------|------------|----------------|---------------------|-------------------|
| Task 1 | 8 | 10 | else-if false branch | - |
| Task 2 | 6 | 8 | - | Magic Number (6) |
| Task 10 | 10 | 7 | null check, unreachable branch* | - |
| Task 23 | 6 | 9 | - | Magic Number (6) |
| Task 27 | 6 | - | ✅ Clean | ✅ Clean |
| Task 28 | 6 | - | ✅ Clean | ✅ Clean |
| Task 30 | 8 | 9 | - | Magic Number (4) |
| Task 32 | 2 | 9 | bound expansion loop | Magic Number (2), Conditional Logic (6) |
| Task 39 | 20 | 12 | - | Magic Number (20) |
| Task 46 | 8 | 10 | base case if branches | Magic Number (8) |

*Task 10 and Task 32 have unreachable branches due to code structure (loop always breaks before natural termination).

### Improved Tests Summary (Başar's Tasks)

Tests were improved using JaCoCo branch coverage analysis and JNose test smell detection.

| Task | Base Tests | Improved Tests | JaCoCo Issues Fixed | JNose Smells Fixed |
|------|------------|----------------|---------------------|-------------------|
| Task 35 | 12 | 10 | ✅ Clean | ✅ Clean |
| Task 42 | 11 | 12 | ✅ Clean | Magic Number (8), Assertion Roulette (1)|
| Task 45 | 11 | - | ✅ Clean | Magic Number (11), Assertion Roulette (1) |
| Task 53 | 11 | - | ✅ Clean | Magic Number (11) |
| Task 59 | 11 | 13 | ✅ Clean | Magic Number (13), Assertion Roulette (2) |
| Task 60 | 11 | - | ✅ Clean | Magic Number (11) |
| Task 68 | 11 | 14 | null & empty list branches | Magic Number (8), Assertion Roulette (1) |
| Task 89 | 11 | 19 | Uppercase & symbol branches | Magic Number (11) |
| Task 129 | 11 | - | ✅ Clean | Magic Number (12), Assertion Roulette (1) |
| Task 160 | 11 | 14 | default switch branch | Magic Number (12), Assertion Roulette (1) |


### Code Coverage (JaCoCo) - After Improved Tests

| Package | Instruction Coverage | Branch Coverage |
|---------|---------------------|-----------------|
| solutions.claude | **99%** | **98%** |
| solutions.gemini | **100%** | **97%** |
| **Total** | **99%** | **97%** |

**Details:**
- Instructions: 849/851 covered (99%)
- Branches: 125/128 covered (97%)
- Lines: 205/206 covered (99%)
- Methods: 48/48 covered (100%)
- Classes: 20/20 covered (100%)

**Coverage Improvement:**
- Instruction Coverage: 96% → **99%** (+3%)
- Branch Coverage: 88% → **97%** (+9%)

### Test Execution Summary

| Metric | Value |
|--------|-------|
| Total Tests | 154 |
| Passed | 154 |
| Failed | 0 |
| Errors | 0 |

---

## Manual Assessment (Step 4)

Black-box testing using Equivalence Class Partitioning (ECP) and Boundary Value Analysis (BVA).
Mutations based on [EvalPlus paper](https://openreview.net/pdf?id=1qvx610Cu7) Table 1.

### Detailed Analysis

| Owner | Tasks | Details |
|-------|-------|---------|
| İbrahim | 1, 2, 10, 23, 27, 28, 30, 32, 39, 46 | [docs/manual_assessment_ibrahim.md](docs/manual_assessment_ibrahim.md) |
| Başar | TBD | TBD |
| Ahmet | TBD | TBD |

### Summary (İbrahim's Tasks)

| Task | ECP Classes | Base Coverage | Coverage % |
|------|-------------|---------------|------------|
| Task 1 | 10 | 5/10 | 50% |
| Task 2 | 9 | 2/9 | 22% |
| Task 10 | 10 | 5/10 | 50% |
| Task 23 | 8 | 3/8 | 37.5% |
| Task 27 | 9 | 6/9 | 67% |
| Task 28 | 8 | 2/8 | 25% |
| Task 30 | 9 | 4/9 | 44% |
| Task 32 | 9 | 5/9 | 56% |
| Task 39 | 7 | 4/7 | 57% |
| Task 46 | 9 | 2/9 | 22% |
| **Average** | **8.8** | **3.8/8.8** | **43%** |

**Conclusion:** Base tests cover only ~43% of identified equivalence classes. Boundary values and invalid inputs are largely untested.
