package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nose_mouth_internal extends MainActivity {

    private TextView back, txttitle, txtdescript;

    private Button btnnaris, btnnasop,btnchoncha, btnmiddle, btnnasal;

    private Button btninter_naris, btnsinus, btnfrontal;

    private  Button btntongue, btnuvula, btnsoft, btnincisors, btncanine;

    private Button btnbicuspids, btnmolars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose_mouth_internal);

        back = findViewById(R.id.internal_back);

        txttitle = findViewById(R.id.txt_title);
        txtdescript = findViewById(R.id.txt_description);

        btnnaris = findViewById(R.id.btn_naris);
        btnnasop = findViewById(R.id.btn_nasopharynx);
        btnchoncha = findViewById(R.id.btn_choncha);
        btnmiddle = findViewById(R.id.btn_middle);
        btnnasal = findViewById(R.id.btn_nasal);
        btninter_naris = findViewById(R.id.btn_inter_naris);
        btnsinus = findViewById(R.id.btn_sinus);
        btnfrontal = findViewById(R.id.btn_frontal);

        btntongue = findViewById(R.id.btn_tongue);
        btnuvula = findViewById(R.id.btn_uvula);
        btnsoft = findViewById(R.id.btn_soft);
        btnincisors = findViewById(R.id.btn_incisors);
        btncanine = findViewById(R.id.btn_canine);
        btnbicuspids = findViewById(R.id.btn_bicuspids);
        btnmolars = findViewById(R.id.btn_molars);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nose_mouth_internal.this, nose_mouth_parts.class));
            }
        });

        btnnaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("External Naris");
                txtdescript.setText("The external naris, also known as the nostril or nasal opening, is the visible and external part of the nasal passage. It is the opening through which air enters and exits the nasal cavity.\n" +
                        "\n" +
                        "In humans, each nostril is located on either side of the nose, and they are responsible for facilitating the flow of air during breathing. The external nares are typically oval-shaped and are lined with fine hairs and mucus membranes that help filter, warm, and humidify the inhaled air.");
            }
        });

        btnnasop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Nasopharynx");
                txtdescript.setText("The nasopharynx is a region of the pharynx, which is the upper part of the throat located behind the nose and mouth. Specifically, the nasopharynx is the uppermost section of the pharynx that extends from the posterior part of the nasal cavity to the level of the soft palate.");
            }
        });

        btnchoncha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Inferior nasal Choncha");
                txtdescript.setText("It is a scroll-shaped, paired bone called the inferior nasal concha lies at the lateral nasal cavity wall. It assists in humidifying and filtering the air we breathe.");
            }
        });

        btnmiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Middle nasal Choncha");
                txtdescript.setText("The medial surface of the labyrinth of the ethmoid, a narrow basal lamella that descends from the underside of the cribriform plate and terminates in a free, convoluted edge, makes up the middle nasal concha.");
            }
        });

        btnnasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Nasal Choncha");
                txtdescript.setText("The nasal concha, also known as the nasal turbinates or nasal turbinated bones, are three shelf-like structures found inside the nasal cavity. They are named the inferior nasal concha, middle nasal concha, and superior nasal concha.\n" +
                        "\n" +
                        "The nasal conchae are bony structures covered by a mucous membrane and are located on the lateral walls of the nasal cavity. They project inward, dividing the nasal cavity into passageways called the nasal meatuses.");
            }
        });

        btninter_naris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Internal Naris");
                txtdescript.setText("The nostrils or external nares are the two holes via which air enters the nasal cavity from the outside. The internal nares are openings from the nasal cavity into the throat.");
            }
        });

        btnsinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Sphenoid Sinus");
                txtdescript.setText("The sphenoid sinus is one of the paired paranasal sinuses located within the sphenoid bone, which is a bone situated at the base of the skull. It is one of the four main types of paranasal sinuses found in the human skull.\n" +
                        "\n" +
                        "The sphenoid sinus is positioned deep within the skull, behind the eyes and above the nasopharynx. It is a cavity lined with a mucous membrane and is usually small and irregularly shaped. The size and shape of the sphenoid sinus can vary among individuals.");
            }
        });

        btnfrontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Frontal Sinus");
                txtdescript.setText("The frontal sinus is one of the paired paranasal sinuses located within the frontal bone, which forms the forehead region of the skull. It is one of the four main types of paranasal sinuses found in the human skull.\n" +
                        "\n" +
                        "The frontal sinuses are situated above the eyes, within the frontal bone, and are lined with a mucous membrane. They are typically present as two separate sinuses, with each one located behind the forehead area.");
            }
        });

        btntongue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Tongue");
                txtdescript.setText("It is a muscle-filled organ made up of a sophisticated combination of intrinsic and extrinsic muscles. The extrinsic muscles are in charge of moving the tongue in various directions, whereas the intrinsic muscles typically affect the form of the tongue.");
            }
        });

        btnuvula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Uvula");
                txtdescript.setText("The uvula is a small, fleshy, bell-shaped structure located at the back of the mouth, hanging from the middle of the soft palate. It is a part of the oral cavity and is visible when you open your mouth wide and look into a mirror.");
            }
        });

        btnsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Soft Palate");
                txtdescript.setText("The soft palate, also known as the velum, is the flexible, muscular portion of the palate located at the back of the mouth. It is a movable structure that extends from the hard palate (the bony front part of the roof of the mouth) to the uvula (the small, pendulous structure hanging from the middle of the soft palate).");
            }
        });

        btnincisors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Incisors");
                txtdescript.setText("Incisors are a type of teeth found in humans and many other mammals. They are located at the front of the mouth and are responsible for biting and cutting food. Incisors are typically the first teeth to erupt in the oral cavity, usually during early childhood.\n" +
                        "\n" +
                        "In humans, there are eight incisors in total, with four in the upper jaw (maxillary incisors) and four in the lower jaw (mandibular incisors). They are divided into two central incisors and two lateral incisors on each side of the mouth.");
            }
        });

        btncanine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Canine");
                txtdescript.setText("In anatomy, the term \"canine\" refers to a specific type of tooth that is found in the permanent dentition of humans and many other mammals. Canine teeth, also known as cuspids or eyeteeth, are located on each side of the incisors and typically have a more pointed and longer shape compared to other teeth.");
            }
        });

        btnbicuspids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Bicuspids");
                txtdescript.setText("In dentistry, bicuspids, also known as premolars, are a type of tooth found in the permanent dentition of humans and many other mammals. They are located between the canines and molars in the dental arches.");
            }
        });

        btnmolars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Molars");
                txtdescript.setText("It is a type of tooth found in the permanent dentition of humans and many other mammals. They are located in the posterior (back) region of the dental arches, behind the premolars (bicuspids). Molars are larger and broader in shape compared to other teeth, and they have a flat biting surface with multiple cusps.");
            }
        });
    }
}