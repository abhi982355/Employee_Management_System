
# Employee Management System

This project is an Employee Management System that utilizes a Restful web service built with Java for the backend and Angular for the frontend. It allows users to perform CRUD (Create, Read, Update, Delete) operations on employee records.


## Technologies

      Backend:  
               Java
               Build In - (Maven)
               Spring Boot (Rest API)
               Spring Boot (Data JPA)
               Spring Boot (Security)
               -----------------------
      Frontend:
               Angular 15
               TypeScript
               Html
               Css
               -----------------------
      Database:
               MySQL
               -----------------------
## How to create?
### Develop spring boot CRUD rest api's -
* create employee
* list employee
* delete employee
* update employee
* get employee by id

### Create Angular 15 app -
* Install the latest version of Angular CLI
* Create Angular 15 client application using Angular CLI
* Identify Components, Services, and Modules
* Create Service & Components using Angular CLI
* Integrate Bootstrap with Angular

### Develop Angular CRUD operations - 
* Create an Employee class (ng g class Employee)
* Employee Service (ng g service service)
* Creating Employee List Template and Component (ng g c)
* Create Add Employee Template and Component
* Update Employee Template and Component
* Create View Employee Details Template and Component
  #### Configurations:
  * npm package.json - Configure Dependencies
  * App Routing Module
  * App Component
  * App Component Template
  * App Module
  * Main Index Html File
  * Main (Bootstrap) File
  * Polyfills
  * TypeScript tsconfig.json
### Running Application - 
  * Running Angular 15 application - 
     (ng serve -o)
  * Demo
  
     

## Features
### Create Employee/add new employee - 
                ( http:localhost:8080/emp/save)

  * Add new employee details, including first name, last name, email-id,id ia also given but its generated Auto type so, no need to put id.
  * Form Validation: Ensure all required fields are filled out.
  * Feedback to User: Display success or error messages after adding an employee.
  * After add employee succesfully then redirect to employee list.

  ### Get Employee List/ particular Employee By Id -
              get All   - ( http:localhost:8080/emp/employees)
              get by id - ( http:localhost:8080/emp/get/{id})

   * Get All employees list with the help of get All (url) and see All employee list we can also update and delete employee profile with the help that particular endpoints.
   * we can also find only employee who i want actully with the help of employee id.      

  ### Update Employee - 
            update - ( http:localhost:8080/emp/update/{id})

   * Update Employee (first name / last name / email),it's user choice how should you have changed or not?
   * firstly user go with employee-list and that list we click on that update button after that he can be populate that data in one form and then you have changed it..
   * If you change employee succesfully means after click on update button then its redirect to employee list with updated data.         

 ### Delete Employee -   
           delete - ( http:localhost:8080/emp/delete/{id})

   *  firstly user go with employee-list and that list we click on that delete button after that he can show on screen one pop-up modal Delete or not? then user's choice delete succesfully or cnacel.
   * we can also on console or postman show which employee should be deleted succesfully. show it's id only.
## How it Works?

### Register New Employee - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20220958.png?raw=true)

### check form validations -
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20221154.png?raw=true)

### Fill Correct form and submit it -
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20221259.png?raw=true)

### click on employee list and see list - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20221617.png?raw=truerue)

### You want to update employee info click on update - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20221858.png?raw=true)

### After click on update button populate given info. - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20222157.png?raw=true)

### Changed it you want - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20222601.png?raw=true)

### update the employee data - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20222933.png?raw=true)

### Redirect to employee list and see updated things - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20223150.png?raw=true)

### If you want delete any employee info clicked on delete icon - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20223448.png?raw=true)

### Last chance to you have deleted or cancel ?? - 
![Register](https://github.com/abhi982355/Employee_Management_System/blob/main/Screenshots/Screenshot%202024-01-04%20223716.png?raw=true)





## Acknowledgements

## Thank Open Source Communities:

   1. Spring - https://spring.io/guides/gs/spring-boot 
   2. Bootsrap - https://getbootstrap.com
   3. Maven Repository - https://mvnrepository.com
   4. Angular (V-15) - https://angular.io
   5. MySql - https://www.mysql.com
   6. PostMan - https://www.postman.com
   


## 🔗 Links

[![twitter](https://logosmarcas.net/wp-content/uploads/2020/12/GitHub-Logo.png)](https://github.com/abhi982355/Employee_Management_System)

# 
 [![linkedin](https://tse1.mm.bing.net/th?id=OIP.62i4eBWqqrpmIaqY0uOL9QHaHa&pid=Api&P=0&h=220)](https://www.linkedin.com/in/abhishek-raut-7a1890237/)
