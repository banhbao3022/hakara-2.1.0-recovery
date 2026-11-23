package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum lt2 implements i82 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(CloseCodes.NORMAL_CLOSURE);


    /* JADX INFO: renamed from: j */
    public final int f16508j;

    lt2(int i) {
        this.f16508j = i;
    }

    /* JADX INFO: renamed from: f */
    public static lt2 m7617f(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + lt2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16508j + " name=" + name() + '>';
    }
}
