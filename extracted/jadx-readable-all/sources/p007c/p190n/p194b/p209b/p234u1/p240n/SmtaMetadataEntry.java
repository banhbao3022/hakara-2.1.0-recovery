package p007c.p190n.p194b.p209b.p234u1.p240n;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.n.d, reason: use source file name */
/* JADX INFO: compiled from: SmtaMetadataEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.b {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final float f8767f;

    /* JADX INFO: renamed from: g */
    public final int f8768g;

    /* JADX INFO: renamed from: c.n.b.b.u1.n.d$a */
    /* JADX INFO: compiled from: SmtaMetadataEntry.java */
    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public SmtaMetadataEntry(float f, int i) {
        this.f8767f = f;
        this.f8768g = i;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f8767f == smtaMetadataEntry.f8767f && this.f8768g == smtaMetadataEntry.f8768g;
    }

    public int hashCode() {
        return ((527 + Float.valueOf(this.f8767f).hashCode()) * 31) + this.f8768g;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("smta: captureFrameRate=");
        sbM1556G.append(this.f8767f);
        sbM1556G.append(", svcTemporalLayerCount=");
        sbM1556G.append(this.f8768g);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f8767f);
        parcel.writeInt(this.f8768g);
    }

    public SmtaMetadataEntry(Parcel parcel, a aVar) {
        this.f8767f = parcel.readFloat();
        this.f8768g = parcel.readInt();
    }
}
