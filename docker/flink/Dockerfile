FROM flink:1.18
ENV FLINK_HOME=/opt/flink
ENV FLINK_HOME_LIB=/opt/flink/lib/
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-sql-connector-kafka/1.18.0/flink-sql-connector-kafka-1.18.0.jar $FLINK_HOME_LIB
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-connector-datagen/1.18.0/flink-connector-datagen-1.18.0.jar $FLINK_HOME_LIB
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-connector-jdbc/1.16.2/flink-connector-jdbc-1.16.2.jar $FLINK_HOME_LIB

USER root

RUN chown -R flink:flink /opt/flink/lib/

USER flink

EXPOSE 8083