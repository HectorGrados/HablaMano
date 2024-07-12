package com.google.mediapipe.examples.gesturerecognizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Registro extends AppCompatActivity {
    EditText nombresEditText,emailEditText,contrasenaEditText;
    Button btnRegistrar;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        nombresEditText=(EditText) findViewById(R.id.nombres);
        emailEditText=(EditText) findViewById(R.id.email);
        contrasenaEditText=(EditText) findViewById(R.id.contrasena);
        btnRegistrar=(Button) findViewById(R.id.registroButton);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutarServicio("http://192.168.100.159/t2_app/insertar_usuario.php");

            }
        });
    }
    public void login(View view) {
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }
    private void ejecutarServicio(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Toast.makeText(getApplicationContext(), "OPERACION EXITOSA", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros= new HashMap<String, String>();
                parametros.put("nombres",nombresEditText.getText().toString());
                parametros.put("email",emailEditText.getText().toString());
                parametros.put("contrasena",contrasenaEditText.getText().toString());
                return parametros;

            }
        };
        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
