FROM tomcat:8.5-jre8
RUN rm -fr /usr/local/tomcat/webapps/ROOT
COPY target/denbox-0.0.1.war /usr/local/tomcat/webapps/ROOT.war
