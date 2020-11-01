FROM alpine
WORKDIR /root/code-test
COPY MainClass.java /root/code-test

RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

RUN javac MainClass.java

ENTRYPOINT java MainClass