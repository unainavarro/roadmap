<h1 align="center">Pseudoclases</h1>

<h2>📑 Contenido</h2>

- [Pseudoclases](#pseudoclases)
- [Pseudoclases de interacción](#pseudoclases-de-interacción)
  - [:active](#active)
  - [:focus](#focus)
  - [:focus-visible](#focus-visible)
  - [:focus-within](#focus-within)
  - [:hover](#hover)
  - [:target](#target)
  - [:visited](#visited)
  - [:link](#link)
- [Pseudoclases de ubicación](#pseudoclases-de-ubicación)
  - [:first-child](#first-child)
  - [:last-child](#last-child)
  - [:nth-child, :nth-last-child y :nth-last-of-type](#nth-child-nth-last-child-y-nth-last-of-type)
  - [:first-of-type y :last-of-type](#first-of-type-y-last-of-type)
  - [:only-child y :only-of-type](#only-child-y-only-of-type)
  - [:nth-last-of-type](#nth-last-of-type)
- [Pseudoclases de idioma](#pseudoclases-de-idioma)
  - [:dir()](#dir)
  - [:lang](#lang)
- [Pseudoclases de estructura](#pseudoclases-de-estructura)
  - [:empty](#empty)
  - [:has()](#has)
  - [:not](#not)
  - [:is](#is)
  - [:where](#where)
- [Pseudoclases de formularios](#pseudoclases-de-formularios)
  - [:autofill](#autofill)
  - [:checked](#checked)
  - [:disabled y :enabled](#disabled-y-enabled)
  - [:in-range](#in-range)
  - [:invalid](#invalid)
  - [:optional](#optional)
  - [:out-of-range](#out-of-range)
  - [:placeholder-shown](#placeholder-shown)
  - [:required](#required)
  - [:user-invalid](#user-invalid)
  - [:valid](#valid)
- [Pseudoclases de estado](#pseudoclases-de-estado)
  - [:any-link](#any-link)
  - [:blank](#blank)
  - [:default](#default)

## Pseudoclases

Las pseudoclases en CSS son selectores que seleccionan elementos en ciertos estados o situaciones específicas. CSS proporciona varios tipos de selectores, para especificar el estado especial del elemento seleccionado. Permite añadir estilos al interactuar con los elementos, añadir nuevos elementos...

La diferencia de las pseudoclases y pseudoelementos es que los pseudoelementos suelen hacer referencia a determinadas partes de un elemento.

## Pseudoclases de interacción

### :active

Se utiliza para seleccionar y estilizar un elemento cuando está siendo activado o "clickeado" por el usuario.

**Cambiar tamaño y color de letra:**

```html
<!-- HTML -->
<a href="#">Enlace de prueba</a>
```

```css
/* CSS */
a:active {
  font-size: 30px;
  color: pink;
}
```

---

### :focus

Se utiliza para seleccionar y estilizar un elemento que actualmente tiene el foco, es decir, el elemento que está siendo activamente utilizado o interactuado por el usuario, como un campo de entrada de texto o un enlace activado por teclado.

**Cambiar borde al hacer foco**

```html
<!-- HTML -->
<label for="username">Nombre de usuario:</label>
<input type="text" id="username" placeholder="Ingresa tu nombre de usuario" />
```

```css
/* CSS */
input {
  padding: 10px;
  margin: 5px;
}

/ input:focus {
  border: 2px solid salmon;
  outline: none;
}
```

---

### :focus-visible

Se utiliza para seleccionar y estilizar un elemento que tiene el foco, pero solo cuando el foco se está aplicando mediante interacción del usuario (por ejemplo, mediante el teclado), y no cuando el foco es activado mediante eventos del mouse.

```html
<!-- HTML -->
<label for="username">Nombre de usuario:</label>
<input type="text" id="username" placeholder="Ingresa tu nombre de usuario" />
```

```css
/* CSS */

input {
  padding: 10px;
  margin: 5px;
}

input:focus-visible {
  border: 2px solid #3498db;
  outline: none;
}
```

---

### :focus-within

Se utiliza para seleccionar y estilizar un elemento padre que contiene un hijo que tiene el foco. Es útil cuando deseas aplicar estilos al contenedor que rodea al elemento focalizado, lo que puede ser útil para indicar visualmente la relación entre el contenedor y el elemento focalizado.

**Cambia el color del borde del padre cuando el hijo tiene foco**

```html
<!-- HTML -->
<div class="container">
  <label for="username">Nombre de usuario:</label>
  <input type="text" id="username" placeholder="Ingresa tu nombre de usuario" />
</div>
```

```css
/* CSS */
.container {
  padding: 20px;
  border: 2px solid #ddd;
}

.container:focus-within {
  border-color: #3498db; /* Cambia el color del borde cuando contiene un elemento con foco */
}

input {
  padding: 10px;
  margin: 5px;
}
```

---

### :hover

Se utiliza para seleccionar y estilizar un elemento cuando el usuario pasa el ratón sobre él. Esta pseudoclase es comúnmente utilizada para proporcionar efectos visuales y de estilo adicionales cuando se interactúa con un elemento.
**Cambiar color de un párrafo al pasar el ratón por encima**

```html
<!-- HTML -->
<p class="cambiar-color">
  Lorem ipsum dolor sit amet consectetur, adipisicing elit. Corporis cupiditate
  quaerat similique porro voluptas nesciunt, cum quia harum sapiente sed earum
  consectetur adipisci esse assumenda maxime eligendi molestias vero nisi!
</p>
```

```css
/* CSS */
.cambiar-color:hover {
  color: blue;
}
```

---

### :target

Se utiliza para seleccionar y estilizar el elemento que es el destino de un enlace interno (ancla) en la URL. Un enlace interno es un hipervínculo que apunta a un fragmento específico de la misma página. Cuando haces clic en un enlace interno y se activa, el elemento al que apunta el fragmento se convierte en el "objetivo" (:target) y puede ser seleccionado y estilizado utilizando esta pseudoclase.

```html
<!-- HTML -->
<nav>
  <ul>
    <li><a href="#seccion1">Ir a la Sección 1</a></li>
    <li><a href="#seccion2">Ir a la Sección 2</a></li>
  </ul>
</nav>

<section id="seccion1">
  <h2>Sección 1</h2>
  <p>Contenido de la Sección 1.</p>
</section>

<section id="seccion2">
  <h2>Sección 2</h2>
  <p>Contenido de la Sección 2.</p>
</section>
```

```css
/* CSS */
:target {
  background-color: #f9d5d5;
  border: 2px solid #e74c3c;
}
```

---

### :visited

Se utiliza para seleccionar y estilizar enlaces que han sido visitados por el usuario. Es útil para proporcionar una indicación visual de qué enlaces ya se han explorado.

> [!IMPORTANT]
>
> Es importante destacar que, por razones de privacidad y seguridad, las propiedades que pueden ser estilizadas utilizando :visited están limitadas. En general, solo se permiten cambios en propiedades relacionadas con el color, como color, background-color, border-color, etc., para evitar posibles abusos que podrían comprometer la privacidad del usuario.

```html
<!-- HTML -->
<ul>
  <li><a href="https://www.ejemplo.com" target="_blank">Enlace 1</a></li>
  <li><a href="https://www.otro-ejemplo.com" target="_blank">Enlace 2</a></li>
  <li>
    <a href="https://www.yet-another-example.com" target="_blank">Enlace 3</a>
  </li>
</ul>
```

```css
/* CSS */
a:visited {
  color: #8e44ad;
  text-decoration: underline;
}
```

---

### :link

La pseudoclase :link es utilizada para seleccionar los enlaces que aún no han sido visitados por el usuario.

```css
a:link {
  color: blue; /* Estilo para enlaces no visitados */
}

a:visited {
  color: purple; /* Estilo para enlaces visitados */
}
```

---

## Pseudoclases de ubicación

### :first-child

Selecciona el primer hijo de un elemento padre, independientemente de su tipo. Puede aplicarse a cualquier tipo de elemento.

```html
<!-- HTML -->
<div>
  <p>Este es el primer párrafo.</p>
  <p>Este es el segundo párrafo.</p>
</div>
<div>
  <span>Este es el primer span.</span>
  <p>Este es otro párrafo.</p>
</div>
```

```css
/* CSS */
div:first-child {
  color: blue;
}
```

---

### :last-child

Selecciona el último hijo de un elemento contenedor, independientemente de su tipo. Puede aplicarse a cualquier tipo de elemento.

```html
<!-- HTML -->
<div>
  <p>Este es el primer párrafo.</p>
  <p>Este es el segundo párrafo.</p>
</div>
<div>
  <p>Este es otro párrafo.</p>
  <span>Este no es un párrafo.</span>
</div>
```

```css
/* CSS */
div:last-child {
  border-bottom: 2px solid #3498db;
}
```

---

### :nth-child, :nth-last-child y :nth-last-of-type

Se utilizan para seleccionar elementos en función de su posición en relación con sus elementos secundarios o en relación con el tipo específico de sus elementos secundarios.

```html
<!-- HTML -->
<p>Este es el primer párrafo.</p>
<p>Este es el segundo párrafo (será estilizado).</p>
<p>Este es el tercer párrafo.</p>

<ul>
  <li>Elemento 1</li>
  <li>Elemento 2</li>
  <li>Elemento 3 (será estilizado)</li>
  <li>Elemento 4</li>
</ul>

<div class="contenedor">
  <p>Primer párrafo dentro de .contenedor.</p>
  <p>Segundo párrafo dentro de .contenedor.</p>
  <p>Tercer párrafo dentro de .contenedor (será estilizado).</p>
</div>
```

```css
/* CSS */
/* Estilo para cada segundo párrafo */
p:nth-child(2n) {
  color: #3498db;
}

/* Estilo para el tercer elemento desde el final */
li:nth-last-child(3) {
  background-color: #ecf0f1;
}

/* Estilo para el último párrafo dentro de un contenedor */
.contenedor p:nth-last-of-type(1) {
  font-weight: bold;
}
```

---

### :first-of-type y :last-of-type

Las pseudoclases :first-of-type y :last-of-type se utilizan para seleccionar elementos en función de su posición dentro de su tipo de elemento.

```html
<div>
  <p>Primer párrafo</p>
  <p>Segundo párrafo</p>
  <span>Un span</span>
  <p>Tercer párrafo</p>
</div>
```

```css
p:first-of-type {
  color: red; /* El primer párrafo será rojo */
}

p:last-of-type {
  color: blue; /* El último párrafo será azul */
}
```

---

### :only-child y :only-of-type

Se utilizan para seleccionar elementos que son hijos únicos de su elemento contenedor o son el único elemento de su tipo entre sus elementos hermanos, respectivamente.

- :only-child: Selecciona elementos que son el único hijo de su elemento contenedor.
- only-of-type: Selecciona elementos que son el único elemento de su tipo entre sus elementos hermanos.

```html
<!-- HTML -->
<div class="contenedor">
  <p>Este es el único párrafo dentro de .contenedor (será estilizado).</p>
</div>

<div class="contenedor">
  <p>Este es el primer párrafo.</p>
  <p>Este es el segundo párrafo.</p>
</div>
```

```css
/* CSS */
.contenedor p:only-child {
  color: #3498db;
}

/* Estilo para el único párrafo de su tipo dentro de un contenedor */
.contenedor p:only-of-type {
  font-weight: bold;
}
```

---

### :nth-last-of-type

La pseudoclase :nth-last-of-type se utiliza para seleccionar uno o más elementos en función de su posición entre los hermanos del mismo tipo, contados desde el final.

```html
<div>
  <p>Primer párrafo</p>
  <p>Segundo párrafo</p>
  <span>Un span</span>
  <p>Tercer párrafo</p>
  <p>Cuarto párrafo</p>
</div>
```

```css
p:nth-last-of-type(2) {
  color: green; /* El segundo párrafo desde el final será verde */
}

p:nth-last-of-type(even) {
  background-color: lightgray; /* Los párrafos pares desde el final tendrán fondo gris claro */
}
```

## Pseudoclases de idioma

### :dir()

Se utiliza para seleccionar elementos según la direccionalidad del texto.

**Cambiar fondo dependiendo de la dirección del texto**

```html
<!-- HTML -->
<p>
  Lorem ipsum dolor sit amet consectetur adipisicing elit. Adipisci tempora
  sequi aliquid rerum nemo consequatur! Atque quos ut, corporis sapiente
  consequuntur illum consequatur culpa iusto impedit! Earum accusantium quaerat
  enim.
</p>

<p dir="rtl">
  Lorem ipsum dolor sit amet consectetur adipisicing elit. Adipisci tempora
  sequi aliquid rerum nemo consequatur! Atque quos ut, corporis sapiente
  consequuntur illum consequatur culpa iusto impedit! Earum accusantium quaerat
  enim.
</p>
```

```css
/* CSS */
p {
  width: 250px;
}

p:dir(ltr) {
  background-color: red;
}

p:dir(rtl) {
  background-color: blue;
}
```

---

### :lang

Se utiliza para seleccionar y estilizar elementos que tienen un atributo lang específico.

```html
<!-- HTML -->
<p lang="es">Este párrafo está en español.</p>
<p lang="en">This paragraph is in English.</p>
```

```css
/* CSS */
p:lang(es) {
  color: #3498db; /* Cambia el color del texto para español */
}

/* Estilo para los elementos con lang="en" */
p:lang(en) {
  color: #e74c3c; /* Cambia el color del texto para inglés */
}
```

---

## Pseudoclases de estructura

### :empty

Se utiliza para seleccionar y estilizar elementos que no contienen ningún contenido o hijos, incluyendo espacio en blanco o comentarios.

```html
<!-- HTML -->
<div>Este div tiene contenido</div>
<div></div>
```

```css
/* CSS */
div {
  border: 1px solid #000;
  margin: 10px;
  padding: 10px;
}

div:empty {
  background-color: #e6e6e6;
  border: 1px dashed #999;
}
```

---

### :has()

Selecciona elementos que contienen otros elementos que coinciden con el selector pasado en sus argumentos. A menudo se le conoce como "el selector principal" debido a su capacidad para seleccionar un elemento principal en función de los elementos secundarios que contiene y aplicar estilos al padre.

**Cambiar el fondo solo si contiene un h3**

```html
<!-- HTML -->
<section>
  <h2>Encabezado</h2>
  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit.</p>
</section>

<section>
  <h2>Encabezado</h2>
  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit.</p>
  <h3>Encabezado 3</h3>
  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit.</p>
</section>
```

```css
/* CSS */
section:has(h3) {
  background-color: teal;
}
```

---

### :not

Se utiliza para seleccionar elementos que no cumplen con ciertos criterios. Permite excluir elementos específicos de la selección.

**Excluir párrafos**

```html
<!-- HTML -->
<p>Este es un párrafo normal.</p>
<p class="excluido">Este párrafo está excluido.</p>

<div class="contenedor">
  <p>Otro párrafo dentro de .contenedor.</p>
  <p class="excluido">Este párrafo dentro de .contenedor está excluido.</p>
</div>
```

```css
/* CSS */
p:not(.excluido) {
  color: #3498db;
  font-weight: bold;
}

.contenedor p {
  background-color: #ecf0f1;
}
```

---

### :is

Se utiliza para agrupar selectores y simplificar la escritura de reglas CSS. Permite especificar varios selectores dentro de una sola regla, lo que puede hacer que las hojas de estilo sean más concisas.

**Estilar solo p y ol**

```html
<!-- HTML -->
<div class="container">
  <p>Este es un párrafo.</p>
  <ul>
    <li>Elemento de lista 1</li>
    <li>Elemento de lista 2</li>
  </ul>
  <ol>
    <li>Elemento numerado 1</li>
    <li>Elemento numerado 2</li>
  </ol>
</div>
```

```css
/* CSS */
.container :is(p, ol) {
  color: #333;
  margin: 10px;
  padding: 10px;
  border: 1px solid #ccc;
}
```

---

### :where

Se utiliza para como un contenedor para agrupar múltiples selectores sin afectar la especificidad de la regla. Es especialmente útil cuando se desea aplicar estilos a varios selectores sin aumentar la especificidad de la regla, lo que puede facilitar la escritura y el mantenimiento del código CSS.

```html
<!-- HTML -->
<section>
  <p>Contenido de la sección.</p>
</section>

<article>
  <p>Contenido del artículo.</p>
</article>

<div>
  <p>Contenido del div.</p>
</div>
```

```css
/* CSS */
:where(section, article, div) {
  margin: 10px;
  padding: 5px;
  border: 1px solid #3498db;
}
```

---

## Pseudoclases de formularios

### :autofill

Se utiliza para seleccionar elementos `<input>` que han sido rellenados de forma automática por el navegador.

```html
<!-- HTML -->
<form>
  <label for="name">Nombre</label>
  <input id="name" name="name" type="text" autocomplete="name" />

  <label for="email">Correo</label>
  <input id="email" name="email" type="email" autocomplete="email" />
</form>
```

```css
/* CSS */
input:autofill {
  border: 3px dashed red;
}

input:-webkit-autofill {
  border: 3px dashed red;
}
```

---

### :checked

Se utiliza para seleccionar y estilizar elementos de formulario que han sido marcados o seleccionados por el usuario. Es comúnmente utilizada con elementos de entrada como casillas de verificación `<input type="checkbox">` y botones de opción `<input type="radio">`.

**Ocultar y mostrar un párrafo mediante un checkbox.**

```html
<!-- HTML -->
<label for="mostrar-ocultar">Pulsa aquí</label>
<input type="checkbox" name="mostrar-ocultar" id="mostrar-ocultar" />

<p>
  Lorem ipsum dolor sit, amet consectetur adipisicing elit. Eaque voluptas quo
  sint voluptate illo mollitia quam possimus obcaecati atque sunt quos, fuga
  similique inventore ad hic nihil temporibus ea at.
</p>
```

```css
/* CSS */
#mostrar-ocultar:checked + p {
  display: none;
}
```

---

### :disabled y :enabled

Se utiliza para seleccionar y estilizar elementos que están deshabilitados(:disabled) o habilitados(:enabled). Esto es comúnmente utilizado con elementos de formulario, como botones, campos de entrada, casillas de verificación, y otros, que han sido desactivados para la interacción del usuario.

**Cambiar el fondo,texto y cursor cuando este desactivado**

```html
<!-- HTML -->
<button>Botón Habilitado</button>
<button disabled>Botón Deshabilitado</button>
```

```css
/* CSS */
button {
  padding: 10px;
  margin: 5px;
}

button:disabled {
  background-color: #d3d3d3;
  color: #808080;
  cursor: not-allowed;
}
```

---

### :in-range

Se utiliza para seleccionar y estilizar un elemento de formulario (como un `<input>` de tipo número) cuando su valor está dentro del rango especificado.

**Cambia el borde cuando está dentro del rango(1-10)**

```html
<!-- HTML -->
<label for="quantity">Cantidad (entre 1 y 10):</label>
<input type="number" id="quantity" name="quantity" min="1" max="10" value="0" />
```

```css
/* CSS */
input[type="number"] {
  padding: 10px;
  margin: 5px;
}

input[type="number"]:in-range {
  border: 2px solid greenyellow;
}
```

---

### :invalid

Se utiliza para seleccionar y estilizar elementos de formulario que tienen un estado de validación "inválido". Un elemento de formulario se considera inválido si no cumple con las restricciones de validación especificadas en su atributo pattern, required, min, max, type, etc.

```html
<!-- HTML -->
<label for="quantity">Cantidad (debe ser un número):</label>
<input type="number" id="quantity" name="quantity" required />
```

```css
/* CSS */
input[type="number"] {
  padding: 10px;
  margin: 5px;
}

input[type="number"]:invalid {
  border: 2px solid red;
}
```

---

### :optional

La pseudoclase :optional se utiliza en CSS para seleccionar los elementos de formulario que no requieren ser completados por el usuario.

```html
<form>
  <label for="name">Nombre (obligatorio):</label>
  <input type="text" id="name" name="name" required />

  <label for="email">Email (opcional):</label>
  <input type="email" id="email" name="email" />

  <label for="age">Edad (opcional):</label>
  <input type="number" id="age" name="age" />

  <button type="submit">Enviar</button>
</form>
```

```css
input:optional {
  border: 2px solid green; /* Aplica un borde verde a los campos opcionales */
}
```

---

### :out-of-range

La pseudoclase :out-of-range se utiliza en CSS para seleccionar los elementos de formulario cuyos valores no están dentro del rango especificado por los atributos min y max en los elementos `<input>` o `<textarea>`.

```html
<label for="quantity">Cantidad (entre 1 y 10):</label>
<input type="number" id="quantity" name="quantity" min="1" max="10" />
```

```css
input[type="number"]:out-of-range {
  border: 2px solid red; /* Aplica un borde rojo a los campos fuera de rango */
}
```

### :placeholder-shown

La pseudoclase :placeholder-shown se utiliza en CSS para seleccionar elementos de formulario cuyo placeholder (texto de marcador de posición) está siendo mostrado.

```html
<label for="username">Nombre de usuario:</label>
<input
  type="text"
  id="username"
  name="username"
  placeholder="Ingrese su nombre de usuario"
/>

<label for="message">Mensaje:</label>
<textarea
  id="message"
  name="message"
  placeholder="Ingrese su mensaje aquí"
></textarea>
```

```css
input:placeholder-shown,
textarea:placeholder-shown {
  color: #999; /* Cambia el color del texto de marcador de posición */
}
```

### :required

Se utiliza para seleccionar y estilizar elementos de formulario que tienen el atributo required. Esta pseudoclase es comúnmente utilizada para aplicar estilos específicos a campos de formulario que deben ser completados antes de enviar el formulario.

```html
<!-- HTML -->
<form>
  <label for="username">Nombre de usuario:</label>
  <input type="text" id="username" name="username" required />

  <label for="password">Contraseña:</label>
  <input type="password" id="password" name="password" required />

  <button type="submit">Enviar</button>
</form>
```

```css
/* CSS */
:required {
  border: 2px solid #e74c3c;
  background-color: #f9d5d5;
}
```

---

### :user-invalid

Selecciona un elemento de formulario en función de si el valor (tal como lo ingresa un usuario) es válido cuando se compara con lo que se especifica como un valor aceptado en el marcado HTML.

**Agregar un borde y una X si el email no es valido**

```html
<!-- HTML -->
<form>
  <label for="email">Email *: </label>
  <input id="email" name="email" type="email" required />
  <span></span>
</form>
```

```css
/* CSS */
input:user-invalid {
  border: 2px solid red;
}

input:user-invalid + span::before {
  content: "✖";
  color: red;
}
```

---

### :valid

Se utiliza para seleccionar y estilizar elementos de formulario que han sido validados con éxito. Esta pseudoclase es comúnmente utilizada para aplicar estilos a campos de formulario después de que el usuario ha ingresado datos válidos.

```html
<!-- HTML -->
<form>
  <label for="email">Correo electrónico:</label>
  <input type="email" id="email" name="email" required />

  <label for="password">Contraseña:</label>
  <input type="password" id="password" name="password" required minlength="8" />

  <button type="submit">Enviar</button>
</form>
```

```css
/* CSS */
/* Estilo para campos de formulario que son válidos */
:valid {
  border: 2px solid #2ecc71;
  background-color: #d4f1d9;
}
```

---

## Pseudoclases de estado

### :any-link

Se utiliza para seleccionar cualquier enlace `<a>` que sea un hiperenlace, independientemente de su estado (ya sea visitado o no). Esta pseudoclase es útil cuando deseas aplicar estilos a todos los enlaces en tu documento, incluyendo aquellos que no han sido visitados.

> [!NOTE]
>
> Un elemento que contiene el atributo `href` es un hipervínculo.
> :any-link es como el selector de atributo[href]

**Aplicar estilo a los enlaces con hipervínculo**

```html
<!-- HTML -->
<ul>
  <li><a href="#">Enlace de prueba</a></li>
  <li><a>Enlace de prueba</a></li>
  <li><a href="#">Enlace de prueba</a></li>
</ul>
```

```css
/* CSS */
a:any-link {
  text-decoration: none;
  color: purple;
  font-size: 20px;
}
```

---

### :blank

La pseudoclase :blank se basa en la pseudoclase :empty. Al igual que :empty, :blank seleccionará elementos que no contengan nada en absoluto o que solo contengan un comentario HTML. Pero :blank también seleccionará elementos que incluyan espacios en blanco, lo cual :empty no lo hará.

```html
<!-- HTML -->
<p>Párrafo con contenido</p>
<p><!-- Párrafo con comentario --></p>
<p></p>
```

```css
/* CSS */
p {
  min-height: 30px;
  width: 250px;
  background-color: teal;
  color: white;
}

p:blank {
  background-color: yellowgreen;
}
```

> [!WARNING]
>
> :blank apenas tiene soporte en los navegadores actuales.

---

### :default

Se utiliza para seleccionar y estilizar el elemento por defecto de un conjunto de opciones, como en el caso de un elemento `<option>` dentro de un menú desplegable `<select>`. El selector :default se aplica al elemento que se seleccionaría por defecto cuando el formulario se carga inicialmente.

**Modificar el fondo del valor por defecto(selected)**

```html
<!-- HTML -->
<select>
  <option value="opc1">Opción 1</option>
  <option value="opc2" selected>Opción por defecto</option>
  <option value="opc3">Opción 3</option>
</select>
```

```css
/* CSS */
option:default {
  background-color: salmon;
}
```
