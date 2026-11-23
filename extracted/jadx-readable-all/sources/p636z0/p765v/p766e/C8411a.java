package p636z0.p765v.p766e;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import p636z0.p725k.p726c.AbstractC8180q;
import p636z0.p725k.p726c.C8176m;
import p636z0.p725k.p726c.NotificationBuilderWithBuilderAccessor;
import p636z0.p725k.p726c.NotificationCompatBuilder;

/* JADX INFO: renamed from: z0.v.e.a */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8411a extends AbstractC8180q {

    /* JADX INFO: renamed from: e */
    public int[] f38803e = null;

    /* JADX INFO: renamed from: f */
    public MediaSessionCompat.Token f38804f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f38805g;

    public C8411a() {
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: b */
    public void mo16088b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        Notification.Builder builder = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        int[] iArr = this.f38803e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f38804f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.f84g);
        }
        builder.setStyle(mediaStyle);
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: e */
    public RemoteViews mo16116e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: f */
    public RemoteViews mo16117f(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    public C8411a(C8176m c8176m) {
        if (this.f37777a != c8176m) {
            this.f37777a = c8176m;
            if (c8176m != null) {
                c8176m.m16114k(this);
            }
        }
    }
}
