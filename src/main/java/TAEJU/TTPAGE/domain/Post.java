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
    private LocalDateTime createdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateDate() {
        return createdate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createdate = createDate;
    }
//@OneToMany(mappedBy = "member,", cascade = CascadeType.REMOVE)
    //private List<Member> memberList;


}
