<h1 align='center'>Dirección de texto</h1>

<h2>📑 Contenido</h2>

- [Dirección de texto](#dirección-de-texto)
- [Atributo dir](#atributo-dir)
  - [Texto de izquierda a derecha (ltr)](#texto-de-izquierda-a-derecha-ltr)
  - [Texto de derecha a izquierda (rtl)](#texto-de-derecha-a-izquierda-rtl)
  - [Dirección automática (auto)](#dirección-automática-auto)
  - [Consideraciones para usar dir](#consideraciones-para-usar-dir)
- [Bidireccional](#bidireccional)
  - [Bidirectional isolate](#bidirectional-isolate)
  - [Bidirectional override](#bidirectional-override)

## Dirección de texto

En HTML, la dirección del texto (o orientación del texto) es un aspecto importante cuando trabajamos con idiomas que se leen de derecha a izquierda, como el árabe o el hebreo, o cuando necesitas forzar que ciertas secciones de texto sigan una dirección específica. La dirección predeterminada del texto en la mayoría de las páginas es de izquierda a derecha (LTR), que es adecuada para lenguas como el español o el inglés, pero HTML proporciona formas de cambiar esta dirección.

## Atributo dir

El atributo dir de HTML se utiliza para especificar la dirección de texto en un elemento. Los valores comunes de este atributo son:

- **ltr (left-to-right):** Texto de izquierda a derecha (dirección predeterminada).
- **rtl (right-to-left):** Texto de derecha a izquierda.
- **auto:** Permite que el navegador determine automáticamente la dirección del texto en función de su contenido.

### Texto de izquierda a derecha (ltr)

Este es el valor predeterminado y no es necesario especificarlo explícitamente, pero puede usarse si quieres asegurarte de que un bloque de texto tenga esta dirección.

```html
<p dir="ltr">Este es un texto en español, que se lee de izquierda a derecha.</p>
```

### Texto de derecha a izquierda (rtl)

Este valor se utiliza para idiomas como el árabe o hebreo, que se leen de derecha a izquierda.

```html
<p dir="rtl">هذا نص باللغة العربية، ويُقرأ من اليمين إلى اليسار.</p>
```

### Dirección automática (auto)

El valor auto permite que el navegador determine la dirección del texto en función de su contenido. Esto es útil si se mezcla contenido en diferentes idiomas y no quieres especificar la dirección manualmente.

```html
<p dir="auto">This is an English sentence. وهذا نص عربي.</p>
```

### Consideraciones para usar dir

- **Coherencia en la dirección del texto:** En las páginas que contienen múltiples idiomas o contenido mixto, es importante asegurar que la dirección del texto sea correcta para mantener la coherencia y legibilidad.

- **Estilos CSS asociados con dir:** Algunos estilos CSS, como text-align o el margen (margin), pueden verse afectados por la dirección del texto. Es importante tener en cuenta la dirección cuando diseñas el estilo de tu página.

- **Elementos embebidos con diferente dirección:** Si tienes elementos pequeños dentro de un bloque de texto que tienen diferente dirección, asegúrate de aplicarle dir a esos elementos específicamente.

## Bidireccional

Las etiquetas `<bdi>` y `<bdo>` se utilizan para manejar la dirección del texto dentro de un documento web. Estas etiquetas son especialmente útiles cuando se trabaja con idiomas que se escriben de derecha a izquierda (como árabe o hebreo) o cuando se necesita controlar la dirección del texto en un fragmento específico de una página web.

### Bidirectional isolate

La etiqueta `<bdi>` se utiliza para aislar una sección de texto dentro de un párrafo o un bloque de texto. Esto permite que el texto contenido en `<bdi>` se represente de acuerdo con su propia dirección, independientemente de la dirección del texto circundante.

```html
<!-- HTML -->
<p>Texto de relleno <bdi>نص باللغة العربية</bdi> más texto de relleno.</p>
```

### Bidirectional override

La etiqueta `<bdo>` se utiliza para forzar la dirección del texto en una dirección específica, anulando la dirección del texto circundante. Puedes usar `<bdo>` para cambiar la dirección de un fragmento de texto dentro de un párrafo o bloque.

```html
<!-- HTML -->
<!-- El atributo dir se usa para forzar la dirección del texto de derecha
a izquierda. -->
<p>
  Texto de relleno <bdo dir="rtl">Texto de derecha-izquierda</bdo> más texto de
  relleno.
</p>
```
