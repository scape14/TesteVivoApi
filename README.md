# Teste de API JAVA

API criada utilizando as seguintes tecnologias: Java 11, Maven, H2, Spring Boot 3.

# Iniciando o H2

Ao executar o projeto na IDE de preferência, ir nesse link: http://localhost:8080/h2/, colocando as configurações que estão no arquivo: resources/application.properties
Para iniciar o banco de dados, executar a seguinte linha de comando:
DROP TABLE IF EXISTS CHOCOLATE;
CREATE TABLE CHOCOLATE(ID INT PRIMARY KEY, TIPO VARCHAR(50), QTD_CACAU DOUBLE PRECISION);
INSERT INTO CHOCOLATE VALUES(1, 'A', 50.0);
INSERT INTO CHOCOLATE VALUES(2, 'B', 75.5);
