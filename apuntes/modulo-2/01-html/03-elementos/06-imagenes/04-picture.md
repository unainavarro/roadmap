<h1 align='center'>Picture</h1>

<h2>📑 Contenido</h2>

- [Picture](#picture)
- [Diferentes imágenes para distintos tamaños de pantalla](#diferentes-imágenes-para-distintos-tamaños-de-pantalla)
- [Uso de srcset para imágenes con diferentes resoluciones](#uso-de-srcset-para-imágenes-con-diferentes-resoluciones)
- [¿Por qué usar picture?](#por-qué-usar-picture)

## Picture

La etiqueta `<picture>` es un contenedor en HTML que se utiliza para ofrecer múltiples fuentes de imágenes y permitir que el navegador elija cuál es la más adecuada según el tamaño de la pantalla, la resolución o el tipo de dispositivo del usuario. Es particularmente útil cuando se requiere cargar diferentes versiones de una imagen, por ejemplo, imágenes de mayor resolución en pantallas con una densidad de píxeles mayor (como pantallas Retina) o imágenes adaptadas a diferentes tamaños de pantalla (como en el diseño responsivo).

```html
<picture>
  <source srcset="imagen-800w.jpg" media="(max-width: 800px)" />
  <source srcset="imagen-1200w.jpg" media="(min-width: 801px)" />
  <img src="imagen-default.jpg" alt="Descripción de la imagen" />
</picture>
```

- **`<picture>`:** Es el contenedor principal que agrupa las diferentes fuentes de imagen.
- **`<source>`:** Cada etiqueta `<source>` define una fuente de imagen específica que se carga según el valor del atributo media, que utiliza una consulta de medios (media query) para determinar en qué condiciones debe aplicarse esa fuente.
- **srcset:** Especifica el archivo de la imagen que se va a mostrar.
- **media:** Especifica una consulta de medios (media query) que determina en qué condiciones se usará esa imagen. Por ejemplo, puede basarse en el ancho de la pantalla o en la densidad de píxeles.
- **`<img>`:** Esta es la etiqueta de respaldo, es decir, si el navegador no es compatible con la etiqueta `<picture>`, o si no se cumplen las condiciones de las etiquetas `<source>`, se utilizará la imagen definida en esta etiqueta.

## Diferentes imágenes para distintos tamaños de pantalla

Imagina que quieres cargar imágenes diferentes según el tamaño de la pantalla. El siguiente ejemplo muestra cómo utilizar `<picture>` para hacer que se carguen diferentes versiones de una imagen dependiendo del ancho de la pantalla del usuario

```html
<picture>
  <!-- Imagen para pantallas pequeñas (ancho máximo de 600px) -->
  <source srcset="imagen-small.jpg" media="(max-width: 600px)" />

  <!-- Imagen para pantallas medianas (ancho mínimo de 601px y máximo de 1200px) -->
  <source
    srcset="imagen-medium.jpg"
    media="(min-width: 601px) and (max-width: 1200px)"
  />

  <!-- Imagen para pantallas grandes (ancho mínimo de 1201px) -->
  <source srcset="imagen-large.jpg" media="(min-width: 1201px)" />

  <!-- Imagen por defecto si el navegador no soporta la etiqueta <picture> -->
  <img src="imagen-default.jpg" alt="Imagen responsiva" />
</picture>
```

## Uso de srcset para imágenes con diferentes resoluciones

Además de adaptar el tamaño de la imagen a diferentes anchos de pantalla, puedes usar el atributo `srcset` para ofrecer imágenes con diferentes resoluciones. Esto es útil para dispositivos con pantallas de alta densidad de píxeles (como los dispositivos Retina de Apple).

```html
<picture>
  <!-- Imagen para pantallas de baja resolución -->
  <source
    srcset="imagen-800w.jpg 800w, imagen-1600w.jpg 1600w"
    media="(max-width: 600px)"
  />

  <!-- Imagen para pantallas de alta resolución -->
  <source
    srcset="imagen-1600w.jpg 1600w, imagen-3200w.jpg 3200w"
    media="(min-width: 601px)"
  />

  <img src="imagen-default.jpg" alt="Imagen responsiva" />
</picture>
```

## ¿Por qué usar picture?

**Optimización para móviles y dispositivos con pantallas de alta resolución:** Al usar `<picture>`, puedes proporcionar diferentes versiones de una imagen dependiendo del tamaño de la pantalla o la densidad de píxeles del dispositivo. Esto mejora tanto la experiencia del usuario como el rendimiento de la página.

**Carga más eficiente:** Usar varias versiones de una imagen (con diferentes tamaños y resoluciones) asegura que los usuarios solo descarguen lo que necesitan, lo que mejora el tiempo de carga de la página, especialmente en dispositivos móviles con conexiones más lentas.

**Control total sobre el contenido visual:** La etiqueta `<picture>` proporciona un control preciso sobre qué imagen mostrar, dependiendo de las condiciones específicas del dispositivo del usuario, como el tamaño de la pantalla, la resolución y la orientación.

> [!NOTE]
>
> - Usa `<figure>` cuando necesitas agrupar una imagen con una descripción semántica.
> - Usa `<picture>` cuando quieres optimizar la carga de imágenes adaptables.
> - Es perfectamente válido incluir un `<picture>` dentro de un `<figure>`.
