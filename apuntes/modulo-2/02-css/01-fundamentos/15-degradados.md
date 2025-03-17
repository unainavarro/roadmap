<h1 align="center">Degradados</h1>

<h2>📑 Contenido</h2>

- [Degradados](#degradados)
- [Degradados lineales](#degradados-lineales)
- [Degradados radiales](#degradados-radiales)
- [Degradados cónicos](#degradados-cónicos)
- [Degradados en forma de rejilla](#degradados-en-forma-de-rejilla)
- [Degradados radiales en forma de diamante](#degradados-radiales-en-forma-de-diamante)

## Degradados

Los degradados en CSS son una forma efectiva de crear transiciones de color suaves entre dos o más colores. Se pueden aplicar a fondos, bordes o incluso texto.

## Degradados lineales

Los degradados lineales en CSS son una forma de aplicar una transición gradual de color en una dirección específica.

```css
/* Degradado lineal de arriba hacia abajo */
.linear-gradient-vertical {
  background: linear-gradient(to bottom, #ff0000, #0000ff);
}

/* Degradado lineal de izquierda a derecha */
.linear-gradient-horizontal {
  background: linear-gradient(to right, #ff0000, #0000ff);
}

/* Degradado lineal diagonal */
.linear-gradient-diagonal {
  background: linear-gradient(to bottom right, #ff0000, #0000ff);
}
```

- linear-gradient indica que se está creando un degradado lineal.

- to bottom, to right, to bottom right, etc., especifica la dirección del degradado.

- #ff0000 y #0000ff son los colores inicial y final del degradado, respectivamente.

Puedes cambiar los colores y las direcciones según tus necesidades. También puedes ajustar la posición del degradado cambiando los valores en las funciones linear-gradient.

## Degradados radiales

Los degradados radiales en CSS son otra forma de aplicar una transición gradual de color, pero en lugar de seguir una línea recta, se expanden desde un punto central hacia afuera en todas las direcciones.

```css
/* Degradado radial */
.radial-gradient-basic {
  background: radial-gradient(circle, #ff0000, #0000ff);
}

/* Degradado radial elíptico */
.radial-gradient-ellipse {
  background: radial-gradient(ellipse at center, #ff0000, #0000ff);
}

/* Degradado radial con múltiples colores */
.radial-gradient-multiple-colors {
  background: radial-gradient(circle, #ff0000, #00ff00, #0000ff);
}
```

- radial-gradient indica que se está creando un degradado radial.

- circle especifica que la forma del degradado es un círculo. Puedes cambiarlo a ellipse para obtener una forma elíptica.

- ellipse at center especifica que el punto central del degradado es el centro del elemento.

- #ff0000, #00ff00, y #0000ff son los colores que se mezclan en el degradado.

Como con los degradados lineales, puedes personalizar estos degradados radiales cambiando los colores, la forma, el tamaño y la posición según tus necesidades.

## Degradados cónicos

Los degradados cónicos son una mezcla de dos o más colores que se extienden desde un punto central hacia afuera en forma de cono.

```css
/* Degradado cónico */
.conic-gradient-basic {
  background: conic-gradient(red, yellow, lime, aqua, blue, magenta, red);
}
```

## Degradados en forma de rejilla

Los degradados en forma de rejilla muestran una transición de color en una cuadrícula regular.

```css
/* Degradado en forma de rejilla */
.repeating-linear-gradient {
  background: repeating-linear-gradient(
    45deg,
    #ffffff,
    #ffffff 10px,
    #000000 10px,
    #000000 20px
  );
}
```

## Degradados radiales en forma de diamante

Estos degradados radiales tienen forma de diamante y se extienden desde el centro hacia las esquinas del elemento.

```css
/* Degradado radial en forma de diamante */
.radial-gradient-diamond {
  background: radial-gradient(45deg, #ff0000 0%, #0000ff 100%);
}
```
