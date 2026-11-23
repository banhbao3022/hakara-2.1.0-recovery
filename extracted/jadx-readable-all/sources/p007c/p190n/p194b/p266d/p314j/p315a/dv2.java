package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum dv2 implements i82 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* JADX INFO: renamed from: k */
    public final int f13402k;

    dv2(int i) {
        this.f13402k = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + dv2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f13402k + " name=" + name() + '>';
    }
}
