# UC12: Safety Compliance Check for Goods Bogies (allMatch)

**Purpose:** Encapsulate bogie rules using functional interfaces and apply them using lambda expressions with allMatch().

**Input:**
- Add Goods Bogies: 
  - Cylindrical -> Petroleum
  - Open -> Coal
  - Box -> Grain
  - Cylindrical -> Coal
- Safety Rule: Cylindrical bogies must only carry Petroleum.

**Output:**
```
============================================================================
 UC12 - Safety Compliance Check for Goods Bogies 
============================================================================

Goods Bogies in Train:
Cylindrical -> Petroleum
Open -> Coal
Box -> Grain
Cylindrical -> Coal

Safety Compliance Status: false
Train formation is NOT SAFE.

UC12 safety validation completed...
```
