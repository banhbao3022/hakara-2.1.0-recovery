package p007c.p190n.p194b.p334e.p335a0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: renamed from: c.n.b.e.a0.a, reason: use source file name */
/* JADX INFO: compiled from: ExtendableSavedState.java */
/* JADX INFO: loaded from: classes.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* JADX INFO: renamed from: h */
    public final SimpleArrayMap<String, Bundle> f24728h;

    /* JADX INFO: renamed from: c.n.b.e.a0.a$a */
    /* JADX INFO: compiled from: ExtendableSavedState.java */
    public static class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f24728h = new SimpleArrayMap<>();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ExtendableSavedState{");
        sbM1556G.append(Integer.toHexString(System.identityHashCode(this)));
        sbM1556G.append(" states=");
        sbM1556G.append(this.f24728h);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }

    @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f38150g, i);
        int i2 = this.f24728h.f36667l;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f24728h.m15611h(i3);
            bundleArr[i3] = this.f24728h.m15612l(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f24728h = new SimpleArrayMap<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f24728h.put(strArr[i2], bundleArr[i2]);
        }
    }
}
