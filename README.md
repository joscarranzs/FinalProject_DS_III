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

## Cómo instalar Git

### Windows
1. Descarga el instalador desde https://git-scm.com/download/win.
2. Ejecuta el instalador y acepta las opciones recomendadas (Git Bash, ubicación de PATH, configuración de fin de línea etc.).
3. Cierra y abre una nueva terminal (Git Bash o PowerShell).

### Linux
1. En distribuciones basadas en Debian/Ubuntu:
   - `sudo apt update`
   - `sudo apt install git`
2. En Fedora/CentOS:
   - `sudo dnf install git`
3. En Arch Linux:
   - `sudo pacman -S git`

### macOS
1. Usando Homebrew:
   - `brew install git`
2. O con Xcode Command Line Tools:
   - `xcode-select --install`

## Comandos básicos de Git

1. `git config --global user.name "Tu Nombre"`
2. `git config --global user.email "tu@correo.com"`
3. `git clone <url>` - clonar un repositorio.
4. `git status` - revisar el estado del repositorio.
5. `git add <archivo>` - stage para commit.
6. `git commit -m "mensaje"` - crear un commit.
7. `git pull origin dev` - traer cambios de la rama dev.
8. `git push origin <tu-rama>` - subir cambios al remoto.
9. `git checkout <rama>` - cambiar de rama.
10. `git checkout -b <rama>` - crear y cambiar a nueva rama.
11. `git branch` - listar ramas locales.

## Conectarse al repositorio y comenzar a colaborar

1. Clonar el repo (desde la URL del proyecto):
   - `git clone https://github.com/joscarranzs/FinalProject_DS_III.git`
2. Entrar al directorio:
   - `cd FinalProject_DS_II`
3. Verificar ramas remotas:
   - `git branch -a`
4. Cambiar a la rama de desarrollo:
   - `git checkout dev`
5. Mantener dev actualizada:
   - `git fetch origin`
   - `git pull origin dev`

## Flujo de trabajo con ramas Git

Este repositorio utiliza dos ramas principales:
- `main` (o `master`) para el código de producción estable.
- `dev` para desarrollo activo.

Siempre trabaja en `dev`:
1. Cambiar a dev:
   - `git checkout dev`
2. Actualizar los últimos cambios antes de empezar:
   - `git fetch origin`
   - `git pull origin dev`
3. Crear una rama de trabajo desde dev para tu tarea:
   - `git checkout -b feature/mi-tarea`

### Convención de nombres de ramas
- `feature/<descripción>`: nuevas funcionalidades.
- `fix/<descripción>`: correcciones de bugs.
- `hotfix/<descripción>`: corrección urgente en producción.
- `chore/<descripción>`: tareas menores (configuración, docs, etc.).

Ejemplo típico:
- `feature/grafo-ponderado`
- `feature/ui-filtros-busqueda`

## Pull request (PR) desde línea de comandos
1. Asegúrate de tener tu rama `feature` actualizada sobre `dev`:
   - `git checkout feature/mi-tarea`
   - `git fetch origin`
   - `git pull origin dev` (rebase o merge según política)
2. Subir tu rama al remoto:
   - `git push origin feature/mi-tarea`
3. Crear PR en GitHub (CLI o web):
   - `gh pr create --base dev --head feature/mi-tarea --title "Feature: mi tarea" --body "Descripción de los cambios."`
4. Revisar y fusionar (merge) cuando esté aprobado:
   - `gh pr merge --merge` (o `--squash` según convención)
5. Eliminar la rama de feature local y remota después de mergear:
   - `git branch -d feature/mi-tarea`
   - `git push origin --delete feature/mi-tarea`

   - Esto se hace para evitar acumular ramas obsoletas, reducir el ruido en el repositorio y dejar claramente solo las ramas activas (como `dev` y `main`).
   - También reduce el riesgo de crear trabajo en ramas antiguas, facilita la revisión y mantenimiento del historial.

> Si no usas GitHub CLI, puedes usar la interfaz web tras el paso 2.

Esto ayuda a mantener la rama `dev` limpia y a seguir el flujo colaborativo. Tambien ayuda a evitar conflictos y mantiene la base actualizada.

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

## Nota importante
- Toda descripción, nombre de rama, mensaje de commit y comentarios de código deben escribirse en inglés.
- El código del proyecto debe mantenerse en inglés coherente con la convención de estilo.
- Evita copiar código generado por inteligencia artificial sin revisar su funcionamiento, seguridad y adecuación al diseño del proyecto.

## Notas

- UI = componentes y visualización.
- CORE = estructuras y lógica.
- APPLICATION = integración de ambos.
