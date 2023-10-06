package com.example.quanlycongviec_web6.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "congviec")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class CTLoaiCongViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
