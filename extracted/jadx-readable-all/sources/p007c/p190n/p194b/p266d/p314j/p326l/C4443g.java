package p007c.p190n.p194b.p266d.p314j.p326l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.d.j.l.g */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4443g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f23686a = 0;

    static {
        C4443g.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m10369a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
