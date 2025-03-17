<h1 align='center'>Lista de definiciones</h1>

<h2>📑 Contenido</h2>

- [Lista de definiciones](#lista-de-definiciones)
- [Buenas prácticas](#buenas-prácticas)

## Lista de definiciones

Las listas de definiciones en HTML son útiles para representar pares de términos y descripciones, como glosarios, listas de preguntas frecuentes o cualquier otro contenido donde se necesite definir términos. Se crean utilizando las etiquetas `<dl>` (Definition List), `<dt>` (Definition Term), y `<dd>` (Definition Description).

`<dl> <dt>Término<dt> <dd>Definición<dd> </dl>`

```HTML
Ejemplo:
<dl>
  <dt>Término1</dt>
  <dd>Definición 1</dd>

  <dt>Término 2</dt>
  <dd>Definición 2</dd>
</dl>

Resultado:
    Término1
        Definición 1
    Término 2
        Definición 2
```

## Buenas prácticas

- **Uso Semántico:** Asegúrate de usar listas de definiciones cuando se trate de términos y sus definiciones para mejorar la semántica y accesibilidad de tu HTML.

- **Contenido Claro y Conciso:** Mantén las definiciones claras y concisas para facilitar la comprensión.
