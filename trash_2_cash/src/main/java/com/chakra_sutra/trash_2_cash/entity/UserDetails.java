package com.chakra_sutra.trash_2_cash.entity;



import javax.persistence.*;

@Entity
@Table(name = "user_information")
public class UserDetails {


    @Column(name = "name",length = 100)
    private String name;

    @Column(name = "email",length = 100)
    private String email;

    @Id
    @Column(name = "telephone")
    private int telephone;

    @Column(name = "image_link")
    private String imageLink;



    public UserDetails() {
    }

    public UserDetails(String name, String email, int telephone, String imageLink) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.imageLink = imageLink;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
