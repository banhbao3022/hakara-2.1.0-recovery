package p636z0.p709j0;

import android.app.Notification;

/* JADX INFO: renamed from: z0.j0.g, reason: use source file name */
/* JADX INFO: compiled from: ForegroundInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class ForegroundInfo {

    /* JADX INFO: renamed from: a */
    public final int f37267a;

    /* JADX INFO: renamed from: b */
    public final int f37268b;

    /* JADX INFO: renamed from: c */
    public final Notification f37269c;

    public ForegroundInfo(int i, Notification notification) {
        this(i, notification, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f37267a == foregroundInfo.f37267a && this.f37268b == foregroundInfo.f37268b) {
            return this.f37269c.equals(foregroundInfo.f37269c);
        }
        return false;
    }

    public int hashCode() {
        return this.f37269c.hashCode() + (((this.f37267a * 31) + this.f37268b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f37267a + ", mForegroundServiceType=" + this.f37268b + ", mNotification=" + this.f37269c + '}';
    }

    public ForegroundInfo(int i, Notification notification, int i2) {
        this.f37267a = i;
        this.f37269c = notification;
        this.f37268b = i2;
    }
}
