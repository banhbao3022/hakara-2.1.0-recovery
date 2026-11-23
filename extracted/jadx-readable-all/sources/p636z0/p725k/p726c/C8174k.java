package p636z0.p725k.p726c;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: renamed from: z0.k.c.k */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8174k extends AbstractC8180q {

    /* JADX INFO: renamed from: e */
    public CharSequence f37708e;

    public C8174k() {
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: a */
    public void mo16096a(Bundle bundle) {
        super.mo16096a(bundle);
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: b */
    public void mo16088b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b).setBigContentTitle(this.f37778b).bigText(this.f37708e);
        if (this.f37780d) {
            bigTextStyleBigText.setSummaryText(this.f37779c);
        }
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: c */
    public void mo16089c(Bundle bundle) {
        super.mo16089c(bundle);
        bundle.remove("android.bigText");
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: d */
    public String mo16090d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: h */
    public void mo16091h(Bundle bundle) {
        super.mo16091h(bundle);
        this.f37708e = bundle.getCharSequence("android.bigText");
    }

    public C8174k(C8176m c8176m) {
        if (this.f37777a != c8176m) {
            this.f37777a = c8176m;
            if (c8176m != null) {
                c8176m.m16114k(this);
            }
        }
    }
}
