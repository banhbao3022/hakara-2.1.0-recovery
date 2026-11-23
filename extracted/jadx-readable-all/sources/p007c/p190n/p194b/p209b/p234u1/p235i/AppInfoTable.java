package p007c.p190n.p194b.p209b.p234u1.p235i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.i.a, reason: use source file name */
/* JADX INFO: compiled from: AppInfoTable.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements Metadata.b {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f8676f;

    /* JADX INFO: renamed from: g */
    public final String f8677g;

    /* JADX INFO: renamed from: c.n.b.b.u1.i.a$a */
    /* JADX INFO: compiled from: AppInfoTable.java */
    public class a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public AppInfoTable createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Objects.requireNonNull(string);
            return new AppInfoTable(parcel.readInt(), string);
        }

        @Override // android.os.Parcelable.Creator
        public AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.f8676f = i;
        this.f8677g = str;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: F */
    public /* synthetic */ byte[] mo4010F() {
        return Metadata2.m4012a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Ait(controlCode=");
        sbM1556G.append(this.f8676f);
        sbM1556G.append(",url=");
        return outline.m1550A(sbM1556G, this.f8677g, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8677g);
        parcel.writeInt(this.f8676f);
    }
}
