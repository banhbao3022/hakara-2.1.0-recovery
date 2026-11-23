package p007c.p190n.p194b.p209b.p234u1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.a, reason: use source file name */
/* JADX INFO: compiled from: Metadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final b[] f8661f;

    /* JADX INFO: renamed from: c.n.b.b.u1.a$a */
    /* JADX INFO: compiled from: Metadata.java */
    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.u1.a$b */
    /* JADX INFO: compiled from: Metadata.java */
    public interface b extends Parcelable {
        /* JADX INFO: renamed from: F */
        byte[] mo4010F();

        /* JADX INFO: renamed from: q */
        Format mo4011q();
    }

    public Metadata(b... bVarArr) {
        this.f8661f = bVarArr;
    }

    /* JADX INFO: renamed from: a */
    public Metadata m4008a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        b[] bVarArr2 = this.f8661f;
        int i = Util6.f6307a;
        Object[] objArrCopyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, objArrCopyOf, bVarArr2.length, bVarArr.length);
        return new Metadata((b[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: b */
    public Metadata m4009b(Metadata metadata) {
        return metadata == null ? this : m4008a(metadata.f8661f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8661f, ((Metadata) obj).f8661f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8661f);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("entries=");
        sbM1556G.append(Arrays.toString(this.f8661f));
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8661f.length);
        for (b bVar : this.f8661f) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public Metadata(List<? extends b> list) {
        this.f8661f = (b[]) list.toArray(new b[0]);
    }

    public Metadata(Parcel parcel) {
        this.f8661f = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.f8661f;
            if (i >= bVarArr.length) {
                return;
            }
            bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
            i++;
        }
    }
}
