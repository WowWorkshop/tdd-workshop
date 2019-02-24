#### Guessing Game Description

The system is giving 4 random different digits as target number. User try to guess the number and input four digits. 

The system compares the guessing number and target number. The result pattern is `xAxB`, e.g. `2A1B`.

Rules:
* If the number matches both digit and position, it's `A`, e.g. 1208 <-> 3206 is `2A0B`.
* If the number matches digit but not matches position, it's `B`, e.g. 1208 <-> 3026 is `0A2B`.

