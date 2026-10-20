Este programa está diseñado para modelar y gestionar el sistema de control de velocidad de un vehículo asegurando que los valores se mantengan siempre dentro de rangos seguros y lógicos mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos) y validaciones defensivas de límites en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase ControlVelocidad: Declara atributos privados (velocidadActual y velocidadMaximaPermitida) para impedir que código externo altere la velocidad de manera arbitraria o descontrolada.

Implementa métodos de control de velocidad:

acelerar(double incremento): Incrementa la velocidad actual pero aplica una validación estricta para garantizar que el valor nunca supere el límite máximo permitido (velocidadMaximaPermitida).

frenar(double decremento): Reduce la velocidad actual aplicando una restricción para asegurar que nunca descienda por debajo de cero (0.0 km/h).

Oculta los campos de velocidad: Protege los datos internos mediante modificadores privados y expone únicamente métodos públicos controlados de lectura y consulta de estado.

Ejecuta la prueba en el main: Instancia el control de velocidad, simula una secuencia de aceleraciones y frenados extremos (intentando superar el límite máximo o reducir por debajo de cero) y muestra los cambios y mensajes de advertencia por consola.
