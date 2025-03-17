<h1 align='center'>Internos y externos</h1>

<h2>📑 Contenido</h2>

- [Internos y externos](#internos-y-externos)
- [Enlaces internos](#enlaces-internos)
- [Enlaces externos](#enlaces-externos)

## Internos y externos

En HTML, cuando se hace referencia a archivos, recursos o páginas web, se habla de rutas internas y rutas externas. Estas rutas se utilizan para especificar cómo se deben localizar los recursos, ya sea dentro del mismo sitio web o en recursos alojados fuera de él.

## Enlaces internos

Los enlaces internos apuntan o enlazan subpáginas o páginas web que se encuentren en el mismo dominio que la página principal.

Sintaxis: <br>
` <a href="contactos.html">Contáctenos</a>`

**Arquitectura de directorios:**

- Web
  - index.html
  - contactos.html
  - nosotros.html
- PDF
  - nosotros.pdf

```HTML
<!-- Supongamos que desde el archivo index.html queremos crear un enlace para contactos.html -->

<a href="contactos.html">Contáctenos</a>

<!-- Supongamos que desde el archivo index.html queremos crear un enlace para nosotros.pdf -->

<a href="../PDF/nosotros.pdf">Sobre Nosotros</a>
```

## Enlaces externos

Los enlaces externos crean hipervínculos hacia dominios externos. Páginas web que no se encuentran en el mismo dominio que la página principal.
Para usar enlaces externos es necesario usar rutas absolutas.

Abrir enlaces en nuevas pestañas puede confundir a los usuarios, especialmente si no se les informa que el enlace abrirá en una nueva pestaña.

Algunos usuarios prefieren controlar cómo se abren los enlaces, y abrir enlaces en nuevas pestañas puede ser molesto.

Sintaxis: <br>
` <a href="https://google.com" target="_blank">Ir a Google</a>`

> [!NOTE]
>
> El atributo target="\_blank" sirve para abrir el enlace en otra pestaña del navegador.

Atributos a tener en cuenta con los enlaces externos:

- `rel=”noopener”` le dice al navegador que no use window.opener de javascript.
- `rel=“noreferrer”` evita que el navegador recopile información sobre la página principal.
- `rel=nofollow` evita que los bots rastreadores tengan en cuenta dicho enlace. La página que recibe el enlace no se beneficia de la página origen.

> [!TIP]
>
> - Es común usar target="\_blank" para enlaces a páginas externas, para que el usuario pueda seguir navegando en la pestaña original sin perder la página actual.
> - Útil para enlaces a documentos PDF, videos, u otros recursos que el usuario puede preferir ver en una nueva pestaña.
> - Usa un texto claro o un ícono (como un símbolo de una pestaña) para indicar que un enlace se abrirá en una nueva pestaña.

> [!CAUTION]
>
> - Si no se usa correctamente, target="\_blank" puede hacer que un sitio web sea vulnerable a ataques de clickjacking. Esto ocurre cuando un sitio malicioso embebe un sitio legítimo en un iframe y engaña al usuario para que haga clic en enlaces o botones sin saberlo.
> - Utiliza rel="noopener noreferrer" junto con target="\_blank" para mejorar la seguridad. Esto previene que el sitio de destino pueda acceder a la ventana de origen y reduce el riesgo de clickjacking.
>  <details>
>  <summary style="margin-left:20px">Ataques (Click)</summary>
>  <h2>Clickjacking</h2>
>  <p>Clickjacking es un ataque en el que un sitio web malicioso oculta elementos engañosos sobre un sitio web legítimo.</p>
>  <ul>
>    <li>El atacante superpone o incrusta elementos de otro sitio web legítimo en su propia página web maliciosa.</li>
>    <li>Estos elementos pueden estar invisibles o semi-transparentes para que el usuario no los note.</li>
>    <li>Cuando el usuario hace clic en aparentemente enlaces inofensivos o botones en la página maliciosa, en realidad está interactuando con los elementos ocultos del sitio legítimo, realizando acciones no deseadas (como compartir contenido no autorizado, realizar compras, etc.).</li>
>  </ul>
>  <h2>Tabnabbing</h2>
>  <p>Tabnabbing es un tipo de ataque en el que un sitio web malicioso aprovecha el comportamiento de las pestañas del navegador.</p>
>  <ul>
>    <li>El usuario abre una pestaña en su navegador hacia un sitio legítimo.</li>
>    <li>Luego, el usuario abre una nueva pestaña o realiza alguna otra actividad en su navegador.</li>
>    <li>El sitio legítimo, que está en la pestaña original, puede ser modificado por un script malicioso que cambia su contenido para parecerse a otro sitio, como una página de inicio de sesión de servicios populares (por ejemplo, Gmail, Facebook).</li>
>    <li>Si el usuario regresa a la pestaña original, puede ser engañado para que ingrese sus credenciales en la página falsa, pensando que está en el sitio legítimo.</li>
>  </ul>
> </details>

> [!IMPORTANT]
>
> Las medidas de seguridad implementadas en el lado del cliente, pueden ser el primer nivel de defensa. Sin embargo, no deben considerarse suficientes por sí solas. Las configuraciones de seguridad adecuadas en el servidor (back-end) y las políticas de seguridad del navegador son esenciales para mitigar correctamente estos riesgos.
