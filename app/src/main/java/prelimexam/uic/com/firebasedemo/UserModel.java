package prelimexam.uic.com.firebasedemo;

/**
 * Created by 3rdyearaccount on 26/01/2018.
 */

public class UserModel {

    public UserModel(String userid, String username, String avatar) {
        this.userid = userid;
        this.username = username;
        this.avatar = avatar;
    }

    public UserModel() {
        this.userid = "";
        this.username = "";
        this.avatar = "";
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private String userid;
    private String username;
    private  String avatar;



}
