package p636z0.p725k.p726c;

import android.os.Bundle;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: z0.k.c.q */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8180q {

    /* JADX INFO: renamed from: a */
    public C8176m f37777a;

    /* JADX INFO: renamed from: b */
    public CharSequence f37778b;

    /* JADX INFO: renamed from: c */
    public CharSequence f37779c;

    /* JADX INFO: renamed from: d */
    public boolean f37780d = false;

    /* JADX INFO: renamed from: a */
    public void mo16096a(Bundle bundle) {
        if (this.f37780d) {
            bundle.putCharSequence("android.summaryText", this.f37779c);
        }
        CharSequence charSequence = this.f37778b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strMo16090d = mo16090d();
        if (strMo16090d != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo16090d);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo16088b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
    }

    /* JADX INFO: renamed from: c */
    public void mo16089c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    /* JADX INFO: renamed from: d */
    public String mo16090d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public RemoteViews mo16116e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public RemoteViews mo16117f(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public RemoteViews mo16118g(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void mo16091h(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f37779c = bundle.getCharSequence("android.summaryText");
            this.f37780d = true;
        }
        this.f37778b = bundle.getCharSequence("android.title.big");
    }
}
