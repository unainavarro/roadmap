<h1 align="center">Ruteo en React</h1>

<h2>📑 Contenido</h2>

- [Ruteo en React](#ruteo-en-react)
- [Configuración de React Router](#configuración-de-react-router)
  - [Pasos para instalar React Router](#pasos-para-instalar-react-router)
- [Creación de rutas y navegación](#creación-de-rutas-y-navegación)
  - [Definir rutas](#definir-rutas)
  - [Navegación entre rutas](#navegación-entre-rutas)
- [Parámetros de ruta y redireccionamiento](#parámetros-de-ruta-y-redireccionamiento)
  - [Parámetros de ruta](#parámetros-de-ruta)
  - [Redireccionamiento](#redireccionamiento)
- [Nested routes](#nested-routes)
  - [Ejemplo de rutas anidadas](#ejemplo-de-rutas-anidadas)
  - [Rutas anidadas con parámetros](#rutas-anidadas-con-parámetros)

## Ruteo en React

El ruteo es una parte fundamental de las aplicaciones web modernas, ya que permite a los usuarios navegar entre diferentes páginas o vistas sin recargar la página. En React, React Router es la biblioteca más popular para manejar el ruteo.

## Configuración de React Router

Para comenzar a usar React Router, primero debes instalar la biblioteca en tu proyecto. React Router se divide en dos paquetes principales: `react-router-dom` para aplicaciones web y `react-router-native` para aplicaciones móviles con React Native.

### Pasos para instalar React Router

Instala react-router-dom usando npm o yarn:

```bash
npm install react-router-dom

yarn add react-router-dom
```

Importa los componentes necesarios en tu aplicación:

```bash
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
```

Envuelve tu aplicación con el componente Router:

```javascript
function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Inicio />} />
        <Route path="/acerca" element={<Acerca />} />
      </Routes>
    </Router>
  );
}
```

## Creación de rutas y navegación

### Definir rutas

Las rutas se definen usando el componente `Route`. Cada ruta tiene un `path` (la URL) y un `element` (el componente que se renderiza cuando la ruta coincide).

```javascript
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Inicio from "./Inicio";
import Acerca from "./Acerca";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Inicio />} />
        <Route path="/acerca" element={<Acerca />} />
      </Routes>
    </Router>
  );
}
```

### Navegación entre rutas

Para navegar entre rutas, usa el componente `Link` o el Hook `useNavigate`.

Usando `Link`:

```javascript
import { Link } from "react-router-dom";

function Navegacion() {
  return (
    <nav>
      <Link to="/">Inicio</Link>
      <Link to="/acerca">Acerca</Link>
    </nav>
  );
}
```

Usando `useNavigate`:

```javascript
import { useNavigate } from "react-router-dom";

function BotonNavegacion() {
  const navigate = useNavigate();

  return <button onClick={() => navigate("/acerca")}>Ir a Acerca</button>;
}
```

## Parámetros de ruta y redireccionamiento

### Parámetros de ruta

Los parámetros de ruta permiten capturar valores dinámicos en la URL. Para definir un parámetro, usa `:nombreParametro` en el `path`.

```javascript
<Route path="/usuario/:id" element={<Usuario />} />
```

En el componente `Usuario`, puedes acceder al parámetro usando el `Hook useParams`.

```javascript
import { useParams } from "react-router-dom";

function Usuario() {
  const { id } = useParams();
  return <p>ID del usuario: {id}</p>;
}
```

### Redireccionamiento

Para redirigir a otra ruta, puedes usar el componente `Navigate` o el Hook `useNavigate`.

Usando Navigate:

```javascript
import { Navigate } from "react-router-dom";

function RutaProtegida({ autenticado }) {
  if (!autenticado) {
    return <Navigate to="/login" />;
  }
  return <p>Bienvenido a la ruta protegida</p>;
}
```

Usando useNavigate:

```javascript
import { useNavigate } from "react-router-dom";

function Login() {
  const navigate = useNavigate();

  const handleLogin = () => {
    // Lógica de autenticación
    navigate("/dashboard");
  };

  return <button onClick={handleLogin}>Iniciar sesión</button>;
}
```

## Nested routes

Las rutas anidadas (nested routes) permiten definir rutas dentro de otras rutas, lo que es útil para crear layouts complejos o jerarquías de componentes.

### Ejemplo de rutas anidadas

Define las rutas anidadas en el componente `App`:

```javascript
function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Inicio />} />
          <Route path="acerca" element={<Acerca />} />
          <Route path="contacto" element={<Contacto />} />
        </Route>
      </Routes>
    </Router>
  );
}
```

En el componente `Layout`, usa el componente `Outlet` para renderizar las rutas anidadas:

```javascript
import { Outlet, Link } from "react-router-dom";

function Layout() {
  return (
    <div>
      <nav>
        <Link to="/">Inicio</Link>
        <Link to="/acerca">Acerca</Link>
        <Link to="/contacto">Contacto</Link>
      </nav>
      <Outlet /> {/* Aquí se renderizan las rutas anidadas */}
    </div>
  );
}
```

### Rutas anidadas con parámetros

También puedes usar parámetros en rutas anidadas:

```javascript
<Route path="/usuario/:id" element={<Usuario />}>
  <Route path="perfil" element={<Perfil />} />
  <Route path="configuracion" element={<Configuracion />} />
</Route>
```

En el componente `Usuario`, puedes usar `Outlet` para renderizar las rutas anidadas:

```javascript
import { Outlet, useParams } from "react-router-dom";

function Usuario() {
  const { id } = useParams();
  return (
    <div>
      <p>ID del usuario: {id}</p>
      <Outlet /> {/* Aquí se renderizan las rutas anidadas */}
    </div>
  );
}
```
