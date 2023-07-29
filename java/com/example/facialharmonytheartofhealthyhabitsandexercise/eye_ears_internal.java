package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eye_ears_internal extends MainActivity {

    private TextView back, txttitlein, txtdescriptin;

    private Button btnchoroid, btnvitreous, btnciliary, btnlens, btnpupli;

    private Button btncornea, btnanterior_chamber, btnsclera, btnoptic_disc;

    private Button btnoptic_nerve, btnmacula, btnretina;

    private  Button btncanal, btnmembrance, btncavity, btntube, btncochlear;

    private Button btnvestibular, btnchoclea, btncanals, btnmalleus, btnincus;

    private Button btnstapes, btnmuscle, btnbone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_ears_internal);

        back = findViewById(R.id.inter_back);

        txttitlein = findViewById(R.id.txtin_title);
        txtdescriptin = findViewById(R.id.txtin_description);

        btnchoroid = findViewById(R.id.btn_choroid);
        btnvitreous = findViewById(R.id.btn_vitreous);
        btnciliary = findViewById(R.id.btn_ciliary);
        btnlens = findViewById(R.id.btn_lens);
        btnpupli = findViewById(R.id.btn_pupli);
        btncornea = findViewById(R.id.btn_cornea);
        btnanterior_chamber = findViewById(R.id.btn_anterior_chamber);
        btnsclera = findViewById(R.id.btn_sclera);
        btnoptic_disc = findViewById(R.id.btn_optic_disc);
        btnoptic_nerve = findViewById(R.id.btn_optic_nerve);
        btnmacula = findViewById(R.id.btn_macula);
        btnretina = findViewById(R.id.btn_retina);

        btncanal = findViewById(R.id.btn_canal);
        btnmembrance = findViewById(R.id.btn_membrance);
        btncavity = findViewById(R.id.btn_cavity);
        btntube = findViewById(R.id.btn_tube);
        btncochlear = findViewById(R.id.btn_cochlear);
        btnvestibular = findViewById(R.id.btn_vestibular);
        btnchoclea = findViewById(R.id.btn_chcolea);
        btncanals = findViewById(R.id.btn_canals);
        btnmalleus = findViewById(R.id.btn_malleus);
        btnincus = findViewById(R.id.btn_incus);
        btnstapes = findViewById(R.id.btn_stapes);
        btnmuscle = findViewById(R.id.btn_muscle);
        btnbone = findViewById(R.id.btn_bone);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_internal.this, eye_ears_parts.class));
            }
        });

        btnchoroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Choroid");
                txtdescriptin.setText("It is a layer of tissue under the retina filled with blood vessels. This important blood vessel layer provides oxygen and nutrition to the retina. It also evacuates waste materials from the outer retina and acts as a heat sump, keeping the retina from overheating.");

            }
        });

        btnvitreous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Vitreous");
                txtdescriptin.setText("It is a clear gel that fills most of the eye. There are no blood vessels and very few cells in the vitreous. The clarity of the vitreous is important in order to allow light to pass from the lens to reach the retina. The vitreous is mainly composed of water, but there are fine protein fibers and a gel (hyaluronin) providing a unique structure. ");

            }
        });

        btnciliary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Ciliary Body");
                txtdescriptin.setText("The ciliary body has two functions inside the eye. It contains muscles to focus the lens (the ciliary muscles are attached to the lens by fine fibers called zonules). The ciliary body also has a pump that produces aqueous (water). ");

            }
        });

        btnlens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Lens");
                txtdescriptin.setText("The lens inside the eye is made of specialized crystalline protein fibers that help to focus light and allow for flexibility of the lens in order to focus light from different distances from the eye. With age the eye loses its ability to focus light; therefore, reading glasses are needed by most people around the age of 40 years.");

            }
        });

        btnpupli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Iris and Pupli");
                txtdescriptin.setText("The iris is responsible for the color of the eye as seen from the outside. A circular opening in the iris is called the pupil, which is seen as a black spot in the center of the iris.  Iris muscles expand and contract to change the size of the pupil and alters the amount of light entering the eye. In bright light, the pupil constricts so as to prevent too much light from entering the eye.");

            }
        });

        btncornea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Cornea");
                txtdescriptin.setText("The cornea is the clear window at the front of the eyeball that allows light to enter the eye. It is continuous with the sclera. Most of the focusing of light happens at the corneal surface/tear film. As this outer layer of the eye is so critical for sight, there are many nerve endings in the cornea making it the most sensitive part of the eye to touch.");

            }
        });

        btnanterior_chamber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Anterior Chamber");
                txtdescriptin.setText("The anterior chamber is bounded anteriorly by the cornea and posteriorly by the iris and the front surface of the lens. It is divided into two portions: the anterior chamber angle, which is the area between the iris and the cornea, and the central part, which is the space between the iris and the lens.");

            }
        });

        btnsclera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Sclera");
                txtdescriptin.setText("The sclera is the tough outer coat of the eye. It provides structural support and protection of the sensitive tissues (like the retina) inside the eye. The sclera does allow for the outflow of water that is produced by the ciliary body.");

            }
        });

        btnoptic_disc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Optic Disc");
                txtdescriptin.setText("The optic disc, also known as the optic nerve head, is a specialized region located at the back of the eye where the optic nerve enters the eyeball. It is a circular area that appears as a pale or whitish spot on the retina, which is the light-sensitive tissue lining the inner surface of the eye.");

            }
        });

        btnoptic_nerve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Optic Nerve");
                txtdescriptin.setText("The optic nerve connects the nerve tissue of the retina to the nerve tissue in the brain, like wire in an electric circuit. The optic nerve is sensitive to the pressure inside the eye.  High intra-ocular pressure may cause loss of vision or blindness from glaucoma. The optic nerve may also be affected by blocked blood flow, inflammation, and pressure from outside the eye (tumors and aneurysms).");
            }
        });

        btnmacula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Macula");
                txtdescriptin.setText("The optic nerve connects the nerve tissue of the retina to the nerve tissue in the brain, like wire in an electric circuit. The optic nerve is sensitive to the pressure inside the eye.  High intra-ocular pressure may cause loss of vision or blindness from glaucoma. The optic nerve may also be affected by blocked blood flow, inflammation, and pressure from outside the eye (tumors and aneurysms).");
            }
        });

        btnretina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("The Retina");
                txtdescriptin.setText("The retina is a light-sensitive layer of nerve tissue that lines the inside of the eye wall. It acts like the film in a camera.  The central portion of the retina is called the macula. The macula is designed for central vision.  When you read or see fine details, you move your eye so that light focuses on the macula.");
            }
        });

        btncanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Ear Canal");
                txtdescriptin.setText("The ear canal, also known as the external auditory canal or external auditory meatus, is a tubular structure that connects the outer ear to the middle ear. It is a passageway that leads from the visible part of the ear (pinna) to the eardrum (tympanic membrane).\n" +
                        "\n" +
                        "The ear canal starts at the opening of the ear, called the ear aperture or external auditory meatus, and extends inward for approximately 2-3 centimeters in adults. It is lined with skin and contains small hair follicles and glands that produce cerumen, commonly known as earwax.");
            }
        });

        btnmembrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Tympanic Membrance");
                txtdescriptin.setText("The tympanic membrane, also known as the eardrum, is a thin, semitransparent membrane that separates the outer ear from the middle ear. It is located at the end of the ear canal and forms the boundary between the external and middle ear.\n" +
                        "\n" +
                        "The tympanic membrane is composed of three layers: an outer layer of skin, a middle layer of fibrous tissue, and an inner layer of mucous membrane. It has a slightly concave shape and is about 0.1 millimeters thick.");
            }
        });

        btncavity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Tympanic Cavity");
                txtdescriptin.setText("The tympanic cavity, also known as the middle ear, is an air-filled space located within the temporal bone of the skull. It is situated between the outer ear (consisting of the ear canal and the tympanic membrane or eardrum) and the inner ear (which includes the cochlea and vestibular apparatus).\n" +
                        "\n" +
                        "The tympanic cavity is lined with a mucous membrane and is connected to the nasopharynx (the upper part of the throat) through the Eustachian tube. It is divided into several interconnected regions, including the tympanic membrane (eardrum), the ossicles (small bones), and various openings.");
            }
        });

        btntube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Eustachian Tube");
                txtdescriptin.setText("The Eustachian tube, also known as the auditory tube or pharyngotympanic tube, is a narrow and tubular structure that connects the middle ear to the back of the throat (nasopharynx). Each person has two Eustachian tubes, one in each ear.");
            }
        });

        btncochlear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Cochlear Nerve");
                txtdescriptin.setText("The cochlear nerve, also known as the auditory nerve or the eighth cranial nerve, is a paired nerve that transmits auditory information from the cochlea of the inner ear to the brain. It is one of the two branches of the vestibulocochlear nerve, the other being the vestibular nerve responsible for balance and spatial orientation.\n" +
                        "\n" +
                        "The cochlear nerve is responsible for carrying sound signals from the sensory hair cells within the cochlea to the brain for processing and interpretation.");
            }
        });

        btnvestibular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Vestibular Nerve");
                txtdescriptin.setText("The vestibular nerve, also known as the vestibular portion of the vestibulocochlear nerve or the eighth cranial nerve, is one of the two main branches of the vestibulocochlear nerve. The other branch is the cochlear nerve, which is responsible for transmitting auditory information from the cochlea to the brain.");
            }
        });

        btnchoclea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Cochlea");
                txtdescriptin.setText("The cochlea consists of three main sections: the scala vestibuli, the scala media, and the scala tympani. These sections are separated by two membranes, the basilar membrane and the Reissner's membrane, which create two fluid-filled compartments: the scala vestibuli and the scala tympani. The scala media, also known as the cochlear duct, is a third compartment within the cochlea that contains a specialized structure called the organ of Corti.");
            }
        });

        btncanals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Semicircular Canals");
                txtdescriptin.setText("The semicircular canals are three fluid-filled structures located within the inner ear, specifically in the bony labyrinth. They are part of the vestibular system, which is responsible for detecting and maintaining balance, spatial orientation, and coordination of eye movements.");
            }
        });

        btnmalleus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Malleus");
                txtdescriptin.setText("The malleus, commonly known as the hammer, is one of the three small bones (ossicles) located in the middle ear. The other two ossicles are the incus (anvil) and the stapes (stirrup). Collectively, these bones are responsible for transmitting sound vibrations from the tympanic membrane (eardrum) to the inner ear.");
            }
        });

        btnincus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Incus");
                txtdescriptin.setText("The incus, commonly known as the anvil, is one of the three small bones (ossicles) located in the middle ear. The other two ossicles are the malleus (hammer) and the stapes (stirrup). Together, these bones play a crucial role in transmitting sound vibrations from the tympanic membrane (eardrum) to the inner ear.");
            }
        });

        btnstapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Stapes");
                txtdescriptin.setText("The stapes, commonly known as the stirrup, is one of the three small bones (ossicles) located in the middle ear. The other two ossicles are the malleus (hammer) and the incus (anvil). Collectively, these bones are responsible for transmitting sound vibrations from the tympanic membrane (eardrum) to the inner ear.");
            }
        });

        btnmuscle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Muscle");
                txtdescriptin.setText("The primary function of the tensor tympani muscle is to dampen the vibrations of the tympanic membrane (eardrum). When the muscle contracts, it pulls the handle of the malleus inward, which tightens the eardrum and reduces its ability to vibrate. This contraction is known as the \"tympanic reflex\" or \"acoustic reflex.\" The tensor tympani muscle's role in the acoustic reflex is believed to help protect the inner ear from loud or intense sounds by decreasing the transmission of sound energy.");
            }
        });

        btnbone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txttitlein.setText("Temporal Bone");
                txtdescriptin.setText("The temporal bone is a paired bone located on the sides and base of the skull. It is situated near the temples, which is why it is called the \"temporal\" bone. The temporal bone houses several important structures, including the middle and inner ear, as well as the temporomandibular joint (TMJ) that connects the jaw to the skull..");
            }
        });
    }
}