CREATE TABLE specialist(
    id        INT not null auto_increment primary key ,
    name      VARCHAR(30),
    surname   VARCHAR(30),
    salary    VARCHAR(30),
    specialty ENUM('ENGINEER',' MANAGER', 'DEVOPS')
);

CREATE TABLE specialty(
    id        INT not null auto_increment primary key ,
    name VARCHAR(40),
    size ENUM('ENGINEER', 'MANAGER', 'DEVOPS')
);



