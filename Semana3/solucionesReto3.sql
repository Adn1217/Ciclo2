---PREGUNTA 1
SELECT Fecha as "Fecha Compra", ID_Compra as "Cod. Compra", Proveedor as "Nombre Proveedor", Pagado FROM Compra
--WHERE ID_Compra >= 1490
ORDER BY ID_Compra DESC
LIMIT 10

---PREGUNTA 2
SELECT Fecha_Inicio as "Fec Inicio", Constructora as "Nombre Constructora", Ciudad as "Nombre Ciudad",
T1.NombreApellido as "Nombre Lider", T2.Codigo_Tipo as "Cod. Tipo", T2.Estrato  FROM Proyecto as Pr
	LEFT JOIN (SELECT Li.ID_Lider, Li.Nombre, Li.Primer_Apellido, (Li.Nombre || ' ' || Li.Primer_Apellido) as NombreApellido
	FROM Lider as Li
	) T1 on Pr.ID_Lider = T1.ID_Lider
	LEFT JOIN (SELECT Ti.ID_Tipo, Ti.Codigo_Tipo, Ti.Estrato FROM Tipo as Ti
	) T2 on Pr.ID_Tipo = T2.ID_Tipo
WHERE Fecha_Inicio BETWEEN '2019-09-01' AND '2019-09-09'
AND Ciudad = 'Pereira'


---PREGUNTA 3
SELECT COUNT(Pr.ID_Proyecto) as "Numero Proyectos" 
FROM Proyecto as Pr
	LEFT JOIN(SELECT DISTINCT Com.ID_Proyecto FROM Compra as Com
					INNER JOIN (SELECT Com.ID_Proyecto FROM Compra as Com
								WHERE Com.ID_MaterialConstruccion = 7
								) T1 on Com.ID_Proyecto = T1.ID_Proyecto
			  WHERE Com.ID_MaterialConstruccion = 1
	) T2 on Pr.ID_Proyecto = T2.ID_Proyecto --Los proyectos con ID_MaterialConstrucción 1 y 7 (al tiempo) quedan aquí.
WHERE Fecha_Inicio >= '2019-12-12'
AND Pr.ID_Lider NOT IN (6)
AND T2.ID_Proyecto is NUll
--AND Pr.ID_Lider != 6

---PREGUNTA 3 OTRA FORMA
SELECT COUNT(p.ID_Proyecto) AS "Numero Proyectos" FROM Proyecto p 
WHERE (p.Fecha_Inicio >= "2019-12-12"
AND NOT EXISTS(SELECT 1 FROM Lider l WHERE (l.ID_Lider = p.ID_Lider) AND (l.ID_Lider = 6))
AND NOT EXISTS(SELECT 1 FROM Compra c WHERE (c.ID_Proyecto = p.ID_Proyecto) AND (c.ID_MaterialConstruccion = 1)
AND EXISTS(SELECT 1 FROM Compra c WHERE (c.ID_Proyecto = p.ID_Proyecto) AND (c.ID_MaterialConstruccion = 7))));

--PREGUNTA 4
SELECT (SUBSTR(Li.Nombre,1,1) || SUBSTR(Li.Primer_Apellido,1,1) || SUBSTR(Li.Segundo_Apellido,1,1)) as Abrev 
FROM Lider as Li
	

---PREGUNTA 5
SELECT Constructora, SUM(T1.Salario) as "Salario Lider" FROM Proyecto as Pr
	LEFT JOIN (SELECT Li.ID_Lider, Li.Nombre, Li.Primer_Apellido, (Li.Nombre || ' ' || Li.Primer_Apellido) as NombreApellido,
	Li.Salario FROM Lider as Li
	) T1 on Pr.ID_Lider = T1.ID_Lider
GROUP BY Constructora
HAVING "Salario Lider" BETWEEN 31000000 AND 34000000