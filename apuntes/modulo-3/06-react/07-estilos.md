<h1 align="center">Estilos</h1>

<h2>📑 Contenido</h2>

- [Estilos en React](#estilos-en-react)
- [CSS tradicional y módulos CSS](#css-tradicional-y-módulos-css)
  - [CSS tradicional](#css-tradicional)
  - [Ventajas](#ventajas)
  - [Desventajas](#desventajas)
- [Módulos CSS](#módulos-css)
  - [Ventajas](#ventajas-1)
  - [Desventajas](#desventajas-1)
- [CSS-in-JS (styled-components, emotion)](#css-in-js-styled-components-emotion)
  - [styled-components](#styled-components)
    - [Ventajas](#ventajas-2)
    - [Desventajas](#desventajas-2)
  - [Emotion](#emotion)
    - [Ventajas](#ventajas-3)
    - [Desventajas](#desventajas-3)
- [Tailwind CSS y otras soluciones de utilidades](#tailwind-css-y-otras-soluciones-de-utilidades)
  - [Tailwind CSS](#tailwind-css)
  - [Ventajas](#ventajas-4)
  - [Desventajas](#desventajas-4)
- [Otras soluciones de utilidades](#otras-soluciones-de-utilidades)

## Estilos en React

Los estilos son una parte esencial de cualquier aplicación web, ya que definen la apariencia y la experiencia del usuario. En React, existen múltiples enfoques para aplicar estilos, desde el uso de CSS tradicional hasta soluciones más avanzadas como CSS-in-JS y frameworks de utilidades como Tailwind CSS.

## CSS tradicional y módulos CSS

### CSS tradicional

El enfoque más básico para aplicar estilos en React es usar archivos CSS tradicionales. Puedes importar un archivo CSS directamente en un componente y aplicar clases usando el atributo `className`.

```javascript
// App.css
.titulo {
  color: blue;
  font-size: 24px;
}

// App.js
import React from "react";
import "./App.css";

function App() {
  return <h1 className="titulo">Hola, mundo!</h1>;
}
```

### Ventajas

- **Sencillez:** Fácil de entender y usar.

- **Compatibilidad:** Funciona en cualquier proyecto web.

### Desventajas

- **Alcance global:** Los estilos pueden afectar a otros componentes si no se manejan correctamente.

- **Dificultad para mantener:** En proyectos grandes, puede ser complicado evitar conflictos de nombres.

## Módulos CSS

Los módulos CSS son una extensión que permite encapsular estilos en componentes específicos, evitando conflictos de nombres. Cada archivo CSS se trata como un módulo, y las clases se convierten en nombres únicos.

```javascript
// App.module.css
.titulo {
  color: blue;
  font-size: 24px;
}

// App.js
import React from "react";
import styles from "./App.module.css";

function App() {
  return <h1 className={styles.titulo}>Hola, mundo!</h1>;
}
```

### Ventajas

- **Alcance local:** Los estilos están encapsulados en el componente.

- **Evita conflictos:** Los nombres de las clases se generan automáticamente para evitar colisiones.

### Desventajas

- **Sintaxis adicional:** Requiere importar y usar el objeto styles.

## CSS-in-JS (styled-components, emotion)

CSS-in-JS es un enfoque moderno que permite escribir estilos directamente en JavaScript. Esto ofrece mayor flexibilidad y dinamismo, ya que los estilos pueden depender de props o estado del componente

### styled-components

`styled-components` es una de las bibliotecas más populares de CSS-in-JS. Permite crear componentes estilizados usando plantillas literales de JavaScript.

```javascript
import styled from "styled-components";

const Titulo = styled.h1`
  color: ${(props) => (props.azul ? "blue" : "black")};
  font-size: 24px;
`;

function App() {
  return <Titulo azul>Hola, mundo!</Titulo>;
}
```

#### Ventajas

**Estilos dinámicos:** Los estilos pueden cambiar en función de props o estado.

**Alcance local:** Los estilos están encapsulados en el componente.

**Facilidad de mantenimiento:** Los estilos y el componente están en el mismo archivo.

#### Desventajas

- **Curva de aprendizaje:** Requiere aprender una nueva sintaxis.

- **Rendimiento:** Puede ser menos eficiente que CSS tradicional en aplicaciones muy grandes.

### Emotion

`emotion` es otra biblioteca de CSS-in-JS que ofrece características similares a `styled-components`, pero con un enfoque más modular.

```javascript
/** @jsxImportSource @emotion/react */
import { css } from "@emotion/react";

const estiloTitulo = css`
  color: blue;
  font-size: 24px;
`;

function App() {
  return <h1 css={estiloTitulo}>Hola, mundo!</h1>;
}
```

#### Ventajas

- **Flexibilidad:** Permite usar estilos en línea o en archivos separados.

- **Compatibilidad:** Funciona bien con otras bibliotecas de React.

#### Desventajas

- **Configuración adicional:** Requiere configurar el compilador de JSX en algunos casos.

## Tailwind CSS y otras soluciones de utilidades

### Tailwind CSS

Tailwind CSS es un framework de utilidades que permite construir interfaces rápidamente aplicando clases predefinidas directamente en el HTML (o JSX). Es altamente personalizable y sigue un enfoque "utility-first".

```javascript
function App() {
  return <h1 className="text-blue-500 text-2xl font-bold">Hola, mundo!</h1>;
}
```

### Ventajas

- **Rápido desarrollo:** No es necesario escribir CSS personalizado.

- **Consistencia:** Las clases predefinidas aseguran un diseño coherente.

- **Personalización:** Puedes configurar colores, tamaños y otros valores en el archivo de configuración.

### Desventajas

- **Curva de aprendizaje:** Requiere familiarizarse con las clases de utilidad.

- **Tamaño del archivo CSS:** Puede generar archivos CSS grandes si no se configura correctamente.

## Otras soluciones de utilidades

Además de Tailwind CSS, existen otras bibliotecas de utilidades como:

- **Bootstrap:** Un framework CSS tradicional que incluye clases predefinidas y componentes.

- **Bulma:** Un framework CSS moderno y ligero.

- **Chakra UI:** Una biblioteca de componentes que combina utilidades con componentes preestilizados.
