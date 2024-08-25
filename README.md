# Homework Assignment

## Project Description.

This project is a part of the training work with databases and Java. The aim of the project is to work with PostgreSQL database, execute SQL queries and process the results using PreparedStatement instead of Statement for more security and efficiency.

### Changes made to the project:

1. **Replacing Statement with PreparedStatement**:
    - All SQL queries that were previously executed using `Statement` were rewritten using `PreparedStatement`.

2. **Models**:
    - Java classes for storing query results have been added.

3. **DatabaseConnector** removed:
    - The `DatabaseConnector.java` file has been removed.
