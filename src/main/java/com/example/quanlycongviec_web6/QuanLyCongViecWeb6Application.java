package com.example.quanlycongviec_web6;

import com.example.quanlycongviec_web6.respon.ResCongViec;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class QuanLyCongViecWeb6Application {

    public static void main(String[] args) {
        ApplicationContext contect = SpringApplication.run(QuanLyCongViecWeb6Application.class, args);
//        contect.getBean(ResCongViec.class).findAll().forEach(System.out::println);
    }

}
