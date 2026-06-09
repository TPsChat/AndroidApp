package com.example.chatappjava.ui.theme;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.chatappjava.R;
import com.example.chatappjava.utils.DatabaseManager;
import com.example.chatappjava.utils.SettingsActionsHelper;

public class SettingsActivity extends AppCompatActivity {

    private TextView tvUserName;
    private DatabaseManager databaseManager;
    private final SettingsActionsHelper settingsActionsHelper = new SettingsActionsHelper();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        databaseManager = new DatabaseManager(this);
        tvUserName = findViewById(R.id.tv_user_name);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());

        loadUserName();
        settingsActionsHelper.bind(findViewById(android.R.id.content), this, databaseManager);
    }

    private void loadUserName() {
        String userName = databaseManager.getUserName();
        if (userName != null && !userName.isEmpty()) {
            tvUserName.setText(userName);
        } else {
            tvUserName.setText(R.string.settings_default_user);
        }
    }

    @Override
    protected void onDestroy() {
        settingsActionsHelper.onDestroy();
        super.onDestroy();
    }
}
