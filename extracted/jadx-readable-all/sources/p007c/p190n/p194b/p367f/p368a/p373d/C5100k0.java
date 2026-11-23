package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.f.a.d.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5100k0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f26051a = 0;

    static {
        C5100k0.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m11539a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
