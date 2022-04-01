package io.purple.jhipsternoclient.service.dto;

public class RegisterDTO {
    private String name;
    private String birth;
    private String phoneNumberSuffix;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhoneNumberSuffix() {
        return phoneNumberSuffix;
    }

    public void setPhoneNumberSuffix(String phoneNumberSuffix) {
        this.phoneNumberSuffix = phoneNumberSuffix;
    }
}
