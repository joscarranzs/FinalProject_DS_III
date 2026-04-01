# Proyecto final: Algoritmo de afinidad

## Descripción

El proyecto final de la materia Estructura de Datos II es crear una aplicación gráfica que represente visualmente el funcionamiento verdadero de estructuras complejas, como árboles o grafos. Se señaló que el proyecto debe contar con una estructura principal; en nuestro caso, esta es "grafos", mientras que "árboles" es la estructura secundaria.

Como proyecto, hemos optado por crear un algoritmo que ilustre las conexiones entre un grupo de nodos (individuos) mediante grafos; al emplear árboles y una estructura preestablecida, estos representarán los gustos compartidos. Todos los nodos tendrán la misma estructura en sus árboles.

El usuario podrá elegir un nodo para comparar con los demás. Este mostrará nodos y su porcentaje de compatibilidad. El nodo seleccionado será marcado en color azul, mientras que los otros nodos tendrán los siguientes colores: rojo (compatibilidad baja: entre 0 y 33%), amarillo (compatibilidad media: entre 34 y 66%) y verde (alta compatibilidad: entre 67 y 100%).

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

1. Configurar lo básico de Git:
   - `git config --global user.name "Tu Nombre"`
   - `git config --global user.email "tu.email@ejemplo.com"`
   - `git config --global core.editor "code --wait"` (opcional: VS Code como editor).
   - `git config --global pull.rebase false` (usualmente con flujos de trabajo en equipo viene por defecto).

2. Clonar el repositorio:
   - `git clone https://github.com/joscarranzs/FinalProject_DS_III.git`
   - `cd FinalProject_DS_III`

3. Ramas base del proyecto:
   - `main`: rama de producción estable, siempre limpia.
   - `dev`: rama de desarrollo, donde se integra el trabajo de todas las funcionalidades.
   - Nota: Todos los colaboradores deben trabajar en `dev`.

4. Cambiar a la rama `dev`:
   - `git checkout dev` (si no existe local: `git fetch && git checkout -b dev origin/dev`).

5. Convenciones de ramas de trabajo (recomendadas):
   - Crear una subrama desde `dev` para cada tarea concreta:
     * `feature/<descripción-corta>` (nueva funcionalidad)
     * `bugfix/<descripción-corta>` (corrección)
     * `hotfix/<descripción-corta>` (emergencias)
   - Ejemplo: `git checkout -b feature/vista-nodos-dev`.

6. Flujo de trabajo sugerido:
   - Trabaja en tu subrama.
   - Realiza commits pequeños y claros con mensajes como:
     * `git commit -m "Feature: Agregar cálculo de compatibilidad"`
     * `git commit -m "Fix: Corregir orden de visualización de nodos"`
   - Sube tu subrama al remoto:
     * `git push -u origin feature/vista-nodos-dev`

7. Fusionar a `dev` y limpiar ramas:
   - Crea un Pull Request / Merge Request desde `feature/...` a `dev` en GitHub.
   - Revisión de código, pruebas y aprobación.
   - También puedes crear un PR usando GitHub CLI:
     * `gh pr create --base dev --head feature/vista-nodos-dev --title "Feature: ..." --body "Descripción de la tarea"`
     * `gh pr merge <número-o-url> --merge` (después de aprobación).
   - O desde consola con Git y remoto configurado:
     * `git push -u origin feature/vista-nodos-dev`
     * Abrir URL: `https://github.com/joscarranzs/FinalProject_DS_III/compare/dev...feature/vista-nodos-dev?expand=1` y completar PR.
   - Una vez fusionada, elimina la subrama en remoto y local:
     * `git branch -d feature/vista-nodos-dev`
     * `git push origin --delete feature/vista-nodos-dev`
   - Mantener solo `main` y `dev` como ramas principales.

> Nota: este flujo garantiza estabilidad en main, facilita la revisión y reduce conflictos, y ayuda a que cada colaborador trabaje de forma independiente.

## Recomendaciones

- Estilo de idioma:
  - El código fuente del proyecto debe estar completamente en inglés (nombres de clases, métodos, variables, paquetes).
  - Las ramas y subramas deben ser nombradas en inglés, por ejemplo: `feature/user-preference`, `bugfix/color-tier`.
  - Los mensajes de commit y descripciones de Git deben estar en inglés.
  - Excepción: los comentarios dentro del código pueden estar en español, siempre usando buenas prácticas de Javadoc y documentación clara.

- Documentación recomendada:
  - Libro oficial de Git en línea: https://git-scm.com/book/en/v2
  - Documentación de Java:
    * https://docs.oracle.com/en/java/
    * https://docs.oracle.com/javase/8/docs/api/ (o la versión correspondiente al JDK usado en el proyecto)
  - Uso de un estilo uniforme de Javadoc para los comentarios de todos los elementos públicos.

- Herramientas complementarias sugeridas:
  - Swing para interfaces gráficas ligeras: https://docs.oracle.com/javase/tutorial/uiswing/
  - JavaFX para UI más moderna: https://openjfx.io/

- Buenas prácticas generales:
  - Mantener el código modular y con responsabilidades separadas.
  - Escribir tests unitarios en `src/test/java` y ejecutarlos con `mvn test`.
  - Revisar y actualizar este README con cada avance relevante del proyecto.

