package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p620j1.p621a.p622a.AppSettingsDialog;
import p636z0.p644b.p645c.AlertDialog;
import p636z0.p644b.p645c.AppCompatActivity;

/* JADX INFO: loaded from: classes2.dex */
public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: u */
    public AlertDialog f34083u;

    /* JADX INFO: renamed from: v */
    public int f34084v;

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f34084v);
            startActivityForResult(data, 7534);
        } else {
            if (i != -2) {
                throw new IllegalStateException(outline.m1590l("Unknown button type: ", i));
            }
            setResult(0);
            finish();
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) getIntent().getParcelableExtra("extra_app_settings");
        Objects.requireNonNull(appSettingsDialog);
        appSettingsDialog.f33105m = this;
        this.f34084v = appSettingsDialog.f33104l;
        int i = appSettingsDialog.f33098f;
        AlertDialog alertDialogCreate = (i != -1 ? new AlertDialog.a(this, i) : new AlertDialog.a(this)).mo11257a(false).setTitle(appSettingsDialog.f33100h).mo11258b(appSettingsDialog.f33099g).mo11261e(appSettingsDialog.f33101i, this).mo11259c(appSettingsDialog.f33102j, this).create();
        alertDialogCreate.show();
        this.f34083u = alertDialogCreate;
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.f34083u;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f34083u.dismiss();
    }
}
