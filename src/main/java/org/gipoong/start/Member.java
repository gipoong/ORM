package org.gipoong.start;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private String id;  // 아이디

    @Column(name = "NAME", nullable = false, length = 10)
    private String username; // 이름

    private Integer age; // 나이

    // ==추가==
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

}
