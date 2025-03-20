<h1 align='center'>History</h1>

<h2>📑 Contenido</h2>

- [History](#history)
- [¿Qué es el objeto history?](#qué-es-el-objeto-history)
- [Propiedades y métodos del objeto history](#propiedades-y-métodos-del-objeto-history)
  - [history.length](#historylength)
  - [history.back()](#historyback)
  - [history.forward()](#historyforward)
  - [history.go()](#historygo)
- [Ejemplos de uso](#ejemplos-de-uso)
  - [Regresar a la página anterior](#regresar-a-la-página-anterior)
  - [Avanzar a la página siguiente](#avanzar-a-la-página-siguiente)
  - [Navegar a una entrada específica en el historial](#navegar-a-una-entrada-específica-en-el-historial)
- [Consideraciones](#consideraciones)

## History

El objeto **`history`** en JavaScript forma parte del **Browser Object Model (BOM)** y se utiliza para interactuar con el historial de navegación del navegador. A través del objeto `history`, puedes acceder a las páginas que el usuario ha visitado, así como manipular el historial de navegación, permitiendo a los desarrolladores crear experiencias más fluidas y controladas para los usuarios.

## ¿Qué es el objeto history?

El objeto **`history`** proporciona acceso al historial de la sesión de navegación. Esto incluye todas las páginas que el usuario ha visitado en la pestaña o ventana actual. El objeto `history` no se debe confundir con el historial de navegación del navegador completo; solo se refiere al historial de la ventana actual.

## Propiedades y métodos del objeto history

### history.length

Devuelve el número de entradas en el historial de navegación de la ventana.

```javascript
console.log(history.length); // Muestra el número de entradas en el historial
```

### history.back()

Carga la página anterior en el historial, equivalente a hacer clic en el botón "Atrás" del navegador.

```javascript
history.back(); // Regresa a la página anterior
```

### history.forward()

Carga la siguiente página en el historial, equivalente a hacer clic en el botón "Adelante" del navegador.

```javascript
history.forward(); // Avanza a la página siguiente
```

### history.go()

Permite navegar a una entrada específica en el historial. Puedes pasar un número positivo para avanzar o un número negativo para retroceder.

```javascript
history.go(-1); // Regresa a la página anterior
history.go(1); // Avanza a la siguiente página
```

---

## Ejemplos de uso

Aquí hay algunos ejemplos que demuestran cómo se puede utilizar el objeto `history` para manipular el historial de navegación en una aplicación web.

### Regresar a la página anterior

```javascript
// Regresar a la página anterior en el historial
history.back();
```

### Avanzar a la página siguiente

```javascript
// Avanzar a la página siguiente en el historial
history.forward();
```

### Navegar a una entrada específica en el historial

```javascript
// Retroceder dos páginas en el historial
history.go(-2); // Navega a la página que estaba dos atrás
```

## Consideraciones

El objeto `history` es una herramienta útil para mejorar la navegación en aplicaciones web de una sola página (SPA), permitiendo a los desarrolladores controlar el flujo de la aplicación y ofrecer una experiencia de usuario más fluida.
Sin embargo, ten en cuenta que manipular el historial puede confundir a los usuarios si no se utiliza de manera coherente. Siempre es recomendable mantener la familiaridad y la facilidad de uso en la navegación.
