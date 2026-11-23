package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2608e;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2659g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f28644f = 0;

    /* JADX INFO: renamed from: g */
    public int f28645g = 0;

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f28645g = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C2659g c2659gM5513b = C2659g.m5513b(this);
                if (i2 == -1) {
                    Handler handler = c2659gM5513b.f11672t;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    C2602b c2602b = new C2602b(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!c2659gM5513b.m5516d(c2602b, intExtra)) {
                        Handler handler2 = c2659gM5513b.f11672t;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, c2602b));
                    }
                }
            }
        } else if (i == 2) {
            this.f28645g = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f28645g = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f28645g = bundle.getInt("resolution");
        }
        if (this.f28645g != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else {
                if (pendingIntent == null) {
                    C2608e.f11563d.m5209f(this, num.intValue(), 2, this);
                    this.f28645g = 1;
                    return;
                }
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f28645g = 1;
                } catch (IntentSender.SendIntentException e) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f28645g);
        super.onSaveInstanceState(bundle);
    }
}
