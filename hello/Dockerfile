# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Java file
COPY HelloWorld.java .

# Compile Java program
RUN javac HelloWorld.java

# Run Java program
CMD ["java", "HelloWorld"]
