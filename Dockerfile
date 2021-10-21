# CodingBat Docker Idea -- Let's Try Learning Docker AND Java at the same time!
#       Because, why not?
# BUILT USING 'docker build -t docker_map_java:1.0 .'

# Import OpenJDK 11 as base image
FROM openjdk:11

# Make directory to house created .class files
RUN mkdir -p /usr/bin /usr/src/main
# Set map folder as default work directory -- Since we're using MapBully & MapMain
WORKDIR /usr

# Copy files from mapone folder on host to src folder on image
COPY ./src/main ./src/main



# Create class files and store in /app/bin
RUN javac -d ./bin -sourcepath src src/main/mapone/MapMain.java

# Run class files
CMD java -cp ./bin main.mapone.MapMain