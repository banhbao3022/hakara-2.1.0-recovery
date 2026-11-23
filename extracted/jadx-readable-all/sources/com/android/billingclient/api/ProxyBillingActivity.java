package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: f */
    public ResultReceiver f28126f;

    /* JADX INFO: renamed from: g */
    public boolean f28127g;

    /* JADX INFO: renamed from: a */
    public final Intent m12553a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int i3 = C4437a.m10351c(intent, "ProxyBillingActivity").f2715a;
            if (i2 != -1) {
                C4437a.m10350b("ProxyBillingActivity", outline.m1586h(85, "Activity finished with resultCode ", i2, " and billing's responseCode: ", i3));
            } else if (i3 != 0) {
                i2 = -1;
                C4437a.m10350b("ProxyBillingActivity", outline.m1586h(85, "Activity finished with resultCode ", i2, " and billing's responseCode: ", i3));
            } else {
                i3 = 0;
            }
            ResultReceiver resultReceiver = this.f28126f;
            if (resultReceiver != null) {
                resultReceiver.send(i3, intent == null ? null : intent.getExtras());
            } else {
                Intent intentM12553a = m12553a();
                if (intent != null) {
                    intentM12553a.putExtras(intent.getExtras());
                }
                sendBroadcast(intentM12553a);
            }
        } else {
            StringBuilder sb = new StringBuilder(69);
            sb.append("Got onActivityResult with wrong requestCode: ");
            sb.append(i);
            sb.append("; skipping...");
            C4437a.m10350b("ProxyBillingActivity", sb.toString());
        }
        this.f28127g = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            C4437a.m10349a("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f28127g = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f28126f = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            }
            return;
        }
        C4437a.m10349a("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f28126f = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else {
            pendingIntent = null;
        }
        try {
            this.f28127g = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 53);
            sb.append("Got exception while trying to start a purchase flow: ");
            sb.append(strValueOf);
            C4437a.m10350b("ProxyBillingActivity", sb.toString());
            ResultReceiver resultReceiver = this.f28126f;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                Intent intentM12553a = m12553a();
                intentM12553a.putExtra("RESPONSE_CODE", 6);
                intentM12553a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                sendBroadcast(intentM12553a);
            }
            this.f28127g = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f28127g) {
            Intent intentM12553a = m12553a();
            intentM12553a.putExtra("RESPONSE_CODE", 1);
            intentM12553a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentM12553a);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f28126f;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f28127g);
    }
}
