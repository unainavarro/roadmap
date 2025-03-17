<h1 align='center'>Audio</h1>

<h2>📑 Contenido</h2>

- [Audio](#audio)
- [Atributos principales](#atributos-principales)
  - [controls](#controls)
  - [autoplay](#autoplay)
  - [loop](#loop)
  - [muted](#muted)
  - [preload](#preload)
- [Formatos de audio compatibles](#formatos-de-audio-compatibles)

## Audio

La etiqueta `<audio>` en HTML se utiliza para incrustar contenido de audio (como música, efectos de sonido, podcasts, entre otros) en una página web. Es una forma sencilla y moderna de agregar archivos de audio sin necesidad de complementos o tecnologías externas.

```html
<audio controls>
  <source src="audio.mp3" type="audio/mp3" />
  Tu navegador no soporta la etiqueta de audio.
</audio>
```

## Atributos principales

### controls

Este atributo agrega controles de reproducción (play, pause, volumen, barra de progreso) al reproductor de audio. Es muy común y recomendable usarlo para que los usuarios puedan interactuar con el archivo de audio.

```html
<audio controls>
  <source src="audio.mp3" type="audio/mp3" />
</audio>
```

### autoplay

Hace que el audio comience a reproducirse automáticamente cuando se carga la página. Sin embargo, algunos navegadores pueden bloquear esta función para evitar una reproducción no deseada.

```html
<audio autoplay>
  <source src="audio.mp3" type="audio/mp3" />
</audio>
```

### loop

Hace que el audio se repita de forma continua (en bucle) una vez que termine. Es útil para música de fondo o efectos de sonido.

```html
<audio loop>
  <source src="audio.mp3" type="audio/mp3" />
</audio>
```

### muted

Silencia el audio por defecto cuando se carga la página. Esto puede ser útil si deseas tener un control total sobre el sonido mediante JavaScript.

```html
<audio muted>
  <source src="audio.mp3" type="audio/mp3" />
</audio>
```

### preload

Controla si el navegador debe cargar el audio de inmediato o esperar hasta que se inicie la reproducción. Los valores posibles son:

- **auto:** El navegador carga el archivo de audio tan pronto como sea posible.
- **metadata:** Solo se cargan los metadatos del archivo de audio (como la duración).
- **none:** El navegador no carga el archivo de audio hasta que el usuario inicie la reproducción.

```html
<audio preload="auto">
  <source src="audio.mp3" type="audio/mp3" />
</audio>
```

## Formatos de audio compatibles

Los navegadores modernos son compatibles con varios formatos de audio. Los más comunes son:

- **MP3 (audio/mp3):** Es uno de los formatos más populares y ampliamente soportados.
- **Ogg (audio/ogg):** Formato abierto y libre de derechos.
- **WAV (audio/wav):** Un formato de alta calidad, pero puede generar archivos más grandes.
- **AAC (audio/aac):** Usado principalmente en dispositivos Apple y también en otros dispositivos móviles.
