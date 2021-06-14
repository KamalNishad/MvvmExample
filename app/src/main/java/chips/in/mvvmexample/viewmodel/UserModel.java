package chips.in.mvvmexample.viewmodel;

import androidx.databinding.BaseObservable;

import chips.in.mvvmexample.R;
import chips.in.mvvmexample.model.User;

public class UserModel extends BaseObservable {

    private String email;
    private String passwod;
    private String emailhint;
    private String passwordhint;


    public UserModel(User user) {

        this.emailhint = user.emailhint;
        this.passwordhint = user.passwordhint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.et_uid);
    }

    public String getPasswod() {
        return passwod;
    }

    public void setPasswod(String passwod) {
        this.passwod = passwod;
        notifyPropertyChanged(R.id.et_pass);
    }

    public String getEmailhint() {
        return emailhint;
    }

    public void setEmailhint(String emailhint) {
        this.emailhint = emailhint;
    }

    public String getPasswordhint() {
        return passwordhint;
    }

    public void setPasswordhint(String passwordhint) {
        this.passwordhint = passwordhint;
    }
}
