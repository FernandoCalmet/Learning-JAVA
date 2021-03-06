CREATE TABLE CARRERA(
	COD_CARRERA INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	NOMBRE VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE ESTUDIANTE(
	COD_ESTUD INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	ID VARCHAR(10) UNIQUE NOT NULL,
	NOMBRES VARCHAR(80) NOT NULL,
	COD_CARRERA INTEGER NOT NULL REFERENCES CARRERA(COD_CARRERA)
);