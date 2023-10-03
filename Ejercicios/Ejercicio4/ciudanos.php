<!DOCTYPE html>
<html>
<head>
    <title>Tabla Ciudadano</title>
</head>
<body>
    <h1>Ciudadanos</h1>
    <?php
    // Configuración de la conexión a la base de datos SQLite
    $base_de_datos = new SQLite3('../bd_personas.db');
    // Consulta SQL para recuperar los datos de la tabla "ciudadano"
    $consulta = "SELECT * FROM ciudadano";
    // Ejecutar la consulta
    $resultado = $base_de_datos->query($consulta);
    if ($resultado) {
        echo "<table border='1'>";
        echo "<tr><th>CI</th><th>Nombres</th><th>Apellidos</th><th>Fecha</th></tr>";
        while ($fila = $resultado->fetchArray(SQLITE3_ASSOC)) {
            echo "<tr>";
            echo "<td>" . $fila['ci'] . "</td>";
            echo "<td>" . $fila['nombres'] . "</td>";
            echo "<td>" . $fila['apellidos'] . "</td>";
            echo "<td>" . $fila['fecha'] . "</td>";
            echo "</tr>";
        }
        echo "</table>";
    } else {
        echo "No se encontraron registros en la tabla.";
    }
    // Cerrar la conexión
    $base_de_datos->close();
    ?>
</body>
</html>
