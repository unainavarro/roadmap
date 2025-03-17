<h1 align='center'>Listas anidadas</h1>

<h2>📑 Contenido</h2>

- [Listas anidadas](#listas-anidadas)
- [Listas de enlaces](#listas-de-enlaces)

## Listas anidadas

Las listas anidadas en HTML son aquellas en las que una lista (ya sea ordenada, desordenada o de definiciones) se encuentra dentro de otro ítem de lista. Se pueden utilizar listas anidadas dentro de listas ordenadas (`<ol>`), desordenadas (`<ul>`) o de definiciones (`<dl>`), y son útiles cuando se quiere representar una jerarquía o una estructura más compleja.

```HTML
Ejemplo:
  <ul>
      <li>Elemento 1</li>
      <li>Elemento 2</li>
      <li>
        <ol>
          <li>Elemento 2.1</li>
          <li>Elemento 2.2</li>
        </ol>
      </li>
      <li>Elemento 3</li>
      <dd>
        <dt>Término1</dt>
        <dd>Definición 1</dd>
        <dt>Término 2</dt>
        <dd>Definición 2</dd>
      </dd>
      <li>Elemento 4</li>
    </ul>

Resultado:
    • Elemento 1
    • Elemento 2
        1. Elemento 2.1
        2. Elemento 2.2
    • Elemento 3
    Término1
        Definición 1
    Término 2
        Definición 2
    • Elemento 4
```

## Listas de enlaces

Este tipo de listas son muy comunes a la hora de crear una navegación para una página web.

```HTML
Ejemplo:
     <ul>
      <li><a href="ruta_del_enlace">Enlace 1</a></li>
      <li><a href="ruta_del_enlace">Enlace 2</a></li>
      <li><a href="ruta_del_enlace">Enlace 3</a></li>
    </ul>
```

Resultado:

- <u>Enlace 1</u>
- <u>Enlace 2</u>
- <u>Enlace 3</u>

---
