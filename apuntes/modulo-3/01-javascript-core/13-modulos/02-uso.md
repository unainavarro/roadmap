<h1 align='center'>Casos prácticos de programas modulares</h1>

<h2>📑 Contenido</h2>

- [Casos prácticos de programas modulares](#casos-prácticos-de-programas-modulares)
  - [Módulo de productos](#módulo-de-productos)
    - [Módulo de carrito de compras](#módulo-de-carrito-de-compras)
  - [Módulo de usuarios](#módulo-de-usuarios)

## Casos prácticos de programas modulares

Imaginemos una aplicación de comercio electrónico. El código de la aplicación se podría organizar en módulos de la siguiente manera:

### Módulo de productos

Este módulo podría manejar toda la lógica relacionada con los productos, como agregar, eliminar o buscar productos.

```js
// archivo: productModule.js
export function agregarProducto(producto) {
  // código para agregar producto
}

export function eliminarProducto(id) {
  // código para eliminar producto
}
```

#### Módulo de carrito de compras

Este módulo se encargaría de toda la lógica relacionada con el carrito, como agregar artículos al carrito, eliminar artículos, calcular el total, etc.

```js
// archivo: cartModule.js
export function agregarAlCarrito(producto) {
  // código para agregar producto al carrito
}

export function calcularTotal() {
  // código para calcular el total
}
```

### Módulo de usuarios

Este manejaría las funcionalidades relacionadas con los usuarios, como iniciar sesión o registrar nuevos usuarios.

```js
// archivo: userModule.js
export function iniciarSesion(usuario, contraseña) {
  // código para iniciar sesión
}

export function registrarUsuario(usuario) {
  // código para registrar usuario
}
```

Luego, en el archivo principal de la aplicación, estos módulos podrían ser importados y utilizados juntos:

```js
// archivo: main.js
import { agregarProducto, eliminarProducto } from "./productModule.js";
import { agregarAlCarrito, calcularTotal } from "./cartModule.js";
import { iniciarSesion, registrarUsuario } from "./userModule.js";

// Usando las funciones de los módulos
agregarProducto({ id: 1, nombre: "Laptop" });
agregarAlCarrito({ id: 1, nombre: "Laptop" });
iniciarSesion("usuario1", "password123");
```
