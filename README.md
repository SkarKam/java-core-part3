# Java Core Part 3
## 🎯 Main goal of the module:
The main goal is to get familiar with:
1. Lambda Expressions,
2. Functional interfaces (such as e.g. Predicate<T>, Supplier<T>),
3. Stream API and pipelines.

...and to use it to solve the assessment.

---

## 📝 Assessment:
This module contains 5 practical tasks focusing on the use of streams and their intermediate/terminal operations.

Here’s what each task focuses on:
1. **Task 1** – Generating and filtering data.
2. **Task 2** – Filtering and transforming data and data structures.
3. **Task 3** – Using terminal operations such as `anyMatch()`, `noneMatch()`, and `count()`.
4. **Task 4** – Transforming data structures from arrays to lists or maps.
5. **Task 5** – Retrieving values from a map structure.

---

## 💡 Solution
Each task is solved in a separate class for clarity and modularity. 
Streams that return non-void values are extracted into **static methods**, which are then tested via unit tests.

---

## 🧪 Tests:
To ensure everything works correctly, each non-void method has corresponding **unit tests**.  
Tests are written using the **white-box approach**, primarily focus on **positive scenarios**.

---

## ✅ Requirements:
To test the solution, you need:
- Java 8 or higher
- Apache Maven 3 or higher

---

## ▶️	How to run tests:
1. Open **Terminal**/**Command Prompt**.
2. Go to project root folder (📁`java-core-part3`).
3. Use command:
```bash
mvn clean test
```
4. Check the result.

---

## ⚙️ Configuration
Configuration of the test are located in `testngConf.xml` in 📁**root folder** (`java-core-part3`).

---

## 📓 Notes:
- Technology used:
  - Java 17 (SDK corretto-17)
  - Apache Maven 3 for dependecies and plugins managements
  - TestNG for testing
  - 🔥Surefire plugin to handle test execution during the build lifecycle
