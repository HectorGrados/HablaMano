package com.google.mediapipe.examples.gesturerecognizer.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import java.util.Locale;

import com.google.mediapipe.examples.gesturerecognizer.R;

public class SettingsFragment extends Fragment {
    private RadioGroup themeRadioGroup;
    private Button btnGuardarConfiguraciones;
    private TextView textViewUserName;
    private Spinner languageSpinner;
    private static final String PREFS_NAME = "app_settings";
    private static final String THEME_PREF = "theme";
    private static final String USER_NAME_PREF = "user_name";
    private static final String LANGUAGE_PREF = "language";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        themeRadioGroup = view.findViewById(R.id.themeRadioGroup);
        btnGuardarConfiguraciones = view.findViewById(R.id.btnGuardarConfiguraciones);
        textViewUserName = view.findViewById(R.id.textViewUserName);
        languageSpinner = view.findViewById(R.id.languageSpinner);

        cargarNombreUsuario();
        loadSettings();

        btnGuardarConfiguraciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveSettings();
            }
        });


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(),
                R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languageSpinner.setAdapter(adapter);

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

        // Cargar idioma
        int selectedLanguageIndex = preferences.getInt(LANGUAGE_PREF, 0);
        languageSpinner.setSelection(selectedLanguageIndex);
    }

    private void saveSettings() {
        // Guardar tema
        int selectedThemeId = themeRadioGroup.getCheckedRadioButtonId();
        String selectedTheme = selectedThemeId == R.id.radioLight ? "Light" : "Dark";
        SharedPreferences preferences = requireActivity().getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(THEME_PREF, selectedTheme);

        // Guardar idioma
        int selectedLanguageIndex = languageSpinner.getSelectedItemPosition();
        editor.putInt(LANGUAGE_PREF, selectedLanguageIndex);

        editor.apply();
        applyTheme(selectedTheme);
        applyLanguage(selectedLanguageIndex);

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

    private void applyLanguage(int selectedLanguageIndex) {
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        String[] languages = res.getStringArray(R.array.languages);

        if (selectedLanguageIndex < languages.length) {
            String selectedLanguage = languages[selectedLanguageIndex];
            if (selectedLanguage.equals("Español")) {
                conf.setLocale(new Locale("es"));
            } else if (selectedLanguage.equals("English")) {
                conf.setLocale(new Locale("en"));
            }
            res.updateConfiguration(conf, dm);
            requireActivity().recreate();
        }
    }
}
