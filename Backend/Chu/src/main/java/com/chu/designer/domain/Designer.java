package com.chu.designer.domain;

import com.chu.global.domain.ImagePath;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@ToString
//@NoArgsConstructor(access = AccessLevel.PROTECTED) //@NoArgsConstructor AccessLevel.PROTECTED: 기본 생성자 막고 싶은데, JPA 스팩상 PROTECTED로 열어두어야 함
public class Designer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;

    private String id;

    private String name;

    private String pwd;

    private String email;

    private Character gender;

    private String introduction;

    private String certificationNum;

    private String address;

    private Double latitude;

    private Double longitude;

    private String salonName;

    @Embedded
    private ImagePath imagePath;

    private float reviewScore;

    private Integer cost;

    private LocalDateTime createdDate;

}
