package p636z0.p725k.p726c;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: z0.k.c.o */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8178o extends AbstractC8180q {

    /* JADX INFO: renamed from: e */
    public ArrayList<CharSequence> f37765e = new ArrayList<>();

    public C8178o() {
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: b */
    public void mo16088b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b).setBigContentTitle(this.f37778b);
        if (this.f37780d) {
            bigContentTitle.setSummaryText(this.f37779c);
        }
        Iterator<CharSequence> it = this.f37765e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: c */
    public void mo16089c(Bundle bundle) {
        super.mo16089c(bundle);
        bundle.remove("android.textLines");
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: d */
    public String mo16090d() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: h */
    public void mo16091h(Bundle bundle) {
        super.mo16091h(bundle);
        this.f37765e.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(this.f37765e, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    public C8178o(C8176m c8176m) {
        if (this.f37777a != c8176m) {
            this.f37777a = c8176m;
            if (c8176m != null) {
                c8176m.m16114k(this);
            }
        }
    }
}
