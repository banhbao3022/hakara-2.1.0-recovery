package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2706p;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p302q.C2753q;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC2767a implements InterfaceC2638k, ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR;

    /* JADX INFO: renamed from: f */
    @RecentlyNonNull
    public static final Status f28648f = new Status(0);

    /* JADX INFO: renamed from: g */
    @RecentlyNonNull
    public static final Status f28649g = new Status(14);

    /* JADX INFO: renamed from: h */
    @RecentlyNonNull
    public static final Status f28650h = new Status(8);

    /* JADX INFO: renamed from: i */
    @RecentlyNonNull
    public static final Status f28651i = new Status(15);

    /* JADX INFO: renamed from: j */
    @RecentlyNonNull
    public static final Status f28652j = new Status(16);

    /* JADX INFO: renamed from: k */
    public final int f28653k;

    /* JADX INFO: renamed from: l */
    public final int f28654l;

    /* JADX INFO: renamed from: m */
    public final String f28655m;

    /* JADX INFO: renamed from: n */
    public final PendingIntent f28656n;

    /* JADX INFO: renamed from: o */
    public final C2602b f28657o;

    static {
        new Status(17);
        new Status(18);
        CREATOR = new C2706p();
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, C2602b c2602b) {
        this.f28653k = i;
        this.f28654l = i2;
        this.f28655m = str;
        this.f28656n = pendingIntent;
        this.f28657o = c2602b;
    }

    public Status(int i, String str) {
        this.f28653k = 1;
        this.f28654l = i;
        this.f28655m = str;
        this.f28656n = null;
        this.f28657o = null;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k
    @RecentlyNonNull
    /* JADX INFO: renamed from: B */
    public Status mo4909B() {
        return this;
    }

    /* JADX INFO: renamed from: H */
    public boolean m12654H() {
        return this.f28654l <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f28653k == status.f28653k && this.f28654l == status.f28654l && C2622l.m5459y(this.f28655m, status.f28655m) && C2622l.m5459y(this.f28656n, status.f28656n) && C2622l.m5459y(this.f28657o, status.f28657o);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28653k), Integer.valueOf(this.f28654l), this.f28655m, this.f28656n, this.f28657o});
    }

    @RecentlyNonNull
    public String toString() {
        C2753q c2753q = new C2753q(this);
        String strM1585g = this.f28655m;
        if (strM1585g == null) {
            int i = this.f28654l;
            switch (i) {
                case -1:
                    strM1585g = "SUCCESS_CACHE";
                    break;
                case 0:
                    strM1585g = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strM1585g = outline.m1585g(32, "unknown status code: ", i);
                    break;
                case 2:
                    strM1585g = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strM1585g = "SERVICE_DISABLED";
                    break;
                case 4:
                    strM1585g = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strM1585g = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strM1585g = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strM1585g = "NETWORK_ERROR";
                    break;
                case 8:
                    strM1585g = "INTERNAL_ERROR";
                    break;
                case 10:
                    strM1585g = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strM1585g = "ERROR";
                    break;
                case 14:
                    strM1585g = "INTERRUPTED";
                    break;
                case 15:
                    strM1585g = "TIMEOUT";
                    break;
                case 16:
                    strM1585g = "CANCELED";
                    break;
                case 17:
                    strM1585g = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strM1585g = "DEAD_CLIENT";
                    break;
                case 19:
                    strM1585g = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strM1585g = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strM1585g = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strM1585g = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c2753q.m5608a("statusCode", strM1585g);
        c2753q.m5608a("resolution", this.f28656n);
        return c2753q.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f28654l;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 2, this.f28655m, false);
        C2622l.m5311T(parcel, 3, this.f28656n, i, false);
        C2622l.m5311T(parcel, 4, this.f28657o, i, false);
        int i3 = this.f28653k;
        parcel.writeInt(263144);
        parcel.writeInt(i3);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this.f28653k = 1;
        this.f28654l = i;
        this.f28655m = str;
        this.f28656n = pendingIntent;
        this.f28657o = null;
    }

    @Deprecated
    public Status(@RecentlyNonNull C2602b c2602b, @RecentlyNonNull String str, int i) {
        this(1, i, str, c2602b.f11554i, c2602b);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(@RecentlyNonNull C2602b c2602b, @RecentlyNonNull String str) {
        this(c2602b, str, 17);
    }
}
