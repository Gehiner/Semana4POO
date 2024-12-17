# Implementación de Clases en POO (Desarrollo de Software Orientado a Objetos)

## Información del Estudiante
- **Nombre:** Gehiner Ferley Sierra Rincón
- **ID:** 997326
- **Curso:** Desarrollo de Software Orientado a Objetos
- **NRC:** 4052

## Descripción del Proyecto
Este proyecto tiene como objetivo la implementación de clases en Programación Orientada a Objetos (POO). A través de este ejercicio, se han creado varias clases que simulan un sistema de venta de computadores en línea, en el cual se gestionan clientes, productos (computadores), pedidos y facturas.

La aplicación sigue el enfoque de programación orientada a objetos, utilizando conceptos como **encapsulamiento**, **herencia** y **polimorfismo**. Cada clase es responsable de manejar una parte del sistema y sus interacciones se dan mediante relaciones bien definidas entre ellas.

Este proyecto también incluye una **interfaz gráfica (GUI)**, donde los usuarios pueden interactuar visualmente con el sistema. A través de la interfaz, se pueden registrar clientes, crear pedidos, agregar productos y generar facturas de una manera más intuitiva.

## Objetivo
El objetivo es implementar un sistema de ventas de computadores en línea que permita:
1. Registrar clientes.
2. Gestionar productos (computadores).
3. Crear pedidos de productos.
4. Generar facturas para los pedidos.
5. Proveer una interfaz gráfica que permita al usuario realizar estas tareas de manera visual.

## Clases Implementadas
1. **Cliente:** Representa a un cliente en el sistema, con atributos como nombre, email, dirección, etc. Permite registrar y consultar datos del cliente.
2. **Computador:** Representa a un producto en el sistema. Contiene atributos como nombre, precio, stock, y métodos para gestionar el producto.
3. **Pedido:** Un pedido realizado por un cliente, que puede contener varios productos. Permite agregar y eliminar productos, así como calcular el total del pedido.
4. **Factura:** Representa una factura generada a partir de un pedido. Calcula el total y permite generar una factura detallada.
5. **SistemaVentasGUI:** Proporciona la interfaz gráfica que permite al usuario interactuar con las clases de **Cliente**, **Computador**, **Pedido** y **Factura** de una forma amigable. Utiliza **Swing** para la creación de la interfaz gráfica.

## Requisitos del Sistema
- **Lenguaje:** Java
- **Entorno de Desarrollo:** IntelliJ IDEA
- **Bibliotecas:** [javax.swing](https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html) (para la interfaz gráfica)

## Instrucciones de Uso
1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/Gehiner/Semana4POO.git
