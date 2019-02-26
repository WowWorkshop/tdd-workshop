#### Guessing Game Description

The system is giving 4 random different digits as target number. User try to guess the number and input four digits. 

The system compares the guessing number and target number. The result pattern is `xAxB`, e.g. `2A1B`.

Rules:
* If the number matches both digit and position, it's `A`, e.g. 1208 <-> 3206 is `2A0B`.
* If the number matches digit but not matches position, it's `B`, e.g. 1208 <-> 3026 is `0A2B`.

Examples:
Input　　 Output        Description
1567      1A0B          1’s position is correct
2478      0A2B          2 and 4’s positions are incorrect
0324      1A2B          4’s position is correct, 2 and 3’s positions are incorrect
5678      0A0B          none is correct
4321      0A4B          all digits positions are incorrect
1234      4A0B          all match
1123      invalid input
12        invalid input
