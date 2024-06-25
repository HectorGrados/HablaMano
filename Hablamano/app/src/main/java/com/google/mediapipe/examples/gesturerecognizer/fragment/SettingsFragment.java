package com.google.mediapipe.examples.gesturerecognizer.fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import android.content.Context;

import com.google.mediapipe.examples.gesturerecognizer.R;

public class SettingsFragment extends Fragment {
    private RadioGroup themeRadioGroup;
    private Button btnGuardarConfiguraciones;
    private TextView textViewUserName;
    private static final String PREFS_NAME = "app_settings";
    private static final String THEME_PREF = "theme";
    private static final String USER_NAME_PREF = "user_name";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        themeRadioGroup = view.findViewById(R.id.themeRadioGroup);
        btnGuardarConfiguraciones = view.findViewById(R.id.btnGuardarConfiguraciones);
        textViewUserName = view.findViewById(R.id.textViewUserName);
        cargarNombreUsuario();
        loadSettings();
        btnGuardarConfiguraciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveSettings();
            }
        });
        return view;
    }
    private void cargarNombreUsuario() {
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String nombreUsuario = sharedPreferences.getString(USER_NAME_PREF, "");
        textViewUserName.setText(nombreUsuario);
    }
    private void loadSettings() {
        // Cargar tema
        SharedPreferences preferences = requireActivity().getSharedPreferences(PREFS_NAME, 0);
        String theme = preferences.getString(THEME_PREF, "Light");
        if (theme.equals("Light")) {
            themeRadioGroup.check(R.id.radioLight);
        } else {
            themeRadioGroup.check(R.id.radioDark);
        }
    }
    private void saveSettings() {
        // Guardar tema seleccionado
        int selectedThemeId = themeRadioGroup.getCheckedRadioButtonId();
        String selectedTheme = selectedThemeId == R.id.radioLight ? "Light" : "Dark";
        SharedPreferences preferences = requireActivity().getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(THEME_PREF, selectedTheme);
        editor.apply();
        applyTheme(selectedTheme);
        Toast.makeText(getActivity(), "Configuraciones guardadas", Toast.LENGTH_SHORT).show();
    }
    private void applyTheme(String theme) {
        if (theme.equals("Light")) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        requireActivity().recreate();
    }
}
