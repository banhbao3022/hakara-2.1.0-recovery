package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.Looper;
import android.os.Message;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p319e.HandlerC3807c;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2671k<L> {

    /* JADX INFO: renamed from: a */
    public volatile L f11716a;

    /* JADX INFO: renamed from: b */
    public final a<L> f11717b;

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.k$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a<L> {

        /* JADX INFO: renamed from: a */
        public final L f11718a;

        /* JADX INFO: renamed from: b */
        public final String f11719b;

        public a(L l, String str) {
            this.f11718a = l;
            this.f11719b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11718a == aVar.f11718a && this.f11719b.equals(aVar.f11719b);
        }

        public final int hashCode() {
            return this.f11719b.hashCode() + (System.identityHashCode(this.f11718a) * 31);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.k$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b<L> {
        /* JADX INFO: renamed from: a */
        void m5543a(L l);

        /* JADX INFO: renamed from: b */
        void m5544b();
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.k$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public final class c extends HandlerC3807c {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C2622l.m5339a(message.what == 1);
            b bVar = (b) message.obj;
            L l = C2671k.this.f11716a;
            if (l == null) {
                bVar.m5544b();
                return;
            }
            try {
                bVar.m5543a(l);
            } catch (RuntimeException e) {
                bVar.m5544b();
                throw e;
            }
        }
    }

    public C2671k(Looper looper, L l, String str) {
        new c(looper);
        C2622l.m5379i(l, "Listener must not be null");
        this.f11716a = l;
        C2622l.m5359e(str);
        this.f11717b = new a<>(l, str);
    }
}
