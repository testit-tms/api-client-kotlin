## How to reproduce api installation?


1. Install openapi-generator using scoop https://scoop.sh for powershell (Note: js version unfortunately had bad log with broken cyrillic) :
```
    scoop install openapi-generator-cli
    scoop bucket add java
    scoop install openjdk
```
2. 
```
openapi-generator-cli generate -i  https://team-okp8.testit.software/swagger/v2/swagger.json -g kotlin --skip-validate-spec -o 
($PWD).path --additional-properties=groupId=ru.testit,packageName=ru.testit.kotlin.client
```


## Jar preparation for local testing

1. make sure that you are using java 11 for assembling:
```
 java --version
```

2. assembling
```
.\gradlew assemble
```

jar will be stored in `api-client-kotlin8\build\libs\testit-api-client-kotlin-1.0.0.jar`