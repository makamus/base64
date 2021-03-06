package com.sdo.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import com.snda.base64.*;

public class DecodeBase64 extends UDF{
	Text result = new Text();
    public DecodeBase64() {
    }
    
    public Text evaluate(String str){
    	if (str == null || str.equals("")) {
    		return null;
    	}
    	try {
    		byte[] b = str.getBytes();
    		result.set(Base64.decodeBase64(b));
    	} catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    	return result;
    }
}
