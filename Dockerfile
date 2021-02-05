FROM openjdk:8u191-jre-alpine3.8
RUN apk add curl jq
# Workspace
WORKDIR /usr/share/udemy

# ADD .jar under target from host
# into this image
ADD target/SeleniumWebProject.jar  SeleniumWebProject.jar
ADD target/SeleniumWebProject-tests.jar SeleniumWebProject-tests.jar
ADD target/libs  libs

# ADD suite files
ADD book-flight-module.xml  book-flight-module.xml
ADD search-module.xml  search-module.xml

#ADD health check script
ADD healthcheck.sh     healthcheck.sh

#BROWSER
#HUB_HOST
#MODULE

ENTRYPOINT sh healthcheck.sh
#ENTRYPOINT java -cp SeleniumWebProject.jar:SeleniumWebProject-tests.jar:libs/* -DBROWSER=$BROWSER -DHUB_HOST=$HUB_HOST org.testng.TestNG $MODULE




