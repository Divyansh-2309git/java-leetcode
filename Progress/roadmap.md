# DSA Learning Roadmap & Topic Mastery Tracker

This roadmap outlines my current mastery level across Data Structures and Algorithms, highlighting mastered techniques, active practice areas, and upcoming learning modules.

---

## 🟢 1. Active & Established Topics

### 1.1 Arrays
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (8):** LC 66, LC 121, LC 169, LC 485, LC 1295, LC 1672, LC 1920, LC 1929
- **Key Patterns:** Running Minimum, Boyer-Moore Majority Voting, Digit Manipulation, Carry Propagation, Matrix Traversal.
- **Concepts Learned:** Single-pass iteration, element swapping, fixed-size vs dynamic array resizing logic.
- **Next Steps:** 2D Matrix rotations (LC 48), Subarray problems.

---

### 1.2 Two Pointers
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (7):** LC 26, LC 27, LC 88, LC 125, LC 167, LC 283, LC 344
- **Key Patterns:** Read/Write Pointers (In-place compacting), Opposite-End Pointers (Palindrome / Reverse), Backward Traversal (In-place merge).
- **Concepts Learned:** Avoid $O(n^2)$ nested loops by moving pointers conditionally based on sorted order or target predicates.
- **Next Steps:** 3Sum (LC 15), Container With Most Water (LC 11).

---

### 1.3 Hashing (HashMap & HashSet)
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (9):** LC 1, LC 36, LC 49, LC 128, LC 205, LC 217, LC 219, LC 290, LC 349
- **Key Patterns:** $O(1)$ Lookup, HashSet Duplicate Detection, Bijective Map Validation (One-to-One Mapping), HashMap Index Tracking, Grouping Collections by Key.
- **Concepts Learned:** Trade space complexity for time efficiency ($O(n)$ time with $O(n)$ space).
- **Deferred Problems Depending on Hashing:**
  - **LC 451 - Sort Characters By Frequency:** Needs Map Value sorting / Bucket Sort.
  - **LC 347 - Top K Frequent Elements:** Needs Heap or Frequency Bucket array.

---

### 1.4 Prefix Sum
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (2):** LC 238, LC 1480
- **Key Patterns:** Cumulative Sum Array, Prefix & Suffix Products.
- **Concepts Learned:** Precomputing cumulative information to answer range queries or exclude elements in $O(1)$ time.
- **Next Steps:** Subarray Sum Equals K (LC 560), 2D Range Sum Queries.

---

### 1.5 Bit Manipulation
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (2):** LC 136, LC 268
- **Key Patterns:** XOR Cancellations ($a \oplus a = 0$, $a \oplus 0 = a$), Expected Sum vs Actual Sum.
- **Concepts Learned:** Bitwise operations achieve $O(1)$ extra space optimization over HashSets.
- **Next Steps:** Bit counting (Hamming Weight), Bitwise masks.

---

### 1.6 Strings
- **Status:** 🟢 **Learned / Active Practice**
- **Problems Solved (3):** LC 242, LC 383, LC 387
- **Key Patterns:** Frequency Array / HashMap Inventory, Character Conversion (`char[]`).
- **Concepts Learned:** String immutability in Java, converting to `char[]` or using integer frequency arrays `int[26]`.
- **Deferred Problems Depending on Strings:**
  - **LC 3 - Longest Substring Without Repeating Characters:** Needs Sliding Window.

---

### 1.7 Binary Search (Basics)
- **Status:** 🟡 **Basic Learned / Needs Deeper Patterns**
- **Problems Solved (1):** LC 35
- **Key Patterns:** Search Space Halving, Insertion Index Boundary Property (`left` pointer position).
- **Concepts Learned:** $O(\log n)$ efficiency on sorted ranges.
- **Next Steps:** Search in Rotated Sorted Array (LC 33), Binary Search on Answer Space (Min/Max optimization).

---

## 🟡 2. Pending & Upcoming Topics Roadmap

### 2.1 Sliding Window
- **Status:** 🔴 **Not Yet Learned (High Priority Next Topic)**
- **Related Deferred Problem:**
  - **LC 3 - Longest Substring Without Repeating Characters**
- **Key Concepts to Learn:** Fixed vs Variable size window, expanding right pointer, shrinking left pointer when condition violated, using HashSet/HashMap inside the window.

---

### 2.2 Heap / Priority Queue & Bucket Sort
- **Status:** 🔴 **Not Yet Learned (High Priority Next Topic)**
- **Related Deferred / Pending Problems:**
  - **LC 451 - Sort Characters By Frequency**
  - **LC 347 - Top K Frequent Elements**
- **Key Concepts to Learn:** Max-Heap, Min-Heap, `PriorityQueue` in Java, Bucket Sort for frequency grouping ($O(n)$ time).

---

### 2.3 Linked Lists
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Single & Double Linked Lists, Fast & Slow Pointers (Floyd's Cycle Detection), Reversing a Linked List.

---

### 2.4 Stack & Queue
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** LIFO / FIFO properties, Monotonic Stack, Valid Parentheses, Evaluating Expressions.

---

### 2.5 Recursion & Backtracking
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Base cases, recursive call stack, state exploration & pruning (Subsets, Permutations, N-Queens).

---

### 2.6 Trees & Binary Search Trees
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Pre-order, In-order, Post-order, Level-order traversals (BFS/DFS), BST insertion/deletion/search properties.

---

### 2.7 Graphs
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Adjacency List / Matrix, BFS (Shortest path), DFS (Connected components), Topological Sort, Dijkstra's algorithm.

---

### 2.8 Dynamic Programming
- **Status:** ⏳ **Planned**
- **Key Concepts to Learn:** Memoization (Top-down), Tabulation (Bottom-up), 1D DP (Climbing Stairs), 2D DP (Knapsack, LCS).
