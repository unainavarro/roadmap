<h1 align='center'>Acrónimos y entidades</h1>

<h2>📑 Contenido</h2>

- [Acrónimos y entidades](#acrónimos-y-entidades)
- [Acrónimos](#acrónimos)
- [Entidades](#entidades)

## Acrónimos y entidades

Los acrónimos y las entidades son elementos clave en el marcado de contenido web, ya que permiten representar de manera clara y semántica abreviaturas, siglas y caracteres especiales que no pueden ser incluidos directamente en el HTML. En esta sección, aprenderás a utilizar las etiquetas adecuadas para estos propósitos.

## Acrónimos

La etiqueta `<abbr>` se utiliza para definir una abreviatura o acrónimo. Esta etiqueta ayuda a los motores de búsqueda y a los navegadores a identificar el significado completo de una abreviatura o acrónimo y proporciona información adicional a los usuarios cuando pasan el cursor sobre la abreviatura. La etiqueta `<abbr>` se coloca generalmente alrededor del texto abreviado y se utiliza en combinación con el atributo `title` para proporcionar la expansión o descripción completa de la abreviatura.

```html
<!-- HTML -->
<p>
  <abbr title="Hypertext Markup Language">HTML</abbr> es un lenguaje de marcado
  utilizado para crear contenido en la web.
</p>
```

> [!TIP]
>
> Si lo que quieres es marcar el término que se quiere definir se puede utilizar
> la etiqueta `<dfn>` <br>
>
> Ejemplo: <br>
> El `<dfn>`HTML`</dfn>` es un lenguaje de marcado para hipertextos.

## Entidades

Las entidades(Entities) son secuencias de caracteres especiales que se utilizan en documentos HTML para representar caracteres que tienen significados especiales o que no se pueden mostrar directamente en el código fuente de HTML debido a su uso como marcas de código o símbolos reservados. Las entidades HTML permiten mostrar estos caracteres de manera correcta y segura en una página web. Cada entidad HTML está compuesta por un símbolo &, seguido de un nombre o número de referencia, y finalizada con un punto y coma ;.

**Ejemplos de entidades comunes:**

- `&lt;`: Representa el signo menor que <.
- `&gt;`: Representa el signo mayor que >.
- `&amp;`: Representa el símbolo de ampersand &.
- `&quot;`: Representa las comillas dobles " en texto.
- `&apos;`: Representa una comilla simple ' en texto.
- `&nbsp;`: Representa un espacio en blanco no rompible (non-breaking space), que evita que el navegador coloque un salto de línea o espacio en blanco adicional.
- `&copy;`: Representa el símbolo de derechos de autor ©.
- `&reg;`: Representa el símbolo de marca registrada ®.

```HTML
<!-- Ejemplo -->
<p>Este es un ejemplo de uso de &lt;strong&gt;etiquetas HTML&lt;/strong&gt;.</p>
<p>&copy; 2023 Mi Empresa, Inc.</p>
<p>&euro; 100.00</p>
```
