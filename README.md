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
├── humaneval_java.jsonl     # HumanEval Java dataset
├── pom.xml                  # Maven configuration
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

### Commit Message Convention
Each commit should follow this format:
```
Step X: [Description of what was changed and why]
```
Example: `Step 3: Improved boundary condition tests based on branch coverage analysis`

### Log Format
All LLM interactions are logged in the `logs/` directory with the following structure:
- Full prompt sent to the agent
- Agent's response
- Notes on how the output was used or modified
