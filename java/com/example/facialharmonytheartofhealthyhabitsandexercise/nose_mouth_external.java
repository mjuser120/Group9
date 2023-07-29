package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nose_mouth_external extends MainActivity {

    private TextView back, txttitle, txtdescript;

    private Button btnnasion, btnrhinion, btnsupratip, btntip, btnlobule;

    private Button btnphiltrum, btnridges, btnbow, btnoral, btnborder, btnsulcus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose_mouth_external);

        back = findViewById(R.id.external_back);

        txttitle = findViewById(R.id.txt_title);
        txtdescript = findViewById(R.id.txt_description);

        btnnasion = findViewById(R.id.btn_nasion);
        btnrhinion = findViewById(R.id.btn_rhinion);
        btnsupratip = findViewById(R.id.btn_supratip);
        btntip = findViewById(R.id.btn_tip);
        btnlobule = findViewById(R.id.btn_lobule);

        btnphiltrum = findViewById(R.id.btn_philtrum);
        btnridges = findViewById(R.id.btn_ridges);
        btnbow = findViewById(R.id.btn_bow);
        btnoral = findViewById(R.id.btn_oral);
        btnborder = findViewById(R.id.btn_border);
        btnsulcus = findViewById(R.id.btn_sulcus);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nose_mouth_external.this, nose_mouth_parts.class));
            }
        });

        btnnasion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Nasion");
                txtdescript.setText("The term \"nasion\" refers to a specific anatomical landmark on the human skull that is associated with the nose. It is a point located at the intersection of the frontal bone (forehead) and the nasal bones, which form the bridge of the nose.\n" +
                        "\n" +
                        "More specifically, the nasion is the midpoint at the junction of the frontonasal suture and the internasal suture. The frontonasal suture is the line where the frontal bone fuses with the nasal bones, while the internasal suture is the line where the two nasal bones meet in the midline.");
            }
        });

        btnrhinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Rhinion (Keystone)");
                txtdescript.setText("The rhinion, also known as the keystone, is an anatomical term used to describe a specific landmark on the human skull associated with the nasal region. It refers to the point at which the nasal bones and the frontal bone meet in the midline of the face.\n" +
                        "\n" +
                        "The term \"keystone\" is used because the rhinion plays a central role in the overall structure and appearance of the nose. It is located at the highest point of the nasal bridge, just above the level of the nasal tip. The rhinion forms part of the nasofrontal angle, which is the angle created by the intersection of the nasal bridge and the forehead.");
            }
        });

        btnsupratip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Supratip");
                txtdescript.setText("The dorsal septum, anterior septal angle, parallel cephalic border of the lateral crura of the lower lateral cartilage, and the distal sections of the upper lateral cartilage make up the supratip region.");
            }
        });

        btntip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Tip");
                txtdescript.setText("the point where the columella and inferior nasal ridge margins converge. It is often the portion of the nose that protrudes the most from the face's plane. Other portions of the ridge may be farther away from the face plane in exceptional cases, such as those with nasal profiles that are noticeably prominent and convex.");
            }
        });

        btnlobule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Infra-tip Lobule");
                txtdescript.setText("between the most anterior tip-defining point and the top of the columella, the lobule (midline tip of the nose).");
            }
        });

        btnphiltrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Philtrum");
                txtdescript.setText("The philtrum is the vertical groove or indentation that runs from the base of the nose to the upper lip. It is the area of the midline of the face between the nose and the upper lip, and it is more prominent in some individuals than in others.\n" +
                        "\n" +
                        "The philtrum is formed during fetal development when the tissues of the face fuse together. It is a natural anatomical feature and varies in depth and length among individuals. The width and shape of the philtrum can also differ, contributing to the uniqueness of each person's facial appearance.");
            }
        });

        btnridges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Philtrum Ridges");
                txtdescript.setText("The philtrum is a vertical groove in the midline of the top lip that is surrounded by two lateral ridges or pillars (Greek: philtron = love potion; the ancient Greeks thought the philtrum to be one of the most erogenous places on the human body).");
            }
        });

        btnbow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Cupid's bow");
                txtdescript.setText("Cupid's bow refers to the distinct double-curved shape of the upper lip, particularly in the central portion. It is named after Cupid, the Roman god of love, as the shape of the upper lip resembles the bow of Cupid's arrow.\n" +
                        "\n" +
                        "The Cupid's bow is characterized by two prominent peaks or ridges in the center of the upper lip, creating a bow-like appearance. These peaks are often more pronounced and defined in some individuals compared to others. The outer edges of the upper lip then curve downward towards the corners of the mouth.");
            }
        });

        btnoral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Oral Commissures");
                txtdescript.setText("The oral commissures, also known as the labial commissures or angles of the mouth, refer to the corners or junctions where the upper and lower lips meet. They are the outermost edges of the mouth.\n" +
                        "\n" +
                        "The oral commissures play an important role in facial expressions, such as smiling, frowning, and other movements of the lips. They are involved in conveying emotions and can significantly affect the appearance of the mouth and overall facial expression.");
            }
        });

        btnborder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Vermilion Border");
                txtdescript.setText("The vermillion border, also known as the vermilion border of the lip or simply the lip border, refers to the distinct demarcation line between the colored portion of the lips (vermilion) and the adjacent skin. It is the edge where the red or pink tissue of the lips meets the surrounding skin.\n" +
                        "\n" +
                        "The vermilion border is highly visible and defines the outline of the lips. It is responsible for the sharp transition between the lip tissue and the surrounding facial skin. The color and texture of the vermilion border differ from the adjacent skin, as it contains more blood vessels and lacks hair follicles and sweat glands.");
            }
        });

        btnsulcus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitle.setText("Mentolabial Sulcus");
                txtdescript.setText("The mentolabial sulcus, also known as the labiomental sulcus or the mental crease, is a natural groove or depression that extends horizontally across the lower face. It is located between the lower lip (labium) and the chin (mentum).\n" +
                        "\n" +
                        "The mentolabial sulcus is a distinct anatomical feature that varies in depth and prominence among individuals. It is formed by the underlying structures of the lower face, including the mentalis muscle, which is responsible for controlling the movement of the lower lip and the chin.");
            }
        });

    }
}