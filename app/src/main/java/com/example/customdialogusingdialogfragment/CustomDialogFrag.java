package com.example.customdialogusingdialogfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomDialogFrag extends DialogFragment {

    EditText email;
    EditText pass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.dialog_login,container);
        email=view.findViewById(R.id.editTxt1);
        pass=view.findViewById(R.id.editTxt2);
        Button login=view.findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!email.getText().toString().isEmpty()&& !pass.getText().toString().isEmpty())
                {
                    Toast.makeText(getContext(),"Login Successful",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getContext(),"Plz fill empty fields",Toast.LENGTH_SHORT).show();
                }
            }
        });


       return view;
    }
}
