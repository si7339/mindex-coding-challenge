# Mindex Java Coding Challenge
# For Task #1 
Created ReportingStructure.java in src\main\java\com\mindex\challenge\data\ReportingStructure.java which holds the model 
for the ReportingStructure class. Then in the src\main\java\com\mindex\challenge\service\impl\EmployeeServiceImpl.java is where the calculateNumberOfReports(String empID) algorithm is defined
Lastly, the REST endpoint for /reportingStructure/{id} is in src\main\java\com\mindex\challenge\controller\EmployeeController.java
To test this:
1)	Open up localhost:8080 on chrome
2)	Look up employee ID’s (ex: John Lennon ID: “16a596ae-edd3-4847-99fe-c4518e82c86f”)
![image](https://github.com/si7339/mindex-coding-challenge/assets/47131569/98a73884-74f2-4984-8433-9728f96e2ad9)

As you can see, it works as expected- returns number of reports as 4.

# For Task 2 
Created Compensation.java, CompensationController.java, CompensationService.java CompensationServiceImpl.java, and CompensationRepository.java
The main two endpoints (/compensation) and (/compensation/{id}) are in CompensationController.java class. 
To test this: 
1) Use a tool like postman, create a POST request to http://localhost:8080/compensation. 
2) Use a body request like ex: John Lennon 
  {
  	    "employee": {
	        "employeeId": "16a596ae-edd3-4847-99fe-c4518e82c86f"
  	    },
  	    "salary": 80000,
  	    "effectiveDate": "2024-02-07"
  }
3) In Postman it would be something like: 
![image](https://github.com/si7339/mindex-coding-challenge/assets/47131569/6e720e6e-8ab5-481d-8f74-54defbd9eb8d)

5) Test reading of the request using GET on POSTMAN or on chrome use the path http://localhost:8080/compensation/16a596ae-edd3-4847-99fe-c4518e82c86f
6) For example, you can see the full GET request for id: 16a596ae-edd3-4847-99fe-c4518e82c86f here 
![image](https://github.com/si7339/mindex-coding-challenge/assets/47131569/37af1202-2fc7-4e52-b6a0-dfb7b0d77162)

