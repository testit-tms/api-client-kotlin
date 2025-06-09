## How to reproduce api installation?


NOTE: generated with generator 7.13


1. Install openapi-generator using scoop https://scoop.sh for powershell (Note: js version unfortunately had bad log with broken cyrillic) :
```
    scoop install openapi-generator-cli
    scoop bucket add java
    scoop install openjdk
```
2. 
```
mkdir .idea/new
cd .idea/new 
openapi-generator-cli generate -i .\master-swagger.json  -g kotlin --skip-validate-spec -o  ($PWD).path --additional-properties=packageName=ru.testit.kotlin.client 
// or
openapi-generator-cli generate -i https://team-s01g.testit.software/swagger/v2/swagger.json  -g kotlin --skip-validate-spec -o  ($PWD).path --additional-properties=packageName=ru.testit.kotlin.client 
rm src/main
cp .idea/new/src/main src/main
# Validate changes in ApiClient.kt 
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