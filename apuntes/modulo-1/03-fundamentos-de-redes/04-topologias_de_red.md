<h1 align="center">Topología de red</h1>

<h2>📑 Contenido</h2>

- [Topología de red](#topología-de-red)
- [Topología de bus](#topología-de-bus)
- [Topología de estrella](#topología-de-estrella)
- [Topología de anillo](#topología-de-anillo)
- [Topología de malla](#topología-de-malla)
- [Topología de árbol](#topología-de-árbol)
- [Comparación de topologías](#comparación-de-topologías)

## Topología de red

Una topología de red es la disposición física o lógica de los dispositivos en una red. Define cómo los nodos (computadoras, servidores, impresoras, etc.) están conectados entre sí y cómo se comunican. La elección de la topología afecta el rendimiento, la escalabilidad, la confiabilidad y el costo de la red.

La importancia de las topologías de red radica en su capacidad para optimizar la comunicación entre dispositivos, facilitar la detección y resolución de problemas, y adaptarse a las necesidades específicas de una organización o entorno.

## Topología de bus

En una topología de bus, todos los dispositivos están conectados a un único cable central, llamado bus o backbone. Los datos se transmiten a lo largo de este cable, y cada dispositivo verifica si la información está destinada a él.

**Funcionamiento:**

- Los datos se envían en forma de señales eléctricas a través del bus.

- Cada dispositivo tiene una dirección única, y solo el dispositivo destinatario procesa la información.

- Si dos dispositivos intentan transmitir al mismo tiempo, puede ocurrir una colisión, lo que requiere mecanismos de detección y resolución.

**Ventajas:**

- **Simplicidad:** Fácil de instalar y entender.

- **Bajo costo:** Requiere menos cableado que otras topologías.

- **Escalabilidad:** Se pueden agregar dispositivos fácilmente.

**Desventajas:**

- **Limitaciones de distancia:** El bus tiene un límite de longitud.

- **Fallas críticas:** Si el bus falla, toda la red se ve afectada.

- **Colisiones:** A medida que aumenta el número de dispositivos, las colisiones pueden reducir el rendimiento.

**Ejemplo de uso:** Redes pequeñas en entornos educativos o domésticos.

## Topología de estrella

En una topología de estrella, todos los dispositivos están conectados a un punto central, como un hub o switch. Este punto central gestiona la comunicación entre los dispositivos.

**Funcionamiento:**

- Cada dispositivo tiene una conexión dedicada al punto central.

- El punto central recibe datos de un dispositivo y los reenvía al destinatario.

- Si el punto central falla, la red deja de funcionar, pero los dispositivos individuales no se afectan entre sí.

**Ventajas:**

- **Fácil de administrar:** Problemas individuales no afectan a toda la red.

- **Alto rendimiento:** Cada dispositivo tiene su propia conexión al punto central.

- **Escalabilidad:** Se pueden agregar dispositivos fácilmente.

**Desventajas:**

- **Dependencia del punto central:** Si el hub o switch falla, la red se cae.

- **Costo:** Requiere más cableado que la topología de bus.

**Ejemplo de uso:** Redes empresariales, redes domésticas con routers modernos.

## Topología de anillo

Los dispositivos están conectados en un círculo, donde cada dispositivo tiene dos vecinos.

**Funcionamiento:** Los datos viajan en una dirección (unidireccional) o en ambas (bidireccional). Cada dispositivo recibe y retransmite los datos.

**Ventajas:**

- Menos colisiones que en la topología de bus.

- Fácil de diagnosticar problemas.

**Desventajas:**

- Si un dispositivo falla, puede interrumpir toda la red.

- Menos escalable que la topología de estrella.

**Ejemplo de uso:** Redes Token Ring (menos común hoy en día).

## Topología de malla

Cada dispositivo está conectado a todos los demás dispositivos en la red.

**Funcionamiento:** Los datos pueden tomar múltiples rutas para llegar al destino, lo que aumenta la redundancia.

**Ventajas:**

- **Alta confiabilidad:** Si un enlace falla, los datos pueden tomar otra ruta.

- **Alto rendimiento:** Múltiples rutas reducen la congestión.

**Desventajas:**

- **Alto costo:** Requiere mucho cableado y configuración.

- **Complejidad:** Difícil de administrar en redes grandes.

**Ejemplo de uso:** Redes militares, redes de sensores.

## Topología de árbol

Combina características de las topologías de bus y estrella. Los dispositivos están organizados en una jerarquía, con un nodo raíz y nodos secundarios.

**Funcionamiento:** Los datos fluyen desde el nodo raíz hacia los nodos secundarios.

**Ventajas:**

- **Escalabilidad:** Fácil de expandir.

- **Aislamiento de fallos:** Problemas en una rama no afectan a otras.

**Desventajas:**

- **Dependencia del nodo raíz:** Si falla, la red se divide.

- **Costo:** Requiere más cableado que una topología de estrella.

**Ejemplo de uso:** Redes corporativas con múltiples departamentos.

## Comparación de topologías

| **Topología** | **Ventajas**                           | **Desventajas**                             | **Uso común**                |
| ------------- | -------------------------------------- | ------------------------------------------- | ---------------------------- |
| Bus           | Simple, bajo costo, fácil de instalar  | Fallas críticas, colisiones, limitaciones   | Redes pequeñas, educativas   |
| Estrella      | Fácil de administrar, alto rendimiento | Dependencia del punto central, mayor costo  | Redes empresariales, hogares |
| Anillo        | Menos colisiones, fácil diagnóstico    | Fallas afectan toda la red, menos escalable | Redes Token Ring (antiguas)  |
| Malla         | Alta confiabilidad, múltiples rutas    | Alto costo, complejidad                     | Redes militares, sensores    |
| Árbol         | Escalable, aislamiento de fallos       | Dependencia del nodo raíz, mayor costo      | Redes corporativas           |
