<h1 align="center">Etiquetas</h1>

<h2>📑 Contenido</h2>

- [¿Que son las etiquetas?](#que-son-las-etiquetas)
- [Operaciones básicas](#operaciones-básicas)
  - [Crear etiqueta](#crear-etiqueta)
  - [Listar etiquetas](#listar-etiquetas)
  - [Añadir mensaje a las etiquetas](#añadir-mensaje-a-las-etiquetas)
  - [Subir etiqueta(remoto)](#subir-etiquetaremoto)
  - [Eliminar etiquetas(local)](#eliminar-etiquetaslocal)
  - [Eliminar etiquetas(remoto)](#eliminar-etiquetasremoto)

## ¿Que son las etiquetas?

Las etiquetas son referencias estáticas a puntos específicos en la historia de un repositorio. A diferencia de las ramas, que son móviles y cambian a medida que se realizan nuevos commits, **las etiquetas son inmutables y se utilizan comúnmente para marcar versiones específicas de un proyecto.** Las etiquetas son útiles para indicar hitos importantes, como versiones de lanzamiento.

## Operaciones básicas

### Crear etiqueta

Puedes crear una etiqueta utilizando el siguiente comando, donde `<nombre_etiqueta>` es el nombre que deseas asignar a la etiqueta y `<commit_id>` es el identificador del commit que deseas etiquetar.

```bash
git tag <nombre_etiqueta> <commit_id>

git tag v1.0
```

### Listar etiquetas

```bash
#Esto muestra todas las etiquetas en el repositorio.
git tag

#Esto muestra la información detallada del commit al que apunta la etiqueta.
git show <nombre_etiqueta>
```

### Añadir mensaje a las etiquetas

```bash
git tag -a v2.0 -m "Versión 2.0"
```

### Subir etiqueta(remoto)

```bash
git push origin <nombre_etiqueta>
```

### Eliminar etiquetas(local)

```bash
git tag -d <nombre_etiqueta>
```

### Eliminar etiquetas(remoto)

```bash
git push --delete origin <nombre_etiqueta>
```
