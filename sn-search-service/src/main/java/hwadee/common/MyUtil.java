package hwadee.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class MyUtil {

  public  static String getBasePath(){
        InputStream resourceAsStream = MyUtil.class.getClassLoader().getResourceAsStream("./sn.properties");
        Properties pro=new Properties();
        String basePath="http://www.suining.gov.cn";

            try {
                pro.load(resourceAsStream);

                basePath=pro.getProperty("imgUrl");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return basePath;




  }
}


