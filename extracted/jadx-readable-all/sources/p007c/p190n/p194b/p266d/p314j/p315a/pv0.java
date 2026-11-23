package p007c.p190n.p194b.p266d.p314j.p315a;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 {

    /* JADX INFO: renamed from: a */
    public final lv0 f18101a;

    /* JADX INFO: renamed from: b */
    public final lv1 f18102b;

    public pv0(lv0 lv0Var, lv1 lv1Var) {
        this.f18101a = lv0Var;
        this.f18102b = lv1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8164a(dl1<SQLiteDatabase, Void> dl1Var) {
        lv1 lv1Var = this.f18102b;
        final lv0 lv0Var = this.f18101a;
        kv1 kv1VarMo6691u0 = lv1Var.mo6691u0(new Callable(lv0Var) { // from class: c.n.b.d.j.a.nv0

            /* JADX INFO: renamed from: a */
            public final lv0 f17460a;

            {
                this.f17460a = lv0Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17460a.getWritableDatabase();
            }
        });
        ov0 ov0Var = new ov0(dl1Var);
        kv1VarMo6691u0.mo6230f(new ev1(kv1VarMo6691u0, ov0Var), this.f18102b);
    }
}
