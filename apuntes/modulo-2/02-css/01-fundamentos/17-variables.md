<h1 align="center">Variables</h1>

<h2>📑 Contenido</h2>

- [Variables](#variables)
  - [Guardar el valor](#guardar-el-valor)
  - [Usar variable](#usar-variable)
- [Alcance o ámbito](#alcance-o-ámbito)
  - [Variables locales](#variables-locales)
  - [Variables globales](#variables-globales)

## Variables

En las variables almacenaremos valores que se repiten, asi evitamos tener que cambiar varias líneas de código si necesitamos modificar un valor. Con las variables podemos almacenar colores, fuentes, tamaños...

### Guardar el valor

> Sintaxis: `--nombre-variable: valor;`

### Usar variable

> Sintaxis: `propiedad: var(--nombre-variable);`

---

## Alcance o ámbito

El alcance o ámbito de una variable es la zona desde donde podemos acceder(locales o globales).

### Variables locales

Variables Locales las variables locales se declaran dentro del selector.

```css
/* CSS */
selector {
  --tamanio: 50px;
  font-size: var(--tamanio);
}
```

> [!NOTE]
>
> La variable "tamanio" solo se puede usar dentro de ese selector.

### Variables globales

Variables Globales las variables globales se declaran dentro de la pseudoclase `:root`

```css
/* CSS */
:root {
  --tamanio: 50px;
}

selector {
  font-size: var(--tamanio);
}
```

> [!NOTE]
>
> La variable "tamanio" se puede usar en cualquier regla del CSS.
>
> La pseudo-clase `:root` representa el elemento `<html>` y es idéntico al selector html, excepto que su especificidad es mayor.
