# Installment Calculator

This Java program calculates the possible number of installments for purchasing a car, 
based on a rule that each installment must be at least $1000.

## Features

- Takes user input for the car's total price.
- Calculates and displays all valid installment options.
- Stops when installment value drops below $1000.

## How to Run

1. Make sure you have Java installed.
2. Compile the program:

```bash
javac src/academy/DavedojoMarathon/InstallmentCalculator.java
```

3. Run the program:

```bash
java academy.DavedojoMarathon.InstallmentCalculator
```

## Example

```
Enter the total price of the car: $30000

Available installment options for a car worth $30000.0:
 1 installments of $30000.00
 2 installments of $15000.00
 3 installments of $10000.00
 ...
30 installments of $1000.00
```