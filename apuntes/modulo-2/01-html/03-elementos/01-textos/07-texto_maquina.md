<h1 align='center'>Texto maquina</h1>

<h2>📑 Contenido</h2>

- [Texto maquina](#texto-maquina)
- [Bloques de texto preformateado](#bloques-de-texto-preformateado)
- [Bloques de código](#bloques-de-código)
- [Entrada del teclado](#entrada-del-teclado)
- [Salida de programas](#salida-de-programas)
- [Comentarios](#comentarios)

## Texto maquina

HTML ofrece una variedad de etiquetas semánticas para representar fragmentos de código, entradas de teclado y otros tipos de texto relacionados con interacciones o visualización de datos técnicos. Estas etiquetas ayudan a estructurar el contenido de manera clara y accesible, mejorando tanto la presentación como la semántica de la información técnica.

## Bloques de texto preformateado

La etiqueta `<pre>` se utiliza para mantener el formato predefinido de un bloque de texto, lo que significa que los espacios en blanco, saltos de línea y tabulaciones son preservados. Es útil para mostrar código con formato específico o estructuras que dependen de espacios.

```html
<pre>
function saludo() {
    console.log("Hola Mundo");
}
</pre>
```

## Bloques de código

La etiqueta `<code>` en HTML se utiliza para marcar fragmentos de código fuente, ya sea código HTML, CSS, JavaScript u otros lenguajes de programación. El contenido dentro de la etiqueta `<code>` se muestra en un tipo de fuente de ancho fijo (como una fuente de monoespaciado), lo que ayuda a distinguirlo del texto normal y facilita su identificación como código.

```html
<p>Aquí tienes un ejemplo de código en HTML:</p>
<code>
  &lt;!DOCTYPE html&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;Mi
  Página&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;h1&gt;Hola,
  mundo&lt;/h1&gt; &lt;/body&gt; &lt;/html&gt;
</code>
```

## Entrada del teclado

La etiqueta `<kbd>` en HTML se utiliza para marcar texto que representa la entrada del teclado, como teclas individuales o combinaciones de teclas, en un documento web. Esta etiqueta es especialmente útil para mostrar comandos de teclado, atajos de teclado y cualquier tipo de entrada del usuario que involucre el teclado.

```html
<p>Para guardar el documento, presione <kbd>Ctrl + S</kbd>.</p>
```

## Salida de programas

El elemento HTML Sample (`<samp>`) se utiliza para incluir texto en línea que representa una muestra (o cita) de la salida de un programa de ordenador.

```html
<p>La salida del programa es: <samp>Resultado = 42</samp></p>
```

## Comentarios

Los comentarios se usan para añadir información de lo que hace el código. Los comentarios solo son visibles para aquellos que dispongan del código fuente.

Comentario:

`<!-- Esto es un comentario en HTML -->`

> [!TIP]
>
> Atajo de teclado para VisualStudioCode ==> **Ctrl+k+c**
