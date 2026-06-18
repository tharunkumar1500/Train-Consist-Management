# UC14: Handle Invalid Bogie Capacity (Custom Exception)

**Purpose:** Prevent invalid passenger bogies from being added to the train by enforcing capacity rules using a custom exception.

**Input:**
- Valid Bogie: "Sleeper" (72)
- Invalid Bogie: "AC Chair" (-10)

**Output:**
```
============================================================================
 UC14 - Handle Invalid Bogie Capacity 
============================================================================

Created Bogie: Sleeper -> 72
Error: Capacity must be greater than zero

UC14 exception handling completed...
```
