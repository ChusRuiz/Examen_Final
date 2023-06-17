insert into catedratico (name, curso, calificacion) values ('Jose', 'mate', 10);
insert into catedratico (name, curso, calificacion) values ('Mario', 'logica', 8);
insert into catedratico (name, curso, calificacion) values ('Javier', 'Estadistica', 5);
insert into catedratico (name, curso, calificacion) values ('Estuardo', 'Deportes',7);
-- Insertar estudiantes
INSERT INTO student (id, name, age)
VALUES (1, 'Juan Perez', 20),
       (2, 'Maria Rodriguez', 22),
       (3, 'Pedro Martinez', 19);

-- Insertar cursos
INSERT INTO course (id, title, description)
VALUES (1, 'Matematicas', 'Curso avanzado de matemáticas'),
       (2, 'Historia', 'Estudio detallado de la historia del mundo'),
       (3, 'Programacion', 'Introducción a la programación en Java');

-- Insertar calificaciones
-- Supongamos que las calificaciones son valores entre 0 y 100
INSERT INTO grade (id, student_id, course_id, grade)
VALUES (1, 1, 1, 85),  -- Juan Perez tiene una calificación de 85 en Matematicas
       (2, 1, 3, 90),  -- Juan Perez tiene una calificación de 90 en Programacion
       (3, 2, 1, 95),  -- Maria Rodriguez tiene una calificación de 95 en Matematicas
       (4, 2, 2, 92),  -- Maria Rodriguez tiene una calificación de 92 en Historia
       (5, 3, 3, 88);  -- Pedro Martinez tiene una calificación de 88 en Programacion
