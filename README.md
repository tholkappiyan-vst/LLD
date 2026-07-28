# Low Level Design (LLD) Examples

This repository contains Java implementations of the **S.O.L.I.D** design principles and **Singleton** design pattern examples.

## Principles Covered

- **S**ingle Responsibility Principle (SRP)
- **O**pen/Closed Principle (OCP)
- **L**iskov Substitution Principle (LSP)
- **I**nterface Segregation Principle (ISP)
- **D**ependency Inversion Principle (DIP)

## Design Patterns Covered

- **Singleton** (with various implementations: Eager, Enum, Thread-safe, etc.)

Each principle and pattern is demonstrated with a clear, self-contained example.

## Structure

```
solid/
├── single/
│   ├── Students.java
│   ├── Teachers.java
│   └── Main.java
├── openclose/
│   ├── goodexample/
│   │   ├── Payment.java
│   │   ├── CardPayment.java
│   │   ├── UpiPayment.java
│   │   └── Main.java
│   └── BadExample.java
├── liskovsubstitution/
│   ├── Birds.java
│   ├── Eat.java
│   ├── Fly.java
│   ├── Human.java
│   ├── Talk.java
│   └── Main.java
├── interfacesegregation/
│   ├── Engine.java
│   ├── Battery.java
│   ├── EvCar.java
│   ├── PetrolCar.java
│   ├── override.java
│   └── info.txt
└── dependencyinversion/
    ├── Notification.java
    ├── SmsNotification.java
    ├── EmailNotification.java
    ├── Main.java
    └── info.txt

singleton/
├── AuthendicatedUser.java
├── AuthendicatedUser1.java
├── Eager.java
├── Enum.java
├── Main.java
└── singleton.txt
```

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/tholkappiyan-vst/LLD.git
   cd LLD
   ```

2. Compile and run any example, e.g. Single Responsibility Principle:
   ```bash
   javac solid/single/Main.java
   java solid/single/Main
   ```

3. To run Singleton examples:
   ```bash
   javac singleton/Main.java
   java singleton.Main
   ```

Repeat for other directories as desired.

## License

This repository is public and free to use for educational purposes.