# DrawStars-JavaFX-100-Percent-Programmatic
A fully programmatic re-engineering of the classic DrawStars JavaFX example—no FXML, no SceneBuilder. Clean, object-oriented Java (JavaFX 21) renders and animates 18 five-pointed stars with continuous rotation, randomized colors, and smooth motion using RotateTransition with Animation.INDEFINITE.

---

## 🚀 Project Overview

This repository showcases a **from-the-ground-up, programmatic reconstruction** of the classic **DrawStars** JavaFX example — meticulously stripped of all FXML/SceneBuilder dependencies and reimagined with **pure, object-oriented Java** for maximum clarity, flexibility, and maintainability.

### ✨ Core Features & Technical Highlights

- **Zero FXML, 100% Java**  
  Entire UI, scene graph, and layout logic implemented directly in Java for better control over rendering and animation pipelines.

- **Procedural Star Generation**  
  Dynamically creates **18 precise five-pointed stars**, leveraging coordinate geometry for exact polygon vertex placement.

- **Continuous Motion Engine**  
  Harnesses `RotateTransition` with `Animation.INDEFINITE` to achieve **buttery-smooth, perpetual rotation** of all stars around a central axis.

- **High-Entropy Color Palette**  
  Uses `SecureRandom` to generate RGBA color values with varied transparency, ensuring **unique visual output on every run**.

- **Custom Scene Composition**  
  Manual positioning via transformation matrices (`Rotate`, pivot-based transforms) to arrange stars in a perfect circular pattern.

- **Performance-Optimized Animation**  
  Minimizes scene graph mutations and leverages JavaFX’s hardware-accelerated pipeline for efficient frame rendering.

### 🏆 Achievement

Earned a **perfect score (100%)**, demonstrating advanced proficiency with **JavaFX animation APIs**, event-driven design principles, and high-quality, production-grade code practices. Output was validated and showcased through a working **video demo**.

---

## 🛠 Requirements & Setup

### 📋 Prerequisites

Before running this project, ensure you have the following installed:

- **Java Development Kit (JDK) 21+**  
  Required for compiling and running modern Java features used in this project.

- **JavaFX 21**  
  Provides the UI and animation APIs.  
  > If using Maven, JavaFX dependencies are already configured in `pom.xml`.

- **Apache Maven 3.9+**  
  For building, running, and dependency management.

- **IDE (Optional but Recommended)**  
  IntelliJ IDEA / Eclipse / VS Code with Java support for easier development and debugging.

---
