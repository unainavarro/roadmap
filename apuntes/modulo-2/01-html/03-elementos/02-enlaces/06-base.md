<h1 align='center'>Bases</h1>

<h2>📑 Contenido</h2>

- [Bases](#bases)
- [Atributo target](#atributo-target)
- [Buenas prácticas](#buenas-prácticas)

## Bases

En HTML, la etiqueta `<base>` se utiliza para especificar una URL base para todas las URL relativas en un documento. Esto significa que todas las rutas relativas a archivos y enlaces se resolverán en relación con la URL proporcionada en el atributo href de la etiqueta `<base>`. Es especialmente útil cuando se desea establecer una base común para todos los enlaces, imágenes, scripts y otros recursos dentro de una página web.

```html
<!-- Ejemplo base -->

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Base</title>
    <base
      href="https://es.wikipedia.org/wiki/Tabla_peri%C3%B3dica_de_los_elementos"
    />
  </head>
  <body>
    <h1>Tabla Periódica</h1>
    <a href="">Hidrógeno</a>
    <a href="">Litio</a>
    <a href="">Renio</a>
    <a href="">Molibdeno</a>
  </body>
</html>
```

## Atributo target

También puedes especificar el atributo target en la etiqueta `<base>` para definir cómo se abren los enlaces relativos. Por ejemplo, si quieres que todos los enlaces se abran en una nueva pestaña, puedes usar `_blank`.

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Base con Target</title>
    <base
      href="https://es.wikipedia.org/wiki/Tabla_peri%C3%B3dica_de_los_elementos"
      target="_blank"
    />
  </head>
  <body>
    <h1>Tabla Periódica</h1>
    <a href="">Hidrógeno</a>
    <a href="">Litio</a>
    <a href="">Renio</a>
    <a href="">Molibdeno</a>
  </body>
</html>
```

## Buenas prácticas

- **Solo una etiqueta `<base>`:** Recuerda que solo puede haber una etiqueta `<base>` en el `<head>` de un documento.

- **Uso adecuado del href:** Asegúrate de que la URL proporcionada en href sea correcta y relevante para el contexto de tu página.
