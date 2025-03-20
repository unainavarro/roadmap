<h1 align='center'>Cookies</h1>

<h2>📑 Contenido</h2>

- [Cookies](#cookies)
- [¿Qué es una cookie?](#qué-es-una-cookie)
  - [Una cookie puede contener diferentes atributos](#una-cookie-puede-contener-diferentes-atributos)
- [Crear y leer cookies con JavaScript](#crear-y-leer-cookies-con-javascript)
  - [Crear una cookie](#crear-una-cookie)
  - [Atributos adicionales de las cookies:](#atributos-adicionales-de-las-cookies)
  - [Leer una cookie](#leer-una-cookie)
- [Modificar una cookie](#modificar-una-cookie)
  - [Eliminar una cookie](#eliminar-una-cookie)
- [Atributos importantes de seguridad en las cookies](#atributos-importantes-de-seguridad-en-las-cookies)
  - [Secure](#secure)
  - [HttpOnly](#httponly)
  - [SameSite](#samesite)
- [Buenas prácticas con cookies](#buenas-prácticas-con-cookies)

## Cookies

Las cookies son pequeños fragmentos de datos almacenados en el navegador del usuario y enviados al servidor con cada solicitud HTTP. Son esenciales para mantener el estado de la aplicación web, almacenar preferencias, autenticar usuarios y rastrear comportamientos entre visitas. Aunque han sido superadas en algunos casos por tecnologías más modernas como el almacenamiento local (`localStorage`) y las sesiones de almacenamiento (`sessionStorage`), las cookies siguen siendo útiles, especialmente cuando se necesita que los datos sean enviados al servidor con cada solicitud.

## ¿Qué es una cookie?

Una cookie es básicamente una cadena de texto que contiene pares clave-valor. Se almacena en el navegador y está asociada a un dominio (o subdominio) específico. Cada vez que el navegador realiza una solicitud HTTP al servidor del dominio, las cookies asociadas a ese dominio son enviadas automáticamente en las cabeceras de la solicitud.

### Una cookie puede contener diferentes atributos

- **Clave-valor:** El contenido de la cookie.
- **Fecha de expiración:** Cuándo debe caducar la cookie.
- **Dominio y ruta:** Qué URL pueden acceder a la cookie.
- Flags como HttpOnly, Secure, SameSite, que controlan la seguridad y la accesibilidad.

## Crear y leer cookies con JavaScript

En JavaScript, el acceso a las cookies se realiza a través de la propiedad `document.cookie`, que es una cadena que contiene todas las cookies disponibles en el sitio actual. Veamos cómo crear, leer, modificar y eliminar cookies.

### Crear una cookie

Para crear una cookie en JavaScript, se asigna una cadena en formato `clave=valor` a `document.cookie`. A continuación un ejemplo:

```js
document.cookie = "nombre=Juan; expires=Fri, 31 Dec 2024 23:59:59 GMT; path=/";
```

En este caso, se ha creado una cookie con la clave nombre y el valor Juan, que expirará el 31 de diciembre de 2024 y será accesible en todo el dominio (`path=/`).

### Atributos adicionales de las cookies:

- **expires:** Define la fecha de expiración de la cookie. Si no se especifica, la cookie se elimina al cerrar el navegador.
- **path:** Define la ruta dentro del dominio en la que la cookie estará disponible. Por defecto, es la ruta actual.
- **domain:** Especifica el dominio para el cual la cookie está disponible. Por defecto, es el dominio actual.
- **secure:** Si está presente, la cookie solo se enviará a través de conexiones HTTPS.
- **HttpOnly:** Evita que la cookie sea accesible desde JavaScript, mejorando la seguridad contra ataques XSS (Cross-Site Scripting).
- **SameSite:** Controla cuándo se debe enviar la cookie en solicitudes entre sitios. Los valores pueden ser `Strict, Lax o None`.

### Leer una cookie

Para leer cookies, se accede a `document.cookie`, pero este devuelve una cadena con todas las cookies, no un objeto. La cadena está en formato `clave=valor` y las cookies están separadas por `;`.

```js
console.log(document.cookie); // "nombre=Juan; tema=oscuro"
```

Dado que `document.cookie` devuelve todas las cookies en una cadena, normalmente es necesario procesar esa cadena para extraer una cookie específica.

```js
function obtenerCookie(nombre) {
  let cookies = document.cookie.split("; ");
  for (let cookie of cookies) {
    let [clave, valor] = cookie.split("=");
    if (clave === nombre) {
      return valor;
    }
  }
  return null;
}

console.log(obtenerCookie("nombre")); // "Juan"
```

En este código, la función obtenerCookie busca una cookie específica (por su clave) y devuelve su valor.

## Modificar una cookie

Modificar una cookie es simplemente sobrescribirla utilizando el mismo nombre clave, pero con un nuevo valor o atributos. El siguiente ejemplo sobrescribe la cookie nombre con un nuevo valor:

```js
document.cookie = "nombre=Pedro; expires=Fri, 31 Dec 2024 23:59:59 GMT; path=/";
```

Ahora, la cookie nombre tiene el valor Pedro.

### Eliminar una cookie

Para eliminar una cookie, se establece su fecha de expiración en el pasado. No existe un método directo para eliminar cookies, así que este enfoque es la práctica común.

```js
document.cookie = "nombre=; expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/";
```

Este ejemplo establece la cookie nombre con un valor vacío y una fecha de expiración en el pasado, lo que efectivamente elimina la cookie.

## Atributos importantes de seguridad en las cookies

Cuando se trabaja con cookies, es crucial comprender algunos atributos que mejoran la seguridad:

### Secure

Este atributo garantiza que una cookie solo se envíe a través de conexiones HTTPS. Si un sitio utiliza HTTP, las cookies con este atributo no se enviarán.

```js
document.cookie = "usuario=Admin; secure";
```

### HttpOnly

Impide que una cookie sea accesible desde JavaScript mediante document.cookie. Esto protege la cookie de ataques XSS, ya que el atacante no puede robarla usando JavaScript.

```js
document.cookie = "sesionID=abc123; HttpOnly";
```

### SameSite

Este atributo permite controlar cuándo se envían cookies en solicitudes de sitios cruzados, lo cual es útil para proteger contra ataques CSRF (Cross-Site Request Forgery).

- **Strict:** La cookie no se enviará en solicitudes de otros sitios, ni siquiera al hacer clic en un enlace.
- **Lax:** La cookie solo se enviará en solicitudes de navegación de primer nivel (por ejemplo, al hacer clic en un enlace).
- **None:** La cookie se enviará en todas las solicitudes entre sitios (requiere el uso de Secure).

```js
document.cookie = "carrito=producto123; SameSite=Strict";
```

## Buenas prácticas con cookies

- Utiliza el atributo HttpOnly para cookies que contengan información sensible, como tokens de autenticación, ya que esto evita que el script del lado del cliente acceda a ellas.
- Usa el atributo Secure para asegurar que las cookies solo sean transmitidas por HTTPS, protegiendo la información durante el tránsito.
- Controla las cookies con SameSite para prevenir ataques CSRF.
- Minimiza el uso de cookies para almacenamiento de datos grandes. Si necesitas almacenar grandes cantidades de información del lado del cliente, considera usar localStorage o sessionStorage.
- Mantén las cookies organizadas: Asigna nombres de clave claros y evita almacenar datos innecesarios. Utiliza el formato JSON para almacenar objetos más complejos si es necesario.
