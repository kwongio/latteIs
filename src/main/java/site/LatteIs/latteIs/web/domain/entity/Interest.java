package site.LatteIs.latteIs.web.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Interest implements Serializable {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sex;
    private String birthday;
    private int age;
    private String university;
    private String religion;
    private String amount_of_alcohol;
    private String smoking;
    private String characteristic;
    private String hobby;
    private String friend_style;
    private String mbti;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
