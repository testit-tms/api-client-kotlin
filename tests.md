## Generated API's tests


### System versions: 

    openjdk 21.0.2 2024-01-16
    OpenJDK Runtime Environment (build 21.0.2+13-58)
    OpenJDK 64-Bit Server VM (build 21.0.2+13-58, mixed mode, sharing)

    Gradle 8.10.2

    Kotlin version 2.0.20-release-360 (JRE 21.0.2+13-58)
### 1.
```bash
gradle wrapper
```
output:
```
Starting a Gradle Daemon (subsequent builds will be faster)

BUILD SUCCESSFUL in 56s
1 actionable task: 1 executed
```

### 2. 
```bash
./gradlew check assemble
```
output:
```
Downloading https://services.gradle.org/distributions/gradle-8.7-all.zip                                                                    
.....................10%.....................20%......................30%.....................40%......................50%.....................60%.....................70%......................80%.....................90%......................100%                                   
                                                                                                                                            
Welcome to Gradle 8.7!                                                                                                                      
                                                                                                                                            
Here are the highlights of this release:
 - Compiling and testing with Java 22
 - Cacheable Groovy script compilation
 - New methods in lazy collection properties

For more details see https://docs.gradle.org/8.7/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

BUILD SUCCESSFUL in 3m 6s
5 actionable tasks: 5 executed
```