export HBASE_PATH=`hbase classpath`


java -cp .:./hbase-1.0-SNAPSHOT.jar:$HBASE_PATH HBaseClientDemo
