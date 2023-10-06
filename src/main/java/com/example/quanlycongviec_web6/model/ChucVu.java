package com.example.quanlycongviec_web6.model;

import javax.persistence.*;

import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "chuvu")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ma, tenChuVu;
    private Integer trangThai;
    private LocalDate ngayTao;
}
