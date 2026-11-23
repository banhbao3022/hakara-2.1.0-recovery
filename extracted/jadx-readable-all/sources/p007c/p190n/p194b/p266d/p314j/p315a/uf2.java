package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public final View f20303h;

    public uf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2, View view) {
        super(pe2Var, "/nUAVD6E5149sZYPq78F0SxtCINb4d4P8HJ52kECSRArxECTN1q26bJ2wQ4rH1F5", "ToWTu5sR1jYEliR/iVXRogiAAmKJy3kOi4U3O1i9Y2M=", go0Var, i, 57);
        this.f20303h = view;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        if (this.f20303h != null) {
            Boolean bool = (Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14192G1);
            se2 se2Var = new se2((String) this.f21526e.invoke(null, this.f20303h, this.f21522a.f17947b.getResources().getDisplayMetrics(), bool));
            f11 f11VarM6702v = f21.m6702v();
            long jLongValue = se2Var.f19540b.longValue();
            if (f11VarM6702v.f13191h) {
                f11VarM6702v.m6298m();
                f11VarM6702v.f13191h = false;
            }
            f21.m6704y((f21) f11VarM6702v.f13190g, jLongValue);
            long jLongValue2 = se2Var.f19541c.longValue();
            if (f11VarM6702v.f13191h) {
                f11VarM6702v.m6298m();
                f11VarM6702v.f13191h = false;
            }
            f21.m6705z((f21) f11VarM6702v.f13190g, jLongValue2);
            long jLongValue3 = se2Var.f19542d.longValue();
            if (f11VarM6702v.f13191h) {
                f11VarM6702v.m6298m();
                f11VarM6702v.f13191h = false;
            }
            f21.m6700A((f21) f11VarM6702v.f13190g, jLongValue3);
            if (bool.booleanValue()) {
                long jLongValue4 = se2Var.f19543e.longValue();
                if (f11VarM6702v.f13191h) {
                    f11VarM6702v.m6298m();
                    f11VarM6702v.f13191h = false;
                }
                f21.m6701B((f21) f11VarM6702v.f13190g, jLongValue4);
            }
            go0 go0Var = this.f21525d;
            f21 f21VarM6300o = f11VarM6702v.m6300o();
            if (go0Var.f13191h) {
                go0Var.m6298m();
                go0Var.f13191h = false;
            }
            f31.m6736X((f31) go0Var.f13190g, f21VarM6300o);
        }
    }
}
