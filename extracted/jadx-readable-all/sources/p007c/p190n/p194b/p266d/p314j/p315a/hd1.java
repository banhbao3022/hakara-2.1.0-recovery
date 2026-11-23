package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum hd1 implements i82 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(CloseCodes.NORMAL_CLOSURE);


    /* JADX INFO: renamed from: k */
    public final int f14823k;

    hd1(int i) {
        this.f14823k = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + hd1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14823k + " name=" + name() + '>';
    }
}
