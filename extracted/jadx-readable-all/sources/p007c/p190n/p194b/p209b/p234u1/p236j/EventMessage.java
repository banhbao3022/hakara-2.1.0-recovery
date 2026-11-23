package p007c.p190n.p194b.p209b.p234u1.p236j;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;

/* JADX INFO: renamed from: c.n.b.b.u1.j.a, reason: use source file name */
/* JADX INFO: compiled from: EventMessage.java */
/* JADX INFO: loaded from: classes.dex */
public final class EventMessage implements Metadata.b {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* JADX INFO: renamed from: f */
    public static final Format f8678f;

    /* JADX INFO: renamed from: g */
    public static final Format f8679g;

    /* JADX INFO: renamed from: h */
    public final String f8680h;

    /* JADX INFO: renamed from: i */
    public final String f8681i;

    /* JADX INFO: renamed from: j */
    public final long f8682j;

    /* JADX INFO: renamed from: k */
    public final long f8683k;

    /* JADX INFO: renamed from: l */
    public final byte[] f8684l;

    /* JADX INFO: renamed from: m */
    public int f8685m;

    /* JADX INFO: renamed from: c.n.b.b.u1.j.a$a */
    /* JADX INFO: compiled from: EventMessage.java */
    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    static {
        Format.b bVar = new Format.b();
        bVar.f6958k = "application/id3";
        f8678f = bVar.m3519a();
        Format.b bVar2 = new Format.b();
        bVar2.f6958k = "application/x-scte35";
        f8679g = bVar2.m3519a();
        CREATOR = new a();
    }

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f8680h = str;
        this.f8681i = str2;
        this.f8682j = j2;
        this.f8683k = j3;
        this.f8684l = bArr;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: F */
    public byte[] mo4010F() {
        if (mo4011q() != null) {
            return this.f8684l;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f8682j == eventMessage.f8682j && this.f8683k == eventMessage.f8683k && Util6.m3113a(this.f8680h, eventMessage.f8680h) && Util6.m3113a(this.f8681i, eventMessage.f8681i) && Arrays.equals(this.f8684l, eventMessage.f8684l);
    }

    public int hashCode() {
        if (this.f8685m == 0) {
            String str = this.f8680h;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f8681i;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j2 = this.f8682j;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f8683k;
            this.f8685m = Arrays.hashCode(this.f8684l) + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f8685m;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public Format mo4011q() {
        String str = this.f8680h;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f8679g;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f8678f;
            default:
                return null;
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("EMSG: scheme=");
        sbM1556G.append(this.f8680h);
        sbM1556G.append(", id=");
        sbM1556G.append(this.f8683k);
        sbM1556G.append(", durationMs=");
        sbM1556G.append(this.f8682j);
        sbM1556G.append(", value=");
        sbM1556G.append(this.f8681i);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8680h);
        parcel.writeString(this.f8681i);
        parcel.writeLong(this.f8682j);
        parcel.writeLong(this.f8683k);
        parcel.writeByteArray(this.f8684l);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8680h = string;
        this.f8681i = parcel.readString();
        this.f8682j = parcel.readLong();
        this.f8683k = parcel.readLong();
        this.f8684l = parcel.createByteArray();
    }
}
