FROM flink:1.18
ENV FLINK_HOME=/opt/flink
ENV FLINK_LIB=/opt/flink/lib/

# FLINK CONNECTORS
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-connector-datagen/1.18.0/flink-connector-datagen-1.18.0.jar $FLINK_LIB
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-connector-jdbc/1.16.2/flink-connector-jdbc-1.16.2.jar $FLINK_LIB
ADD https://repo1.maven.org/maven2/org/postgresql/postgresql/42.6.0/postgresql-42.6.0.jar $FLINK_LIB
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-sql-jdbc-driver/1.18.0/flink-sql-jdbc-driver-1.18.0.jar $FLINK_LIB
ADD https://github.com/knaufk/flink-faker/releases/download/v0.5.3/flink-faker-0.5.3.jar $FLINK_LIB
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-sql-connector-kafka/3.0.2-1.18/flink-sql-connector-kafka-3.0.2-1.18.jar $FLINK_LIB

# FLINK FORMATS
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-sql-avro-confluent-registry/1.18.0/flink-sql-avro-confluent-registry-1.18.0.jar $FLINK_LIB


# FLINK OTHERS
ADD https://repo.maven.apache.org/maven2/org/apache/flink/flink-shaded-guava/30.1.1-jre-16.2/flink-shaded-guava-30.1.1-jre-16.2.jar $FLINK_LIB

USER root

RUN chown -R flink:flink /opt/flink/lib/

#USER flink

EXPOSE 8083
