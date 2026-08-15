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
| **Total Problems Tracked** | **56** | Complete repository inventory |
| **✅ Solved** | **52** | 13 Solved Independently (LC 48, LC 53, LC 75, LC 76, LC 153, LC 189, LC 209, LC 567, LC 643, LC 704, LC 904, LC 1004, LC 1456), 3 Solved With Assistance (LC 15, LC 54, LC 74), 36 Solved (User input required for Independent vs Assisted classification) |
| **⏸️ Deferred** | **3** | Paused pending upcoming topics (LC 202, LC 347, LC 451) |
| **🚧 In Progress** | **1** | Solution in progress (LC 2461) |
| **🔁 Flagged for Revision** | **10** | Flagged for review (LC 3, LC 15, LC 35, LC 49, LC 74, LC 88, LC 205, LC 202, LC 347, LC 451) |

---

## 📂 Topic Progress Table

| Topic | Problems Solved | Deferred | In Progress | Total Tracked | Status | Primary Patterns Covered |
|---|---|---|---|---|---|---|
| [**Arrays**](Arrays/) | 17 | 0 | 1 | 18 | Active Practice | Kadane's Algorithm, Running Minimum, Boyer-Moore Voting, Digit Manipulation, Carry Propagation, Matrix Traversal / Rotation, Dutch National Flag, Array Reversal, Sliding Window |
| [**Sliding Window**](Arrays/) *(Cross-Topic)* | 10 | 0 | 1 | 11 | 🟢 **Completed / Active Practice** | Fixed-Size Window, Variable-Size Window, Frequency Map / Array Windows, HashSet Window Uniqueness |
| [**Strings**](Strings/) | 9 | 0 | 0 | 9 | Active Practice | Frequency Count Inventory, Character Traversal, Sliding Window (LC 3, LC 76, LC 424, LC 438, LC 567, LC 1456) |
| [**Hashing**](Hashing/) | 9 | 3 | 0 | 12 | Active Practice | Hash Map Index Tracking, Hash Set Sequence, Bijective Mapping, Anagram Grouping, Sudoku Duplicate Detection |
| [**Two Pointers**](TwoPointers/) | 8 | 0 | 0 | 8 | Active Practice | Sorting + Two Pointers, Read/Write Pointers, Opposite Ends, Backward Traversal, In-place Swapping |
| [**Binary Search**](BinarySearch/) | 5 | 0 | 0 | 5 | Active Practice | Standard Binary Search, Search Space Halving, Boundary Property / First & Last Occurrence (LC 34), Insertion Index (LC 35), Virtual 1D Matrix Search (LC 74), Rotated Sorted Array (LC 153) |
| [**Prefix Sum**](PrefixSum/) | 2 | 0 | 0 | 2 | Active Practice | Prefix Array, Suffix & Prefix Product Preprocessing |
| [**Bit Manipulation**](Bit_Manipulation/) | 2 | 0 | 0 | 2 | Active Practice | XOR Cancellation, Expected Sum |

---

## ⏸️ Deferred & Pending Problems

| # | Problem | Difficulty | Primary Pattern | Topic | Reason / Status |
|---|---|---|---|---|---|
| **202** | **LC 202 - Happy Number** | Easy | Cycle Detection | Hashing | ⏸️ **Deferred** — Deferred to revisit cycle detection / HashSet logic. |
| **347** | **LC 347 - Top K Frequent Elements** | Medium | Bucket Sort / Heap | Hashing | ⏸️ **Deferred** — Deferred pending Heap / Bucket Sort learning. |
| **451** | **LC 451 - Sort Characters By Frequency** | Medium | Frequency Counting + Sorting | Hashing | ⏸️ **Deferred** — Deferred to revisit Map sorting / Bucket Sort. |
| **2461** | **LC 2461 - Maximum Sum of Distinct Subarrays With Length K** | Medium | Fixed-Size Sliding Window + Set | Arrays | 🚧 **In Progress** — Solution logic incomplete. |

---

## ❓ Needs User Input

The following items require personal user input:
1. **Independent vs Assisted Status:** 36 solved problems (all solved except the 13 verified Independently and 3 With Assistance) need user confirmation to classify as "Solved Independently" or "Solved With Assistance".
2. **Missing Dates, Confidence & Revision Flags:** Input needed for recently added/updated problems (LC 34, LC 424, LC 438, LC 2461).
3. **Deferred Notes & Personal Metrics:** Dates, confidence, and revision flags for LC 202, LC 347, and LC 451.

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
