package p636z0.p663d.p664a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: z0.d.a.i, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsIntent.java */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsIntent {

    /* JADX INFO: renamed from: a */
    public final Intent f35369a;

    /* JADX INFO: renamed from: z0.d.a.i$a */
    /* JADX INFO: compiled from: CustomTabsIntent.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Intent f35370a;

        /* JADX INFO: renamed from: b */
        public boolean f35371b;

        public a() {
            this(null);
        }

        /* JADX INFO: renamed from: a */
        public CustomTabsIntent m15061a() {
            this.f35370a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f35371b);
            return new CustomTabsIntent(this.f35370a, null);
        }

        public a(CustomTabsSession customTabsSession) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f35370a = intent;
            this.f35371b = true;
            if (customTabsSession != null) {
                intent.setPackage(customTabsSession.f35374c.getPackageName());
            }
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", customTabsSession == null ? null : customTabsSession.f35373b.asBinder());
            intent.putExtras(bundle);
        }
    }

    public CustomTabsIntent(Intent intent, Bundle bundle) {
        this.f35369a = intent;
    }

    /* JADX INFO: renamed from: a */
    public void m15060a(Context context, Uri uri) {
        this.f35369a.setData(uri);
        Intent intent = this.f35369a;
        Object obj = ContextCompat.f37815a;
        ContextCompat.a.m16136b(context, intent, null);
    }
}
