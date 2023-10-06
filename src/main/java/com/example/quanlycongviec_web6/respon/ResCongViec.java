package com.example.quanlycongviec_web6.respon;

import com.example.quanlycongviec_web6.model.CongViec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResCongViec extends JpaRepository<CongViec, Integer> {

}
