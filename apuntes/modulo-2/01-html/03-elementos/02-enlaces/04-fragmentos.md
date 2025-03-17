<h1 align='center'>Fragmentos de texto</h1>

<h2>📑 Contenido</h2>

- [Fragmentos de texto](#fragmentos-de-texto)
- [¿Cómo funciona?](#cómo-funciona)
- [¿Cómo funciona internamente?](#cómo-funciona-internamente)
- [Limitaciones y compatibilidad](#limitaciones-y-compatibilidad)
- [¿Para qué se utiliza?](#para-qué-se-utiliza)
- [Dar estilo a los fragmentos de texto](#dar-estilo-a-los-fragmentos-de-texto)

## Fragmentos de texto

El fragmento de URL `#_~:text=` es una forma de manejar fragmentos de texto específicos en una página web, y está relacionado con la funcionalidad de "text fragments" en HTML. Este es un mecanismo experimental que permite a los navegadores resaltar o localizar partes específicas del contenido dentro de una página, directamente desde la URL.

## ¿Cómo funciona?

El fragmento de URL después de `#_~:text=` hace referencia a un texto que se quiere resaltar o localizar. El navegador interpreta este fragmento y localiza el texto especificado dentro de la página, resaltándolo para el usuario. Esta funcionalidad está disponible en algunos navegadores modernos, como Google Chrome.

```html
<h1>Bienvenido a mi página</h1>
<p>
  Este es un párrafo con información interesante. Puedes buscar palabras o
  frases específicas.
</p>
<p>Este es otro párrafo que contiene más texto para resaltar.</p>
```

```bash
http://tusitio.com#_~:text=información%20interesante
```

## ¿Cómo funciona internamente?

La parte `#\~:text=` de la URL es un identificador de fragmento especial.

Lo que sigue después del signo de igual (=) es el texto que se desea localizar, codificado de acuerdo con las reglas de URL (por ejemplo, el espacio se convierte en %20).

Al acceder a esa URL, el navegador buscará el texto correspondiente dentro de la página y lo resaltará si lo encuentra.

## Limitaciones y compatibilidad

**Compatibilidad:** No todos los navegadores soportan esta funcionalidad de manera uniforme. Actualmente, es una característica de algunos navegadores basados en Chromium (como Google Chrome).

**Exactitud:** El texto debe coincidir exactamente con lo que aparece en la página, y no todos los navegadores pueden manejar caracteres especiales o codificados de la misma forma.

## ¿Para qué se utiliza?

**Accesibilidad:** Permite a los usuarios saltar directamente a la sección de una página web que contiene un fragmento específico de texto.

**Enlaces profundos:** Puedes crear enlaces directos a contenido específico dentro de una página, lo que mejora la navegación, especialmente en páginas con mucho texto o contenido largo.

## Dar estilo a los fragmentos de texto

El pseudo-elemento CSS ::target-text representa el texto al que se ha desplazado si tu navegador admite fragmentos de texto. Permite a los developers decidir cómo resaltar esa sección de texto.

```css
::target-text {
  background-color: gold;
}
```
