# base64
CREATE TEMPORARY FUNCTION decodebase64 AS 'com.sdo.hive.udf.DecodeBase64'


base64.jar  loc:  /opt/cloudera/parcels/CDH/lib/spark/userlib/
/etc/spark/conf/spark-defaults.conf 
spark.executor.extraClassPath=/opt/cloudera/parcels/CDH/lib/spark/userlib/*
spark.driver.extraClassPath=/opt/cloudera/parcels/CDH/lib/spark/userlib/*
