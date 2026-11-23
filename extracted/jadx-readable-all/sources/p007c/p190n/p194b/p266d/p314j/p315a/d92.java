package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d92 implements k92 {

    /* JADX INFO: renamed from: a */
    public final k92[] f13195a;

    public d92(k92... k92VarArr) {
        this.f13195a = k92VarArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k92
    /* JADX INFO: renamed from: a */
    public final boolean mo6149a(Class<?> cls) {
        k92[] k92VarArr = this.f13195a;
        for (int i = 0; i < 2; i++) {
            if (k92VarArr[i].mo6149a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k92
    /* JADX INFO: renamed from: b */
    public final j92 mo6150b(Class<?> cls) {
        k92[] k92VarArr = this.f13195a;
        for (int i = 0; i < 2; i++) {
            k92 k92Var = k92VarArr[i];
            if (k92Var.mo6149a(cls)) {
                return k92Var.mo6150b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
