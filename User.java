package Test;

public class User {
    String firstName;
    String secondName;
    String fatherName;
    String email;
    String phoneNumber;
    String nickName;
    String password;

    User () {

    }

    User (String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    User (String firstName, String secondName, String fatherName,
    String email, String phoneNumber, String nickName, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nickName = nickName;
        this.password = password;
    }

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setSecondName (String secondName) {this.secondName = secondName;}
    public void setFatherName (String fatherName) {this.fatherName = fatherName;}
    public void setEmail (String email) {this.email = email;}
    public void setPhoneNumber (String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setNickName (String nickName) {this.nickName = nickName;}
    public void setPassword (String password) {this.password = password;}

    public void changeFirstName (String firstName) {this.firstName = firstName;}
    public void changeSecondName (String secondName) {this.secondName = secondName;}
    public void changeFatherName (String fatherName) {this.fatherName = fatherName;}
    public void changeEmail (String email) {this.email = email;}
    public void changePhoneNumber (String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void changeNickName (String nickName) {this.nickName = nickName;}
    public void changePassword (String password) {this.password = password;}

    public void deleteFirstName () {this.firstName = "";}
    public void deleteSecondName () {this.secondName = "";}
    public void deleteFatherName () {this.fatherName = "";}
    public void deleteEmail () {this.email = "";}
    public void deletePhoneNumber () {this.phoneNumber = "";}
    //public void deleteNickName () {this.nickName = "guest";}
    //public void deletePassword () {this.password = "qwerty";}




}
