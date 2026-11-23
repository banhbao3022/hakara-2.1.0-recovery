package p636z0.p725k.p726c;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: renamed from: z0.k.c.l */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C8175l {

    /* JADX INFO: renamed from: a */
    public PendingIntent f37709a;

    /* JADX INFO: renamed from: b */
    public PendingIntent f37710b;

    /* JADX INFO: renamed from: c */
    public IconCompat f37711c;

    /* JADX INFO: renamed from: d */
    public int f37712d;

    /* JADX INFO: renamed from: e */
    public int f37713e;

    /* JADX INFO: renamed from: f */
    public int f37714f;

    /* JADX INFO: renamed from: g */
    public String f37715g;

    /* JADX INFO: renamed from: z0.k.c.l$a */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static C8175l m16097a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                return null;
            }
            c cVar = new c(bubbleMetadata.getIntent(), IconCompat.m343b(bubbleMetadata.getIcon()));
            cVar.m16102b(bubbleMetadata.getAutoExpandBubble());
            cVar.f37721f = bubbleMetadata.getDeleteIntent();
            cVar.m16103c(bubbleMetadata.isNotificationSuppressed());
            if (bubbleMetadata.getDesiredHeight() != 0) {
                cVar.f37718c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                cVar.f37719d = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                cVar.f37719d = bubbleMetadata.getDesiredHeightResId();
                cVar.f37718c = 0;
            }
            return cVar.m16101a();
        }

        /* JADX INFO: renamed from: b */
        public static Notification.BubbleMetadata m16098b(C8175l c8175l) {
            if (c8175l == null || c8175l.f37709a == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(c8175l.f37711c.m355n()).setIntent(c8175l.f37709a).setDeleteIntent(c8175l.f37710b).setAutoExpandBubble((c8175l.f37714f & 1) != 0).setSuppressNotification((c8175l.f37714f & 2) != 0);
            int i = c8175l.f37712d;
            if (i != 0) {
                suppressNotification.setDesiredHeight(i);
            }
            int i2 = c8175l.f37713e;
            if (i2 != 0) {
                suppressNotification.setDesiredHeightResId(i2);
            }
            return suppressNotification.build();
        }
    }

    /* JADX INFO: renamed from: z0.k.c.l$b */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static C8175l m16099a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.m343b(bubbleMetadata.getIcon()));
            cVar.m16102b(bubbleMetadata.getAutoExpandBubble());
            cVar.f37721f = bubbleMetadata.getDeleteIntent();
            cVar.m16103c(bubbleMetadata.isNotificationSuppressed());
            if (bubbleMetadata.getDesiredHeight() != 0) {
                cVar.f37718c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                cVar.f37719d = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                cVar.f37719d = bubbleMetadata.getDesiredHeightResId();
                cVar.f37718c = 0;
            }
            return cVar.m16101a();
        }

        /* JADX INFO: renamed from: b */
        public static Notification.BubbleMetadata m16100b(C8175l c8175l) {
            if (c8175l == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder builder = c8175l.f37715g != null ? new Notification.BubbleMetadata.Builder(c8175l.f37715g) : new Notification.BubbleMetadata.Builder(c8175l.f37709a, c8175l.f37711c.m355n());
            builder.setDeleteIntent(c8175l.f37710b).setAutoExpandBubble((c8175l.f37714f & 1) != 0).setSuppressNotification((c8175l.f37714f & 2) != 0);
            int i = c8175l.f37712d;
            if (i != 0) {
                builder.setDesiredHeight(i);
            }
            int i2 = c8175l.f37713e;
            if (i2 != 0) {
                builder.setDesiredHeightResId(i2);
            }
            return builder.build();
        }
    }

    /* JADX INFO: renamed from: z0.k.c.l$c */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public PendingIntent f37716a;

        /* JADX INFO: renamed from: b */
        public IconCompat f37717b;

        /* JADX INFO: renamed from: c */
        public int f37718c;

        /* JADX INFO: renamed from: d */
        public int f37719d;

        /* JADX INFO: renamed from: e */
        public int f37720e;

        /* JADX INFO: renamed from: f */
        public PendingIntent f37721f;

        /* JADX INFO: renamed from: g */
        public String f37722g;

        @Deprecated
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: a */
        public C8175l m16101a() {
            String str = this.f37722g;
            if (str == null) {
                Objects.requireNonNull(this.f37716a, "Must supply pending intent or shortcut to bubble");
            }
            if (str == null) {
                Objects.requireNonNull(this.f37717b, "Must supply an icon or shortcut for the bubble");
            }
            PendingIntent pendingIntent = this.f37716a;
            PendingIntent pendingIntent2 = this.f37721f;
            IconCompat iconCompat = this.f37717b;
            int i = this.f37718c;
            int i2 = this.f37719d;
            int i3 = this.f37720e;
            C8175l c8175l = new C8175l(pendingIntent, pendingIntent2, iconCompat, i, i2, i3, str, null);
            c8175l.f37714f = i3;
            return c8175l;
        }

        /* JADX INFO: renamed from: b */
        public c m16102b(boolean z) {
            if (z) {
                this.f37720e |= 1;
            } else {
                this.f37720e &= -2;
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m16103c(boolean z) {
            if (z) {
                this.f37720e |= 2;
            } else {
                this.f37720e &= -3;
            }
            return this;
        }

        public c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
            this.f37722g = str;
        }

        public c(PendingIntent pendingIntent, IconCompat iconCompat) {
            Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
            Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
            this.f37716a = pendingIntent;
            this.f37717b = iconCompat;
        }
    }

    public C8175l(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str, C8171h c8171h) {
        this.f37709a = pendingIntent;
        this.f37711c = iconCompat;
        this.f37712d = i;
        this.f37713e = i2;
        this.f37710b = pendingIntent2;
        this.f37714f = i3;
        this.f37715g = str;
    }
}
