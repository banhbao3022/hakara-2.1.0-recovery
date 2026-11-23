package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 {

    /* JADX INFO: renamed from: a */
    public final s32 f17467a;

    public nw1(s32 s32Var) {
        this.f17467a = s32Var;
    }

    public final String toString() {
        s32 s32Var = this.f17467a;
        int i = dx1.f13419a;
        u32 u32VarM8715v = x32.m8715v();
        int iM8343v = s32Var.m8343v();
        if (u32VarM8715v.f13191h) {
            u32VarM8715v.m6298m();
            u32VarM8715v.f13191h = false;
        }
        ((x32) u32VarM8715v.f13190g).zzb = iM8343v;
        for (r32 r32Var : s32Var.m8344x()) {
            v32 v32VarM8608v = w32.m8608v();
            String strM6776v = r32Var.m8249x().m6776v();
            if (v32VarM8608v.f13191h) {
                v32VarM8608v.m6298m();
                v32VarM8608v.f13191h = false;
            }
            w32.m8610y((w32) v32VarM8608v.f13190g, strM6776v);
            h32 h32VarM8250y = r32Var.m8250y();
            if (v32VarM8608v.f13191h) {
                v32VarM8608v.m6298m();
                v32VarM8608v.f13191h = false;
            }
            w32.m8611z((w32) v32VarM8608v.f13190g, h32VarM8250y);
            l42 l42VarM8247A = r32Var.m8247A();
            if (v32VarM8608v.f13191h) {
                v32VarM8608v.m6298m();
                v32VarM8608v.f13191h = false;
            }
            w32.m8607B((w32) v32VarM8608v.f13190g, l42VarM8247A);
            int iM8251z = r32Var.m8251z();
            if (v32VarM8608v.f13191h) {
                v32VarM8608v.m6298m();
                v32VarM8608v.f13191h = false;
            }
            ((w32) v32VarM8608v.f13190g).zzf = iM8251z;
            w32 w32VarM6300o = v32VarM8608v.m6300o();
            if (u32VarM8715v.f13191h) {
                u32VarM8715v.m6298m();
                u32VarM8715v.f13191h = false;
            }
            x32.m8718z((x32) u32VarM8715v.f13190g, w32VarM6300o);
        }
        return u32VarM8715v.m6300o().toString();
    }
}
