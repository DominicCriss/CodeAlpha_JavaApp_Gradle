# CodeAlpha_JavaApp_Gradle

## 📌 Project Overview

This project demonstrates the implementation of a Java application using Gradle with modern DevOps practices. The application automates the build process, manages dependencies efficiently, performs automated testing, and integrates Continuous Integration (CI) using GitHub Actions.

The project was developed as part of the **CodeAlpha DevOps Internship – Task 3: Java Application using Gradle**.

---

## 🎯 Objectives

* Automate Java project builds using Gradle
* Manage dependencies efficiently
* Implement automated testing using JUnit 5
* Integrate Continuous Integration (CI) using GitHub Actions
* Generate executable build artifacts
* Understand core DevOps principles in Java development

---

## 🛠 Technologies Used

* Java 21
* Gradle
* JUnit 5
* Apache Commons Lang
* Google Guava
* Git
* GitHub
* GitHub Actions
* Docker (Containerization)

---

## 📂 Project Structure

```text
CodeAlpha_JavaApp_Gradle
│
├── .github/
│   └── workflows/
│       └── gradle.yml
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   └── java/
│   │   └── test/
│   │       └── java/
│   │
│   ├── build.gradle
│   └── build/
│
├── gradle/
│   └── libs.versions.toml
│
├── Dockerfile
├── gradlew
├── gradlew.bat
├── settings.gradle
└── README.md
```

---

## ⚙ Features

### Build Automation

* Automated project compilation using Gradle
* Executable JAR generation
* Dependency resolution from Maven Central

### Dependency Management

* Version Catalog (`libs.versions.toml`)
* Apache Commons Lang
* Google Guava

### Automated Testing

* Unit testing using JUnit 5
* Test execution integrated into build process

### Continuous Integration

* Automated builds using GitHub Actions
* Automatic test execution on every push
* Artifact generation during CI pipeline

### Containerization

* Fat JAR generation using Shadow Plugin
* Docker image creation
* Containerized application execution

---

## 🚀 Running the Project

### Clone Repository

```bash
git clone https://github.com/DominicCriss/CodeAlpha_JavaApp_Gradle.git
cd CodeAlpha_JavaApp_Gradle
```

### Build Project

```bash
./gradlew build
```

Windows:

```powershell
.\gradlew build
```

### Run Application

```bash
./gradlew run
```

Windows:

```powershell
.\gradlew run
```

### Run Tests

```bash
./gradlew test
```

### Generate Fat JAR

```bash
./gradlew clean shadowJar
```

Generated JAR:

```text
app/build/libs/app-all.jar
```

### Execute JAR

```bash
java -jar app/build/libs/app-all.jar
```

---

## 🐳 Docker Support

### Build Docker Image

```bash
docker build -t codealpha-java-app .
```

### Run Docker Container

```bash
docker run --rm codealpha-java-app
```

---

## 🔄 CI/CD Pipeline

GitHub Actions automatically performs:

1. Source Code Checkout
2. Java 21 Setup
3. Dependency Resolution
4. Build Execution
5. Unit Testing
6. Fat JAR Generation
7. Docker Image Build
8. Container Verification

Workflow file:

```text
.github/workflows/gradle.yml
```

---

## 📊 DevOps Concepts Implemented

* Build Automation
* Dependency Management
* Continuous Integration (CI)
* Automated Testing
* Artifact Generation
* Containerization
* Version Control
* Deployment Readiness

---

## 📷 Sample Output

```text
Krish patil
```

---

## 👨‍💻 Author

Krish Patil

CodeAlpha DevOps Internship – Task 3

Java Application using Gradle
