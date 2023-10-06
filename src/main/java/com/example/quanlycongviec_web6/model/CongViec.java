package com.example.quanlycongviec_web6.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "congviec")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class CongViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ma, tenCongViec, tieuDe, moTa, doUuTien;
    private LocalDate thoiHanDuKien, ngayTao;
    private Integer trangThai;
}
