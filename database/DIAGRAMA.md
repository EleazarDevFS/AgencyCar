# Diagrama de Estructura de Base de Datos - AgencyCar506

## Esquema General

```
agenciaBd (Base de Datos)
└── privateSchema (Esquema)
    ├── TIPOS ENUM
    │   ├── statusValido (Activo, Inactivo, Vacaciones, Incapacidad, Suspendido)
    │   ├── metodo_de_pago (Efectivo, Tarjeta, Transferencia, Cheque, Credito)
    │   └── tipo_registro (venta, compra, gasto, deuda)
    │
    ├── CATÁLOGOS
    │   ├── departamento (id, nombre, descripcion)
    │   ├── area (id, nombre, descripcion, iddepartamento)
    │   └── puesto (id, nombre, salario, descripcion, idarea)
    │
    ├── RECURSOS HUMANOS
    │   ├── empleado (id, idpuesto, nombre, apellidos, fechas, status)
    │   ├── contacto_empleado (idempleado, ubicacion, email, telefono)
    │   └── cuentas (idempleado, asociada)
    │
    ├── INVENTARIO Y CLIENTES
    │   ├── vehiculos (id, tipo, desc, cantidad, marca, modelo, año, color, precio, nombre)
    │   └── cliente (id, nombre, apellidos, telefono, direccion, status)
    │
    ├── TRANSACCIONES
    │   ├── registros (id, idempleado, tipo, fecha)
    │   ├── ventas (id, idcliente, idregistro, idvehiculo, fecha, cantidad, monto)
    │   ├── compras (id, idregistro, total, metododepago, descripcion, fecha)
    │   ├── gastos (id, idregistro, fecha, descripcion, total, metododepago)
    │   └── deudas (id, idregistro, motivo, fecha, monto, metodo, interes, acreedor, plazo)
    │
    └── PROCEDIMIENTOS
        ├── resta_cantidad(cantidad, vehiculo_id)
        └── suuma_compras(vehiculo_id)
```

## Relaciones Principales

### 1. Estructura Organizacional
```
departamento (1) ──→ (N) area (1) ──→ (N) puesto (1) ──→ (N) empleado
```

### 2. Información de Empleados
```
empleado (1) ──→ (1) contacto_empleado
empleado (1) ──→ (0..1) cuentas (relación con usuario PostgreSQL)
```

### 3. Transacciones
```
empleado (1) ──→ (N) registros (1) ──→ (N) ventas/compras/gastos/deudas
                                    │
cliente (1) ──→ (N) ventas ←── (N) vehiculos
```

## Diagrama Detallado de Tablas

### EMPLEADO Y ORGANIZACIÓN
```
┌─────────────────┐      ┌─────────────┐      ┌─────────────┐
│  departamento   │      │    area     │      │   puesto    │
├─────────────────┤      ├─────────────┤      ├─────────────┤
│ PK iddepartamen │      │ PK idarea   │      │ PK idpuesto │
│    nombre       │◄─┐   │    nombre   │◄─┐   │    nombre   │
│    descripcion  │  └──│FK iddeparta.│  └──│FK idarea    │
└─────────────────┘      └─────────────┘      │    salario  │
                                               │    descripc │
                                               └──────┬──────┘
                                                      │
                         ┌────────────────────────────┘
                         ▼
┌──────────────────┐    ┌───────────────────────┐
│contacto_empleado │    │      empleado         │
├──────────────────┤    ├───────────────────────┤
│PK/FK idempleado  │◄───│ PK idempleado         │
│     ubicacion    │    │ FK idpuesto           │
│     email        │    │    nombre, apellidos  │
│     telefono     │    │    fechanacimiento    │
└──────────────────┘    │    fechaingreso       │
                        │    status (ENUM)      │
          ┌─────────────┤                       │
          │             └───────────────────────┘
          │
┌─────────▼────────┐
│     cuentas      │
├──────────────────┤
│PK/FK idempleado  │
│     asociada     │ ← Referencia al usuario PostgreSQL
└──────────────────┘
```

### VENTAS Y TRANSACCIONES
```
┌─────────────┐         ┌──────────────┐         ┌─────────────┐
│   cliente   │         │   registros  │         │  empleado   │
├─────────────┤         ├──────────────┤         ├─────────────┤
│PK idcliente │         │PK idregistro │         │PK idempleado│
│   nombre    │         │FK idempleado ├─────────►             │
│   apellidos │         │   tipo(ENUM) │         └─────────────┘
│   telefono  │         │   fecha      │
│   direccion │         └──────┬───────┘
│   status    │                │
└─────┬───────┘                │
      │                        ├──────────┬──────────┬──────────┐
      │        ┌───────────────▼────┐     │          │          │
      │        │      ventas        │     │          │          │
      │        ├────────────────────┤     │          │          │
      │        │PK idventa          │     │          │          │
      └───────►│FK idcliente        │     │          │          │
               │FK idregistro       │     │          │          │
               │FK idvehiculo    ───┼─┐   │          │          │
               │   fecha            │ │   │          │          │
               │   cantidadvendida  │ │   │          │          │
               │   montototal       │ │   │          │          │
               └────────────────────┘ │   │          │          │
                                      │   │          │          │
┌─────────────────────┐               │   │          │          │
│     vehiculos       │◄──────────────┘   │          │          │
├─────────────────────┤                   │          │          │
│PK idvehiculo        │                   │          │          │
│   tipo              │      ┌────────────▼────┐     │          │
│   descripcion       │      │     compras     │     │          │
│   cantidad          │      ├─────────────────┤     │          │
│   marca, modelo     │      │PK idcompra      │     │          │
│   anio, color       │      │FK idregistro    │     │          │
│   precio, nombre    │      │   total         │     │          │
└─────────────────────┘      │   metododepago  │     │          │
                             │   descripcion   │     │          │
                             │   fecha         │     │          │
                             └─────────────────┘     │          │
                                                     │          │
                             ┌────────────────┐     │          │
                             │    gastos      │◄────┘          │
                             ├────────────────┤                │
                             │PK idgasto      │                │
                             │FK idregistro   │                │
                             │   fecha        │                │
                             │   descripcion  │                │
                             │   total        │                │
                             │   metododepago │                │
                             └────────────────┘                │
                                                               │
                             ┌────────────────┐                │
                             │    deudas      │◄───────────────┘
                             ├────────────────┤
                             │PK iddeuda      │
                             │FK idregistro   │
                             │   motivo       │
                             │   fecha        │
                             │   monto        │
                             │   metododepago │
                             │   interes      │
                             │   acreedor     │
                             │   mesesplazo   │
                             └────────────────┘
```

## Flujo de Datos Principal

### Registro de una Venta
```
1. Login Usuario (verifica tabla: cuentas)
   ↓
2. Buscar Cliente (tabla: cliente)
   ↓
3. Seleccionar Vehículo (tabla: vehiculos)
   ↓
4. Crear Registro (INSERT en: registros)
   ↓
5. Registrar Venta (INSERT en: ventas)
   ↓
6. Actualizar Inventario (CALL resta_cantidad)
   ↓
7. Generar Factura (PDF con iText)
```

### Flujo de Autenticación
```
1. Usuario ingresa nombre y contraseña
   ↓
2. App verifica en pg_roles de PostgreSQL
   ↓
3. Si existe, intenta conectar con esas credenciales
   ↓
4. Obtiene idempleado desde tabla cuentas
   ↓
5. Según sufijo del usuario abre módulo:
   - _adm → InicioFrame (Admin)
   - _pv  → Principal (Ventas)
   - _ct  → Conta (Contabilidad)
   - _rh  → GestionEmpleados (RH)
```

## Índices para Optimización

- `idx_empleado_status` → empleado(status)
- `idx_empleado_puesto` → empleado(idpuesto)
- `idx_vehiculos_marca` → vehiculos(marca)
- `idx_vehiculos_modelo` → vehiculos(modelo)
- `idx_vehiculos_nombre` → vehiculos(nombre)
- `idx_ventas_fecha` → ventas(fecha)
- `idx_ventas_cliente` → ventas(idcliente)
- `idx_registros_tipo` → registros(tipo)
- `idx_registros_fecha` → registros(fecha)

## Tipos de Datos Importantes

### ENUM statusValido
- Activo
- Inactivo
- Vacaciones
- Incapacidad
- Suspendido

### ENUM metodo_de_pago
- Efectivo
- Tarjeta
- Transferencia
- Cheque
- Credito

### ENUM tipo_registro
- venta
- compra
- gasto
- deuda

---

**Nota**: Todas las tablas están en el esquema `privateSchema` para mantener separación lógica de otras aplicaciones.
