<h1 align='center'>Track</h1>

<h2>📑 Contenido</h2>

- [Track](#track)
- [Atributos principales](#atributos-principales)
  - [src](#src)
  - [kind](#kind)
  - [srclang](#srclang)
  - [label](#label)
  - [default](#default)
- [Tipos de pistas en track](#tipos-de-pistas-en-track)

## Track

La etiqueta `<track>` en HTML se utiliza para especificar pistas de texto que se pueden agregar a los elementos `<video>` y `<audio>`, como subtítulos, descripciones de audio, o capítulos. La etiqueta `<track>` es particularmente útil para mejorar la accesibilidad de los contenidos multimedia, ya que permite proporcionar información adicional en forma de texto para usuarios con discapacidades auditivas o visuales.

```html
<video controls>
  <source src="video.mp4" type="video/mp4" />
  <track
    src="subtitulos_es.vtt"
    kind="subtitles"
    srclang="es"
    label="Español"
  />
  Tu navegador no soporta la etiqueta de video.
</video>
```

## Atributos principales

### src

Especifica la URL del archivo que contiene la pista de texto. Este archivo generalmente se encuentra en formato WebVTT (.vtt), que es un estándar para subtítulos y pistas de texto.

```html
<track src="subtitulos_es.vtt" kind="subtitles" srclang="es" label="Español" />
```

### kind

Define el tipo de pista. Los valores más comunes son:

- subtitles: Usado para subtítulos que se muestran en el video.
- captions: Similar a los subtítulos, pero con la diferencia de que incluyen descripciones de los sonidos importantes en el contenido (por ejemplo, "sonido de teléfono").
- descriptions: Descripciones de audio para personas con discapacidades visuales. Proporciona una descripción de lo que ocurre en pantalla.
- chapters: Marca de capítulos dentro del video, útil para navegación por escenas.

```html
<track src="subtitulos_es.vtt" kind="subtitles" srclang="es" label="Español" />
```

### srclang

Especifica el idioma de la pista de texto. El valor debe ser un código de idioma en formato de dos letras, como es para español, en para inglés, fr para francés, etc.

```html
<track src="subtitulos_es.vtt" kind="subtitles" srclang="es" label="Español" />
```

### label

Proporciona una etiqueta que describe la pista de texto. Esta etiqueta es útil para que los usuarios elijan qué pista mostrar si hay varias disponibles.

```html
<track src="subtitulos_es.vtt" kind="subtitles" srclang="es" label="Español" />
```

### default

Si se incluye este atributo, la pista de texto se activará por defecto cuando el video se cargue. Esto es útil si quieres que los subtítulos o las descripciones se muestren de forma predeterminada.

```html
<track
  src="subtitulos_es.vtt"
  kind="subtitles"
  srclang="es"
  label="Español"
  default
/>
```

## Tipos de pistas en track

**Subtítulos (subtitles):** Son los textos que se muestran en el video para traducir el diálogo o contenido verbal. Los subtítulos generalmente no incluyen información sobre los sonidos de fondo.

**Leyendas (captions):** Similar a los subtítulos, pero incluyen información adicional sobre sonidos importantes (por ejemplo, "timbre de puerta", "risa en el fondo"). Son más adecuados para personas con discapacidades auditivas.

**Descripciones de Audio (descriptions):** Estas pistas proporcionan descripciones detalladas de lo que está sucediendo en la pantalla para personas con discapacidades visuales. Por ejemplo, "una persona entra en la habitación y se sienta en la mesa".

**Capítulos (chapters):** Sirven para marcar capítulos o secciones dentro de un video, lo que permite a los usuarios saltar a una parte específica del contenido.
