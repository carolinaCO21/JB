# Proyecto: **Estructuras de Control y Manejo de Arrays en Java**

## Descripción del Proyecto

Este repositorio contiene ejemplos de código en **Java** que demuestran el uso de **estructuras de control**, **bucles**, **bucles anidados**, y **manejo de arrays**. Es una recopilación de prácticas fundamentales para programadores novatos que deseen entender cómo utilizar estas herramientas para resolver problemas comunes de programación.

### ¿Por qué es útil?

El repositorio es útil para cualquier persona que desee mejorar su comprensión sobre cómo funcionan las estructuras de control en Java, cómo manipular arrays y cómo aplicar bucles para iterar sobre datos. A través de ejemplos sencillos y claros, aprenderás a:
- Utilizar estructuras de control 
- Trabajar con bucles `for`, `while` y bucles anidados.
- Manipular arrays para realizar búsquedas, ordenaciones y otras operaciones comunes.

## Requisitos
- Java Development Kit (JDK) 8 o superior ➜ Permite compilar/ejecutar. 🔧

- IDE o editor de código (opcional pero recomendado) Facilita el proceso  🛠️

- Conocimientos básicos de sintaxis en Java.

## 🛠️ Cómo Instalarlo  
1. **Clona el repositorio**:  
   git clone https://github.com/carolinaCO21/JB.git

2. Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, VSCode, etc.).

3. Ejecuta los archivos .java directamente desde el IDE o compílalos desde la terminal

## 🚀 Cómo Usarlo

Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, VSCode, etc.).

Ejecuta los archivos .java directamente desde el IDE o compílalos desde la terminal:

javac NombreArchivo.java  # Compilar  
java NombreArchivo        # Ejecutar  

Cada clase implementa funcionalidades prácticas que permiten explorar conceptos fundamentales de Java.

## ¡Explora los ejemplos y domina Java! 💻⚡

Este repositorio es ideal para estudiantes de informática, programadores novatos y cualquier persona que quiera mejorar su habilidad en Java.

![Texto alternativo](https://www.manualweb.net/img/logos/java.png)

[¿Qué es Java?](https://www.youtube.com/watch?v=crBLydQRUsk)

# Estructura de Ramas y Cambios en el Proyecto

Este proyecto utiliza **ramas independientes** para trabajar en diferentes funcionalidades sin afectar la versión principal (`main`). A continuación se detalla el propósito de cada rama y su impacto:

---
## 🌿 Ramas: 

### 🌿 Rama `Problema1`  
**Objetivo**: Implementar la solución al Problema 1 con clases básicas.  
**Paquete afectado**: `commits`  

### Clases Añadidas/Modificadas:
1. **`Clase1.java`**  
  

2. **`Clase2.java`**  
  

**Impacto en el proyecto**:  
- Añade capacidades básicas para resolver el Problema 1.  
- No afecta a la rama principal (aislamiento por ramas).  

---

### 🌿 Rama `Problema2`  
**Objetivo**: Desarrollar características avanzadas para el Problema 2.  
**Paquete afectado**: `commits`  

### Clases Añadidas/Modificadas:

1. **`Clase3.java`**  

2. **`Clase4.java`**  
  
**Impacto en el proyecto**:  
- Introduce funcionalidades específicas para el Problema 2.  
- No afecta a la rama principal (aislamiento por ramas).  

---

## 🔄 Flujo de Trabajo Recomendado  

1. Para trabajar en el Problema 1:
   
git checkout Problema1

Para contribuir al Problema 2:

git checkout Problema2

⚠️ Notas Importantes:
main permanece estable: Las ramas no modifican main hasta que se haga un merge aprobado.

Sin conflictos: Las clases en Problema1 y Problema2 son independientes (no comparten nombres ni paquetes).

Fusión futura:

git checkout main

git merge Problema1  # O git merge Problema2

✅ Beneficios de esta estructura:

Desarrollo paralelo sin interferencias.

Código modular y fácil de probar.

Historial de Git limpio y organizado.
