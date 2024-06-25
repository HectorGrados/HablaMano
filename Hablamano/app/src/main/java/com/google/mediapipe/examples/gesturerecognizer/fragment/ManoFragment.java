package com.google.mediapipe.examples.gesturerecognizer.fragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.mediapipe.examples.gesturerecognizer.R;

public class ManoFragment extends Fragment {
    private EditText editTextWord;
    private Button btnProcess;
    private LinearLayout layoutResults;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mano, container, false);
        editTextWord = view.findViewById(R.id.editTextWord);
        btnProcess = view.findViewById(R.id.btnProcess);
        layoutResults = view.findViewById(R.id.layoutResults);
        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = editTextWord.getText().toString().trim().toUpperCase();
                if (word.isEmpty()) {
                    Toast.makeText(getContext(), "Por favor, ingrese una palabra", Toast.LENGTH_SHORT).show();
                } else {
                    processWord(word);
                }
            }
        });
        return view;
    }
    private void processWord(String word) {
        // Limpiar el layout de resultados
        layoutResults.removeAllViews();

        for (char letter : word.toCharArray()) {
            View letterView = createLetterView(letter);
            if (letterView != null) {
                layoutResults.addView(letterView);
            } else {
                Toast.makeText(getContext(), "Letra no encontrada: " + letter, Toast.LENGTH_SHORT).show();
            }
        }
    }
    private View createLetterView(char letter) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View letterView = inflater.inflate(R.layout.item_letter, layoutResults, false);
        ImageView imageView = letterView.findViewById(R.id.imageViewLetter);
        TextView textView = letterView.findViewById(R.id.textViewLetter);
        textView.setText(String.valueOf(letter));
        int imageResId = getImageResourceId(letter);
        if (imageResId != 0) {
            imageView.setImageResource(imageResId);
            return letterView;
        } else {
            return null;
        }
    }
    private int getImageResourceId(char letter) {
        switch (letter) {
            case 'A': return R.drawable.a2;
            case 'B': return R.drawable.b;
            case 'C': return R.drawable.c;
            case 'D': return R.drawable.d;
            case 'E': return R.drawable.e;
            case 'F': return R.drawable.f;
            case 'G': return R.drawable.g;
            case 'H': return R.drawable.h;
            case 'I': return R.drawable.i;
            case 'J': return R.drawable.j;
            case 'K': return R.drawable.k;
            case 'L': return R.drawable.l;
            case 'M': return R.drawable.m;
            case 'N': return R.drawable.n;
            case 'O': return R.drawable.o;
            case 'P': return R.drawable.p;
            case 'Q': return R.drawable.q;
            case 'R': return R.drawable.r;
            case 'S': return R.drawable.s;
            case 'T': return R.drawable.t;
            case 'U': return R.drawable.u;
            case 'V': return R.drawable.v;
            case 'W': return R.drawable.w;
            case 'X': return R.drawable.x;
            case 'Y': return R.drawable.y;
            case 'Z': return R.drawable.z;
            default: return 0;
        }
    }
}

