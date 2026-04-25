# Manual Assessment - İbrahim Mert Sürme

Black-box testing using Equivalence Class Partitioning (ECP) and Boundary Value Analysis (BVA).
Mutations based on [EvalPlus paper](https://openreview.net/pdf?id=1qvx610Cu7) Table 1.

**Tasks:** 1, 2, 10, 23, 27, 28, 30, 32, 39, 46

---

## Task 1: separateParenGroups

**Function:** `separateParenGroups(String paren_string) → List<String>`

**Description:** Separate balanced parentheses groups from input string, ignoring spaces.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty string | Boundary | `""` | `[]` |
| EC2 | Only spaces | Boundary | `"   "` | `[]` |
| EC3 | Minimum group | Valid | `"()"` | `["()"]` |
| EC4 | Single nested group | Valid | `"(())"` | `["(())"]` |
| EC5 | Multiple groups | Valid | `"()()"` | `["()", "()"]` |
| EC6 | Multiple nested | Valid | `"(()) (()())"` | `["(())", "(()())"]` |
| EC7 | Input with spaces | Valid | `"( ) (( ))"` | `["()", "(())"]` |
| EC8 | Deep nesting | Valid | `"(((())))"` | `["(((())))"]` |
| EC9 | Unbalanced (extra open) | Invalid | `"(()"` | Undefined |
| EC10 | Unbalanced (extra close) | Invalid | `"())"` | Undefined |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min string length | `""` | Empty input |
| BV2 | Min group length | `"()"` | Smallest valid group |
| BV3 | Max nesting depth | `"((((()))))"` | Deep nesting stress test |
| BV4 | Single group | `"()"` | Group count = 1 |
| BV5 | Many groups | `"()()()()()"` | Group count = 5 |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ❌ | - |
| EC2 | ❌ | - |
| EC3 | ❌ | - |
| EC4 | ✅ | nestedGroups |
| EC5 | ✅ | multipleGroups |
| EC6 | ✅ | multipleGroups |
| EC7 | ✅ | spacesInside |
| EC8 | ✅ | nestedGroups |
| EC9 | ❌ | - |
| EC10 | ❌ | - |

**Coverage: 5/10 (50%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| str: remove all | `"()()"` | `""` | EC1 |
| str: replace with spaces | `"()"` | `"   "` | EC2 |
| str: remove substring | `"()()"` | `"()"` | EC3 |
| str: repeat substring | `"()"` | `"()()()()()"` | BV5 |
| str: remove char | `"(())"` | `"(()"` | EC9 |
| str: remove char | `"(())"` | `"())"` | EC10 |

---

## Task 2: truncateNumber

**Function:** `truncateNumber(double number) → double`

**Description:** Return the decimal part of a positive floating point number.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | x > 1 with decimal | Valid | `3.5` | `0.5` |
| EC2 | Large number with decimal | Valid | `123.456` | `0.456` |
| EC3 | Whole number (x.0) | Valid | `5.0` | `0.0` |
| EC4 | 0 < x < 1 | Valid | `0.75` | `0.75` |
| EC5 | x = 0 | Boundary | `0.0` | `0.0` |
| EC6 | x = 1.0 | Boundary | `1.0` | `0.0` |
| EC7 | Very small decimal | Valid | `1.0001` | `0.0001` |
| EC8 | Close to next integer | Valid | `2.9999` | `0.9999` |
| EC9 | Negative number | Invalid | `-3.5` | Undefined* |

*Spec says "positive floating point number"

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Zero | `0.0` | Minimum valid input |
| BV2 | Just above zero | `0.0001` | Near minimum |
| BV3 | Just below 1 | `0.9999` | Max decimal before 1 |
| BV4 | Exactly 1 | `1.0` | Integer boundary |
| BV5 | Very large | `999999.123` | Large number stress |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | truncateNumber_3_5, truncateNumber_1_33 |
| EC2 | ✅ | truncateNumber_123_456 |
| EC3 | ❌ | - |
| EC4 | ❌ | - |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |
| EC9 | ❌ | - |

**Coverage: 2/9 (22%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| float: x - x | `3.5` | `0.0` | EC5 |
| float: floor(x) | `3.5` | `5.0` | EC3 |
| float: x - 1 | `1.33` | `0.33` | EC4 |
| float: x + 1 | `0.9999` | `1.9999` | EC8 |
| float: x * 1000 | `0.123` | `123.123` | EC2 |

---

## Task 10: makePalindrome

**Function:** `makePalindrome(String string) → String`

**Description:** Find the shortest palindrome that begins with the supplied string.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty string | Boundary | `""` | `""` |
| EC2 | Single character | Valid | `"x"` | `"x"` |
| EC3 | Already palindrome (odd) | Valid | `"xyx"` | `"xyx"` |
| EC4 | Already palindrome (even) | Valid | `"abba"` | `"abba"` |
| EC5 | Non-palindrome (odd length) | Valid | `"xyz"` | `"xyzyx"` |
| EC6 | Non-palindrome (even length) | Valid | `"jerry"` | `"jerryrrej"` |
| EC7 | Partial palindrome suffix | Valid | `"cata"` | `"catac"` |
| EC8 | All same characters | Valid | `"aaa"` | `"aaa"` |
| EC9 | Two different chars | Boundary | `"ab"` | `"aba"` |
| EC10 | null input | Invalid | `null` | `""` |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min length | `""` | Empty string |
| BV2 | Length = 1 | `"x"` | Single character |
| BV3 | Length = 2 (same) | `"aa"` | Min even palindrome |
| BV4 | Length = 2 (different) | `"ab"` | Min non-palindrome |
| BV5 | Long string | `"abcdefgh"` | Stress test |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | makePalindrome_empty |
| EC2 | ✅ | makePalindrome_singleChar |
| EC3 | ✅ | makePalindrome_alreadyPalindrome |
| EC4 | ❌ | - |
| EC5 | ✅ | makePalindrome_xyz |
| EC6 | ✅ | makePalindrome_jerry |
| EC7 | ❌ | - |
| EC8 | ❌ | - |
| EC9 | ❌ | - |
| EC10 | ❌ | - |

**Coverage: 5/10 (50%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| str: repeat char | `"x"` | `"aa"` | EC8 |
| str: add char | `"xyx"` | `"abba"` | EC4 |
| str: substring | `"catac"` | `"cata"` | EC7 |
| str: truncate | `"xyz"` | `"ab"` | EC9 |
| special: null | `"x"` | `null` | EC10 |

---

## Task 23: strlen

**Function:** `strlen(String string) → int`

**Description:** Return the length of the given string.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty string | Boundary | `""` | `0` |
| EC2 | Single character | Valid | `"x"` | `1` |
| EC3 | Multiple characters | Valid | `"abc"` | `3` |
| EC4 | String with spaces | Valid | `"a b c"` | `5` |
| EC5 | Only spaces | Valid | `"   "` | `3` |
| EC6 | Special characters | Valid | `"!@#$"` | `4` |
| EC7 | Unicode characters | Valid | `"héllo"` | `5` |
| EC8 | null input | Invalid | `null` | NullPointerException |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min length | `""` | Length = 0 |
| BV2 | Length = 1 | `"x"` | Single char |
| BV3 | Very long string | 1000+ chars | Stress test |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | strlen_empty |
| EC2 | ✅ | strlen_single |
| EC3 | ✅ | strlen_multiple |
| EC4 | ❌ | - |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |

**Coverage: 3/8 (37.5%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| str: insert space | `"abc"` | `"a b c"` | EC4 |
| str: replace all | `"abc"` | `"   "` | EC5 |
| str: replace with special | `"abc"` | `"!@#$"` | EC6 |
| str: add unicode | `"hello"` | `"héllo"` | EC7 |

---

## Task 27: flipCase

**Function:** `flipCase(String string) → String`

**Description:** Flip lowercase characters to uppercase and vice versa.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty string | Boundary | `""` | `""` |
| EC2 | All lowercase | Valid | `"hello"` | `"HELLO"` |
| EC3 | All uppercase | Valid | `"HELLO"` | `"hello"` |
| EC4 | Mixed case | Valid | `"HeLLo"` | `"hEllO"` |
| EC5 | With numbers | Valid | `"Test123"` | `"tEST123"` |
| EC6 | With special chars | Valid | `"Hi!@#"` | `"hI!@#"` |
| EC7 | Only numbers | Valid | `"12345"` | `"12345"` |
| EC8 | Only special chars | Valid | `"!@#$%"` | `"!@#$%"` |
| EC9 | With spaces | Valid | `"Hello World"` | `"hELLO wORLD"` |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min length | `""` | Empty string |
| BV2 | Single lowercase | `"a"` | Min lowercase |
| BV3 | Single uppercase | `"A"` | Min uppercase |
| BV4 | Boundary char 'a' | `"a"` | First lowercase |
| BV5 | Boundary char 'Z' | `"Z"` | Last uppercase |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | flipCase_empty |
| EC2 | ✅ | flipCase_sentence (partial) |
| EC3 | ✅ | flipCase_sentence (partial) |
| EC4 | ✅ | flipCase_hello |
| EC5 | ❌ | - |
| EC6 | ✅ | flipCase_hello ("Hello!") |
| EC7 | ❌ | - |
| EC8 | ❌ | - |
| EC9 | ✅ | flipCase_sentence |

**Coverage: 6/9 (67%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| str: add digits | `"Hello"` | `"Test123"` | EC5 |
| str: replace with digits | `"Hello"` | `"12345"` | EC7 |
| str: replace with special | `"Hello"` | `"!@#$%"` | EC8 |

---

## Task 28: concatenate

**Function:** `concatenate(List<String> strings) → String`

**Description:** Concatenate list of strings into a single string.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty list | Boundary | `[]` | `""` |
| EC2 | Single element | Valid | `["a"]` | `"a"` |
| EC3 | Multiple elements | Valid | `["a", "b", "c"]` | `"abc"` |
| EC4 | Elements with spaces | Valid | `["a ", " b"]` | `"a  b"` |
| EC5 | Empty strings in list | Valid | `["a", "", "b"]` | `"ab"` |
| EC6 | All empty strings | Valid | `["", "", ""]` | `""` |
| EC7 | Long strings | Valid | `["hello", "world"]` | `"helloworld"` |
| EC8 | null in list | Invalid | `["a", null]` | NullPointerException |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min list size | `[]` | Empty list |
| BV2 | List size = 1 | `["x"]` | Single element |
| BV3 | Empty string element | `[""]` | Min string length |
| BV4 | Many elements | 100+ elements | Stress test |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | concatenate_empty |
| EC2 | ❌ | - |
| EC3 | ✅ | concatenate_xyz |
| EC4 | ❌ | - |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |

**Coverage: 2/8 (25%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| list: truncate | `["a","b","c"]` | `["a"]` | EC2 |
| list: insert empty | `["a","b"]` | `["a","","b"]` | EC5 |
| list: replace all empty | `["a","b"]` | `["","",""]` | EC6 |
| str: expand | `["x","y"]` | `["hello","world"]` | EC7 |

---

## Task 30: getPositive

**Function:** `getPositive(List<Integer> l) → List<Integer>`

**Description:** Return only positive numbers from the list.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty list | Boundary | `[]` | `[]` |
| EC2 | All positive | Valid | `[1, 2, 3]` | `[1, 2, 3]` |
| EC3 | All negative | Valid | `[-1, -2]` | `[]` |
| EC4 | Mixed positive/negative | Valid | `[-1, 2, -3, 4]` | `[2, 4]` |
| EC5 | Contains zero | Valid | `[0, 1, -1]` | `[1]` |
| EC6 | Only zero | Boundary | `[0]` | `[]` |
| EC7 | Single positive | Valid | `[5]` | `[5]` |
| EC8 | Single negative | Valid | `[-5]` | `[]` |
| EC9 | Large numbers | Valid | `[1000000, -1000000]` | `[1000000]` |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min list | `[]` | Empty list |
| BV2 | Zero boundary | `[0]` | Zero is not positive |
| BV3 | x = 1 | `[1]` | Minimum positive |
| BV4 | x = -1 | `[-1]` | Maximum negative |
| BV5 | Integer.MAX_VALUE | `[2147483647]` | Max int |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | getPositive_empty |
| EC2 | ❌ | - |
| EC3 | ✅ | getPositive_allNegative |
| EC4 | ✅ | getPositive_mixed |
| EC5 | ✅ | getPositive_complex (contains 0) |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |
| EC9 | ❌ | - |

**Coverage: 4/9 (44%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| list: filter positive only | `[-1,2,3]` | `[1,2,3]` | EC2 |
| list: single element | `[1,2,3]` | `[5]` | EC7 |
| list: single negative | `[-1,-2]` | `[-5]` | EC8 |
| int: x * 1000 | `[1,-1]` | `[1000000,-1000000]` | EC9 |
| list: only zero | `[0,1]` | `[0]` | EC6 |

---

## Task 32: findZero

**Function:** `findZero(List<Double> xs) → double`

**Description:** Find x such that poly(x) = 0, where xs are polynomial coefficients.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Linear (2 coeffs) | Valid | `[1.0, 2.0]` | `-0.5` |
| EC2 | Quadratic (4 coeffs) | Valid | `[-6.0, 11.0, -6.0, 1.0]` | `1.0, 2.0, or 3.0` |
| EC3 | Higher degree (6 coeffs) | Valid | 6 coefficients | One root |
| EC4 | Positive root | Valid | `[-2.0, 1.0]` | `2.0` |
| EC5 | Negative root | Valid | `[2.0, 1.0]` | `-2.0` |
| EC6 | Zero at origin | Valid | `[0.0, 1.0]` | `0.0` |
| EC7 | Small coefficients | Valid | `[0.001, 1.0]` | `-0.001` |
| EC8 | Large coefficients | Valid | `[-1000.0, 1.0]` | `1000.0` |
| EC9 | Odd number of coeffs | Invalid | `[1.0, 2.0, 3.0]` | Undefined* |

*Spec requires even number of coefficients

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min coeffs (2) | `[a, b]` | Linear equation |
| BV2 | Root = 0 | `[0.0, 1.0]` | Zero boundary |
| BV3 | Very small root | `[-0.0001, 1.0]` | Precision test |
| BV4 | Very large root | `[-1000000.0, 1.0]` | Large value |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | randomPolynomials (includes linear) |
| EC2 | ✅ | randomPolynomials (includes quadratic) |
| EC3 | ✅ | randomPolynomials (includes degree 6) |
| EC4 | ✅ | randomPolynomials (random) |
| EC5 | ✅ | randomPolynomials (random) |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |
| EC9 | ❌ | - |

**Coverage: 5/9 (56%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| list: first elem = 0 | `[1.0, 2.0]` | `[0.0, 1.0]` | EC6 |
| float: x / 1000 | `[1.0, 2.0]` | `[0.001, 1.0]` | EC7 |
| float: x * 1000 | `[-1.0, 1.0]` | `[-1000.0, 1.0]` | EC8 |

---

## Task 39: primeFib

**Function:** `primeFib(int n) → int`

**Description:** Return n-th number that is both Fibonacci and prime.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | n = 1 (first) | Boundary | `1` | `2` |
| EC2 | Small n | Valid | `3` | `5` |
| EC3 | Medium n | Valid | `5` | `89` |
| EC4 | Large n | Valid | `10` | `433494437` |
| EC5 | n = 0 | Invalid | `0` | Undefined |
| EC6 | Negative n | Invalid | `-1` | Undefined |
| EC7 | n causing overflow | Invalid | `11+` | Overflow |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min valid n | `1` | First prime Fibonacci |
| BV2 | n = 0 | `0` | Below min |
| BV3 | Large n before overflow | `10` | Max safe int result |
| BV4 | n causing overflow | `11` | Result exceeds int |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | primeFib_1 |
| EC2 | ✅ | primeFib_3 |
| EC3 | ✅ | primeFib_5 |
| EC4 | ✅ | primeFib_10 |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ❌ | - |

**Coverage: 4/7 (57%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| int: x - 1 | `1` | `0` | EC5 |
| int: -x | `1` | `-1` | EC6 |
| int: x + 1 | `10` | `11` | EC7 |

---

## Task 46: fib4

**Function:** `fib4(int n) → int`

**Description:** Compute n-th element of Fib4 sequence: fib4(n) = fib4(n-1) + fib4(n-2) + fib4(n-3) + fib4(n-4).

Base cases: fib4(0)=0, fib4(1)=0, fib4(2)=2, fib4(3)=0

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | n = 0 (base case) | Boundary | `0` | `0` |
| EC2 | n = 1 (base case) | Boundary | `1` | `0` |
| EC3 | n = 2 (base case) | Boundary | `2` | `2` |
| EC4 | n = 3 (base case) | Boundary | `3` | `0` |
| EC5 | n = 4 (first computed) | Valid | `4` | `2` |
| EC6 | Small n > 4 | Valid | `5` | `4` |
| EC7 | Medium n | Valid | `10` | `104` |
| EC8 | Large n | Valid | `20` | `66012` |
| EC9 | Negative n | Invalid | `-1` | Undefined |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | n = 0 | `0` | First base case |
| BV2 | n = 3 | `3` | Last base case |
| BV3 | n = 4 | `4` | First computed value |
| BV4 | n = -1 | `-1` | Below valid range |
| BV5 | Large n | `30` | Performance test |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ❌ | - |
| EC2 | ❌ | - |
| EC3 | ❌ | - |
| EC4 | ❌ | - |
| EC5 | ❌ | - |
| EC6 | ✅ | fib4_5 |
| EC7 | ✅ | fib4_10 |
| EC8 | ❌ | - |
| EC9 | ❌ | - |

**Coverage: 2/9 (22%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| int: x - 5 | `5` | `0` | EC1 |
| int: x - 4 | `5` | `1` | EC2 |
| int: x - 3 | `5` | `2` | EC3 |
| int: x - 2 | `5` | `3` | EC4 |
| int: x - 1 | `5` | `4` | EC5 |
| int: x * 4 | `5` | `20` | EC8 |
| int: -x | `5` | `-1` | EC9 |

---

## Summary

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

**Conclusion:** Base tests cover only ~43% of identified equivalence classes. Boundary values and invalid inputs are largely untested. Mutation-based test generation is recommended to improve coverage.
