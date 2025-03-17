<h1 align='center'>Comportamiento</h1>

<h2>📑 Contenido</h2>

- [Comportamiento de los elementos en HTML](#comportamiento-de-los-elementos-en-html)
- [Elementos en línea](#elementos-en-línea)
- [Elementos en bloque](#elementos-en-bloque)
- [Factores influyentes](#factores-influyentes)
  - [Tipo de elemento](#tipo-de-elemento)
  - [Nesting (anidación)](#nesting-anidación)
  - [Atributos y estilos](#atributos-y-estilos)
  - [Eventos y JavaScript](#eventos-y-javascript)
  - [Modelo de caja](#modelo-de-caja)
  - [Compatibilidad del navegador](#compatibilidad-del-navegador)

## Comportamiento de los elementos en HTML

Cada elemento HTML tiene un comportamiento predeterminado que afecta cómo se muestra y se relaciona con otros elementos en el flujo del documento. Este comportamiento básico se puede modificar con CSS, pero es esencial comprender cómo actúan de manera natural. Los elementos se dividen principalmente en dos tipos de comportamiento: en **bloque** y en **línea**, lo que afecta la forma en que ocupan espacio y se alinean dentro del diseño de la página.

## Elementos en línea

Los elementos en línea (inline elements) son aquellos que solo ocupan el espacio necesario para su contenido y no comienzan en una nueva línea. Estos elementos se alinean horizontalmente con otros elementos en línea, lo que los hace ideales para trabajar dentro de bloques de texto. No interrumpen el flujo del documento, permitiendo que otros elementos continúen a su alrededor en la misma línea.

```html
<p>
  Este es un texto con un <a href="#">enlace</a> y una
  <span style="color: red;">palabra resaltada</span>.
</p>
```

Características de los elementos en línea:

- No forzan un salto de línea.
- Solo ocupan el espacio que requiere su contenido.
- No afectan el flujo de los elementos adyacentes.
- Las propiedades de width y height no tienen efecto directo en ellos (aunque sí pueden aplicarse estilos como padding o margin lateral).

## Elementos en bloque

Los elementos en bloque (block elements) son aquellos que ocupan todo el ancho disponible de su contenedor y siempre comienzan en una nueva línea, empujando otros elementos hacia abajo. Los elementos en bloque son ideales para crear la estructura principal de una página, como encabezados, párrafos y divisores.

```html
<div>
  <h1>Este es un encabezado</h1>
  <p>Este es un párrafo dentro de un contenedor en bloque.</p>
</div>
```

Características de los elementos en bloque:

- Siempre inician en una nueva línea.
- Ocupan todo el ancho disponible de su contenedor, a menos que se especifique un ancho.
- Pueden contener otros elementos en bloque y elementos en línea.
- Las propiedades de width, height, margin y padding se aplican directamente y afectan su tamaño y posición.

> [!TIP]
>
> - Los elementos en línea se pueden convertir en bloques y viceversa con la propiedad display (Ver en CSS).
> - Los elementos en bloque pueden contener elementos en línea, pero no al revés.
> - Los elementos en línea pueden tener espacios en blanco entre ellos, que se pueden eliminar con la propiedad font-size: 0.

## Factores influyentes

El comportamiento de un elemento HTML no solo depende de su tipo, sino que puede estar influenciado por varios factores, incluyendo:

### Tipo de elemento

Los elementos tienen dos categorías principales en línea y bloque. En función de que elemento sea, el siguiente elementos comenzara en una nueva línea o pegado al elemento anterior.

### Nesting (anidación)

Los elementos HTML pueden anidarse unos dentro de otros, lo que afecta cómo se renderiza el contenido en la página y cómo se comporta. La jerarquía y la estructura de anidación pueden tener un impacto significativo en la apariencia y la interacción de los elementos.

- Si dudas de si se puede incluir, [caninclude](https://caninclude.glitch.me/) te saca de dudas.

### Atributos y estilos

Los atributos HTML y las reglas de estilo CSS aplicadas a los elementos pueden cambiar su comportamiento. Por ejemplo, los atributos pueden afectar la accesibilidad, la interacción con el usuario y otros aspectos del comportamiento.

### Eventos y JavaScript

Los elementos HTML pueden ser interactivos y responder a eventos del usuario, como clics, movimientos del mouse, ingreso de datos, etc. JavaScript se utiliza comúnmente para controlar el comportamiento de los elementos y crear interacciones dinámicas.

### Modelo de caja

El modelo de caja de CSS define cómo se representan visualmente los elementos en términos de su tamaño, márgenes, relleno, borde y posición en la página.

### Compatibilidad del navegador

El comportamiento de los elementos puede variar ligeramente según el navegador web que se esté utilizando. Es importante asegurarse de que los sitios web sean compatibles con múltiples navegadores para garantizar una experiencia consistente para los usuarios.

> [!IMPORTANT]
>
> Comprender cómo funcionan los elementos es esencial para diseñar y desarrollar sitios web eficaces y funcionales.
