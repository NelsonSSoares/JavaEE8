# Build
mvn clean package && docker build -t academy.learn.pragrammin/mavenproject1 .

# RUN

docker rm -f mavenproject1 || true && docker run -d -p 8080:8080 -p 4848:4848 --name mavenproject1 academy.learn.pragrammin/mavenproject1 