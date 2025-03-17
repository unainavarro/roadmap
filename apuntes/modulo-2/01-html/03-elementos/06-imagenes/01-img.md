<h1 align='center'>Imágenes</h1>

<h2>📑 Contenido</h2>

- [Imágenes](#imágenes)
- [Atributo alt y accesibilidad](#atributo-alt-y-accesibilidad)
- [Atributos width y height](#atributos-width-y-height)
  - [¿Por qué ocurre el "salto de contenido"?](#por-qué-ocurre-el-salto-de-contenido)
  - [Uso de width y height para evitar el salto de contenido](#uso-de-width-y-height-para-evitar-el-salto-de-contenido)

## Imágenes

En HTML, las imágenes se insertan utilizando la etiqueta `<img>`. Esta etiqueta no tiene una etiqueta de cierre, ya que es un elemento vacío. Se utiliza principalmente para incluir imágenes en una página web.

La etiqueta `<img>` tiene varios atributos importantes que controlan cómo se carga y se muestra la imagen:

src: Especifica la ubicación (URL) de la imagen.
alt: Proporciona un texto alternativo que describe la imagen. Es importante para la accesibilidad y SEO.
width y height: Definen las dimensiones de la imagen en píxeles. No son obligatorios, pero puedes usarlos para controlar el tamaño de la imagen.
title: Proporciona información adicional cuando el usuario pasa el mouse sobre la imagen.

```html
<img src="imagen.jpg" alt="Descripción de la imagen" width="500" height="300" />
```

- **src="imagen.jpg":** La imagen se encuentra en la misma carpeta que el archivo HTML.
- **alt="Descripción de la imagen":** En caso de que la imagen no se cargue, se mostrará el texto alternativo "Descripción de la imagen".
- **width="500" height="300":** La imagen se mostrará con un tamaño de 500 píxeles de ancho y 300 píxeles de alto.

## Atributo alt y accesibilidad

El atributo alt es muy importante desde el punto de vista de la accesibilidad y SEO. Permite que los usuarios que no pueden ver la imagen (por ejemplo, personas con discapacidades visuales que usan lectores de pantalla) comprendan el contenido de la imagen.

## Atributos width y height

Cuando utilizas las imágenes en HTML y especificas los atributos width y height, estás definiendo el tamaño de la imagen. Esto puede evitar un efecto de salto de contenido (a veces llamado "layout shift") cuando la imagen se carga. Este efecto ocurre cuando la imagen tarda en cargarse y, mientras tanto, el espacio destinado a ella no está definido, lo que hace que otros elementos en la página se muevan para ocupar el espacio de la imagen una vez que se ha cargado

### ¿Por qué ocurre el "salto de contenido"?

Si una imagen se carga en una página sin tener un tamaño definido (ya sea mediante los atributos width y height o a través de CSS), el navegador no sabe cuánto espacio reservar para la imagen antes de que se cargue. Esto puede hacer que el contenido circundante se desplace hacia abajo o hacia los lados para ajustarse al tamaño real de la imagen una vez que se ha cargado.

### Uso de width y height para evitar el salto de contenido

Al definir los atributos `width` y `height` de la imagen, estás indicando al navegador el tamaño exacto de la imagen, incluso antes de que se haya descargado. Esto permite que el espacio para la imagen se reserve en el diseño de la página, evitando que otros elementos se deslicen cuando la imagen se haya cargado.
