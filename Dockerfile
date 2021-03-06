# Alpine Linux with OpenJDK JRE
FROM tomcat:8.0-alpine

# copy WAR into image
ADD target/demo.war /usr/local/tomcat/webapps/
 
EXPOSE 8080

# run application with this command line 
CMD ["catalina.sh", "run" "-Dspring.profiles.active=default", "/demo.war"]