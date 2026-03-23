# CONTRIBUTIONS.md: The Lions
**Project:** Programming Project 2 – Spring 2026
**Course:** CS 2430, Section 501

## Team Roles & Responsibilities


| Team Member | Role | Primary Responsibility & Evidence Pointers |
| :--- | :--- | :--- |
| **Iesus Gonzalez-Flores** | **Implementation Lead** | **Core Implementation:** Developed all 10 Java classes, including the `PermutationGenerator`, the `ExperimentDriver` architecture, and all four sorting algorithms (`MergeSort`, `QuickSort`, `ShakerSort`, `HeapSort`) with integrated comparison counters. |
| **Edgar Pena Arreola** | **Communications Lead** | **Report & Assembly:** Responsible for the formal team report PDF, generating and formatting the best/worst 10 data tables for n=4, 6, 8, and ensuring all Section 8 questions were addressed in full paragraphs. |
| **Chris Salcedo Cardenas** | **Verification Lead** | **Docs & Verification:** Developed the `README.md`, `Verification.md`, and the `docs/PermutationPseudocode.md` design artifact. Created the repository structure and performed the final code audit to ensure comparison counts exclude loop bounds. |

## Team Evidence & Accountability
- **Role Rotation:** Confirmed. Each team member is serving in a different role than held in Project 1 (March 22, 2026).
- **Comparison Metric Audit:** Chris (Verification Lead) audited the 10 source files to ensure `comparisons++` only triggers on element-to-element checks (e.g., `arr[i] < arr[j]`) and excludes loop bounds (Section 6, Part 2).
- **Design Artifacts:** The `/docs` folder contains the required Project Plan, the team's UML Diagram (Artifact #1), and the Permutation Pseudocode (Artifact #2) for the project checkpoint.
- **Data Integrity:** Iesus (Implementation) utilized `Arrays.copyOf` and `.clone()` within the `ExperimentDriver` and `RunRecord` classes to ensure original input arrays were preserved for the "Best/Worst 10" report tables.

## Repository Layout
- `/src`: All 10 Java source files (SortingAlgorithms package).
- `/docs`: Project Plan, Verification Plan, Permutation Pseudocode, and Sorting UML Diagram.
- `README.md`: Build and run instructions.
- `CONTRIBUTIONS.md`: This role and evidence mapping file.
