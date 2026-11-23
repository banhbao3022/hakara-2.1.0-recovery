package p636z0.p745m.p746a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: z0.m.a.a, reason: use source file name */
/* JADX INFO: compiled from: AbsSavedState.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: g */
    public final Parcelable f38150g;

    /* JADX INFO: renamed from: f */
    public static final AbsSavedState f38149f = new a();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new b();

    /* JADX INFO: renamed from: z0.m.a.a$a */
    /* JADX INFO: compiled from: AbsSavedState.java */
    public class a extends AbsSavedState {
        public a() {
            super((a) null);
        }
    }

    public AbsSavedState(a aVar) {
        this.f38150g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f38150g, i);
    }

    /* JADX INFO: renamed from: z0.m.a.a$b */
    /* JADX INFO: compiled from: AbsSavedState.java */
    public class b implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbsSavedState.f38149f;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new AbsSavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f38149f;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f38150g = parcelable == f38149f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f38150g = parcelable == null ? f38149f : parcelable;
    }
}
