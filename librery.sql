CREATE DATABASE IF NOT EXISTS library_db;
USE library_db;

CREATE TABLE IF NOT EXISTS books (
    id       INT PRIMARY KEY,
    name     VARCHAR(200) NOT NULL,
    author   VARCHAR(200) NOT NULL,do
    isIssued BOOLEAN DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS users (
    userId   INT PRIMARY KEY,
    name     VARCHAR(200) NOT NULL
);

CREATE TABLE IF NOT EXISTS issued_books (
    userId   INT,
    bookId   INT,
    PRIMARY KEY (userId, bookId),
    FOREIGN KEY (userId) REFERENCES users(userId) ON DELETE CASCADE,
    FOREIGN KEY (bookId) REFERENCES books(id)     ON DELETE CASCADE
);