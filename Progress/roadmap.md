# DSA Learning Roadmap & Topic Mastery Tracker

This roadmap outlines my current mastery level across Data Structures and Algorithms, highlighting mastered techniques, active practice areas, and upcoming learning modules.

---

## 🟢 1. Active & Established Topics

### 1.1 Sliding Window
- **Status:** 🟢 **Learned / Completed Module / Active Practice**
- **Problems Solved (11 Solved):** LC 3, LC 76, LC 209, LC 424, LC 438, LC 567, LC 643, LC 904, LC 1004, LC 1456, LC 2461
- **Key Patterns:**
  - **Fixed-Size Window:** Fixed length window slide, adding incoming element and removing outgoing element (LC 643, LC 1456, LC 438, LC 567, LC 2461).
  - **Variable-Size Window:** Expanding `right` to include elements and conditionally shrinking `left` when constraints are broken (LC 3, LC 76, LC 209, LC 424, LC 904, LC 1004).
  - **Sliding Window + Frequency Map / Array:** Counting character/element frequencies dynamically within the current window (LC 76, LC 424, LC 438, LC 567, LC 904).
  - **Sliding Window + HashSet:** Tracking distinct elements inside the window (LC 3, LC 2461).
- **Concepts Learned:** Replacing nested $O(n^2)$ subarray/substring searches with $O(n)$ two-pointer linear scans, tracking optimal window lengths (min/max), and sliding window state invariants.
- **Next Steps:** Minimum Window Subsequence, Subarrays with K Different Integers (LC 992).

---

### 1.2 Two Pointers
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (16 Solved):** LC 11, LC 15, LC 16, LC 18, LC 26, LC 27, LC 42, LC 88, LC 125, LC 167, LC 283, LC 344, LC 680, LC 881, LC 977, LC 986
- **Key Patterns:**
  - **Opposite-End Pointers:** Inward convergence for target search, palindromes, or container volumes (LC 11, LC 125, LC 167, LC 344, LC 881, LC 977).
  - **Sorting + Two Pointers (k-Sum):** Fixing outer loop indices and using two pointers for remaining pair search (3Sum - LC 15, 3Sum Closest - LC 16, 4Sum - LC 18).
  - **Read/Write Pointers:** In-place element compacting, removal, and zero-shifting (LC 26, LC 27, LC 283).
  - **Backward Traversal:** Merging sorted arrays from end to avoid overwriting (LC 88).
  - **Branching / Greedy Search:** Validating palindrome with one allowed character deletion (LC 680).
  - **Interval Intersections:** Parallel scanning over sorted intervals based on endpoints (LC 986).
  - **Prefix/Suffix Boundaries:** Calculating trapped water between enclosing height boundaries (LC 42).
- **Concepts Learned:** Avoiding $O(n^2)$ search spaces by narrowing bounds based on sorted order or invariant properties.
- **Next Steps:** 3Sum With Multiplicity (LC 923), Shortest Unsorted Continuous Subarray (LC 581).

---

### 1.3 Stack
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (5 Solved, 1 In Progress):** LC 20, LC 150, LC 496, LC 844, LC 1047 *(In Progress: LC 71)*
- **Key Patterns:**
  - **LIFO / Bracket Matching:** Pushing opening brackets, validating and popping on matching closing brackets (LC 20).
  - **Expression Evaluation (Postfix / RPN):** Operand stack with reverse-order binary operator evaluation (LC 150).
  - **Monotonic Decreasing Stack:** Pruning non-optimal candidates to find next greater element in $O(n)$ time (LC 496).
  - **Adjacent Pair Removal / Stack Cancellation:** Popping matching top element to simulate collision / cancellation (LC 1047).
  - **Backspace / Undo Simulation:** Simulating editing actions with push and pop (LC 844).
  - **Directory Path Canonicalization:** Path tokenization and directory level management (LC 71 - In Progress).
- **Concepts Learned:** LIFO ordering, monotonic stack invariant maintenance, processing nested and inverse structures.
- **Next Steps:** Min Stack (LC 155), Daily Temperatures (LC 739), Largest Rectangle in Histogram (LC 84).

---

### 1.4 Arrays
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (18 Solved):** LC 48, LC 53, LC 54, LC 66, LC 75, LC 121, LC 169, LC 189, LC 209, LC 485, LC 643, LC 904, LC 1004, LC 1295, LC 1672, LC 1920, LC 1929, LC 2461
- **Key Patterns:** Kadane's Algorithm (LC 53), Running Minimum (LC 121), Boyer-Moore Majority Voting (LC 169), Digit Manipulation (LC 1295), Carry Propagation (LC 66), Matrix Transposition + Row Reversal (LC 48), Spiral Boundary Simulation (LC 54), Dutch National Flag / Three Pointers (LC 75), Array Reversal for Rotations (LC 189), Sliding Window on Arrays (LC 209, LC 643, LC 904, LC 1004, LC 2461).
- **Concepts Learned:** Single-pass iteration, element swapping, fixed-size vs dynamic array resizing logic, maximum subarray sum tracking, 2D matrix traversal and in-place matrix manipulation.
- **Next Steps:** Subarray Sum Equals K (LC 560), Set Matrix Zeroes (LC 73).

---

### 1.5 Strings
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (9 Solved):** LC 3, LC 76, LC 242, LC 383, LC 387, LC 424, LC 438, LC 567, LC 1456
- **Key Patterns:** Frequency Array / HashMap Inventory (LC 242, LC 383, LC 387), Character Traversal (`char[]`), Sliding Window on Strings (LC 3, LC 76, LC 424, LC 438, LC 567, LC 1456).
- **Concepts Learned:** String immutability in Java, converting to `char[]` or using integer frequency arrays `int[26]`, sliding window dynamic substring matching.
- **Next Steps:** Longest Palindromic Substring (LC 5), String Encode and Decode (LC 271).

---

### 1.6 Binary Search
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (5 Solved):** LC 34, LC 35, LC 74, LC 153, LC 704
- **Key Patterns:** Standard Binary Search (LC 704), Search Space Halving, Boundary Property / First and Last Occurrence (LC 34), Insertion Index Boundary Property (LC 35), Virtual 1D Indexing on 2D Matrix (LC 74), Minimum in Rotated Sorted Array (LC 153).
- **Concepts Learned:** $O(\log n)$ efficiency on sorted ranges, handling duplicate boundaries, mapping virtual 1D indices to 2D matrices, detecting inflection points in rotated arrays.
- **Next Steps:** Search in Rotated Sorted Array (LC 33), Binary Search on Answer Space (Koko Eating Bananas - LC 875).

---

### 1.7 Hashing (HashMap & HashSet)
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (9 Solved, 3 Deferred):** LC 1, LC 36, LC 49, LC 128, LC 205, LC 217, LC 219, LC 290, LC 349
- **Key Patterns:** $O(1)$ Lookup, HashSet Duplicate Detection, Bijective Map Validation (One-to-One Mapping), HashMap Index Tracking, Grouping Collections by Key, Sudoku Encoding.
- **Concepts Learned:** Trade space complexity for time efficiency ($O(n)$ time with $O(n)$ space).
- **Deferred Problems Depending on Hashing:**
  - **LC 202 - Happy Number:** Needs Cycle Detection / HashSet iteration.
  - **LC 451 - Sort Characters By Frequency:** Needs Map Value sorting / Bucket Sort.
  - **LC 347 - Top K Frequent Elements:** Needs Heap or Frequency Bucket array.

---

### 1.8 Prefix Sum
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (2 Solved):** LC 238, LC 1480
- **Key Patterns:** Cumulative Sum Array, Prefix & Suffix Products.
- **Concepts Learned:** Precomputing cumulative information to answer range queries or exclude elements in $O(1)$ time.
- **Next Steps:** Subarray Sum Equals K (LC 560), Range Sum Query 2D - Immutable (LC 304).

---

### 1.9 Bit Manipulation
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (2 Solved):** LC 136, LC 268
- **Key Patterns:** XOR Cancellations ($a \oplus a = 0$, $a \oplus 0 = a$), Expected Sum vs Actual Sum.
- **Concepts Learned:** Bitwise operations achieve $O(1)$ extra space optimization over HashSets.
- **Next Steps:** Number of 1 Bits (LC 191), Counting Bits (LC 338).

---

## 🟡 2. Pending & Upcoming Topics Roadmap

### 2.1 Heap / Priority Queue & Bucket Sort
- **Status:** 🔴 **Not Yet Learned (High Priority Next Topic)**
- **Related Deferred Problems:**
  - **LC 451 - Sort Characters By Frequency**
  - **LC 347 - Top K Frequent Elements**
- **Key Concepts to Learn:** Max-Heap, Min-Heap, `PriorityQueue` in Java, Bucket Sort for frequency grouping ($O(n)$ time).

---

### 2.2 Linked Lists
- **Status:** ⏳ **Planned**
- **Related Deferred Problem:**
  - **LC 202 - Happy Number** (Cycle Detection / Fast & Slow Pointers)
- **Key Concepts to Learn:** Single & Double Linked Lists, Fast & Slow Pointers (Floyd's Cycle Detection), Reversing a Linked List.

---

### 2.3 Queue & Monotonic Queue
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** FIFO properties, Sliding Window Maximum via Monotonic Deque (LC 239).

---

### 2.4 Recursion & Backtracking
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Base cases, recursive call stack, state exploration & pruning (Subsets, Permutations, Combination Sum, N-Queens).

---

### 2.5 Trees & Binary Search Trees
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Pre-order, In-order, Post-order, Level-order traversals (BFS/DFS), BST insertion/deletion/search properties.

---

### 2.6 Graphs
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Adjacency List / Matrix, BFS (Shortest path), DFS (Connected components), Topological Sort, Dijkstra's algorithm.

---

### 2.7 Dynamic Programming
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Memoization (Top-down), Tabulation (Bottom-up), 1D DP (Climbing Stairs), 2D DP (Knapsack, Longest Common Subsequence).
