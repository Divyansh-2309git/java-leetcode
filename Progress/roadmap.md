# DSA Learning Roadmap & Topic Mastery Tracker

This roadmap outlines my current mastery level across Data Structures and Algorithms, highlighting mastered techniques, active practice areas, and upcoming learning modules.

---

## 🟢 1. Active & Established Topics

### 1.1 Sliding Window
- **Status:** 🟢 **Learned / Completed Module / Active Practice**
- **Problems Solved (10 Solved, 1 In Progress):** LC 3, LC 76, LC 209, LC 424, LC 438, LC 567, LC 643, LC 904, LC 1004, LC 1456 *(In Progress: LC 2461)*
- **Key Patterns:**
  - **Fixed-Size Window:** Fixed length window slide, adding incoming element and removing outgoing element (LC 643, LC 1456, LC 438, LC 567, LC 2461).
  - **Variable-Size Window:** Expanding `right` to include elements and conditionally shrinking `left` when constraints are broken (LC 3, LC 76, LC 209, LC 424, LC 904, LC 1004).
  - **Sliding Window + Frequency Map / Array:** Counting character/element frequencies dynamically within the current window (LC 76, LC 424, LC 438, LC 567, LC 904).
  - **Sliding Window + HashSet:** Tracking distinct elements inside the window (LC 3, LC 2461).
- **Concepts Learned:** Replacing nested $O(n^2)$ subarray/substring searches with $O(n)$ two-pointer linear scans, tracking optimal window lengths (min/max), and sliding window state invariants.
- **Next Steps:** Complete LC 2461, Minimum Window Subsequence.

---

### 1.2 Arrays
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (17 Solved, 1 In Progress):** LC 48, LC 53, LC 54, LC 66, LC 75, LC 121, LC 169, LC 189, LC 209, LC 485, LC 643, LC 904, LC 1004, LC 1295, LC 1672, LC 1920, LC 1929 *(In Progress: LC 2461)*
- **Key Patterns:** Kadane's Algorithm (LC 53), Running Minimum (LC 121), Boyer-Moore Majority Voting (LC 169), Digit Manipulation (LC 1295), Carry Propagation (LC 66), Matrix Transposition + Row Reversal (LC 48), Spiral Boundary Simulation (LC 54), Dutch National Flag / Three Pointers (LC 75), Array Reversal for Rotations (LC 189), Sliding Window on Arrays (LC 209, LC 643, LC 904, LC 1004).
- **Concepts Learned:** Single-pass iteration, element swapping, fixed-size vs dynamic array resizing logic, maximum subarray sum tracking, 2D matrix traversal and in-place matrix manipulation.
- **Next Steps:** Subarray Sum Equals K (LC 560), Set Matrix Zeroes (LC 73).

---

### 1.3 Two Pointers
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (8):** LC 15, LC 26, LC 27, LC 88, LC 125, LC 167, LC 283, LC 344
- **Key Patterns:** Sorting + Two Pointers (3Sum - LC 15), Read/Write Pointers (In-place compacting - LC 26, LC 27, LC 283), Opposite-End Pointers (Palindrome - LC 125 / Reverse - LC 344 / Two Sum II - LC 167), Backward Traversal (In-place merge - LC 88).
- **Concepts Learned:** Avoid $O(n^2)$ nested loops by moving pointers conditionally based on sorted order or target predicates.
- **Next Steps:** Container With Most Water (LC 11), 4Sum (LC 18), Trapping Rain Water (LC 42).

---

### 1.4 Strings
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (9):** LC 3, LC 76, LC 242, LC 383, LC 387, LC 424, LC 438, LC 567, LC 1456
- **Key Patterns:** Frequency Array / HashMap Inventory (LC 242, LC 383, LC 387), Character Traversal (`char[]`), Sliding Window on Strings (LC 3, LC 76, LC 424, LC 438, LC 567, LC 1456).
- **Concepts Learned:** String immutability in Java, converting to `char[]` or using integer frequency arrays `int[26]`, sliding window dynamic substring matching.
- **Next Steps:** Longest Palindromic Substring (LC 5), String Encoding / Decoding.

---

### 1.5 Binary Search
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (5):** LC 34, LC 35, LC 74, LC 153, LC 704
- **Key Patterns:** Standard Binary Search (LC 704), Search Space Halving, Boundary Property / First and Last Occurrence (LC 34), Insertion Index Boundary Property (LC 35), Virtual 1D Indexing on 2D Matrix (LC 74), Minimum in Rotated Sorted Array (LC 153).
- **Concepts Learned:** $O(\log n)$ efficiency on sorted ranges, handling duplicate boundaries, mapping virtual 1D indices to 2D matrices, detecting inflection points in rotated arrays.
- **Next Steps:** Search in Rotated Sorted Array (LC 33), Binary Search on Answer Space (Koko Eating Bananas - LC 875).

---

### 1.6 Hashing (HashMap & HashSet)
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (9 Solved, 3 Deferred):** LC 1, LC 36, LC 49, LC 128, LC 205, LC 217, LC 219, LC 290, LC 349
- **Key Patterns:** $O(1)$ Lookup, HashSet Duplicate Detection, Bijective Map Validation (One-to-One Mapping), HashMap Index Tracking, Grouping Collections by Key, Sudoku Encoding.
- **Concepts Learned:** Trade space complexity for time efficiency ($O(n)$ time with $O(n)$ space).
- **Deferred Problems Depending on Hashing:**
  - **LC 202 - Happy Number:** Needs Cycle Detection / HashSet iteration.
  - **LC 451 - Sort Characters By Frequency:** Needs Map Value sorting / Bucket Sort.
  - **LC 347 - Top K Frequent Elements:** Needs Heap or Frequency Bucket array.

---

### 1.7 Prefix Sum
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (2):** LC 238, LC 1480
- **Key Patterns:** Cumulative Sum Array, Prefix & Suffix Products.
- **Concepts Learned:** Precomputing cumulative information to answer range queries or exclude elements in $O(1)$ time.
- **Next Steps:** Subarray Sum Equals K (LC 560), 2D Range Sum Queries.

---

### 1.8 Bit Manipulation
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (2):** LC 136, LC 268
- **Key Patterns:** XOR Cancellations ($a \oplus a = 0$, $a \oplus 0 = a$), Expected Sum vs Actual Sum.
- **Concepts Learned:** Bitwise operations achieve $O(1)$ extra space optimization over HashSets.
- **Next Steps:** Bit counting (Hamming Weight), Bitwise masks.

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

### 2.3 Stack & Queue
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** LIFO / FIFO properties, Monotonic Stack, Valid Parentheses, Evaluating Expressions.

---

### 2.4 Recursion & Backtracking
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Base cases, recursive call stack, state exploration & pruning (Subsets, Permutations, N-Queens).

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
- **Key Concepts to Learn:** Memoization (Top-down), Tabulation (Bottom-up), 1D DP (Climbing Stairs), 2D DP (Knapsack, LCS).
