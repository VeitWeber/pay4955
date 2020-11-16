# pay4955
Reproducer for Payara Issue #4955: Payara OpenAPI document creation failed

## Build
`./mvn clean package`

## Run
`java -jar ./target/pay4955-microbundle.jar`

## Check the OpenAPI document
http://localhost:8080/openapi
