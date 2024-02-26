package com.example.utsayumi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class ProfilMahasiswa extends AppCompatActivity {
    Spinner statusSpinner;
    Button button;
    EditText studentIDEditText, nameEditText, jurusanEditText, tahunEditText, kampusEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_mahasiswa);

        statusSpinner = findViewById(R.id.statusSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.status_mahasiswa,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statusSpinner.setAdapter(adapter);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentIDEditText = findViewById(R.id.studentID);
                nameEditText = findViewById(R.id.name);
                jurusanEditText = findViewById(R.id.jurusan);
                tahunEditText = findViewById(R.id.tahun);
                kampusEditText = findViewById(R.id.kampus);

                String status = statusSpinner.getSelectedItem().toString();

                String message = "Student ID: " + studentIDEditText.getText() + "\n" +
                        "Nama: " + nameEditText.getText() + "\n" +
                        "Jurusan: " + jurusanEditText.getText() + "\n" +
                        "Tahun Masuk: " + tahunEditText.getText() + "\n" +
                        "Status Mahasiswa: " + status + "\n" +
                        "Kampus: " + kampusEditText.getText();

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}