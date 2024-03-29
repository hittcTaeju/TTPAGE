package TAEJU.TTPAGE.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;



@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private String content;
    private LocalDateTime createDate;

    //@OneToMany(mappedBy = "member,", cascade = CascadeType.REMOVE)
    //private List<Member> memberList;


}
