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
public class LoaiCongViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenLoaiCongViec;
    private Integer trangThai;
    private LocalDate ngayTao;
}
