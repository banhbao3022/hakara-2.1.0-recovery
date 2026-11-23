package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p007c.p165l.p178k0.CustomTab;
import p636z0.p663d.p664a.CustomTabsIntent;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p763u.p764a.LocalBroadcastManager;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: f */
    public static final String f28284f = CustomTabMainActivity.class.getSimpleName() + ".extra_params";

    /* JADX INFO: renamed from: g */
    public static final String f28285g = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";

    /* JADX INFO: renamed from: h */
    public static final String f28286h = CustomTabMainActivity.class.getSimpleName() + ".extra_url";

    /* JADX INFO: renamed from: i */
    public static final String f28287i = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";

    /* JADX INFO: renamed from: j */
    public boolean f28288j = true;

    /* JADX INFO: renamed from: k */
    public BroadcastReceiver f28289k;

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$a */
    public class C5807a extends BroadcastReceiver {
        public C5807a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f28287i);
            String str = CustomTabMainActivity.f28286h;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12584a(int i, Intent intent) {
        LocalBroadcastManager.m16762a(this).m16765d(this.f28289k);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = CustomTabActivity.f28280f;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f28284f);
            String stringExtra = getIntent().getStringExtra(f28285g);
            CustomTab customTab = new CustomTab("oauth", bundleExtra);
            CustomTabsIntent customTabsIntentM15061a = new CustomTabsIntent.a().m15061a();
            customTabsIntentM15061a.f35369a.setPackage(stringExtra);
            customTabsIntentM15061a.f35369a.addFlags(1073741824);
            customTabsIntentM15061a.f35369a.setData(customTab.f4921a);
            Intent intent = customTabsIntentM15061a.f35369a;
            Object obj = ContextCompat.f37815a;
            ContextCompat.a.m16136b(this, intent, null);
            this.f28288j = false;
            this.f28289k = new C5807a();
            LocalBroadcastManager.m16762a(this).m16763b(this.f28289k, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f28287i.equals(intent.getAction())) {
            LocalBroadcastManager.m16762a(this).m16764c(new Intent(CustomTabActivity.f28281g));
            m12584a(-1, intent);
        } else if (CustomTabActivity.f28280f.equals(intent.getAction())) {
            m12584a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f28288j) {
            m12584a(0, null);
        }
        this.f28288j = true;
    }
}
