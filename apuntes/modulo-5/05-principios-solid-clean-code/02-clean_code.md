<h1 align="center">Clean Code</h1>

<h2>📑 Contenido</h2>

- [Clean code](#clean-code)
- [Principios y prácticas básicas](#principios-y-prácticas-básicas)
  - [Nombres significativos](#nombres-significativos)
  - [Funciones pequeñas y simples](#funciones-pequeñas-y-simples)
  - [Comentarios relevantes](#comentarios-relevantes)
  - [Formato consistente](#formato-consistente)
  - [Eliminar código duplicado](#eliminar-código-duplicado)
  - [Pruebas unitarias](#pruebas-unitarias)
  - [Refactorización continua](#refactorización-continua)

## Clean code

"Clean Code" es un término acuñado por Robert C. Martin en su libro del mismo nombre, "Clean Code: A Handbook of Agile Software Craftsmanship". Este libro es una guía práctica que ofrece principios y prácticas para escribir código limpio, fácil de entender, mantener y adaptar.

El objetivo principal de "Clean Code" es ayudar a los desarrolladores a escribir código de alta calidad que sea comprensible para otros programadores y que pueda evolucionar de manera efectiva a medida que cambian los requisitos del proyecto.

## Principios y prácticas básicas

### Nombres significativos

Los nombres significativos son una parte fundamental de escribir código limpio y comprensible. Utilizar nombres descriptivos y significativos para variables, funciones, clases y otros elementos del código es crucial para que el código sea fácil de entender y mantener. Aquí tienes algunas pautas para elegir nombres significativos:

- **Ser descriptivo:** Elige nombres que comuniquen claramente la intención y el propósito de la variable, función o clase. Un buen nombre debe responder a la pregunta "¿Qué hace esto?" de manera clara y concisa.

- **Utilizar nombres que se entiendan:** Evita usar nombres oscuros, abreviaturas poco claras o jerga que pueda ser confusa para otros desarrolladores. Es mejor elegir nombres que sean fáciles de entender y que reflejen el dominio del problema que está resolviendo el código.

- **Usar nombres específicos:** Elija nombres que sean específicos y representativos de la funcionalidad que están describiendo. Evite nombres genéricos como "data", "temp", "value", etc., que no proporcionan información útil sobre el propósito de la variable o función.

- **Seguir convenciones de nomenclatura:** Mantén un estilo de nombres consistente en todo el código y sigue las convenciones de nomenclatura del lenguaje de programación que estés utilizando. Por ejemplo, en Java se suele usar camelCase para nombres de variables y métodos, mientras que en Python se usa snake_case.

- **Evitar prefijos y sufijos redundantes:** Evita añadir prefijos o sufijos redundantes a los nombres que no añadan información útil. Por ejemplo, no es necesario agregar "obj" o "my" antes de cada variable para indicar que es un objeto o una variable propia.

- **Utilizar nombres pronunciables:** Elige nombres que puedan ser pronunciados fácilmente en voz alta. Esto ayuda a facilitar las discusiones sobre el código entre miembros del equipo y a evitar confusiones sobre la pronunciación de los nombres.

- **Refactorizar nombres cuando sea necesario:** Si encuentras un nombre que no es lo suficientemente claro o descriptivo, no dudes en refactorizarlo para hacerlo más significativo. La claridad del código es más importante que la brevedad de los nombres.

### Funciones pequeñas y simples

Escribir funciones pequeñas y simples es una práctica fundamental para escribir código limpio y mantenible. Las funciones pequeñas y simples son más fáciles de entender, probar, reutilizar y mantener en comparación con las funciones largas y complejas

- **Facilitan la comprensión:** Las funciones pequeñas son más fáciles de entender porque se pueden asimilar rápidamente. Esto permite a otros desarrolladores comprender rápidamente qué hace la función y cómo se utiliza.

- **Fomentan la reutilización:** Las funciones pequeñas y simples son más fáciles de reutilizar en diferentes partes del código. Al tener una funcionalidad bien encapsulada y específica, es más probable que otras partes del sistema puedan utilizarla sin necesidad de modificaciones.

- **Simplifican la prueba:** Las funciones pequeñas son más fáciles de probar porque tienen un alcance más limitado y realizan una única tarea específica. Esto facilita la creación de casos de prueba y la identificación de posibles problemas.

- **Facilitan la refactorización:** Las funciones pequeñas son más fáciles de refactorizar porque tienen una estructura más simple y se pueden entender completamente. Esto facilita la identificación de mejoras y la implementación de cambios sin afectar otras partes del código.

- **Mejoran la legibilidad:** Las funciones pequeñas y simples son más legibles porque permiten un mayor nivel de abstracción y reducen la cantidad de código que se necesita para entender una función. Esto hace que el código sea más claro y fácil de seguir.

Algunas pautas para escribir funciones pequeñas y simples:

- **Realizar una sola tarea:** Cada función debe realizar una sola tarea específica y tener una responsabilidad bien definida.
- **Limitar la longitud:** Intenta mantener la longitud de las funciones dentro de un límite razonable, como 10-15 líneas de código.
- **Evitar la repetición de código:** Identifica patrones comunes y extrae funcionalidad repetida en funciones separadas para promover la reutilización del código.
- **Utilizar nombres descriptivos:** Elige nombres significativos para las funciones que reflejen claramente su propósito y funcionalidad.

### Comentarios relevantes

Los comentarios relevantes son una parte importante de escribir código limpio y comprensible. Proporcionan información adicional sobre el propósito, la intención o el funcionamiento del código que no se puede expresar fácilmente a través del código en sí mismo.

Pautas:

- **Explicar el por qué, no el qué:** En lugar de simplemente repetir lo que hace el código, los comentarios deben explicar por qué se está realizando una determinada acción o por qué se ha tomado una decisión de diseño. Esto proporciona contexto y ayuda a otros desarrolladores a entender la razón detrás del código.

- **Comentar el código difícil de entender:** Los comentarios son especialmente útiles cuando el código es complejo o difícil de entender. Si una sección de código requiere un conocimiento especializado o está implementando una solución no obvia, es útil agregar comentarios para explicar lo que está sucediendo.

- **Documentar asunciones y limitaciones:** Los comentarios pueden utilizarse para documentar las asunciones subyacentes y las limitaciones del código. Esto ayuda a otros desarrolladores a comprender las restricciones del sistema y a evitar comportamientos inesperados.

- **Escribir comentarios claros y concisos:** Los comentarios deben ser claros, concisos y directos al punto. Evita comentarios largos y excesivamente detallados que puedan ser difíciles de seguir. Utiliza un estilo de escritura claro y sencillo para maximizar la comprensión.

- **Actualizar los comentarios cuando se modifique el código:** Los comentarios deben mantenerse actualizados y sincronizados con el código. Si se realizan cambios en el código, asegúrate de actualizar cualquier comentario relevante para reflejar los cambios.

- **Utilizar comentarios estratégicamente:** No todos los bloques de código necesitan comentarios. Utiliza los comentarios donde sean necesarios para mejorar la comprensión del código, pero evita los comentarios innecesarios que puedan redundar en información que ya está clara a través del propio código.

- **Revisar los comentarios con regularidad:** Es útil revisar los comentarios con regularidad para asegurarse de que sigan siendo relevantes y precisos a medida que el código evoluciona. Elimina los comentarios obsoletos o irrelevantes para mantener el código limpio y actualizado.

### Formato consistente

Mantener un formato consistente en todo el código es una práctica importante para mejorar la legibilidad y la mantenibilidad del mismo. Un formato consistente hace que el código sea más fácil de entender y seguir, tanto para el autor original como para otros desarrolladores que trabajen en el proyecto.

Pautas:

- **Indentación:** Utiliza la misma cantidad de espacios o tabulaciones para la indentación en todo el código. La mayoría de las convenciones de estilo recomiendan usar cuatro espacios para la indentación en lenguajes como Python o JavaScript.

- **Longitud de línea:** Limita la longitud de las líneas de código para que quepan dentro de un ancho razonable en la pantalla. Una regla común es mantener las líneas de código a menos de 80 o 100 caracteres de longitud.

- **Espaciado:** Utiliza espacios de forma consistente alrededor de los operadores, paréntesis, llaves y corchetes. Por ejemplo, siempre coloca un espacio después de una coma o un operador de asignación, y no dejes espacios innecesarios al final de las líneas.

- **Nombres de variables:** Mantén un estilo consistente para los nombres de variables, funciones y clases en todo el código. Decide si prefieres camelCase, snake_case, PascalCase u otro estilo y adhiérete a él de manera uniforme.

- **Comentarios:** Utiliza un estilo de comentario consistente en todo el código. Decide si prefieres comentarios de una sola línea (// en JavaScript, C++, etc.) o comentarios multilínea (/\* \*/ en JavaScript, C++, etc.) y úsalos de manera coherente.

- **Organización del código:** Mantén una estructura de código consistente en todo el proyecto. Por ejemplo, decide si prefieres agrupar las importaciones al principio de un archivo o si prefieres ordenarlas alfabéticamente.

- **Convenciones de estilo:** Si estás trabajando en un proyecto colaborativo o en un equipo, es posible que tengas que seguir las convenciones de estilo establecidas por el equipo. Estas convenciones pueden incluir reglas específicas sobre indentación, espaciado, nombres de variables, etc.

- **Herramientas de formato automático:** Considera el uso de herramientas de formato automático (formatters) que puedan aplicar un formato consistente a todo el código de manera automática. Esto puede ayudar a mantener un formato uniforme en todo el proyecto y reducir las discusiones sobre el estilo de código durante las revisiones de código.

### Eliminar código duplicado

Eliminar código duplicado es una práctica importante en el desarrollo de software, ya que ayuda a mejorar la legibilidad, la mantenibilidad y la eficiencia del código

- **Mejora la legibilidad:** El código duplicado aumenta la complejidad y dificulta la comprensión del sistema. Al eliminar duplicaciones, el código se vuelve más claro y más fácil de entender para otros desarrolladores.

- **Facilita el mantenimiento:** Cuando hay código duplicado en múltiples lugares del sistema, cualquier cambio en la lógica o en el comportamiento del código debe ser realizado en cada una de esas instancias. Eliminar duplicaciones hace que los cambios sean más fáciles y menos propensos a errores.

- **Reduce el riesgo de errores:** Si hay código duplicado en diferentes partes del sistema, es más probable que se introduzcan errores al corregir o modificar una instancia del código duplicado sin actualizar las demás. Eliminar duplicaciones reduce este riesgo al centralizar la lógica en un solo lugar.

- **Mejora la eficiencia:** El código duplicado consume recursos adicionales, tanto en términos de espacio de almacenamiento como de tiempo de desarrollo. Al eliminar duplicaciones, se mejora la eficiencia del código y se reduce la cantidad de trabajo necesario para mantener el sistema.

Estrategias para eliminar el código duplicado:

- **Extraer a funciones o métodos:** Identifica patrones repetitivos de código y extráelos a funciones o métodos reutilizables. De esta manera, puedes llamar a la función o método en lugar de duplicar el código en múltiples lugares.

- **Utilizar herencia o composición:** Si hay código duplicado en clases similares, considera usar herencia o composición para compartir la funcionalidad común. De esta manera, puedes reutilizar el código compartido en lugar de duplicarlo en cada clase.

- **Crear abstracciones:** Identifica conceptos comunes o patrones de diseño en el código duplicado y crea abstracciones que representen estos conceptos. Por ejemplo, puedes crear clases base o interfaces que definan la funcionalidad común y luego hacer que las clases concretas implementen estas abstracciones.

- **Refactorizar:** Si encuentras código duplicado existente en el sistema, refactóralo para eliminar la duplicación y centralizar la lógica en un solo lugar. Asegúrate de probar el código después de refactorizar para garantizar que no se hayan introducido nuevos errores.

### Pruebas unitarias

Escribir pruebas unitarias para validar el comportamiento del código y garantizar su correctitud y robustez. Las pruebas unitarias también actúan como documentación viva del código y facilitan su mantenimiento.

### Refactorización continua

Mejorar constantemente el diseño del código a través de la refactorización, identificando y eliminando código duplicado, simplificando funciones complejas y mejorando la estructura general del código.
