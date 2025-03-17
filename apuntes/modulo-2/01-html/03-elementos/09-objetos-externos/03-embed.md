<h1 align='center'>Embed</h1>

<h2>📑 Contenido</h2>

- [Embed](#embed)
- [Embed vs video](#embed-vs-video)

## Embed

La etiqueta `<embed>` se utiliza para incrustar contenido multimedia, como audio o video, en una página web. A través de esta etiqueta, puedes proporcionar una forma sencilla de incrustar contenido multimedia sin necesidad de plugins adicionales.

```html
<!-- HTML -->

<h2>Video incrustado</h2>
<embed src="video.mp4" type="video/mp4" width="400" height="300" />
```

## Embed vs video

El uso de `<video>` o `<embed>` depende del propósito y del tipo de contenido que deseas incluir en tu página. Cada uno tiene casos de uso específicos, por lo que uno no reemplaza necesariamente al otro, pero `<video>` suele ser preferido cuando trabajas específicamente con archivos de video.

Cuándo usar `<video>`:

- Específicamente diseñado para reproducir archivos de video.

- Ofrece más control y personalización, como:

  - Controles nativos (reproducir, pausar, volumen, etc.).

  - Compatibilidad con subtítulos a través de `<track>`.

  - pciones de configuración como `autoplay`, `loop` y `muted`.

Cuándo usar `<embed>`:

- Se utiliza para incrustar contenido externo, como archivos de documentos, contenido flash (obsoleto) o contenido multimedia de otras fuentes.

- Es más genérico y menos especializado que `<video>`.

- Puede incrustar otros tipos de contenido además de videos, como aplicaciones PDF o páginas web.
