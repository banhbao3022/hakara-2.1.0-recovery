package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;

/* JADX INFO: renamed from: c.n.d.l.e.k.d1, reason: use source file name */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public class Utils5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Callable f26475f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4782j f26476g;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: c.n.d.l.e.k.d1$a */
    /* JADX INFO: compiled from: Utils.java */
    public class a<T> implements InterfaceC4767b<T, Void> {
        public a() {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
        /* JADX INFO: renamed from: a */
        public Void mo5191a(AbstractC4781i abstractC4781i) throws Exception {
            if (abstractC4781i.mo10941n()) {
                Utils5.this.f26476g.f24683a.m10944q((TResult) abstractC4781i.mo10937j());
                return null;
            }
            C4782j c4782j = Utils5.this.f26476g;
            c4782j.f24683a.m10943p(abstractC4781i.mo10936i());
            return null;
        }
    }

    public Utils5(Callable callable, C4782j c4782j) {
        this.f26475f = callable;
        this.f26476g = c4782j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((AbstractC4781i) this.f26475f.call()).mo10933f(new a());
        } catch (Exception e) {
            this.f26476g.f24683a.m10943p(e);
        }
    }
}
