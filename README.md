# UC9: Group Bogies by Type (Collectors.groupingBy)

**Purpose:** Group bogies into categories using Stream collectors.

**Input:**
- Add bogies: "Sleeper" (72), "AC Chair" (56), "First Class" (24), "Sleeper" (70), "AC Chair" (60)
- Group by bogie name

**Output:**
```
============================================================================
 UC9 - Group Bogies by Type 
============================================================================

All Bogies:
Sleeper -> 72
AC Chair -> 56
First Class -> 24
Sleeper -> 70
AC Chair -> 60

Grouped Bogies:

Bogie Type: First Class
  Capacity -> 24

Bogie Type: Sleeper
  Capacity -> 72
  Capacity -> 70

Bogie Type: AC Chair
  Capacity -> 56
  Capacity -> 60

UC9 grouping completed...
```
