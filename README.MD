we are using java version 21.0.10 and javaFX version 21.0.10, the good news is that we are using maven so you guys only need to install java 21.0.10 and maven, and everything else works out-of-box. the download for java 21 is: 
https://learn.microsoft.com/en-us/java/openjdk/download

to install maven just run 
```sudo apt update```
```sudo apt install maven -y```

and then verify the installation with:
```mvn -version```

it should tell you that you have have Apache Maven 3.8.7

---
to run the project cd into the sharetea_pos folder, and then : ```mvn javafx:run```

if you are working in Java i suggest getting grabbing the Java and JavaFX extensions