package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cv2 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f13127a = new cv2();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        dv2 dv2Var;
        if (i == 0) {
            dv2Var = dv2.VIDEO_ERROR_CODE_UNSPECIFIED;
        } else if (i == 1) {
            dv2Var = dv2.OPENGL_RENDERING_FAILED;
        } else if (i != 2) {
            dv2Var = i != 3 ? null : dv2.ANDROID_TARGET_API_TOO_LOW;
        } else {
            dv2Var = dv2.CACHE_LOAD_FAILED;
        }
        return dv2Var != null;
    }
}
