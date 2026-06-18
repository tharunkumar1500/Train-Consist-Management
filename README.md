# UC20: Exception Handling During Search Operations

**Purpose:** Prevent searching an empty train by throwing an exception early.

**Input:**
- Empty Bogie Array: `{}`
- Search Key: `"BG101"`

**Output:**
```
============================================================================
 UC20 - Exception Handling During Search 
============================================================================

Exception in thread "main" java.lang.IllegalStateException: No bogies available in train. Cannot perform search.
	at train.UseCase20TrainConsistMgmnt.main(UseCase20TrainConsistMgmnt.java:41)
```
