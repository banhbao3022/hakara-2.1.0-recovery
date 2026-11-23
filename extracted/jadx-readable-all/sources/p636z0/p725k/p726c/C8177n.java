package p636z0.p725k.p726c;

import android.app.Notification;
import android.os.Build;
import android.widget.RemoteViews;
import java.util.Objects;

/* JADX INFO: renamed from: z0.k.c.n */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8177n extends AbstractC8180q {
    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: b */
    public void mo16088b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f37782b.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: d */
    public String mo16090d() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: e */
    public RemoteViews mo16116e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        Objects.requireNonNull(this.f37777a);
        Objects.requireNonNull(this.f37777a);
        return null;
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: f */
    public RemoteViews mo16117f(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        Objects.requireNonNull(this.f37777a);
        return null;
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: g */
    public RemoteViews mo16118g(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        Objects.requireNonNull(this.f37777a);
        Objects.requireNonNull(this.f37777a);
        return null;
    }
}
