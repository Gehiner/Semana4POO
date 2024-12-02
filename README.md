# Implementación de Clases en POO (Desarrollo de Software Orientado a Objetos)

## Información del Estudiante
- **Nombre:** Gehiner Ferley Sierra Rincón
- **ID:** 997326
- **Curso:** Desarrollo de Software Orientado a Objetos
- **NRC:** 4052

## Descripción del Proyecto
Este proyecto tiene como objetivo la implementación de clases en Programación Orientada a Objetos (POO). A través de este ejercicio, se han creado varias clases que simulan un sistema de venta de computadores en línea, en el cual se gestionan clientes, productos (computadores), pedidos y facturas. 

La aplicación sigue el enfoque de programación orientada a objetos, utilizando conceptos como **encapsulamiento**, **herencia** y **polimorfismo**. Cada clase es responsable de manejar una parte del sistema y sus interacciones se dan mediante relaciones bien definidas entre ellas.

## Objetivo
El objetivo es implementar un sistema de ventas de computadores en línea que permita:
1. Registrar clientes.
2. Gestionar productos (computadores).
3. Crear pedidos de productos.
4. Generar facturas para los pedidos.

## Clases Implementadas
1. **Cliente:** Representa a un cliente en el sistema, con atributos como nombre, email, dirección, etc. Permite registrar y consultar datos del cliente.
2. **Computador:** Representa a un producto en el sistema. Contiene atributos como nombre, precio, stock, y métodos para gestionar el producto.
3. **Pedido:** Un pedido realizado por un cliente, que puede contener varios productos. Permite agregar y eliminar productos, así como calcular el total del pedido.
4. **Factura:** Representa una factura generada a partir de un pedido. Calcula el total y permite generar una factura detallada.

## Requisitos del Sistema
- **Lenguaje:** Java
- **Entorno de Desarrollo:** IntelliJ IDEA

## Instrucciones de Uso
1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en **IntelliJ IDEA**.
3. Ejecuta la clase `Main.java`.
4. Observa cómo interactúan las clases `Cliente`, `Computador`, `Pedido` y `Factura`.
5. Modifica el código para agregar más funcionalidades o probar casos de uso adicionales.

## Ejemplo de Ejecución
Cuando se ejecuta el código, se muestra un flujo básico de cómo un cliente realiza un pedido y cómo se genera una factura:
```java
Cliente registrado: Juan Pérez
Producto agregado: PC Gamer
Producto agregado: Laptop Pro
Total del pedido: $2700.0
Estado del pedido actualizado a: Confirmado
Factura generada:
ID Factura: 1
Fecha: 2024-12-02
Total: 2700.0
