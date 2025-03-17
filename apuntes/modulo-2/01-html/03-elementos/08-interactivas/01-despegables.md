<h1 align='center'>Despegables</h1>

<h2>📑 Contenido</h2>

- [Details](#details)
- [Menu](#menu)

## Details

Crea un elemento desplegable que muestra información adicional cuando el usuario hace clic en él.

- **`<details>`** Crea un elemento desplegable. Etiqueta contenedora.
  - **`<details open>`** Visible por defecto.
- **`<summary>`** Título del desplegable. Aparece siempre, se encuentre desplegado o no.

```HTML
<!-- Ejemplo <details>-->
<details>
    <summary>Click</summary>
    <p>Texto aleatorio.</p>
</details>
```

## Menu

Esta etiqueta define un menú de comandos o acciones que el usuario puede ejecutar.

> [!CAUTION]
>
> No confundir con la etiqueta `<nav>`, `<menu>`en este momento no es compatible con la mayoría de navegadores.

```HTML
<!-- Ejemplo <details>-->
<menu type="toolbar">
  <command label="Guardar" onclick="save()">
  <command label="Imprimir" onclick="print()">
  <command label="Compartir" onclick="share()">
</menu>
```
