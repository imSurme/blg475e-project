## Task 35: maxElement

**Function:** `maxElement(List<Integer> l) → int`

**Description:** Return the maximum element in a list of integers.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty list | Invalid/Boundary | `[]` | Exception/Undefined |
| EC2 | Null list | Invalid/Boundary | `null` | Exception/Undefined |
| EC3 | Single element | Valid | `[5]` | `5` |
| EC4 | All positive elements | Valid | `[1, 5, 3]` | `5` |
| EC5 | All negative elements | Valid | `[-5, -1, -3]` | `-1` |
| EC6 | Mixed positive & negative | Valid | `[-2, 0, 5]` | `5` |
| EC7 | Duplicate max elements | Valid | `[5, 1, 5]` | `5` |
| EC8 | Max element at boundaries | Valid | `[9, 1, 2]` | `9` |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min list length | `[]` | Empty input handling |
| BV2 | Single element | `[42]` | Smallest valid list size |
| BV3 | Max Integer Value | `[2147483647]` | Upper bound limit test |
| BV4 | Min Integer Value | `[-2147483648]` | Lower bound limit test |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ❌ | - |
| EC2 | ❌ | - |
| EC3 | ❌ | - |
| EC4 | ✅ | normalPositiveValues |
| EC5 | ❌ | - |
| EC6 | ✅ | mixedValues |
| EC7 | ❌ | - |
| EC8 | ✅ | maxAtEnd |

**Coverage: 3/8 (37.5%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| list: remove all | `[1, 5, 3]` | `[]` | EC1 |
| list: single element | `[1, 5, 3]` | `[5]` | EC3 |
| list: make negative | `[1, 5, 3]` | `[-1, -5, -3]` | EC5 |

---

## Task 42: incrList

**Function:** `incrList(List<Integer> l) → List<Integer>`

**Description:** Return a new list with each element incremented by 1.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty list | Boundary | `[]` | `[]` |
| EC2 | Null input | Boundary | `null` | `[]` |
| EC3 | All positive | Valid | `[1, 2, 3]` | `[2, 3, 4]` |
| EC4 | All negative | Valid | `[-3, -2, -1]` | `[-2, -1, 0]` |
| EC5 | Containing zero | Valid | `[-1, 0, 1]` | `[0, 1, 2]` |
| EC6 | Single element | Valid | `[5]` | `[6]` |
| EC7 | Large integers | Valid | `[1000, 2000]` | `[1001, 2001]` |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min list length | `[]` | Empty list handling |
| BV2 | Zero inclusion | `0` | Transition from negative to positive |
| BV3 | Max integer bound | `[2147483646]` | Edge case before wrap-around |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | emptyList |
| EC2 | ✅ | nullInput |
| EC3 | ✅ | normalValues |
| EC4 | ✅ | negativeValues |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ❌ | - |

**Coverage: 4/7 (57%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| list: single element | `[1, 2, 3]` | `[1]` | EC6 |
| list: scale up values | `[1, 2]` | `[1000, 2000]` | EC7 |
| num: set to zero | `[1, 2]` | `[0, 1]` | EC5 |

---

## Task 45: triangleArea

**Function:** `triangleArea(double base, double height) → double`

**Description:** Calculate the area of a triangle given base and height.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Normal integer values | Valid | `b=4.0, h=5.0` | `10.0` |
| EC2 | Normal decimal values | Valid | `b=3.0, h=5.0` | `7.5` |
| EC3 | Base is zero | Boundary | `b=0.0, h=10.0` | `0.0` |
| EC4 | Height is zero | Boundary | `b=10.0, h=0.0` | `0.0` |
| EC5 | Base equals height | Valid | `b=4.0, h=4.0` | `8.0` |
| EC6 | Negative values | Invalid | `b=-4.0, h=5.0` | Undefined/Error |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Minimum dimension | `0.0` | Zero area lower bound |
| BV2 | Small decimals | `b=0.5, h=1.0` | Floating-point precision test |
| BV3 | Large inputs | `b=1000, h=1000` | Floating-point scaling |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | normalValues |
| EC2 | ✅ | decimalValues |
| EC3 | ✅ | zeroBase |
| EC4 | ✅ | zeroHeight |
| EC5 | ❌ | - |
| EC6 | ❌ | - |

**Coverage: 4/6 (66.6%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| num: set to zero | `b=4.0, h=5.0` | `b=0.0, h=5.0` | EC3 |
| num: make negative | `b=4.0, h=5.0` | `b=-4.0, h=5.0` | EC6 |
| num: equalize | `b=4.0, h=5.0` | `b=4.0, h=4.0` | EC5 |

---

## Task 53: add

**Function:** `add(int x, int y) → int`

**Description:** Add two integer numbers together.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Two positive integers | Valid | `x=2, y=3` | `5` |
| EC2 | Two negative integers | Valid | `x=-2, y=-3` | `-5` |
| EC3 | Positive and negative | Valid | `x=5, y=-2` | `3` |
| EC4 | Both zero | Boundary | `x=0, y=0` | `0` |
| EC5 | Resulting in zero | Valid | `x=5, y=-5` | `0` |
| EC6 | Large numbers | Valid | `x=1000, y=2000` | `3000` |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Zero value | `x=0, y=0` | Neutral element of addition |
| BV2 | Max bound limit | `x=Integer.MAX_VALUE - 1, y=1` | Test just before overflow |
| BV3 | Min bound limit | `x=Integer.MIN_VALUE + 1, y=-1` | Test just before underflow |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | addPositiveNumbers |
| EC2 | ❌ | - |
| EC3 | ✅ | addMixedNumbers |
| EC4 | ❌ | - |
| EC5 | ❌ | - |
| EC6 | ❌ | - |

**Coverage: 2/6 (33.3%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| num: set to zero | `x=2, y=3` | `x=0, y=0` | EC4 |
| num: make negative | `x=2, y=3` | `x=-2, y=-3` | EC2 |
| num: invert sign | `x=2, y=3` | `x=2, y=-2` | EC5 |

---

## Task 59: largestPrimeFactor

**Function:** `largestPrimeFactor(int n) → int`

**Description:** Return the largest prime factor of a given number `n`.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Prime number | Valid | `n=29` | `29` |
| EC2 | Composite number | Valid | `n=15` | `5` |
| EC3 | Power of two | Valid | `n=64` | `2` |
| EC4 | Large composite | Valid | `n=13195` | `29` |
| EC5 | Smallest prime | Boundary | `n=2` | `2` |
| EC6 | Number 3 | Boundary | `n=3` | `3` |
| EC7 | Product of primes | Valid | `n=390` | `13` |
| EC8 | Negative / Zero | Invalid | `n=-5` | Undefined/Exception |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Smallest valid prime | `n=2` | Minimum valid input boundary |
| BV2 | Smallest odd prime | `n=3` | `for` loop initialization boundary |
| BV3 | Large threshold | `n=13195` | Large computational bound |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | primeNumber |
| EC2 | ✅ | compositeNumber |
| EC3 | ✅ | powerOfTwo |
| EC4 | ✅ | largeComposite |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |

**Coverage: 4/8 (50%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| num: set to minimum | `n=15` | `n=2` | EC5 |
| num: scale up product | `n=15` | `n=390` | EC7 |
| num: make negative | `n=15` | `n=-15` | EC8 |

---

## Task 60: sumToN

**Function:** `sumToN(int n) → int`

**Description:** Return the sum of numbers from 1 to `n` (inclusive).

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Normal positive | Valid | `n=5` | `15` |
| EC2 | Minimum positive | Boundary | `n=1` | `1` |
| EC3 | Zero | Boundary | `n=0` | `0` |
| EC4 | Negative input | Invalid | `n=-5` | `0` (or Undefined) |
| EC5 | Large `n` | Valid | `n=100` | `5050` |
| EC6 | Very large `n` | Boundary | `n=100000` | Integer overflow test |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Zero | `n=0` | Loop lower bound / base case |
| BV2 | One | `n=1` | Minimum positive value |
| BV3 | Overflow risk | `n=65535` | Gauss formula (`n*(n+1)/2`) overflow limit |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | normalValues |
| EC2 | ❌ | - |
| EC3 | ❌ | - |
| EC4 | ❌ | - |
| EC5 | ✅ | largeValues |
| EC6 | ❌ | - |

**Coverage: 2/6 (33.3%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| num: set to zero | `n=5` | `n=0` | EC3 |
| num: set to one | `n=5` | `n=1` | EC2 |
| num: make negative | `n=5` | `n=-5` | EC4 |

---

## Task 68: pluck

**Function:** `pluck(List<Long> arr) → List<Long>`

**Description:** Find the node with the smallest even value. Return `[value, index]` or an empty list if no even value exists.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty list | Boundary | `[]` | `[]` |
| EC2 | Null input | Boundary | `null` | `[]` |
| EC3 | No even numbers | Valid | `[1, 3, 5]` | `[]` |
| EC4 | One even number | Valid | `[1, 2, 3]` | `[2, 1]` |
| EC5 | Multiple distinct evens | Valid | `[4, 2, 6]` | `[2, 1]` |
| EC6 | Duplicate min evens | Valid | `[2, 4, 2]` | `[2, 0]` (smallest index) |
| EC7 | Negative even numbers | Valid | `[-4, -2, 3]` | `[-4, 0]` |
| EC8 | Mixed positive/negative | Valid | `[-3, 0, 4]` | `[0, 1]` |
| EC9 | Large values | Valid | `[200000L, 4L]` | `[4, 1]` |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min list length | `[]` | Edge case handling |
| BV2 | Single element | `[2]` | Array bounds test |
| BV3 | Max/Min Long values | `[Long.MAX_VALUE, Long.MIN_VALUE]` | Data type overflow bounds |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ❌ | - |
| EC2 | ❌ | - |
| EC3 | ✅ | noEvenNumbers |
| EC4 | ✅ | singleEvenNumber |
| EC5 | ✅ | multipleEvens |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |
| EC9 | ❌ | - |

**Coverage: 3/9 (33.3%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| list: remove all | `[4, 2, 6]` | `[]` | EC1 |
| list: make odd | `[4, 2, 6]` | `[5, 3, 7]` | EC3 |
| list: make negative | `[4, 2, 6]` | `[-4, -2, -6]` | EC7 |

---

## Task 89: encrypt

**Function:** `encrypt(String s) → String`

**Description:** Caesar cipher shifting letters by 4. Preserves case, leaves non-alphabetical characters unchanged.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Empty string | Boundary | `""` | `""` |
| EC2 | Only lowercase | Valid | `"hi"` | `"lm"` |
| EC3 | Only uppercase | Valid | `"HELLO"` | `"LIPPS"` |
| EC4 | Mixed case letters | Valid | `"Hi"` | `"Lm"` |
| EC5 | Non-alphabetical | Valid | `"123 !?"` | `"123 !?"` |
| EC6 | Mixed letters/symbols | Valid | `"aB1!"` | `"eF1!"` |
| EC7 | Alphabet wrap-around | Boundary | `"xyz"` | `"bcd"` |
| EC8 | Null string | Invalid | `null` | Exception/Undefined |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min string length | `""` | Empty input check |
| BV2 | Lowercase boundary | `'z'` | Wraparound to `'d'` |
| BV3 | Uppercase boundary | `'Z'` | Wraparound to `'D'` |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ❌ | - |
| EC2 | ✅ | lowercaseShift |
| EC3 | ❌ | - |
| EC4 | ❌ | - |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ✅ | wraparound |
| EC8 | ✅ | normalString |

**Coverage: 3/8 (37.5%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| str: remove all | `"hi"` | `""` | EC1 |
| str: to uppercase | `"hi"` | `"HI"` | EC3 |
| str: add symbols | `"hi"` | `"hi123!"` | EC6 |

---

## Task 129: minPath

**Function:** `minPath(int[][] grid) → int`

**Description:** Find minimum path sum from top-left to bottom-right in a grid (down/right moves only).

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | 1x1 grid | Boundary | `[[5]]` | `5` |
| EC2 | 1xN grid (row) | Valid | `[[1, 2, 3]]` | `6` |
| EC3 | Nx1 grid (column) | Valid | `[[1], [2], [3]]` | `6` |
| EC4 | NxN normal grid | Valid | `[[1,3],[1,5]]` | `7` |
| EC5 | Grid with all zeros | Valid | `[[0,0],[0,0]]` | `0` |
| EC6 | Grid with negatives | Valid | `[[1,-2],[-1,-3]]` | `-4` |
| EC7 | Empty grid `[]` | Boundary | `[]` | Exception/Undefined |
| EC8 | Null grid | Boundary | `null` | Exception/Undefined |
| EC9 | Large grid | Valid | `100x100 matrix` | Calculated sum |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Minimal grid | `[[X]]` | No moves possible |
| BV2 | Single row/col bounds | `1xN` or `Nx1` | Only 1 valid move direction |
| BV3 | Extreme values | `[[Integer.MAX_VALUE]]` | DP integer overflow risk |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ❌ | - |
| EC2 | ❌ | - |
| EC3 | ❌ | - |
| EC4 | ✅ | normalGrid |
| EC5 | ✅ | zeroGrid |
| EC6 | ✅ | negativeGrid |
| EC7 | ✅ | emptyHandling |
| EC8 | ❌ | - |
| EC9 | ❌ | - |

**Coverage: 4/9 (44.4%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| matrix: 1x1 | `[[1,2],[3,4]]` | `[[1]]` | EC1 |
| matrix: single row | `[[1,2],[3,4]]` | `[[1,2]]` | EC2 |
| list: remove all | `[[1,2],[3,4]]` | `[]` | EC7 |

---

## Task 160: doAlgebra

**Function:** `doAlgebra(String[] operators, int[] operands) → int`

**Description:** Evaluate math operations sequentially (`+`, `-`, `*`). Operands length is ops length + 1.

### Equivalence Classes

| ID | Class | Type | Example Input | Expected Output |
|----|-------|------|---------------|-----------------|
| EC1 | Only addition | Valid | `["+"], [10, 5]` | `15` |
| EC2 | Only subtraction | Valid | `["-"], [10, 5]` | `5` |
| EC3 | Only multiplication | Valid | `["*"], [10, 5]` | `50` |
| EC4 | Mixed operations | Valid | `["+", "*"], [2, 3, 4]` | `20` |
| EC5 | Empty operators | Boundary | `[], [42]` | `42` |
| EC6 | Null inputs | Invalid | `null, null` | Exception/Undefined |
| EC7 | Invalid operator | Invalid | `["?"], [10, 5]` | `10` (default switch branch) |
| EC8 | Multiply by zero | Valid | `["*"], [5, 0]` | `0` |
| EC9 | Negative result | Valid | `["-"], [5, 10]` | `-5` |
| EC10 | Mismatched lengths | Invalid | `["+"], [10]` | Exception |

### Boundary Values

| ID | Boundary | Value | Rationale |
|----|----------|-------|-----------|
| BV1 | Min arrays | `ops=[], vals=[X]` | Shortest valid length |
| BV2 | Zero in multiplication | `val=0` | Logic zeroing |
| BV3 | Unknown branch | `op="?"` | Test the `default` switch case |

### Base Test Coverage

| EC ID | Covered? | Test Name |
|-------|----------|-----------|
| EC1 | ✅ | addition |
| EC2 | ✅ | subtraction |
| EC3 | ✅ | multiplication |
| EC4 | ✅ | mixedOps |
| EC5 | ❌ | - |
| EC6 | ❌ | - |
| EC7 | ❌ | - |
| EC8 | ❌ | - |
| EC9 | ❌ | - |
| EC10| ❌ | - |

**Coverage: 4/10 (40%)**

### Mutations Applied (from Paper Table 1)

| Mutation Type | Original Input | Mutated Input | Tests EC |
|---------------|----------------|---------------|----------|
| list: remove all | `["+"]` | `[]` | EC5 |
| str: invalid op | `["+"]` | `["?"]` | EC7 |
| num: set to zero | `[10, 5]` | `[10, 0]` | EC8 |

## Summary (Başar's Tasks)

| Task | ECP Classes | Base Coverage | Coverage % |
|------|-------------|---------------|------------|
| Task 35 | 8 | 3/8 | 37.5% |
| Task 42 | 7 | 4/7 | 57% |
| Task 45 | 6 | 4/6 | 66.6% |
| Task 53 | 6 | 2/6 | 33.3% |
| Task 59 | 8 | 4/8 | 50% |
| Task 60 | 6 | 2/6 | 33.3% |
| Task 68 | 9 | 3/9 | 33.3% |
| Task 89 | 8 | 3/8 | 37.5% |
| Task 129 | 9 | 4/9 | 44.4% |
| Task 160 | 10 | 4/10 | 40% |
| **Average** | **7.7** | **3.3/7.7** | **42.85%** |

**Conclusion:** Base tests cover only ~42.85% of identified equivalence classes. Boundary values and invalid inputs are largely untested. Mutation-based test generation is recommended to improve coverage.