package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.v1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4374v1 implements InterfaceC4183h5 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4183h5 f23510a = new C4374v1();

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4183h5
    /* JADX INFO: renamed from: b */
    public final boolean mo9829b(int i) {
        C4347t1.a aVar;
        if (i == 0) {
            aVar = C4347t1.a.UNKNOWN;
        } else if (i == 1) {
            aVar = C4347t1.a.STRING;
        } else if (i == 2) {
            aVar = C4347t1.a.NUMBER;
        } else if (i != 3) {
            aVar = i != 4 ? null : C4347t1.a.STATEMENT;
        } else {
            aVar = C4347t1.a.BOOLEAN;
        }
        return aVar != null;
    }
}
