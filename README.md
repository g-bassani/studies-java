# Java Studies

A collection of Java studies and exercises focused on fundamental programming concepts, Object-Oriented Programming, Collections, Generics, file handling, exceptions, and matrices.

The repositories are organized by topic, with each project containing separate folders for the concepts and exercises covered.

## Repositories

### OOP

Object-Oriented Programming concepts and practices in Java.

**Topics:**

* **Encapsulation:** Account system, getters and setters, public methods, and access control.
* **Inheritance:** Employee and Person system, class inheritance, enums, and method overriding.
* **Abstraction:** Shape system, abstract classes, and inheritance.
* **Composition:** Car service system, object composition, lists of objects, enums, and object relationships.
* **Interfaces:** Contract system, interface implementation, and dependency injection.
* **Polymorphism:** Tax payer system, inheritance, method overriding, upcasting, and polymorphism.

---

### Matrices

Two-dimensional arrays and matrix operations.

**Topics:**

* **Matrix addition:** Addition of two matrices.
* **Matrix transpose:** Transpose of a matrix, from rows to columns.
* **Square and symmetric matrices:** Shows if the matrix is symmetric and square.
* **Matrix search and finding neighboring elements:** Shows the index of the matrix and its neighboring elements.

---

### Exceptions

Exception handling and custom exceptions.

**Topics:**

* **Password Validator:** Regular expressions and custom exception handling with `InvalidatePattern`, validating password requirements.
* **Quadratic Equation Calculator:** `ArithmeticException` to validate a quadratic equation and its discriminant before calculating and returning its real roots.
* **Account Withdrawal Exception:** Bank account withdrawal system with a custom `BalanceException` used to validate withdrawal limits and account balance.
* **Product Register:** Validating product data and stock capacity using `ProductException` and `StockException`.

---

### Files

File I/O, directories, and structured data processing.

**Topics:**

* **Word Counter:** Counting the number of words that appear in a file.
* **Product File Processor:** Creating files and directories, reading and writing CSV files, converting file data into objects, and generating a summary file.
* **Book Section File Processor:** Creating directories and storing book records from a section in a text file.
* **Launch Logger:** Creates a user-specific directory using the modern `Path API` and records each program launch, including its date and time, in a file named after the current day.
---

### Generics

Generic types, type safety, and bounded wildcards.

**Topics:**

* **Generic Repository:** Implementing a type-safe generic repository capable of storing and managing different object types such as employees, products, and administrators.
* **Loot Chest:** Implementing a type-safe loot chest that stores items of any type and randomly selects an item when opened, while preventing empty chests and multiple openings.
* **Bounded Wildcards:** Using bounded wildcards (`? extends` and `? super`) to create generic methods that work with different numeric list types while safely reading and adding elements.
* **Order System:** Order system using Generics and the `Fluent API pattern`. The `Order<T>` class allows dishes of a specific type to be added through chained method calls.

---

### Collections

Java Collections Framework and object organization.

**Topics:**

* **Set:** `Set` and `HashSet`, demonstrating how duplicate objects are prevented using `equals()` and `hashCode()`, while counting unique students across multiple courses.
* **Map:** `Map` and `LinkedHashMap`, processing candidate records from a CSV file and aggregating votes for candidates with the same name while preserving insertion order.
* **Comparable:** `Comparable` interface, implementing the natural ordering of expense objects by date and organizing expenses within a monthly expense list.
* **Queue:** `Queue` and `FIFO` processing, simulating a print queue where documents are added, processed, and removed in the order they were received.

---


### Streams

Java Stream API and functional programming concepts, focusing on processing and transforming collections in a declarative way.

**Topics**

* **Prime Numbers:** Using `filter()`, method references, and `toList()` to extract prime numbers from a list.
* **Employee Processing:** Demonstrating filtering, mapping, sorting, and reducing employee data to process salaries and emails.
* **Spent More:** Demonstrating `max()`, `Comparator`, method references, and `Optional` to find the customer who spent the most.

---