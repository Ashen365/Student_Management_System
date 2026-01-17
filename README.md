# Student Management System

A simple console-based Student Management System built in Java that allows you to manage student records including adding, viewing, updating, and deleting students.

## Features

- **Add Student**: Add new students with ID, name, and marks
- **View Students**: Display all students with their details and calculated grades
- **Update Student**: Modify existing student information
- **Delete Student**: Remove students from the system
- **Grade Calculation**: Automatic grade assignment based on marks:
  - A: 75% and above
  - B: 65-74%
  - C: 50-64%
  - F: Below 50%

## Requirements

- Java 8 or higher
- No external dependencies required

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Ashen365/Student_Management_System.git
   cd Student_Management_System
   ```

2. Compile the Java files:
   ```bash
   javac src/*.java
   ```

3. Run the application:
   ```bash
   java -cp src Main
   ```

## Usage

The application provides a menu-driven interface:

1. **Add Student**: Enter student ID, name, and marks
2. **View Students**: See all students with their details
3. **Update Student**: Enter student ID and new information
4. **Delete Student**: Enter student ID to remove
5. **Exit**: Close the application

## Project Structure

```
src/
├── Main.java          # Main application class with menu
├── Student.java       # Student model class
└── StudentService.java # Service class for student operations
```

## Contributing

Feel free to fork this repository and submit pull requests for any improvements or bug fixes.

## License

This project is open source and available under the [MIT License](LICENSE).