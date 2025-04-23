# Sistema de Gestión de Personas con Algoritmos de Ordenamiento y Búsqueda

## 📌 Información General

- **Título:** Sistema de Gestión de Personas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Miller Mendez Mateo Josue
- **Fecha:** 23 / 04 / 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa un sistema completo para gestionar personas (nombre y edad) con capacidades de:  
- **Ordenamiento** mediante múltiples algoritmos:  
  - Burbuja por nombre  
  - Selección por nombre (descendente)  
  - Inserción por edad  
  - Inserción por nombre  
- **Búsqueda** binaria eficiente:  
  - Por nombre  
  - Por edad  
- **Validación** de orden previo a búsquedas  
- Interfaz de usuario intuitiva mediante consola  

---
## 🏗️ Estructura del Proyecto
```plaintext
src/
├── models/
│ └── Person.java        # Modelo de datos (nombre, edad)
├── views/
│ └── View.java          # Interfaz de usuario (entrada/salida)
├── controllers/
│ ├── Controller.java    # Coordinador principal
│ ├── SortingMethods.java # Algoritmos de ordenamiento
│ └── SearchMethods.java # Algoritmos de búsqueda
└── App.java             # Punto de entrada
```
---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```
    
---
