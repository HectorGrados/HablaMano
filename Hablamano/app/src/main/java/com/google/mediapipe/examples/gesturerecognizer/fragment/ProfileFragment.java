package com.google.mediapipe.examples.gesturerecognizer.fragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import com.google.mediapipe.examples.gesturerecognizer.R;

public class ProfileFragment extends Fragment {
    private ImageView imageViewSignA, imageViewSignB, imageViewSignC, imageViewSignD,
            imageViewSignE, imageViewSignF, imageViewSignG, imageViewSignH, imageViewSignI,
            imageViewSignJ, imageViewSignK, imageViewSignL, imageViewSignM, imageViewSignN,
            imageViewSignO, imageViewSignP, imageViewSignQ, imageViewSignR, imageViewSignS,
            imageViewSignT, imageViewSignU, imageViewSignV, imageViewSignW, imageViewSignX,
            imageViewSignY, imageViewSignZ;
    private TextView textViewLetterA, textViewLetterB, textViewLetterC, textViewLetterD,
            textViewLetterE, textViewLetterF, textViewLetterG, textViewLetterH, textViewLetterI,
            textViewLetterJ, textViewLetterK, textViewLetterL, textViewLetterM, textViewLetterN,
            textViewLetterO, textViewLetterP, textViewLetterQ, textViewLetterR, textViewLetterS,
            textViewLetterT, textViewLetterU, textViewLetterV, textViewLetterW, textViewLetterX,
            textViewLetterY, textViewLetterZ;

    private EditText editTextSearch;
    private Button btnSearch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Referenciar las vistas para la letra A
        imageViewSignA = view.findViewById(R.id.imageViewSignA);
        textViewLetterA = view.findViewById(R.id.textViewLetterA);
        imageViewSignA.setImageResource(R.drawable.a2);
        textViewLetterA.setText("Letra A");
        // Referenciar las vistas para la letra B
        imageViewSignB = view.findViewById(R.id.imageViewSignB);
        textViewLetterB = view.findViewById(R.id.textViewLetterB);
        imageViewSignB.setImageResource(R.drawable.b);
        textViewLetterB.setText("Letra B");
        // Referenciar las vistas para la letra C
        imageViewSignC = view.findViewById(R.id.imageViewSignC);
        textViewLetterC = view.findViewById(R.id.textViewLetterC);
        imageViewSignC.setImageResource(R.drawable.c);
        textViewLetterC.setText("Letra C");
        // Referenciar las vistas para la letra D
        imageViewSignD = view.findViewById(R.id.imageViewSignD);
        textViewLetterD = view.findViewById(R.id.textViewLetterD);
        imageViewSignD.setImageResource(R.drawable.d);
        textViewLetterD.setText("Letra D");
        // Referenciar las vistas para la letra E
        imageViewSignE = view.findViewById(R.id.imageViewSignE);
        textViewLetterE = view.findViewById(R.id.textViewLetterE);
        imageViewSignE.setImageResource(R.drawable.e);
        textViewLetterE.setText("Letra E");
        // Referenciar las vistas para la letra F
        imageViewSignF = view.findViewById(R.id.imageViewSignF);
        textViewLetterF = view.findViewById(R.id.textViewLetterF);
        imageViewSignF.setImageResource(R.drawable.f);
        textViewLetterF.setText("Letra F");
        // Referenciar las vistas para la letra G
        imageViewSignG = view.findViewById(R.id.imageViewSignG);
        textViewLetterG = view.findViewById(R.id.textViewLetterG);
        imageViewSignG.setImageResource(R.drawable.g);
        textViewLetterG.setText("Letra G");
        // Referenciar las vistas para la letra H
        imageViewSignH = view.findViewById(R.id.imageViewSignH);
        textViewLetterH = view.findViewById(R.id.textViewLetterH);
        imageViewSignH.setImageResource(R.drawable.h);
        textViewLetterH.setText("Letra H");
        // Referenciar las vistas para la letra I
        imageViewSignI = view.findViewById(R.id.imageViewSignI);
        textViewLetterI = view.findViewById(R.id.textViewLetterI);
        imageViewSignI.setImageResource(R.drawable.i);
        textViewLetterI.setText("Letra I");
        // Referenciar las vistas para la letra J
        imageViewSignJ = view.findViewById(R.id.imageViewSignJ);
        textViewLetterJ = view.findViewById(R.id.textViewLetterJ);
        imageViewSignJ.setImageResource(R.drawable.j);
        textViewLetterJ.setText("Letra J");
        // Referenciar las vistas para la letra K
        imageViewSignK = view.findViewById(R.id.imageViewSignK);
        textViewLetterK = view.findViewById(R.id.textViewLetterK);
        imageViewSignK.setImageResource(R.drawable.k);
        textViewLetterK.setText("Letra K");
        // Referenciar las vistas para la letra L
        imageViewSignL = view.findViewById(R.id.imageViewSignL);
        textViewLetterL = view.findViewById(R.id.textViewLetterL);
        imageViewSignL.setImageResource(R.drawable.l);
        textViewLetterL.setText("Letra L");
        // Referenciar las vistas para la letra M
        imageViewSignM = view.findViewById(R.id.imageViewSignM);
        textViewLetterM = view.findViewById(R.id.textViewLetterM);
        imageViewSignM.setImageResource(R.drawable.m);
        textViewLetterM.setText("Letra M");
        // Referenciar las vistas para la letra N
        imageViewSignN = view.findViewById(R.id.imageViewSignN);
        textViewLetterN = view.findViewById(R.id.textViewLetterN);
        imageViewSignN.setImageResource(R.drawable.n);
        textViewLetterN.setText("Letra N");
        // Referenciar las vistas para la letra O
        imageViewSignO = view.findViewById(R.id.imageViewSignO);
        textViewLetterO = view.findViewById(R.id.textViewLetterO);
        imageViewSignO.setImageResource(R.drawable.o);
        textViewLetterO.setText("Letra O");
        // Referenciar las vistas para la letra P
        imageViewSignP = view.findViewById(R.id.imageViewSignP);
        textViewLetterP = view.findViewById(R.id.textViewLetterP);
        imageViewSignP.setImageResource(R.drawable.p);
        textViewLetterP.setText("Letra P");
        // Referenciar las vistas para la letra Q
        imageViewSignQ = view.findViewById(R.id.imageViewSignQ);
        textViewLetterQ = view.findViewById(R.id.textViewLetterQ);
        imageViewSignQ.setImageResource(R.drawable.q);
        textViewLetterQ.setText("Letra Q");
        // Referenciar las vistas para la letra R
        imageViewSignR = view.findViewById(R.id.imageViewSignR);
        textViewLetterR = view.findViewById(R.id.textViewLetterR);
        imageViewSignR.setImageResource(R.drawable.r);
        textViewLetterR.setText("Letra R");
        // Referenciar las vistas para la letra S
        imageViewSignS = view.findViewById(R.id.imageViewSignS);
        textViewLetterS = view.findViewById(R.id.textViewLetterS);
        imageViewSignS.setImageResource(R.drawable.s);
        textViewLetterS.setText("Letra S");
        // Referenciar las vistas para la letra T
        imageViewSignT = view.findViewById(R.id.imageViewSignT);
        textViewLetterT = view.findViewById(R.id.textViewLetterT);
        imageViewSignT.setImageResource(R.drawable.t);
        textViewLetterT.setText("Letra T");
        // Referenciar las vistas para la letra T
        imageViewSignT = view.findViewById(R.id.imageViewSignT);
        textViewLetterT = view.findViewById(R.id.textViewLetterT);
        imageViewSignT.setImageResource(R.drawable.t);
        textViewLetterT.setText("Letra T");
        // Referenciar las vistas para la letra U
        imageViewSignU = view.findViewById(R.id.imageViewSignU);
        textViewLetterU = view.findViewById(R.id.textViewLetterU);
        imageViewSignU.setImageResource(R.drawable.u);
        textViewLetterU.setText("Letra U");
        // Referenciar las vistas para la letra V
        imageViewSignV = view.findViewById(R.id.imageViewSignV);
        textViewLetterV = view.findViewById(R.id.textViewLetterV);
        imageViewSignV.setImageResource(R.drawable.v);
        textViewLetterV.setText("Letra V");
        // Referenciar las vistas para la letra W
        imageViewSignW = view.findViewById(R.id.imageViewSignW);
        textViewLetterW = view.findViewById(R.id.textViewLetterW);
        imageViewSignW.setImageResource(R.drawable.w);
        textViewLetterW.setText("Letra W");
        // Referenciar las vistas para la letra X
        imageViewSignX = view.findViewById(R.id.imageViewSignX);
        textViewLetterX = view.findViewById(R.id.textViewLetterX);
        imageViewSignX.setImageResource(R.drawable.x);
        textViewLetterX.setText("Letra X");
        // Referenciar las vistas para la letra Y
        imageViewSignY = view.findViewById(R.id.imageViewSignY);
        textViewLetterY = view.findViewById(R.id.textViewLetterY);
        imageViewSignY.setImageResource(R.drawable.y);
        textViewLetterY.setText("Letra Y");
        // Referenciar las vistas para la letra Z
        imageViewSignZ = view.findViewById(R.id.imageViewSignZ);
        textViewLetterZ = view.findViewById(R.id.textViewLetterZ);
        imageViewSignZ.setImageResource(R.drawable.z);
        textViewLetterZ.setText("Letra Z");
        // Referenciar el campo de búsqueda y el botón
        editTextSearch = view.findViewById(R.id.editTextSearch);
        btnSearch = view.findViewById(R.id.btnSearch);
        //Condicional para buscar
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchQuery = editTextSearch.getText().toString().trim().toUpperCase();

                hideAllLetters();

                switch (searchQuery) {
                    case "A":
                        imageViewSignA.setVisibility(View.VISIBLE);
                        textViewLetterA.setVisibility(View.VISIBLE);
                        break;
                    case "B":
                        imageViewSignB.setVisibility(View.VISIBLE);
                        textViewLetterB.setVisibility(View.VISIBLE);
                        break;
                    case "C":
                        imageViewSignC.setVisibility(View.VISIBLE);
                        textViewLetterC.setVisibility(View.VISIBLE);
                        break;
                    case "D":
                        imageViewSignD.setVisibility(View.VISIBLE);
                        textViewLetterD.setVisibility(View.VISIBLE);
                        break;
                    case "E":
                        imageViewSignE.setVisibility(View.VISIBLE);
                        textViewLetterE.setVisibility(View.VISIBLE);
                        break;
                    case "F":
                        imageViewSignF.setVisibility(View.VISIBLE);
                        textViewLetterF.setVisibility(View.VISIBLE);
                        break;
                    case "G":
                        imageViewSignG.setVisibility(View.VISIBLE);
                        textViewLetterG.setVisibility(View.VISIBLE);
                        break;
                    case "H":
                        imageViewSignH.setVisibility(View.VISIBLE);
                        textViewLetterH.setVisibility(View.VISIBLE);
                        break;
                    case "I":
                        imageViewSignI.setVisibility(View.VISIBLE);
                        textViewLetterI.setVisibility(View.VISIBLE);
                        break;
                    case "J":
                        imageViewSignJ.setVisibility(View.VISIBLE);
                        textViewLetterJ.setVisibility(View.VISIBLE);
                        break;
                    case "K":
                        imageViewSignK.setVisibility(View.VISIBLE);
                        textViewLetterK.setVisibility(View.VISIBLE);
                        break;
                    case "L":
                        imageViewSignL.setVisibility(View.VISIBLE);
                        textViewLetterL.setVisibility(View.VISIBLE);
                        break;
                    case "M":
                        imageViewSignM.setVisibility(View.VISIBLE);
                        textViewLetterM.setVisibility(View.VISIBLE);
                        break;
                    case "N":
                        imageViewSignN.setVisibility(View.VISIBLE);
                        textViewLetterN.setVisibility(View.VISIBLE);
                        break;
                    case "O":
                        imageViewSignO.setVisibility(View.VISIBLE);
                        textViewLetterO.setVisibility(View.VISIBLE);
                        break;
                    case "P":
                        imageViewSignP.setVisibility(View.VISIBLE);
                        textViewLetterP.setVisibility(View.VISIBLE);
                        break;
                    case "Q":
                        imageViewSignQ.setVisibility(View.VISIBLE);
                        textViewLetterQ.setVisibility(View.VISIBLE);
                        break;
                    case "R":
                        imageViewSignR.setVisibility(View.VISIBLE);
                        textViewLetterR.setVisibility(View.VISIBLE);
                        break;
                    case "S":
                        imageViewSignS.setVisibility(View.VISIBLE);
                        textViewLetterS.setVisibility(View.VISIBLE);
                        break;
                    case "T":
                        imageViewSignT.setVisibility(View.VISIBLE);
                        textViewLetterT.setVisibility(View.VISIBLE);
                        break;
                    case "U":
                        imageViewSignU.setVisibility(View.VISIBLE);
                        textViewLetterU.setVisibility(View.VISIBLE);
                        break;
                    case "V":
                        imageViewSignV.setVisibility(View.VISIBLE);
                        textViewLetterV.setVisibility(View.VISIBLE);
                        break;
                    case "W":
                        imageViewSignW.setVisibility(View.VISIBLE);
                        textViewLetterW.setVisibility(View.VISIBLE);
                        break;
                    case "X":
                        imageViewSignX.setVisibility(View.VISIBLE);
                        textViewLetterX.setVisibility(View.VISIBLE);
                        break;
                    case "Y":
                        imageViewSignY.setVisibility(View.VISIBLE);
                        textViewLetterY.setVisibility(View.VISIBLE);
                        break;
                    case "Z":
                        imageViewSignZ.setVisibility(View.VISIBLE);
                        textViewLetterZ.setVisibility(View.VISIBLE);
                        break;
                    default:
                        Toast.makeText(getContext(), "Letra no encontrada", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        return view;
    }
    private void hideAllLetters() {
        imageViewSignA.setVisibility(View.GONE);
        textViewLetterA.setVisibility(View.GONE);
        imageViewSignB.setVisibility(View.GONE);
        textViewLetterB.setVisibility(View.GONE);
        imageViewSignC.setVisibility(View.GONE);
        textViewLetterC.setVisibility(View.GONE);
        imageViewSignD.setVisibility(View.GONE);
        textViewLetterD.setVisibility(View.GONE);
        imageViewSignE.setVisibility(View.GONE);
        textViewLetterE.setVisibility(View.GONE);
        imageViewSignF.setVisibility(View.GONE);
        textViewLetterF.setVisibility(View.GONE);
        imageViewSignG.setVisibility(View.GONE);
        textViewLetterG.setVisibility(View.GONE);
        imageViewSignH.setVisibility(View.GONE);
        textViewLetterH.setVisibility(View.GONE);
        imageViewSignI.setVisibility(View.GONE);
        textViewLetterI.setVisibility(View.GONE);
        imageViewSignJ.setVisibility(View.GONE);
        textViewLetterJ.setVisibility(View.GONE);
        imageViewSignK.setVisibility(View.GONE);
        textViewLetterK.setVisibility(View.GONE);
        imageViewSignL.setVisibility(View.GONE);
        textViewLetterL.setVisibility(View.GONE);
        imageViewSignM.setVisibility(View.GONE);
        textViewLetterM.setVisibility(View.GONE);
        imageViewSignN.setVisibility(View.GONE);
        textViewLetterN.setVisibility(View.GONE);
        imageViewSignO.setVisibility(View.GONE);
        textViewLetterO.setVisibility(View.GONE);
        imageViewSignP.setVisibility(View.GONE);
        textViewLetterP.setVisibility(View.GONE);
        imageViewSignQ.setVisibility(View.GONE);
        textViewLetterQ.setVisibility(View.GONE);
        imageViewSignR.setVisibility(View.GONE);
        textViewLetterR.setVisibility(View.GONE);
        imageViewSignS.setVisibility(View.GONE);
        textViewLetterS.setVisibility(View.GONE);
        imageViewSignT.setVisibility(View.GONE);
        textViewLetterT.setVisibility(View.GONE);
        imageViewSignU.setVisibility(View.GONE);
        textViewLetterU.setVisibility(View.GONE);
        imageViewSignV.setVisibility(View.GONE);
        textViewLetterV.setVisibility(View.GONE);
        imageViewSignW.setVisibility(View.GONE);
        textViewLetterW.setVisibility(View.GONE);
        imageViewSignX.setVisibility(View.GONE);
        textViewLetterX.setVisibility(View.GONE);
        imageViewSignY.setVisibility(View.GONE);
        textViewLetterY.setVisibility(View.GONE);
        imageViewSignZ.setVisibility(View.GONE);
        textViewLetterZ.setVisibility(View.GONE);
    }
}