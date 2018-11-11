package my.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "baihoc")
public class BaiHoc  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idbaihoc;
    private String namebaihoc;
    private String image;
    private String noidung;
    private Timestamp createday;

    @ManyToOne
    @JoinColumn(name = "idchuong")
    private  Chuong chuong;

    @OneToMany(mappedBy = "baiHoc")
    private List<TestBaiHoc> listTestBaiHoc;

    @OneToMany(mappedBy = "baiHoc")
    private List<Comment> listComment;
    public BaiHoc() {
    }

    public BaiHoc(Integer idbaihoc, String namebaihoc, String image, String noidung, Timestamp createday, Chuong chuong) {
        this.idbaihoc = idbaihoc;
        this.namebaihoc = namebaihoc;
        this.image = image;
        this.noidung = noidung;
        this.createday = createday;
        this.chuong = chuong;
    }

    public List<Comment> getListComment() {
        return listComment;
    }

    public void setListComment(List<Comment> listComment) {
        this.listComment = listComment;
    }

    public List<TestBaiHoc> getListTestBaiHoc() {
        return listTestBaiHoc;
    }

    public void setListTestBaiHoc(List<TestBaiHoc> listTestBaiHoc) {
        this.listTestBaiHoc = listTestBaiHoc;
    }

    public Integer getIdbaihoc() {
        return idbaihoc;
    }

    public void setIdbaihoc(Integer idbaihoc) {
        this.idbaihoc = idbaihoc;
    }

    public String getNamebaihoc() {
        return namebaihoc;
    }

    public void setNamebaihoc(String namebaihoc) {
        this.namebaihoc = namebaihoc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public Timestamp getCreateday() {
        return createday;
    }

    public void setCreateday(Timestamp createday) {
        this.createday = createday;
    }

    public Chuong getChuong() {
        return chuong;
    }

    public void setChuong(Chuong chuong) {
        this.chuong = chuong;
    }
}
