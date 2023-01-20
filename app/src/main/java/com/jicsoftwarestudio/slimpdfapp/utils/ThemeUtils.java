package com.jicsoftwarestudio.slimpdfapp.utils;

import android.content.Context;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatDelegate;

import com.jicsoftwarestudio.slimpdfapp.fragments.SettingsFragment;

public class ThemeUtils {
    public static void setTheme(Context context) {
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean(SettingsFragment.NIGHT_MODE_ENABLED, false)) {
            AppCompatDelegate.setDefaultNightMode(2);
        } else {
            AppCompatDelegate.setDefaultNightMode(3);
        }
    }
}
