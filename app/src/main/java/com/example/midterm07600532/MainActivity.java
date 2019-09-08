package com.example.midterm07600532;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String username1 = "aaa";
    private static final String PASSWORD1 = "111";
    private static final String username2 = "bbb";
    private static final String PASSWORD2 = "222";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginbutton = findViewById(R.id.Login_button);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText uesrnameEditText = findViewById(R.id.username_editText);
                EditText passwordEditText = findViewById(R.id.Password_editText);

                String inputusername = uesrnameEditText.getText().toString();
                String inputpassword = passwordEditText.getText().toString();

                String loginSuccess = getString(R.string.loginSuccess);
                String loginFail = getString(R.string.loginfail);



                Auth auth =new Auth();
                auth.setMusername(inputusername);
                auth.setmPassword(inputpassword);

                boolean result1 = auth.check1();
                //boolean result2 = auth.check2();
                if(result1 == true){
                    if (inputusername.equals(username1)){
                        Toast.makeText(MainActivity.this,loginSuccess, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                        intent.putExtra("User","Ittikorn Worasiri");
                        intent.putExtra("goesto","มหาวิทยาลัยศิลปากร");
                        intent.putExtra("livein","นครปฐม");
                        intent.putExtra("from","นครปฐม");
                        startActivity(intent);//ตัาสั่งเริ่มทำงาน เชื่อมหน้าจอ
                        finish();

                    }else if (inputusername.equals(username2)){
                        Toast.makeText(MainActivity.this,loginSuccess, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                        intent.putExtra("User","Promlert Lovichit");
                        intent.putExtra("goesto","สวนกุหลาบวิทยาลัย");
                        intent.putExtra("livein","กรุงเทพมหานคร");
                        intent.putExtra("from","กรุงเทพมหานคร");
                        startActivity(intent);//ตัาสั่งเริ่มทำงาน เชื่อมหน้าจอ
                        finish();
                    }

                }else if(result1 == false){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.loginfail);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //โค้ดที่มำงาน เมื่อ user กดปุ่ม OK
                            //Todo:
                        }
                    })
                            .show();
                }



            }
        });
    }
}
