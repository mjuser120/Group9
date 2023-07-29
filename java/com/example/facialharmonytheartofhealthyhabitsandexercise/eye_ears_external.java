package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eye_ears_external extends AppCompatActivity {


    private TextView back, txttitle, txtdescript;

    private Button btnpupil, btneyelid, btniris, btnsclera;

    private Button btnantihelix, btnhelix, btnconcha, btntragus, btnantitragus, btnlobule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_ears_external);

        back = findViewById(R.id.external_back);

        txttitle = findViewById(R.id.txt_title);
        txtdescript = findViewById(R.id.txt_description);

        btnpupil = findViewById(R.id.btn_pupil);
        btneyelid = findViewById(R.id.btn_eyelid);
        btniris = findViewById(R.id.btn_iris);
        btnsclera = findViewById(R.id.btn_sclera);

        btnantihelix = findViewById(R.id.btn_antihelix);
        btnhelix = findViewById(R.id.btn_helix);
        btnconcha = findViewById(R.id.btn_concha);
        btntragus = findViewById(R.id.btn_tragus);
        btnantitragus = findViewById(R.id.btn_antitragus);
        btnlobule = findViewById(R.id.btn_lobule);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_external.this, eye_ears_parts.class));
            }
        });


        btnpupil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Pupil");
                txtdescript.setText("The pupil is the black, circular opening at the center of the iris. It appears black because it absorbs most of the light that enters the eye. The main function of the pupil is to control the amount of light that enters the eye. In bright conditions, the pupil constricts (becomes smaller) to reduce the amount of light entering the eye, while in dim conditions, it dilates (becomes larger) to allow more light in.");

            }
        });

        btneyelid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Eyelid");
                txtdescript.setText("The eyelids are movable folds of skin that cover and protect the front surface of the eye. They serve several important functions, including:\n" +
                        "\n" +
                        "Protecting the eye from foreign objects, such as dust or debris.\n" +
                        "Spreading tears across the surface of the eye to keep it lubricated and moist.\n" +
                        "Controlling the amount of light entering the eye by blinking and closing the eyelids.\n" +
                        "Distributing tears over the surface of the eye when we cry or when the eye needs moisture.");
            }
        });

        btniris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Iris");
                txtdescript.setText("The iris is the colored part of the eye that surrounds the pupil. It's made up of a thin, circular muscle that controls the size of the pupil, which regulates the amount of light entering the eye. The color of the iris varies from person to person and can be blue, green, brown, or a combination of these colors.");

            }
        });

        btnsclera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Sclera");
                txtdescript.setText("The sclera is the white, tough outer layer of the eye that covers the majority of its surface. It provides structural support and protection to the eye. The visible portion of the sclera is what we commonly refer to as the \"white of the eye.\" The sclera helps maintain the shape of the eye and houses the muscles that control eye movement.");

            }
        });

        btnantihelix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Antihelix");
                txtdescript.setText("The antihelix is a prominent ridge or fold of cartilage located in the outer part of the ear. It runs parallel to the helix, which is the outer rim or curve of the ear. The antihelix is positioned just inside the helix and extends from the top of the ear (superiorly) to the earlobe (inferiorly).");

            }
        });

        btnhelix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Helix");
                txtdescript.setText("The helix refers to the outer rim or curve of the external ear, specifically the part that wraps around the outer edge of the ear. It is the most visible and prominent feature of the ear's structure.\n" +
                        "\n" +
                        "The helix is composed of cartilage, giving it a flexible yet firm structure. It starts at the top of the ear, known as the superior portion, and extends downward, curving around the ear to meet the earlobe or connect to the antihelix, which is an inner ridge of cartilage.");
            }
        });

        btnconcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Concha");
                txtdescript.setText("The term \"concha\" refers to the concave, shell-like structure found within the external ear. It is specifically used to describe two main regions:\n" + "\n" +
                        "1. Superior Concha: The superior concha, also known as the cymba conchae, is the upper portion of the concave structure within the external ear. It is located above the middle concha and is formed by a curved ridge of cartilage.\n" + "\n" +
                        "2. Inferior Concha: The inferior concha, also known as the concha inferior or nasal concha, is the lower portion of the concave structure within the external ear. ");
            }
        });

        btntragus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Tragus");
                txtdescript.setText("The tragus is a small, cartilaginous projection located on the external part of the ear, specifically on the inner side of the ear opening. It is positioned in front of the ear canal and extends horizontally.\n" +
                        "\n" +
                        "The tragus varies in size and shape among individuals, but it is generally characterized by its firm and protruding structure. It is named after its resemblance to a goat's beard, as \"tragos\" means \"goat\" in Greek.");
            }
        });

        btnantitragus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Antitragus");
                txtdescript.setText("The antitragus is a small, cartilaginous prominence located opposite the tragus on the external part of the ear. It is positioned on the inner side of the ear opening, below the tragus, and is often described as a small bump or ridge.\n" +
                        "\n" +
                        "The antitragus is less prominent and more variable in size compared to the tragus. It is named as the \"anti-\" counterpart to the tragus, indicating its position on the opposite side.");
            }
        });

        btnlobule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Lobule");
                txtdescript.setText("The lobule, also known as the earlobe, is the soft, fleshy lower part of the external ear that hangs down below the helix and antihelix. It is composed mainly of connective tissue and fat, lacking the cartilage found in other parts of the ear.\n" +
                        "\n" +
                        "The lobule is often one of the most noticeable and distinct features of the ear. It varies in size, shape, and texture among individuals, and it can be attached or unattached to the side of the head. Attached lobules are connected to the cheek or face, while unattached lobules are free-hanging.");
            }
        });

    }
}