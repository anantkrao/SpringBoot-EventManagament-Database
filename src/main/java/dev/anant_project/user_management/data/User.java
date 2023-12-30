package dev.anant_project.user_management.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;@Document(collection = "user")
public class User {    @Id
private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String age;
    private String contact_number;
    private String Social_media;
    private String website;
    public User(String id, String firstName, String lastName, String address, String age,String contact_number,String Social_media,String website) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.contact_number = contact_number;
        this.Social_media= Social_media;
        this.website=website;

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getContact_number(){
        return contact_number;
    }
    public void setContact_number(String contact_number){
        this.contact_number=contact_number;
    }
    public String getSocial_media(){
        return Social_media;
    }
    public void setSocial_media(String Social_media){
        this.Social_media=Social_media;
    }
    public String getWebsite(){
        return website;
    }
    public void setWebsite(String website){
        this.website=website;
    }
}