# Java DSA & LeetCode Practice Portfolio

Welcome to my Data Structures and Algorithms (DSA) and LeetCode repository in Java. This repository contains my structured practice, pattern-based problem-solving notes, time/space complexity analysis, and chronological progress tracking.

---

## 📌 Repository Overview

- **Language:** Java (JDK 8+)
- **Focus:** Building a solid foundation in core Data Structures and Algorithms.
- **Organization:** Pattern-oriented, grouped into dedicated topic directories.
- **Progress Tracking:** Detailed progress logs, confidence metrics, revision flags, and learning roadmaps maintained under [`Progress/`](Progress/).

---

## 📊 Progress Summary

| Metric | Count | Details |
|---|---|---|
| **Total Problems Tracked** | **35** | Complete repository inventory |
| **✅ Solved** | **32** | Verified implementations with full commentary |
| **⏸️ Deferred** | **2** | Paused pending upcoming topics (Sliding Window, Sorting Map Values) |
| **❌ Not Solved** | **1** | Stubbed for future implementation |

---

## 📂 Topic Progress Table

| Topic | Problems Solved | Deferred | Total Tracked | Status | Primary Patterns Covered |
|---|---|---|---|---|---|
| [**Arrays**](Arrays/) | 8 | 0 | 8 | In Progress | Running Minimum, Boyer-Moore Voting, Digit Manipulation, Carry Propagation, Matrix Traversal |
| [**Two Pointers**](TwoPointers/) | 7 | 0 | 7 | In Progress | Read/Write Pointers, Opposite Ends, Backward Traversal, In-place Swapping |
| [**Hashing**](Hashing/) | 9 | 1 | 11 | In Progress | Hash Map Index Tracking, Hash Set Sequence, Bijective Mapping, Anagram Grouping |
| [**Strings**](Strings/) | 3 | 1 | 4 | In Progress | Frequency Count Inventory, Character Traversal |
| [**Prefix Sum**](PrefixSum/) | 2 | 0 | 2 | In Progress | Prefix Array, Suffix & Prefix Product Preprocessing |
| [**Bit Manipulation**](Bit_Manipulation/) | 2 | 0 | 2 | In Progress | XOR Cancellation, Expected Sum |
| [**Binary Search**](BinarySearch/) | 1 | 0 | 1 | In Progress | Left/Right Pointer Shrinking, Insertion Index Property |

*Note: All counts are derived directly from verified source files in the repository.*

---

## ⏸️ Deferred & Pending Problems

| Problem | Difficulty | Primary Pattern | Topic | Status & Reason |
|---|---|---|---|---|
| **LC 3 - Longest Substring Without Repeating Characters** | Medium | Sliding Window | Strings | ⏸️ **Deferred** — Requires Sliding Window pattern (not yet learned). |
| **LC 451 - Sort Characters By Frequency** | Medium | Frequency Counting + Sorting | Hashing | ⏸️ **Deferred** — On hold to revisit after mastering Map sorting / Bucket Sort. |
| **LC 347 - Top K Frequent Elements** | Medium | Bucket Sort / Heap | Hashing | ❌ **Not Solved** — Stubbed, pending Heap / Bucket Sort learning. |

---

## 🗺️ Repository Structure

```
DSA/
├── README.md                              # Root repository documentation
├── Progress/
│   ├── progress.md                        # Chronological log of all problems
│   └── roadmap.md                         # Topic mastery & upcoming learning plan
│
├── Arrays/                                # Array traversal, voting, digit manipulation
├── BinarySearch/                          # Binary search algorithms
├── Bit_Manipulation/                      # Bitwise XOR & expected sum
├── Hashing/                               # HashMap & HashSet pattern solutions
├── PrefixSum/                             # Prefix sum & product arrays
├── Strings/                               # String manipulation & frequency maps
└── TwoPointers/                           # In-place, two-pointer algorithms
```

---

## 📝 Problem Comment Standard

Each solution file includes a standard header block containing metadata, complexities, approach summary, and key learnings:

```java
/*
 * Problem: LC <number> - <problem name>
 *
 * Topic: <topic>
 * Pattern: <pattern>
 * Difficulty: <difficulty>
 *
 * Time Complexity: <complexity>
 * Space Complexity: <complexity>
 *
 * Approach:
 * - ...
 *
 * Key Learning:
 * - ...
 *
 * Date Solved: <date>
 * Confidence: ⭐⭐⭐⭐⭐
 * Revision: No
 */
```

---

## 🚀 How to Run Solutions

Each `.java` file contains a self-contained static `Solution` class along with a `main` method containing test cases.

To compile and run any problem:

```bash
# Example: Running LC219 Contains Duplicate II
javac Hashing/LC219_ContainsDuplicateII.java
java Hashing.LC219_ContainsDuplicateII
```
