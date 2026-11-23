package p007c.p190n.p194b.p266d.p298f;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.p302q.C2753q;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2602b extends AbstractC2767a {

    /* JADX INFO: renamed from: g */
    public final int f11552g;

    /* JADX INFO: renamed from: h */
    public final int f11553h;

    /* JADX INFO: renamed from: i */
    public final PendingIntent f11554i;

    /* JADX INFO: renamed from: j */
    public final String f11555j;

    /* JADX INFO: renamed from: f */
    @RecentlyNonNull
    public static final C2602b f11551f = new C2602b(0);

    @RecentlyNonNull
    public static final Parcelable.Creator<C2602b> CREATOR = new C2795w();

    public C2602b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f11552g = i;
        this.f11553h = i2;
        this.f11554i = pendingIntent;
        this.f11555j = str;
    }

    public C2602b(int i, PendingIntent pendingIntent, String str) {
        this.f11552g = 1;
        this.f11553h = i;
        this.f11554i = pendingIntent;
        this.f11555j = str;
    }

    /* JADX INFO: renamed from: L */
    public static String m5195L(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m5196H() {
        return (this.f11553h == 0 || this.f11554i == null) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public boolean m5197K() {
        return this.f11553h == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2602b)) {
            return false;
        }
        C2602b c2602b = (C2602b) obj;
        return this.f11553h == c2602b.f11553h && C2622l.m5459y(this.f11554i, c2602b.f11554i) && C2622l.m5459y(this.f11555j, c2602b.f11555j);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11553h), this.f11554i, this.f11555j});
    }

    @RecentlyNonNull
    public String toString() {
        C2753q c2753q = new C2753q(this);
        c2753q.m5608a("statusCode", m5195L(this.f11553h));
        c2753q.m5608a("resolution", this.f11554i);
        c2753q.m5608a("message", this.f11555j);
        return c2753q.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11552g;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f11553h;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        C2622l.m5311T(parcel, 3, this.f11554i, i, false);
        C2622l.m5315U(parcel, 4, this.f11555j, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2602b(int i) {
        this(i, null, null);
    }

    public C2602b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }
}
