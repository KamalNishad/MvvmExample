package chips.in.mvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import chips.in.mvvmexample.commands.UserLogin;
import chips.in.mvvmexample.databinding.ActivityMainBinding;
import chips.in.mvvmexample.model.User;
import chips.in.mvvmexample.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        init();
    }

    private void init(){
        UserModel userModel = new UserModel(new User("Email","Password"));
        mBinding.setLogin(userModel);

        mBinding.setUserloginevent(new UserLogin() {
            @Override
            public void OnLoginClick() {
                Toast.makeText(MainActivity.this, ""+mBinding.getLogin().getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}