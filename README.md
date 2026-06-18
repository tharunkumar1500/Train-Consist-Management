# UC15: Safe Cargo Assignment Using try-catch-finally

**Purpose:** Safely handle unsafe cargo assignments without crashing the Train Consist Management App using runtime exceptions.

**Input:**
- Try to assign "Petroleum" to a "Cylindrical" bogie (Safe).
- Try to assign "Petroleum" to a "Rectangular" bogie (Unsafe).

**Output:**
```
============================================================================
 UC15 - Safe Cargo Assignment 
============================================================================

Cargo assigned successfully -> Petroleum
Cargo validation completed for Cylindrical bogie

Error: Unsafe cargo assignment!
Cargo validation completed for Rectangular bogie

UC15 runtime handling completed...
```
