package p636z0.p692g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: z0.g0.c, reason: use source file name */
/* JADX INFO: compiled from: VersionedParcelParcel.java */
/* JADX INFO: loaded from: classes.dex */
public class VersionedParcelParcel extends VersionedParcel {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f36676d;

    /* JADX INFO: renamed from: e */
    public final Parcel f36677e;

    /* JADX INFO: renamed from: f */
    public final int f36678f;

    /* JADX INFO: renamed from: g */
    public final int f36679g;

    /* JADX INFO: renamed from: h */
    public final String f36680h;

    /* JADX INFO: renamed from: i */
    public int f36681i;

    /* JADX INFO: renamed from: j */
    public int f36682j;

    /* JADX INFO: renamed from: k */
    public int f36683k;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: a */
    public void mo15622a() {
        int i = this.f36681i;
        if (i >= 0) {
            int i2 = this.f36676d.get(i);
            int iDataPosition = this.f36677e.dataPosition();
            this.f36677e.setDataPosition(i2);
            this.f36677e.writeInt(iDataPosition - i2);
            this.f36677e.setDataPosition(iDataPosition);
        }
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: b */
    public VersionedParcel mo15623b() {
        Parcel parcel = this.f36677e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f36682j;
        if (i == this.f36678f) {
            i = this.f36679g;
        }
        return new VersionedParcelParcel(parcel, iDataPosition, i, outline.m1550A(new StringBuilder(), this.f36680h, "  "), this.f36673a, this.f36674b, this.f36675c);
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: f */
    public boolean mo15627f() {
        return this.f36677e.readInt() != 0;
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: g */
    public byte[] mo15628g() {
        int i = this.f36677e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f36677e.readByteArray(bArr);
        return bArr;
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: h */
    public CharSequence mo15629h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f36677e);
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: i */
    public boolean mo15630i(int i) {
        while (this.f36682j < this.f36679g) {
            int i2 = this.f36683k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f36677e.setDataPosition(this.f36682j);
            int i3 = this.f36677e.readInt();
            this.f36683k = this.f36677e.readInt();
            this.f36682j += i3;
        }
        return this.f36683k == i;
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: j */
    public int mo15631j() {
        return this.f36677e.readInt();
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: l */
    public <T extends Parcelable> T mo15633l() {
        return (T) this.f36677e.readParcelable(VersionedParcelParcel.class.getClassLoader());
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: n */
    public String mo15635n() {
        return this.f36677e.readString();
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: p */
    public void mo15637p(int i) {
        mo15622a();
        this.f36681i = i;
        this.f36676d.put(i, this.f36677e.dataPosition());
        this.f36677e.writeInt(0);
        this.f36677e.writeInt(i);
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: q */
    public void mo15638q(boolean z) {
        this.f36677e.writeInt(z ? 1 : 0);
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: r */
    public void mo15639r(byte[] bArr) {
        if (bArr == null) {
            this.f36677e.writeInt(-1);
        } else {
            this.f36677e.writeInt(bArr.length);
            this.f36677e.writeByteArray(bArr);
        }
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: s */
    public void mo15640s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f36677e, 0);
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: t */
    public void mo15641t(int i) {
        this.f36677e.writeInt(i);
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: u */
    public void mo15642u(Parcelable parcelable) {
        this.f36677e.writeParcelable(parcelable, 0);
    }

    @Override // p636z0.p692g0.VersionedParcel
    /* JADX INFO: renamed from: v */
    public void mo15643v(String str) {
        this.f36677e.writeString(str);
    }

    public VersionedParcelParcel(Parcel parcel, int i, int i2, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f36676d = new SparseIntArray();
        this.f36681i = -1;
        this.f36682j = 0;
        this.f36683k = -1;
        this.f36677e = parcel;
        this.f36678f = i;
        this.f36679g = i2;
        this.f36682j = i;
        this.f36680h = str;
    }
}
