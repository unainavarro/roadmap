<h1 align="center">Reglas de arroba</h1>

<h2>📑 Contenido</h2>

- [Reglas de arroba](#reglas-de-arroba)
- [Reglas generales](#reglas-generales)
- [Reglas de anidamiento](#reglas-de-anidamiento)
- [Codificación y fuentes](#codificación-y-fuentes)
  - [@charset](#charset)
  - [@color-profile](#color-profile)
  - [@font-face](#font-face)
  - [@font-feature-values](#font-feature-values)
- [Importación y namespace](#importación-y-namespace)
  - [@import](#import)
  - [@namespace](#namespace)
- [Estructura y estilo](#estructura-y-estilo)
  - [@container](#container)
  - [@counter-style](#counter-style)
  - [@keyframes](#keyframes)
  - [@page](#page)
- [Medios y condiciones](#medios-y-condiciones)
  - [@media](#media)
  - [@supports](#supports)
  - [@scope](#scope)

## Reglas de arroba

Las reglas de arroba, comúnmente conocidas como "at-rules" en inglés, son instrucciones que se utilizan en hojas de estilo en cascada (CSS) para especificar reglas que afectan al proceso de estilo en sí mismo o introducen declaraciones especiales. Estas reglas comienzan con el símbolo de arroba (@). Cada una de estas reglas tiene un propósito específico y se utiliza para diferentes situaciones dentro de un archivo CSS.

## Reglas generales

Estas reglas deben colocarse encima de la hoja de estilo, antes de todos los demás atributos y propiedades de CSS porque definen la configuración general de las reglas de CSS y no serán sobrescritas por otras reglas.
Algunas reglas generales son `@charset, @import, @namespace`.

## Reglas de anidamiento

Hay un subconjunto de reglas CSS que almacenan un subconjunto de declaraciones dentro de ellas.
Algunas reglas de anidamiento son `@document, @font-face, @keyframes`

## Codificación y fuentes

### @charset

La regla `@charset` se utiliza para especificar el conjunto de caracteres (charset) del documento CSS. Esta regla debe aparecer al principio del archivo CSS y antes de cualquier otra regla o declaración. Su propósito es indicar al navegador o agente de usuario cuál es el conjunto de caracteres que se está utilizando en el archivo CSS.

**Ejemplo:**

```css
/* CSS */

/* Regla @charset */
@charset "UTF-8";

/* Resto de las reglas CSS van después de @charset */
body {
  font-family: Arial, sans-serif;
  color: #333;
  background-color: #fff;
}
```

> [!IMPORTANT]
>
> Tener en cuenta que si el archivo CSS no contiene la regla @charset, se asumirá que el conjunto de caracteres es el mismo que el del documento HTML que hace referencia al archivo CSS. Si ya has especificado el conjunto de caracteres (charset) en la etiqueta `<meta>` del documento HTML, no es necesario repetirlo en el archivo CSS utilizando la regla @charset

### @color-profile

La regla `@color-profile` se utiliza para definir y especificar perfiles de color ICC (International Color Consortium) asociados con imágenes o elementos gráficos en una página web. Estos perfiles de color permiten que los navegadores y otros agentes de usuario representen de manera más precisa los colores en las imágenes, asegurando la consistencia en la reproducción del color en diferentes dispositivos y configuraciones.

Dentro del bloque de la regla `@color-profile`, puedes incluir varias propiedades que describan el perfil de color. Algunas de las propiedades comunes son src (fuente) y rendering-intent (intención de representación).

**Ejemplo**

```css
/* CSS */

/* Definir un perfil de color llamado "sRGB" con una intención de representación perceptual y especificando las fuentes (archivos ICC) desde las cuales se debe obtener el perfil de color. */

@color-profile sRGB {
  rendering-intent: perceptual;
  src: local("sRGB Color Space Profile.icm"), local("sRGB IEC61966-2.1");
}
```

> [!IMPORTANT]
>
> La regla @color-profile se utiliza principalmente en el contexto de imágenes y gráficos que utilizan perfiles de color ICC para asegurar una representación coherente de los colores en diferentes dispositivos.
>
> **No es algo que se use comúnmente en todos los proyectos de CSS.**

### @font-face

La regla `@font-face `en CSS se utiliza para especificar fuentes personalizadas para su uso en la presentación de un documento web. Permite a los desarrolladores web incorporar fuentes específicas que no están disponibles de manera predeterminada en la mayoría de los sistemas, dando así un mayor control sobre el aspecto tipográfico de la página.

**Sintaxis**

```css
/* CSS */

@font-face {
  font-family: "NombreDeLaFuente";
  src: url("ruta/al/archivo-de-fuente.woff2") format("woff2"), url("ruta/al/archivo-de-fuente.woff")
      format("woff");
  /* 
font-family: Especifica el nombre de la fuente que se utilizará en el resto de las reglas de estilo.
src: Indica la ubicación de los archivos de la fuente. Puede incluir rutas a archivos locales o URLs remotas. Además, se especifica el formato de la fuente utilizando format(). Esto permite al navegador seleccionar la fuente adecuada según el formato que pueda manejar.
*/
}
```

**Ejemplo**

```css
/* CSS */

/* Crear la fuente personalizada */
@font-face {
  font-family: "MiFuentePersonalizada";
  src: url("ruta/a/mi-fuente.woff2") format("woff2"), url("ruta/a/mi-fuente.woff")
      format("woff");
  font-weight: normal;
  font-style: normal;
}

/* Utilizar la fuente personalizada */
body {
  font-family: "MiFuentePersonalizada", sans-serif;
}
```

> [!NOTE]
>
> La regla `@font-face` es especialmente útil para mejorar la consistencia tipográfica y el diseño visual de un sitio web al utilizar fuentes que pueden no estar presentes en todos los sistemas.

### @font-feature-values

La regla-at CSS @font-feature-values permite a los autores usar un nombre común de font-variant-alternates para características activadas de distintas formas en OpenType. Permite simplificar el código CSS cuando se usan distintas fuentes.

**Ejemplo**

```css
/* CSS */

@font-feature-values MiFuente {
  /* Definición de nombre y características alternativas */
  @styleset {
    roman: 1; /* Estilo normal */
    italic: 2; /* Estilo cursiva */
  }

  @character-variant {
    swash: swsh; /* Variante de glifo decorativa */
    small-caps: smcp; /* Letras versalitas */
  }
}

body {
  font-family: "MiFuente", sans-serif;
  font-variant-alternates: styleset(italic), character-variant(swash);
}

/* 
Se define un conjunto de estilos (@styleset) con nombres roman e italic asociados con valores numéricos específicos.

Se define una variante de carácter (@character-variant) con nombres swash y small-caps asociados con códigos específicos.

Luego, en el selector body, se utiliza font-variant-alternates para aplicar las características alternativas usando los nombres definidos previamente en @font-feature-values.
*/
```

## Importación y namespace

### @import

La regla `@import` se utiliza para importar estilos desde otro archivo CSS o una URL externa y combinarlos con el archivo CSS actual. Permite dividir el código CSS en varios archivos y facilita la organización y mantenimiento del código.

**Sintaxis**

```css
/* CSS */

@import url("ruta/al/otro-archivo.css");
```

**Ejemplos**

```css
/* CSS */

@import url("archivo1.css");
@import url("print.css") print;
/* 
Será importado únicamente cuando se esté imprimiendo la página. La condición print se utiliza para especificar que estos estilos deben aplicarse únicamente cuando el documento se está imprimiendo
*/
@import url("common-styles.css") screen;
/* 
Los estilos definidos en common-styles.css se aplicarán cuando la página se visualice en pantalla. La condición screen especifica que estos estilos deben aplicarse solo cuando se está visualizando en un dispositivo de pantalla, como un monitor o dispositivo móvil.
*/
@import url("landscape.css") screen and (orientation: landscape);
/* 
Esto indica que el archivo landscape.css será importado solo cuando se cumplan dos condiciones:

Medio (screen): Se aplica solo si el medio de presentación es una pantalla.

Orientación (orientation: landscape): Se aplica solo cuando la orientación de la pantalla es horizontal (paisaje).
*/
```

> [!WARNING]
>
> Tener en cuenta que las reglas @import son generales y deben estar al principio del archivo CSS, antes de cualquier otra regla, para garantizar que los estilos importados se apliquen correctamente.

### @namespace

La regla `@namespace` en CSS se utiliza para declarar un espacio de nombres (namespace). Se utiliza para asociar un espacio de nombres con un bloque de reglas de estilo CSS. Esto es especialmente útil cuando se trabaja con XML y XHTML, donde los elementos pueden estar definidos en diferentes espacios de nombres.

Esta regla es más comúnmente utilizada en el contexto de XML y XHTML, donde se pueden definir diferentes espacios de nombres para elementos específicos.

**Sintaxis**

```css
/* CSS */

@namespace prefix url(namespaceURI);

/* 
prefix: Es el identificador que se utiliza como prefijo para los elementos del espacio de nombres.

url(namespaceURI): Es la URL que especifica la ubicación del espacio de nombres.
*/
```

**Ejemplo**

```css
/* CSS */
@namespace svg url(http://www.w3.org/2000/svg);

svg|circle {
  fill: red;
}
```

> [!NOTE]
>
> En la práctica, en el desarrollo web estándar, no es necesario utilizar @namespace a menos que estés trabajando específicamente con XML o XHTML. La mayoría de los desarrolladores web que trabajan con HTML no necesitan preocuparse por esta regla.

## Estructura y estilo

### @container

La regla `@container` son el mismo concepto que las [Media Queries](../03-Layouts/01-Basicos/07-media_query.md), pero orientados a modificar los estilos dependiendo del tamaño de la página o dispositivo, lo hace dependiendo de un contenedor padre específico. Se puede cambiar el tamaño de ciertos elementos en función del contexto donde se encuentre

### @counter-style

Se utiliza para definir estilos personalizados para **contadores** de lista y numeración en documentos. Permite personalizar la apariencia y el formato de los números o caracteres utilizados en listas numeradas.

**Propiedades:**

- **system:**Especifica el sistema de numeración a utilizar. Algunos valores posibles son:
  - `decimal:` Sistema decimal (por defecto).
  - `cyclic:` Sistema cíclico.
  - `fixed:` Sistema fijo.
- **symbols:** Define los símbolos que se utilizarán para representar los números en el contador. Puedes usar cadenas de texto, caracteres Unicode, o incluso imágenes.
- **additive-symbols:** Especifica símbolos adicionales que se agregarán a los números cuando haya un desbordamiento en el contador.
- **suffix y prefix:** Agrega un sufijo o prefijo a cada número del contador.
- **range:** Define un rango específico de valores para el contador.

```html
<!-- HTML -->
<h1>Lista Numerada con Counter-Style Personalizado</h1>

<ol>
  <li>Elemento 1</li>
  <li>Elemento 2</li>
  <li>Elemento 3</li>
</ol>
```

```css
/* CSS */
@counter-style custom-counter {
  system: fixed;
  symbols: "🔴" "🔵" "🟢";
  suffix: " ";
}

ol {
  counter-reset: custom-counter;
  list-style: custom-counter;
}

li {
  margin-bottom: 10px;
}
```

### @keyframes

Se utiliza para definir animaciones. Con @keyframes, puedes especificar cómo cambian los estilos de un elemento durante una animación a lo largo del tiempo.

**Sintaxis básica:**

```css
/* CSS */
@keyframes nombreDeAnimacion {
  from {
    /* Estilos iniciales */
  }
  to {
    /* Estilos finales */
  }
}

/* O también puedes especificar puntos intermedios usando porcentaje */
@keyframes nombreDeAnimacion {
  0% {
    /* Estilos iniciales */
  }
  50% {
    /* Estilos a la mitad de la animación */
  }
  100% {
    /* Estilos finales */
  }
}

/* Aplicar la animación a un elemento */
.elemento {
  animation: nombreDeAnimacion 3s ease-in-out;
}
```

> [!NOTE]
>
> Ver más en el apartado para animaciones.

### @page

Se utiliza para definir los estilos de una página impresa cuando se realiza una impresión del contenido web. Permite controlar la apariencia de las páginas impresas, como el diseño, márgenes, encabezados, pies de página y otros aspectos específicos de la impresión.

```css
/* CSS */
@page {
  size: A4; /* Tamaño del papel, puede ser 'letter', 'A4', etc. */
  margin: 1cm; /* Márgenes de la página */
}

/* Estilos específicos para el encabezado de la página */
@page {
  margin-top: 20mm;
  margin-bottom: 10mm;
  @top-left {
    content: "Encabezado izquierdo";
  }
  @top-center {
    content: "Encabezado centrado";
  }
  @top-right {
    content: "Encabezado derecho";
  }
}

/* Estilos específicos para el pie de la página */
@page {
  margin-bottom: 20mm;
  @bottom-left {
    content: "Pie izquierdo";
  }
  @bottom-center {
    content: "Pie centrado";
  }
  @bottom-right {
    content: "Pie derecho";
  }
}
```

## Medios y condiciones

### @media

Se utiliza para aplicar estilos específicos según las características del dispositivo o la ventana gráfica del navegador. Permite crear diseños responsive adaptados a diferentes tamaños de pantalla, resoluciones o características del dispositivo.

```css
/* CSS */
@media tipo_de_medio and (condición) {
  /* Estilos a aplicar si la condición se cumple */
}
```

> [!NOTE]
>
> Mirar más en [Media Queries](../03-Layouts/01-Basicos/07-media_query.md)

### @supports

Se utiliza para verificar si el navegador es compatible con ciertas características o propiedades antes de aplicar un conjunto específico de estilos. Esto permite que los desarrolladores adapten los estilos según la capacidad del navegador.

**Condiciones:**

- `@supports (condición)` Aplica los estilos si se cumple la condición.
- `@supports not (condición)` Aplica los estilos si no se cumple la condición.
- `@supports (condición1) and (condición2)` Aplica los estilos si se cumplen las diferentes condiciones.
- `@supports (condición1) or (condición2)` Aplica los estilos si se cumple una de las dos condiciones.

```html
<!-- HTML -->
<nav>
  <ul>
    <li><a href="#">Inicio</a></li>
    <li><a href="#">Acerca de</a></li>
    <li><a href="#">Servicios</a></li>
    <li><a href="#">Contacto</a></li>
  </ul>
</nav>
```

```css
/* CSS */
ul {
  display: flex;
  gap: 20px;
  list-style: none;
}

@supports not (display: flex) {
  li {
    list-style: none;
    float: left;
    padding: 20px;
  }
}
```

### @scope

Permite seleccionar elementos en subárboles DOM específicos, apuntando a elementos con precisión sin escribir selectores demasiado específicos que sean difíciles de anular y sin acoplar demasiado sus selectores a la estructura DOM.

Aplica estilo a un scope concreto.

**Sintaxis básica**

```html
<!-- HTML -->
<div class="ambito">
  <h2 class="encabezados">Encabezado en el ambito.</h2>
</div>
<h2 class="encabezados">Encabezado fuera del ambito.</h2>
```

```css
/* CSS */
@scope (.ambito) {
  .encabezados {
    background: teal;
    color: greenyellow;
    padding: 15px;
  }
}
```

**Podemos marcar un principio y un final de ámbito en nuestro DOM**

```css
/* CSS */
@scope (límite inicial) to (límite final) {
  /* Estilos CSS */
}
```
