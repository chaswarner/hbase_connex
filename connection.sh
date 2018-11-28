export HBASE_PATH=`hbase classpath`


java -cp .:./hbase-1.0-SNAPSHOT.jar:/opt/cloudera/parcels/CDH-5.12.1-1.cdh5.12.1.p0.3/lib/hive/lib/hive-jdbc-standalone.jar:/opt/cloudera/parcels/CDH-5.12.1-1.cdh5.12.1.p0.3/lib/hadoop/client/hadoop-common-2.6.0-cdh5.12.1.jar:/opt/cloudera/parcels/CDH-5.12.1-1.cdh5.12.1.p0.3/lib/hadoop/client-0.20/hadoop-core-2.6.0-mr1-cdh5.12.1.jar:/opt/cloudera/parcels/CDH-5.12.1-1.cdh5.12.1.p0.3/lib/hadoop/client/hadoop-auth-2.6.0-cdh5.12.1.jar:/opt/cloudera/parcels/CDH-5.12.2-1.cdh5.12.2.p0.4/lib/hbase/*:$HADOOP_PATH:$HBASE_PATH HBaseClientDemo
