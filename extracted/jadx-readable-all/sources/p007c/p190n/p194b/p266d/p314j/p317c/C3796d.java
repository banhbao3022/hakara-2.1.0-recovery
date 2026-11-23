package p007c.p190n.p194b.p266d.p314j.p317c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.d.j.c.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3796d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f22466a = 0;

    static {
        C3796d.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m8921a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
