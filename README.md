# technical_java_test_autocomplete

## 📝 Index 

1. [Description] (#description)
2. [Prerequisites] (#prerequisites)
3. [Installation] (#installation)
4. [App Running] (#app-running)
5. [Tests Running] (#tests-running)
6. [Comments] (#comments)
7. [Answers] (#answers)


### 💡 Description

This is the solution code for a technical test, which involves auto-complete feature with following requiements:
    - the function accepts a list of predefined keywords;
    - it suggests up to four keywords based on the letters typed by the user;
    - the search is case-insensitive;
    - the results are sorted in alphabetical order;
    - the preferred programming language is Java, although other languages are accepted;
    - a web interface is not required; the functionality can be implemented as a simple method call that takes a string input and returns up to four suggestions.

###  ✔ Prerequisites

To build and run the project, ensure you have the following installed:

    - Java Development Kit (JDK) 17 or higher (required for maven.compiler.source and maven.compiler.target set to 17).
    - Apache Maven 3.6.0 or higher (to build the project and manage dependencies).

###  💾 Installation

1. CLone the repository :

```bash
 git clone https://github.com/BSN-Asumiko/technical_test_java_autocomplete.git
```
2. Run Maven installation command: 

```bash
 mvn clean install
```


### ⌨️ App Running 

To run the application, use the following Maven command (if you're not using an IDE):

```bash
 mvn exec:java
```
Once the program starts, enter your search query when prompted.
After displaying the result, the program will ask if you would like to perform another search.
    - To continue searching, press Y (or y).
    - To exit, press any other key.


### Tests Running

To run tests, use the following Maven command (if you don't have IDE extensions for running Java tests):

```bash
 mvn test
```

### 💬 Comments 

When developing the solution, I knew that I could make a simple function call, but I decided to add some interaction and provide a fallback for the situation when there are no matches in the keywords list. In a real-world scenario, this fallback would not be necessary, as the suggestions list would simply remain empty and not cause any problems. However, in this case, I considered it helpful for manual testing of the code.


### ✍️ Answers 

1. What would you change if the list of keywords was large (several millions)?
    - To improve performance, I would reduce the number of filtered results before sorting to avoid sorting the entire large dataset.

2. What would you change if the requirements were to match any portion of the keywords (example: for string “pro”, code would possibly return “reprobe”)
    - In this case, I would change .startsWith() to .contains() on line 66. I would also update the expected output in the last test case (line 51) to include "grape."
