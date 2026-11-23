package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p636z0.p763u.p764a.LocalBroadcastManager;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: f */
    public static final String f28280f = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";

    /* JADX INFO: renamed from: g */
    public static final String f28281g = CustomTabActivity.class.getSimpleName() + ".action_destroy";

    /* JADX INFO: renamed from: h */
    public BroadcastReceiver f28282h;

    /* JADX INFO: renamed from: com.facebook.CustomTabActivity$a */
    public class C5806a extends BroadcastReceiver {
        public C5806a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f28280f);
            intent2.putExtra(CustomTabMainActivity.f28286h, getIntent().getDataString());
            LocalBroadcastManager.m16762a(this).m16764c(intent2);
            this.f28282h = new C5806a();
            LocalBroadcastManager.m16762a(this).m16763b(this.f28282h, new IntentFilter(f28281g));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f28280f);
        intent.putExtra(CustomTabMainActivity.f28286h, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        LocalBroadcastManager.m16762a(this).m16765d(this.f28282h);
        super.onDestroy();
    }
}
