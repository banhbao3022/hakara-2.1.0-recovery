package p636z0.p752p.p753c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: z0.p.c.g0, reason: use source file name */
/* JADX INFO: compiled from: FragmentState.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final String f38322f;

    /* JADX INFO: renamed from: g */
    public final String f38323g;

    /* JADX INFO: renamed from: h */
    public final boolean f38324h;

    /* JADX INFO: renamed from: i */
    public final int f38325i;

    /* JADX INFO: renamed from: j */
    public final int f38326j;

    /* JADX INFO: renamed from: k */
    public final String f38327k;

    /* JADX INFO: renamed from: l */
    public final boolean f38328l;

    /* JADX INFO: renamed from: m */
    public final boolean f38329m;

    /* JADX INFO: renamed from: n */
    public final boolean f38330n;

    /* JADX INFO: renamed from: o */
    public final Bundle f38331o;

    /* JADX INFO: renamed from: p */
    public final boolean f38332p;

    /* JADX INFO: renamed from: q */
    public final int f38333q;

    /* JADX INFO: renamed from: r */
    public Bundle f38334r;

    /* JADX INFO: renamed from: z0.p.c.g0$a */
    /* JADX INFO: compiled from: FragmentState.java */
    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f38322f = fragment.getClass().getName();
        this.f38323g = fragment.f38437l;
        this.f38324h = fragment.f38445t;
        this.f38325i = fragment.f38406C;
        this.f38326j = fragment.f38407D;
        this.f38327k = fragment.f38408E;
        this.f38328l = fragment.f38411H;
        this.f38329m = fragment.f38444s;
        this.f38330n = fragment.f38410G;
        this.f38331o = fragment.f38438m;
        this.f38332p = fragment.f38409F;
        this.f38333q = fragment.f38424U.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f38322f);
        sb.append(" (");
        sb.append(this.f38323g);
        sb.append(")}:");
        if (this.f38324h) {
            sb.append(" fromLayout");
        }
        if (this.f38326j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f38326j));
        }
        String str = this.f38327k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f38327k);
        }
        if (this.f38328l) {
            sb.append(" retainInstance");
        }
        if (this.f38329m) {
            sb.append(" removing");
        }
        if (this.f38330n) {
            sb.append(" detached");
        }
        if (this.f38332p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38322f);
        parcel.writeString(this.f38323g);
        parcel.writeInt(this.f38324h ? 1 : 0);
        parcel.writeInt(this.f38325i);
        parcel.writeInt(this.f38326j);
        parcel.writeString(this.f38327k);
        parcel.writeInt(this.f38328l ? 1 : 0);
        parcel.writeInt(this.f38329m ? 1 : 0);
        parcel.writeInt(this.f38330n ? 1 : 0);
        parcel.writeBundle(this.f38331o);
        parcel.writeInt(this.f38332p ? 1 : 0);
        parcel.writeBundle(this.f38334r);
        parcel.writeInt(this.f38333q);
    }

    public FragmentState(Parcel parcel) {
        this.f38322f = parcel.readString();
        this.f38323g = parcel.readString();
        this.f38324h = parcel.readInt() != 0;
        this.f38325i = parcel.readInt();
        this.f38326j = parcel.readInt();
        this.f38327k = parcel.readString();
        this.f38328l = parcel.readInt() != 0;
        this.f38329m = parcel.readInt() != 0;
        this.f38330n = parcel.readInt() != 0;
        this.f38331o = parcel.readBundle();
        this.f38332p = parcel.readInt() != 0;
        this.f38334r = parcel.readBundle();
        this.f38333q = parcel.readInt();
    }
}
