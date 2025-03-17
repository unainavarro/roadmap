<h1 align='center'>Enlaces interactivos</h1>

<h2>📑 Contenido</h2>

- [Imágenes](#imágenes)
- [Descargas](#descargas)
- [Enlaces para correos](#enlaces-para-correos)
  - [Añadir un asunto al correo electrónico](#añadir-un-asunto-al-correo-electrónico)
  - [Añadir un cuerpo de correo](#añadir-un-cuerpo-de-correo)
  - [Añadir CC (copia carbón) o BCC (copia carbón oculta)](#añadir-cc-copia-carbón-o-bcc-copia-carbón-oculta)

## Imágenes

En HTML, es posible usar imágenes como enlaces, lo que significa que al hacer clic en una imagen, el navegador llevará al usuario a una nueva página o recurso. Esto se logra combinando las etiquetas `<a>` (para los enlaces) y `<img>` (para las imágenes). Al envolver la imagen con una etiqueta `<a>`, puedes hacer que la imagen actúe como un enlace interactivo.

```html
<!-- Ejemplo de una Imagen con un Enlace -->

<a href="https://unsplash.com/es/fotos/JW-T2BH5k5E">
  <img
    src="https://images.unsplash.com/photo-1648737154547-b0dfd281c51e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"
    alt="Tablet de Windows"
  />
</a>
```

## Descargas

Los enlaces para descargas permiten a los usuarios descargar archivos directamente desde tu página web. Esto es muy útil para ofrecer archivos como documentos, imágenes, programas, música o cualquier otro tipo de contenido descargable. En HTML, se utilizan enlaces (`<a>`) junto con el atributo href para crear estos enlaces de descarga.

```html
<!-- Ejemplo enlace para descargar Navegador-Firefox -->

<a
  href="https://download.mozilla.org/?product=firefox-latest-ssl&os=win64&lang=es-MX"
  download="firefox-latest-64bit-installer.exe"
>
  Descarga la última versión de Firefox para Windows (64 bits) (Español, es-MX)
</a>

<!-- Ejemplo de enlace de descarga PDF interno-->
<a href="documento.pdf" download>Descargar documento PDF</a>
```

> [!TIP]
>
> Se puede descargar una imagen si la anidamos con un enlace y la propiedad download(Las imágenes tienen que estar en tu dominio).
>
> ```html
> <a download href="img/imagen.jpg">
>   <img src="img/imagen.jpg" alt="Imagen de prueba" />
> </a>
> ```
>
> Al hacer click en la imagen se descargara o te pedirá donde guardarla.

## Enlaces para correos

Los enlaces para correos permiten que los usuarios envíen un correo electrónico de manera rápida al hacer clic en un enlace en una página web. Esto se logra mediante la etiqueta `<a>` en HTML, utilizando el atributo mailto: en el href para indicar que se trata de un enlace de correo electrónico.

> [!CAUTION]
>
> El correo que se pone en mailto: es el correo del **destinatario**.

```html
<!-- Ejemplo de un enlace mailto: -->

<a href="mailto:correo@dominio.com">Consúltenos a correo@dominio.com</a>
```

### Añadir un asunto al correo electrónico

Puedes preconfigurar el asunto del correo utilizando el atributo subject dentro de la URL del enlace mailto:. Esto permite que cuando el usuario haga clic en el enlace, el campo de asunto del correo ya esté completado.

```html
<a href="mailto:contacto@empresa.com?subject=Consulta%20sobre%20producto"
  >Enviar consulta</a
>
```

`subject=Consulta%20sobre%20producto`: El %20 es una codificación URL para el espacio en blanco. En este caso, el asunto será "Consulta sobre producto".

### Añadir un cuerpo de correo

Además del asunto, puedes preconfigurar el cuerpo del correo. Esto puede ser útil si deseas que el usuario complete un mensaje específico al hacer clic en el enlace.

```html
<a
  href="mailto:contacto@empresa.com?subject=Consulta%20sobre%20producto&body=Hola,%20me%20interesa%20más%20información%20sobre%20el%20producto."
  >Enviar mensaje</a
>
```

`body=Hola,%20me%20interesa%20más%20información%20sobre%20el%20producto.:` El cuerpo del correo tiene un texto predeterminado que aparecerá en el campo de mensaje del correo.

### Añadir CC (copia carbón) o BCC (copia carbón oculta)

Puedes agregar direcciones de correo a los campos de copia (CC) o copia oculta (BCC) mediante los parámetros cc y bcc en el enlace mailto:

- **CC (Copia Carbón):** Se usa para enviar una copia del correo a otras personas que no son los destinatarios principales.
- **BCC (Copia Carbón Oculta):** Se usa para enviar una copia del correo a otras personas, pero ocultando sus direcciones de los demás destinatarios.

```html
<!-- Ejemplo de CC: -->
<a
  href="mailto:contacto@empresa.com?cc=ventas@empresa.com&subject=Consulta%20sobre%20producto"
  >Enviar correo</a
>

<!-- Ejemplo de BCC: -->
<a
  href="mailto:contacto@empresa.com?bcc=soporte@empresa.com&subject=Consulta%20sobre%20producto"
  >Enviar correo</a
>

<!-- Ejemplo de CC y BCC: -->
<a
  href="mailto:contacto@empresa.com?cc=ventas@empresa.com&bcc=soporte@empresa.com&subject=Consulta%20general"
  >Enviar consulta</a
>
```
