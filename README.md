# FinalProject_DS_II

## Visión general

Repositorio de una aplicación de afinidad y compatibilidad entre nodos (personas) basada en estructuras de datos:
- Grafos como estructura principal (representan redes de relaciones y compatibilidades).
- Árboles como estructura secundaria (simbolizan similitudes e intereses compartidos).

El objetivo es detectar parejas o conexiones compatibles entre dos nodos con intereses comunes y otras relaciones.

---

## Estructura modular

1. `src/main/java/com/finalproject/ui`
   - Módulo UI.
   - Crea componentes visuales y estructuras de interfaz.
   - Muestra resultados de afinidad y guía interacción de usuario.

2. `src/main/java/com/finalproject/core`
   - Módulo central.
   - Implementa estructuras de datos y algoritmos:
     - Grafos (nodos, aristas, peso, recorridos, conectividad).
     - Árboles (similitud, comparación, expansión de intereses).
   - Funcionalidades de cálculo de compatibilidad, búsqueda y filtrado.

3. `src/main/java/com/finalproject/application`
   - Módulo de aplicación.
   - Integra UI+core para ejecutar la lógica del sistema.
   - Orquesta:
     - carga de perfiles y atributos,
     - construcción de grafo de relaciones,
     - generación de árboles de similitud,
     - búsqueda de pares compatibles,
     - entrega de resultados a la interfaz.

---

## Objetivo funcional

- Encontrar afinidades entre nodos según relaciones y similitudes.
- Grafos: expresan relaciones directas/indirectas y compatibilidad.
- Árboles: representan intereses comunes y similitud de perfiles.
- Aplicación estilo matchmaking, con foco en DS y diseño modular.

---

## Estructura del repositorio

- `pom.xml`: configuración Maven.
- `src/main/java/com/finalproject`
  - `App.java`: punto de entrada.
  - `application/`: capa de integración.
  - `core/`: lógica y estructuras.
  - `ui/`: interfaz de usuario.
- `src/test/java/com/finalproject/AppTest.java`: pruebas.
- `target/`: artefactos de compilación.

---

## Cómo ejecutar

1. `mvn clean install`
2. `mvn exec:java -Dexec.mainClass="com.finalproject.App"`

(Modificar según configuración real si cambia el Main o plugin.)

---

## Próximas ampliaciones de la documentación

- Documentación detallada de clases, paquetes y algoritmos.
- Ejemplo de flujo de datos (caso de uso: búsqueda de pareja compatible).
- API de métodos y formatos de entrada/salida.
- Resultados esperados y ejemplos de uso.
- Guía de pruebas unitarias e integración.

---

## Notas

- UI = componentes y visualización.
- CORE = estructuras y lógica.
- APPLICATION = integración de ambos.
