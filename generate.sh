rm -r new
mkdir new
cd new 

openapi-generator-cli generate -i ../source/swagger_release_17_sep.json  -g kotlin --skip-validate-spec -o . --additional-properties=packageName=ru.testit.kotlin.client 

cd ..
rm -r src/main
cp -r new/src/main src/main
rm -r docs
cp -r new/docs docs

echo "Validate changes in ApiClient.kt"