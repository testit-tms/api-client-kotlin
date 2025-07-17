mkdir new
cd new 

openapi-generator-cli generate -i ../source/swagger540.json  -g kotlin --skip-validate-spec -o . --additional-properties=packageName=ru.testit.kotlin.client 

cd ..
rm -r src/main
cp -r new/src/main src/main

echo "Validate changes in ApiClient.kt"