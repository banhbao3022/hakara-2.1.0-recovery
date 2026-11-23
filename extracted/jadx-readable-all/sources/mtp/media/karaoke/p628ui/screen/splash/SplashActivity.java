package mtp.media.karaoke.p628ui.screen.splash;

import android.content.Intent;
import android.os.Bundle;
import mtp.media.karaoke.MainActivity;
import mtp.media.karaoke.data.model.Notification;
import p477d1.p481d0.StringNumberConversions;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p644b.p645c.AppCompatActivity;

/* JADX INFO: compiled from: SplashActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SplashActivity extends AppCompatActivity {
    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        Notification notification;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            Intrinsics2.m13088d(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Integer numM12986c = StringNumberConversions.m12986c(String.valueOf(extras.get("content_id")));
                Integer numM12986c2 = StringNumberConversions.m12986c(String.valueOf(extras.get("sub_content_id")));
                notification = new Notification(0, 0, null, String.valueOf(extras.get("type")), null, numM12986c != null ? numM12986c.intValue() : 0, Integer.valueOf(numM12986c2 != null ? numM12986c2.intValue() : 0), null, "", null, 0, null, null, null, 14996, null);
            } else {
                notification = null;
            }
        } catch (Exception unused) {
        }
        startActivity(MainActivity.f33373w.m14330a(this, notification));
        finish();
    }
}
