<h1 align="center">Diseño web responsive</h1>

<h2>📑 Contenido</h2>

- [Diseño web responsive](#diseño-web-responsive)
- [Diseño responsivo y diseño adaptativo](#diseño-responsivo-y-diseño-adaptativo)
  - [Diseño responsivo](#diseño-responsivo)
  - [Diseño adaptativo](#diseño-adaptativo)
- [Flujo vs estático](#flujo-vs-estático)
  - [Diseño en flujo](#diseño-en-flujo)
  - [Diseño estático](#diseño-estático)
- [Breakpoints](#breakpoints)

## Diseño web responsive

El diseño web responsive es una técnica de diseño y desarrollo de sitios web que busca proporcionar una experiencia óptima de visualización y uso, independientemente del dispositivo que se esté utilizando para acceder al sitio (como computadoras de escritorio, tabletas o teléfonos móviles).

La idea clave detrás del diseño web responsive es crear un diseño que se adapte dinámicamente al tamaño de la pantalla y a las capacidades del dispositivo del usuario. Esto se logra mediante el uso de rejillas flexibles, imágenes escalables y hojas de estilo CSS específicas para cada tamaño de pantalla.

En lugar de crear diferentes versiones del mismo sitio web para dispositivos diferentes, el diseño web responsive utiliza un único conjunto de código que se ajusta automáticamente según sea necesario. Esto no solo simplifica el proceso de desarrollo, sino que también garantiza una experiencia coherente para todos los usuarios, lo que mejora la usabilidad y la accesibilidad del sitio web.

## Diseño responsivo y diseño adaptativo

El diseño responsivo y el diseño adaptativo son dos enfoques relacionados pero distintos para crear sitios web que se ajusten a diferentes dispositivos y tamaños de pantalla.

### Diseño responsivo

- El diseño responsivo utiliza un enfoque fluido para adaptar el diseño de un sitio web a diferentes tamaños de pantalla.
- Se basa en el uso de porcentajes y unidades relativas en lugar de medidas fijas, lo que permite que los elementos del sitio se escalen y reorganicen dinámicamente según el tamaño de la pantalla.
- Normalmente se emplea una única estructura de diseño y un conjunto de estilos CSS que se ajustan según el ancho de la ventana del navegador.
- El diseño responsivo suele ofrecer una experiencia de usuario más consistente y fluida, ya que los elementos se adaptan de forma continua a medida que cambia el tamaño de la pantalla.

### Diseño adaptativo

- El diseño adaptativo implica crear múltiples versiones de un sitio web, cada una diseñada específicamente para adaptarse a un rango predefinido de tamaños de pantalla.
- En lugar de usar un diseño flexible y fluido como en el diseño responsivo, el diseño adaptativo utiliza puntos de quiebre (breakpoints) predefinidos en los que se activan diseños específicos diseñados para tamaños de pantalla particulares.
- Cada punto de quiebre marca el límite en el que se cambia el diseño, y el sitio web puede tener diferentes diseños para dispositivos móviles, tabletas y computadoras de escritorio.
- Aunque el diseño adaptativo puede ofrecer un control más granular sobre la apariencia del sitio en diferentes dispositivos, también puede requerir más trabajo de desarrollo al crear y mantener múltiples versiones del sitio.

## Flujo vs estático

### Diseño en flujo

- El diseño en flujo se refiere a un enfoque de diseño web en el que los elementos de la página se organizan de manera relativa y fluida en relación con el tamaño de la ventana del navegador o del dispositivo.
- Los elementos del diseño, como el texto, las imágenes y los bloques de contenido, se ajustan automáticamente para adaptarse al ancho y alto disponibles.
- Este enfoque se alinea con el diseño responsivo, ya que el diseño en flujo permite que los elementos se expandan o contraigan según sea necesario para adaptarse a diferentes tamaños de pantalla.
- El diseño en flujo es flexible y dinámico, lo que permite una experiencia de usuario coherente en una variedad de dispositivos y tamaños de pantalla.

### Diseño estático

- El diseño estático, por otro lado, implica crear una disposición fija y predeterminada de los elementos en la página web, sin ajustarse en respuesta al tamaño de la pantalla del usuario.
- Los elementos se posicionan y dimensionan con medidas fijas, como píxeles, lo que significa que la disposición y el aspecto de la página permanecen constantes independientemente del dispositivo que se esté utilizando.
- Aunque el diseño estático puede ofrecer un mayor control sobre la apariencia visual de la página en dispositivos específicos, puede resultar menos adaptable y menos amigable para dispositivos con diferentes tamaños de pantalla.

## Breakpoints

Los breakpoints, o puntos de quiebre en español, son valores predefinidos en el diseño web adaptativo que indican dónde un diseño debe cambiar para acomodar diferentes tamaños de pantalla o dispositivos. Estos puntos de quiebre se utilizan para adaptar la apariencia y el diseño de un sitio web a diferentes resoluciones de pantalla, como las de dispositivos móviles, tabletas y computadoras de escritorio.

Cuando se alcanza un punto de quiebre específico, se activa un conjunto de reglas CSS diseñadas para ese tamaño de pantalla particular. Estas reglas pueden incluir ajustes en el diseño, la disposición de los elementos, el tamaño de las fuentes y otras propiedades visuales para optimizar la experiencia del usuario en el dispositivo específico.

Los breakpoints se definen mediante media queries en las hojas de estilo CSS del sitio web. Por ejemplo, un breakpoint común podría ser 768 píxeles de ancho, que se usa a menudo para adaptar el diseño a tabletas en modo horizontal. Otro breakpoint podría ser 1024 píxeles, que se usa comúnmente para adaptar el diseño a tabletas en modo vertical o a computadoras de escritorio de tamaño mediano.

El uso efectivo de los breakpoints es crucial para garantizar que un sitio web se vea y funcione bien en una variedad de dispositivos y tamaños de pantalla. Al establecer puntos de quiebre estratégicos y ajustar el diseño en consecuencia, los diseñadores web pueden crear experiencias de usuario consistentes y optimizadas en todos los dispositivos.
