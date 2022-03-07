# Bridge Java from python with pyjnius

## pre-requisites:
1. python 3.8
2. Open jdk 11
3. javac

## usage
1. Compile the java project with maven `mvn clean install -f some-java-app/pom.xml`
2. Make sure the jar file is located at `some-java-app/target/some-java-app-1.0-SNAPSHOT.jar`
3. Run the python script `python some-python-app`