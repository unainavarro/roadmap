<h1 align="center">Transacciones</h1>

<h2>📑 Contenido</h2>

- [Transacciones](#transacciones)
- [Uso de transacciones en SQL](#uso-de-transacciones-en-sql)
- [Beneficios de las transacciones](#beneficios-de-las-transacciones)
- [ACID](#acid)
  - [Atomicidad (atomicity)](#atomicidad-atomicity)
  - [Consistencia (consistency)](#consistencia-consistency)
  - [Aislamiento (isolation)](#aislamiento-isolation)
  - [Durabilidad (durability)](#durabilidad-durability)
  - [Ejemplo práctico](#ejemplo-práctico)

## Transacciones

Las transacciones en bases de datos son un conjunto de operaciones SQL que se ejecutan como una unidad atómica. Si una transacción se completa con éxito, los cambios se confirman (commit); si falla, los cambios se revierten (rollback). Esto garantiza la integridad y consistencia de los datos.

## Uso de transacciones en SQL

Para gestionar transacciones, se usan las siguientes sentencias:

- **BEGIN TRANSACTION o START TRANSACTION:** Inicia una transacción.

- **COMMIT:** Confirma los cambios.

- **ROLLBACK:** Revierte los cambios.

Uso:

```sql
START TRANSACTION;
UPDATE cuentas SET saldo = saldo - 100 WHERE id = 1;
UPDATE cuentas SET saldo = saldo + 100 WHERE id = 2;
COMMIT;
```

Si alguna de las operaciones falla, podemos hacer rollback:

```sql
ROLLBACK;
```

## Beneficios de las transacciones

- Garantizan la integridad de los datos.

- Permiten la recuperación en caso de fallos.

- Aseguran consistencia en sistemas concurrentes.

## ACID

ACID es un conjunto de propiedades que garantizan la fiabilidad de las transacciones. Estas propiedades aseguran que las transacciones en una base de datos se manejen de forma consistente y segura, incluso en situaciones como fallos de sistema o interrupciones. ACID es un acrónimo de:

### Atomicidad (atomicity)

Una transacción es atómica, lo que significa que se ejecuta completamente o no se ejecuta en absoluto. Si alguna parte de la transacción falla, los cambios realizados se revierten, y la base de datos queda en su estado original.

### Consistencia (consistency)

Garantiza que una transacción lleve la base de datos de un estado válido a otro estado válido. Las reglas y restricciones de integridad siempre se mantienen.

### Aislamiento (isolation)

Las transacciones múltiples pueden ejecutarse simultáneamente sin interferir entre sí. Cada transacción se maneja como si fuese la única en ejecución, lo que evita efectos colaterales no deseados.

### Durabilidad (durability)

Una vez que una transacción se confirma (committed), los cambios realizados son permanentes y se conservarán incluso si ocurre un fallo, como un corte de energía.

### Ejemplo práctico

Supongamos que transfieres dinero entre cuentas bancarias:

- **Atomicidad:** Si transfieres $100 de la Cuenta A a la Cuenta B, y ocurre un fallo, el dinero no desaparecerá. O bien la transferencia completa sucede o no sucede nada.

- **Consistencia:** Después de la transferencia, el saldo total de las cuentas debe ser el mismo que antes (se respetan las reglas del sistema).

- **Aislamiento:** Si alguien más realiza operaciones en la Cuenta A o B al mismo tiempo, esas transacciones no afectarán tu transferencia.

- **Durabilidad:** Si la transferencia fue exitosa, el nuevo estado del saldo se guarda incluso si el sistema se apaga después.
