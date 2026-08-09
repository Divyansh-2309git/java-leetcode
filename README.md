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
| **Total Problems Tracked** | **38** | Complete repository inventory |
| **✅ Solved** | **33** | 1 Solved Independently (LC 53), 1 Solved With Assistance (LC 15), 31 Solved (User input required for Independent vs Assisted classification) |
| **⏸️ Deferred** | **4** | Paused pending upcoming topics (LC 3, LC 202, LC 347, LC 451) |
| **🔁 Flagged for Revision** | **6** | Flagged for review (LC 15, LC 35, LC 49, LC 88, LC 205, LC 202/347/451) |

---

## 📂 Topic Progress Table

| Topic | Problems Solved | Deferred | Total Tracked | Status | Primary Patterns Covered |
|---|---|---|---|---|---|
| [**Arrays**](Arrays/) | 9 | 0 | 9 | In Progress | Kadane's Algorithm, Running Minimum, Boyer-Moore Voting, Digit Manipulation, Carry Propagation, Matrix Traversal |
| [**Two Pointers**](TwoPointers/) | 8 | 0 | 8 | In Progress | Sorting + Two Pointers, Read/Write Pointers, Opposite Ends, Backward Traversal, In-place Swapping |
| [**Hashing**](Hashing/) | 8 | 3 | 11 | In Progress | Hash Map Index Tracking, Hash Set Sequence, Bijective Mapping, Anagram Grouping, Sudoku Duplicate Detection |
| [**Strings**](Strings/) | 3 | 1 | 4 | In Progress | Frequency Count Inventory, Character Traversal |
| [**Prefix Sum**](PrefixSum/) | 2 | 0 | 2 | In Progress | Prefix Array, Suffix & Prefix Product Preprocessing |
| [**Bit Manipulation**](Bit_Manipulation/) | 2 | 0 | 2 | In Progress | XOR Cancellation, Expected Sum |
| [**Binary Search**](BinarySearch/) | 1 | 0 | 1 | In Progress | Left/Right Pointer Shrinking, Insertion Index Property |

---

## ⏸️ Deferred & Pending Problems

| # | Problem | Difficulty | Primary Pattern | Topic | Reason |
|---|---|---|---|---|---|
| **3** | **LC 3 - Longest Substring Without Repeating Characters** | Medium | Sliding Window | Strings | ⏸️ **Deferred** — Requires Sliding Window pattern (not yet learned). |
| **202** | **LC 202 - Happy Number** | Easy | Cycle Detection | Hashing | ⏸️ **Deferred** — Deferred to revisit cycle detection / HashSet logic. |
| **347** | **LC 347 - Top K Frequent Elements** | Medium | Bucket Sort / Heap | Hashing | ⏸️ **Deferred** — Deferred pending Heap / Bucket Sort learning. |
| **451** | **LC 451 - Sort Characters By Frequency** | Medium | Frequency Counting + Sorting | Hashing | ⏸️ **Deferred** — Deferred to revisit Map sorting / Bucket Sort. |

---

## ❓ Needs User Input

The following items require personal user input:
1. **Independent vs Assisted Status:** 31 solved problems (all solved except LC 53 [Independently] and LC 15 [With Assistance]) need user confirmation to classify as "Solved Independently" or "Solved With Assistance".
2. **Deferred Notes & Personal Metrics:** Dates, confidence, and revision flags for LC 202, LC 347, and LC 451.

---

## 🗺️ Repository Structure

```
LeetCode/
├── AGENTS.md                               # AI agent guidelines & workflow rules
├── README.md                              # Main progress dashboard
├── Progress/
│   ├── progress.md                        # Chronological log of all problems
│   └── roadmap.md                         # Topic mastery & upcoming learning plan
│
├── Arrays/                                # Array traversal, voting, Kadane's, digit manipulation
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
 * Status: <status>
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
