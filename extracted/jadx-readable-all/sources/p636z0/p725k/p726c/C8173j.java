package p636z0.p725k.p726c;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: z0.k.c.j */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8173j extends AbstractC8180q {

    /* JADX INFO: renamed from: e */
    public Bitmap f37705e;

    /* JADX INFO: renamed from: f */
    public IconCompat f37706f;

    /* JADX INFO: renamed from: g */
    public boolean f37707g;

    /* JADX INFO: renamed from: z0.k.c.j$a */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m16093a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        /* JADX INFO: renamed from: b */
        public static void m16094b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    /* JADX INFO: renamed from: z0.k.c.j$b */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m16095a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    public C8173j() {
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: b */
    public void mo16088b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        int i = Build.VERSION.SDK_INT;
        NotificationCompatBuilder notificationCompatBuilder = (NotificationCompatBuilder) notificationBuilderWithBuilderAccessor;
        Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(notificationCompatBuilder.f37782b).setBigContentTitle(this.f37778b).bigPicture(this.f37705e);
        if (this.f37707g) {
            IconCompat iconCompat = this.f37706f;
            Bitmap bitmapM344c = null;
            if (iconCompat == null) {
                a.m16093a(bigPictureStyleBigPicture, null);
            } else if (i >= 23) {
                b.m16095a(bigPictureStyleBigPicture, iconCompat.m356o(notificationCompatBuilder.f37781a));
            } else if (iconCompat.m352i() == 1) {
                IconCompat iconCompat2 = this.f37706f;
                int i2 = iconCompat2.f675b;
                if (i2 == -1 && i >= 23) {
                    Object obj = iconCompat2.f676c;
                    if (obj instanceof Bitmap) {
                        bitmapM344c = (Bitmap) obj;
                    }
                } else if (i2 == 1) {
                    bitmapM344c = (Bitmap) iconCompat2.f676c;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapM344c = IconCompat.m344c((Bitmap) iconCompat2.f676c, true);
                }
                a.m16093a(bigPictureStyleBigPicture, bitmapM344c);
            } else {
                a.m16093a(bigPictureStyleBigPicture, null);
            }
        }
        if (this.f37780d) {
            a.m16094b(bigPictureStyleBigPicture, this.f37779c);
        }
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: c */
    public void mo16089c(Bundle bundle) {
        super.mo16089c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
    }

    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: d */
    public String mo16090d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    @Override // p636z0.p725k.p726c.AbstractC8180q
    /* JADX INFO: renamed from: h */
    public void mo16091h(Bundle bundle) {
        IconCompat iconCompatM343b;
        super.mo16091h(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            Parcelable parcelable = bundle.getParcelable("android.largeIcon.big");
            if (parcelable == null) {
                iconCompatM343b = null;
            } else if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                iconCompatM343b = IconCompat.m343b((Icon) parcelable);
            } else if (parcelable instanceof Bitmap) {
                PorterDuff.Mode mode = IconCompat.f674a;
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f676c = (Bitmap) parcelable;
                iconCompatM343b = iconCompat;
            } else {
                iconCompatM343b = null;
            }
            this.f37706f = iconCompatM343b;
            this.f37707g = true;
        }
        this.f37705e = (Bitmap) bundle.getParcelable("android.picture");
    }

    /* JADX INFO: renamed from: i */
    public C8173j m16092i(Bitmap bitmap) {
        this.f37706f = null;
        this.f37707g = true;
        return this;
    }

    public C8173j(C8176m c8176m) {
        if (this.f37777a != c8176m) {
            this.f37777a = c8176m;
            if (c8176m != null) {
                c8176m.m16114k(this);
            }
        }
    }
}
