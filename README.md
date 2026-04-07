# Proyecto final: Algoritmo de afinidad

## Descripción

El proyecto final de la materia Estructura de Datos II es crear una aplicación gráfica que represente visualmente el funcionamiento verdadero de estructuras complejas, como árboles o grafos. Se señaló que el proyecto debe contar con una estructura principal; en nuestro caso, esta es **"árboles"**, mientras que **"grafos"** es la estructura secundaria o auxiliar.

Como proyecto, hemos optado por crear un algoritmo de afinidad que calcula el porcentaje de compatibilidad entre un nodo principal y un subconjunto de nodos. Los **árboles** son el núcleo del sistema: cada nodo posee un árbol con la misma estructura predefinida, que representa categorías, subcategorías y elementos (gustos o preferencias). La compatibilidad se calcula recorriendo y comparando estos árboles para determinar cuántos elementos coinciden y expresar ese valor como un porcentaje. Una vez calculados todos los porcentajes, los **grafos** los reciben para visualizar las relaciones entre nodos de forma colorida e intuitiva.

El usuario podrá elegir un nodo para comparar con los demás. El sistema mostrará todos los nodos y su porcentaje de compatibilidad de la siguiente manera:

| Color  | Rango de compatibilidad | Significado            |
|--------|-------------------------|------------------------|
| 🔵 Azul   | —                       | Nodo principal (el que se compara) |
| 🔴 Rojo   | 0 % – 33 %              | Compatibilidad baja    |
| 🟡 Amarillo | 34 % – 66 %           | Compatibilidad media   |
| 🟢 Verde  | 67 % – 100 %            | Compatibilidad alta    |

### Flujo de datos

```
Árboles de nodos
      │
      ▼
Recorrido y comparación de contenido
      │
      ▼
Cálculo del % de compatibilidad
      │
      ▼
Grafo con nodos coloreados según compatibilidad
```

1. Cada nodo tiene un árbol asociado con categorías, subcategorías y elementos.
2. Los árboles del nodo principal y de cada nodo del subconjunto se recorren y comparan para obtener el porcentaje de coincidencias.
3. Los porcentajes calculados se pasan al grafo, que los visualiza mediante los colores descritos en la tabla anterior.

### Modularidad del proyecto

El diseño del proyecto está dividido en dos capas bien diferenciadas:

- **Capa de cálculo (árboles):** Responsable de almacenar los datos de cada nodo y de ejecutar las comparaciones para generar los valores de compatibilidad. Es la estructura de mayor peso operativo del sistema.
- **Capa de visualización (grafos):** Responsable de representar las relaciones entre nodos, mostrando de forma gráfica los resultados calculados por los árboles. Recibe los porcentajes y los traduce en colores sobre el grafo.

> Nota: Por ahora solo hay una funcionalidad establecida; posteriormente se agregarán más.

## Requerimientos

Para colaborar en este proyecto necesitas instalar y configurar las siguientes herramientas: Git, Java JDK y Visual Studio Code.

### Git

- Windows
  1. Descarga desde https://git-scm.com/download/win
  2. Ejecuta el instalador y acepta las opciones recomendadas (incluye Git Bash y línea de comandos).
  3. Verifica en terminal: `git --version`

- macOS
  1. Instala con Homebrew: `brew install git` (si no tienes Homebrew, primero: `/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`).
  2. Alternativa: descarga desde https://git-scm.com/download/mac.
  3. Verifica: `git --version`

- Linux (Ubuntu/Debian)
  1. `sudo apt update && sudo apt install git -y`
  2. Verifica: `git --version`
  3. Para Fedora/CentOS: `sudo dnf install git -y`.

### Java (JDK) + PATH

- Windows
  1. Descarga el JDK (preferible OpenJDK 17/21) desde https://adoptium.net/ o https://www.oracle.com/java/technologies/javase-downloads.html.
  2. Instala en `C:\Program Files\Java\jdk-<version>`.
  3. Ajusta variables de entorno:
     - JAVA_HOME = `C:\Program Files\Java\jdk-<version>`
     - PATH = `%JAVA_HOME%\bin;` + valor existente.
  4. Verifica: `java -version` y `javac -version`.

- macOS
  1. Homebrew: `brew install openjdk@17` (o 21) y luego `sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk`.
  2. Agrega a tu shell (`~/.zshrc` o `~/.bash_profile`):
     - `export JAVA_HOME="$(/usr/libexec/java_home -v 17)"`
     - `export PATH="$JAVA_HOME/bin:$PATH"`
  3. Verifica: `java -version` y `javac -version`.

- Linux (Ubuntu/Debian)
  1. `sudo apt update && sudo apt install openjdk-17-jdk -y`.
  2. Verifica de la ruta: `sudo update-alternatives --config java` y `sudo update-alternatives --config javac`.
  3. En `~/.bashrc` o `~/.zshrc`:
     - `export JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64"`
     - `export PATH="$JAVA_HOME/bin:$PATH"`
  4. Ejecuta `source ~/.bashrc` y comprueba: `java -version`, `javac -version`.

### Visual Studio Code

- Windows
  1. Descarga: https://code.visualstudio.com/download
  2. Instala y marca "Add to PATH" y "Open with Code".
  3. Verifica: `code --version`.

- macOS
  1. Descarga e instala desde el sitio oficial.
  2. Abre VS Code y ejecuta el comando `Shell Command: Install 'code' command in PATH`.
  3. Verifica: `code --version`.

- Linux
  1. En Ubuntu/Debian: `sudo snap install code --classic` o `sudo apt install ./<archivo>.deb`.
  2. En Fedora: `sudo rpm -i <archivo>.rpm` o Snap.
  3. Verifica: `code --version`.


> Nota: estas tres herramientas son imprescindibles para comenzar a cooperar en el proyecto.


## Primeros pasos en git

Esta sección explica cómo configurar git, clonar el repositorio, trabajar con ramas, usar convenciones de ramas y comandos útiles.

### 1. Configuraciones globales básicas de Git

Antes de trabajar con repositorios, configura tu identidad y algunas opciones generales:

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"
git config --global core.editor "code --wait"
git config --global pull.rebase false
git config --global --list
```

Estas configuraciones se almacenan en `~/.gitconfig` y se aplican a todos los repositorios de tu usuario.

### 2. Clonar repositorio

Para trabajar en el proyecto, clona el repositorio remoto y entra en la carpeta del proyecto:

```bash
git clone https://github.com/joscarranzs/FinalProject_DS_III.git
cd FinalProject_DS_III
```

Después de clonar, el repositorio local estará listo para crear ramas, hacer commits y enviar cambios al remoto.

### 3. Visualización de ramas

Ver las ramas locales del proyecto:

```bash
git branch
```

Ver todas las ramas locales y remotas:

```bash
git branch -a
```

Cambiar de rama:

```bash
git checkout dev
```

O, en versiones recientes de Git:

```bash
git switch dev
```

En este proyecto hay dos ramas principales:

- `main` — rama de producción.
- `dev` — rama de desarrollo.

Solo el administrador del proyecto debe trabajar directamente en `main`. El resto del equipo debe crear ramas temporales y fusionar sus cambios en `dev`.

### 4. Convención de ramas

Una convención de ramas es un conjunto de reglas para nombrar ramas de manera consistente. Se usa para que el equipo entienda el propósito de una rama sin leer su contenido.

Ejemplos de tipos de ramas:

- `feature/` — nuevas funcionalidades.
- `bugfix/` — correcciones de errores.
- `hotfix/` — arreglos urgentes en producción.
- `release/` — preparación de una versión.
- `chore/` — tareas de mantenimiento.
- `docs/` — cambios en documentación.

Por ejemplo, `feature/user-authentication` indica que se trata de una nueva funcionalidad.

#### Flujo típico con una rama de convención

1. Crear la rama desde `dev`:

```bash
git checkout dev
git pull origin dev
git checkout -b feature/user-authentication
```

2. Trabajar en la tarea, agregar cambios y hacer commits:

```bash
git add src/main/java/com/finalproject/...
git commit -m "Add user authentication feature"
```

3. Subir la rama temporal al remoto:

```bash
git push -u origin feature/user-authentication
```

4. Continuar trabajando y subir cambios:

```bash
git add .
git commit -m "Fix login validation"
git push
```

5. Fusionar la rama a `dev` en local:

```bash
git checkout dev
git pull origin dev
git merge --no-ff feature/user-authentication -m "Integrating user authentication into dev"
```

6. Subir `dev` al remoto:

```bash
git push origin dev
```

7. Eliminar la rama temporal:

```bash
git branch -d feature/user-authentication
git push origin --delete feature/user-authentication
```

Al finalizar, la rama de convención ya no debe quedar activa.

### 5. Comandos útiles

Aquí están los comandos más usados en Git con ejemplos reales:

1. `git status`
   - Muestra cambios sin confirmar y la rama actual.
   - Ejemplo:
     ```bash
     git status
     ```
2. `git add`
   - Añade archivos al área de staging.
   - Ejemplo:
     ```bash
     git add src/main/java/com/finalproject/App.java
     ```
3. `git commit`
   - Crea un commit con los cambios añadidos.
   - Ejemplo:
     ```bash
     git commit -m "Implement affinity algorithm core logic"
     ```
4. `git push`
   - Envía commits locales al repositorio remoto.
   - Ejemplo:
     ```bash
     git push origin dev
     ```
5. `git pull`
   - Descarga cambios remotos y los fusiona en la rama actual.
   - Ejemplo:
     ```bash
     git pull origin dev
     ```
6. `git clone`
   - Clona un repositorio remoto.
   - Ejemplo:
     ```bash
     git clone https://github.com/joscarranzs/FinalProject_DS_III.git
     ```
7. `git branch`
   - Lista ramas locales.
   - Ejemplo:
     ```bash
     git branch
     ```
8. `git branch -a`
   - Lista ramas locales y remotas.
   - Ejemplo:
     ```bash
     git branch -a
     ```
9. `git checkout`
   - Cambia de rama o crea una nueva rama desde otra.
   - Ejemplo:
     ```bash
     git checkout -b bugfix/fix-null-pointer dev
     ```
10. `git switch`
    - Cambia de rama de manera más moderna.
    - Ejemplo:
      ```bash
      git switch main
      ```
11. `git merge`
    - Fusiona otra rama en la rama activa.
    - Ejemplo:
      ```bash
      git merge --no-ff feature/user-authentication
      ```
12. `git log`
    - Muestra el historial de commits.
    - Ejemplo:
      ```bash
      git log --oneline --graph --decorate
      ```
13. `git reset`
    - Deshace cambios en el área de staging o en el working tree.
    - Ejemplo:
      ```bash
      git reset HEAD src/main/java/com/finalproject/App.java
      ```
14. `git diff`
    - Muestra diferencias entre archivos, commits o ramas.
    - Ejemplo:
      ```bash
      git diff origin/dev..dev
      ```
15. `git stash`
    - Guarda cambios temporales sin hacer commit.
    - Ejemplo:
      ```bash
      git stash push -m "WIP fix affinity graph"
      ```
16. `git stash pop`
    - Recupera los cambios guardados en el stash.
    - Ejemplo:
      ```bash
      git stash pop
      ```
17. `git pull --rebase`
    - Actualiza la rama actual rebaseando tus commits encima de los cambios remotos.
    - Ejemplo:
      ```bash
      git pull --rebase origin dev
      ```
18. `git push origin --delete <branch>`
    - Elimina una rama remota cuando ya no se necesita.
    - Ejemplo:
      ```bash
      git push origin --delete feature/user-authentication
      ```

> Nota: en Git, los nombres de ramas y mensajes deben mantenerse en inglés para que sean claros y consistentes en equipos internacionales.

## GitHub CLI (Pull Request)

### 1. ¿Qué es GitHub CLI?

GitHub CLI (`gh`) es una herramienta de línea de comandos creada por GitHub para gestionar repositorios, issues y pull requests desde la terminal. Su propósito es permitir a los desarrolladores trabajar con GitHub sin cambiar al navegador, integrando flujos de trabajo de Git y GitHub en una experiencia rápida y consistente.

### 2. Comandos básicos

- Crear un pull request desde `dev` hacia `main`:

    ```bash
    gh pr create --base main --head dev --title "Add user authentication" --body "This PR implements user authentication for the project"
    ```

- Ver el estado de un pull request:

    ```bash
    gh pr view <pr-number> --web
    ```

- Listar pull requests abiertos en el repositorio:

    ```bash
    gh pr list --state open --base main
    ```

- Fusionar un pull request:

    ```bash
    gh pr merge <pr-number> --merge
    ```

### 3. Ejemplo práctico

Imagina que ya trabajaste en la rama `dev`, hiciste commits y estás listo para abrir un pull request hacia `main`.

1. Crear el pull request desde GitHub CLI:

    ```bash
    gh pr create --base main --head dev --title "Add user authentication" --body "This PR adds user authentication feature to main"
    ```

    Ejemplo de salida esperada:

    ```text
    Created pull request #42
    View it on GitHub: https://github.com/joscarranzs/FinalProject_DS_III/pull/42
    ```

2. Ver el estado del pull request:

    ```bash
    gh pr view 42 --web
    ```

   - Esto abre la vista del PR `#42` en el navegador y muestra su estado actual.
   - Si prefieres ver la información en la terminal, usa:

    ```bash
    gh pr view 42 --json number,title,state,author
    ```

3. Fusionar el pull request con un merge commit:

    ```bash
    gh pr merge 42 --merge
    ```

    Ejemplo de salida esperada:

    ```text
    Merged pull request #42
    ```

> Consejo: usa el número real del pull request en lugar de `42`, siguiendo lo que `gh pr list --state open --base main` muestre.

