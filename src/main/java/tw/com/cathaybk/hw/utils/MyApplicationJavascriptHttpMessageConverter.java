package tw.com.cathaybk.hw.utils;

import org.json.JSONObject;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class MyApplicationJavascriptHttpMessageConverter extends AbstractJackson2HttpMessageConverter {
        /**
         * restTemplate獲得的響應的content-type滿足下面的條件
         * 纔會被該HttpMessageConverter處理
         */
        public MyApplicationJavascriptHttpMessageConverter() {
            // application/javascript
            super(Jackson2ObjectMapperBuilder.json().build(),new MediaType("application", "javascript"));
        }

//        /**
//         * 檢查傳入的字節碼是否符合要求
//         *
//         * @param clazz
//         * @return 返回true纔會執行readInternal()
//         */
//        @Override
//        protected boolean supports(Class clazz) {
//            return true;
//        }
//
//        /**
//         * 將restTemplate獲得的響應轉化成clazz對應的類型
//         *
//         * @param clazz
//         * @param inputMessage restTemplate獲得的響應
//         * @return
//         */
//        @Override
//        protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws HttpMessageNotReadableException, IOException {
//            //restTemplate發送請求後獲得的響應
//            InputStream body = inputMessage.getBody();
//
//            //將響應轉成對應類型
//            // 就是restTemplate.getForObject(url, Map.class)的返回值
//            return JSON.parseObject(body, clazz);
//
//        }
//
//        /**
//         * 還不知道該方法的功能
//         * 該方法也不會被執行到
//         *
//         * @param o
//         * @param outputMessage
//         * @throws IOException
//         * @throws HttpMessageNotWritableException
//         */
//        @Override
//        protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
//            //do nothing
//            System.out.println("do nothing");
//        }

}
