FROM java
ADD ./target/app-1-0.0.1-SNAPSHOT.jar /app-1-0.0.1-SNAPSHOT.jar
ADD ./run.sh /run.sh
RUN chmod a+x /run.sh
EXPOSE 5000:8080
CMD /run.sh