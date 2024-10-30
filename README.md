# Employee Management System

## Overview
This project is a basic Employee Management System built using Spring Boot, featuring user authentication and a straightforward interface for managing employee data. The application includes:

1. **User Login**:
   - Users are prompted with a login page where they enter their username and password.
   - The credentials are validated against records in the database, and upon successful login, the user is redirected to the main dashboard.

2. **Employee Dashboard**:
   - After login, users can view a list of employees displayed in a tabular format.
   - The data is fetched directly from the database using a `SELECT` query and mapped to the table on the UI.

3. **Personalized Welcome Message**:
   - Once logged in, users see a custom welcome message with their username displayed at the top of the dashboard.

4. **Optional Employee Addition**:
   - Users can add new employee records through a form, entering details that are saved directly to the database. This feature provides a basic CRUD interface where users can input, view, and manage employee data.

## Technologies Used

- **Frontend**:
  - **Thymeleaf**
  
- **Backend**:
  - **Spring Boot**
 
- **Database**:
  - **MySQL**

- **Development Tools**:
  - **Java 8**
  - **Maven**
  - **Visual Studio Code**

