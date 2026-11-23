package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.kr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3224kr extends AbstractC3082gx {

    /* JADX INFO: renamed from: c */
    public static final C3224kr f16021c = new C3224kr();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3082gx
    /* JADX INFO: renamed from: a */
    public final b10 mo7037a(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new b30();
        }
        return "mvhd".equals(str) ? new b40() : new c50(str);
    }
}
