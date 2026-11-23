package p007c.p190n.p194b.p266d.p298f.p302q;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p314j.p322h.HandlerC4065d;

/* JADX INFO: renamed from: c.n.b.d.f.q.p0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC2752p0 extends HandlerC4065d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2717c f11896a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2752p0(AbstractC2717c abstractC2717c, Looper looper) {
        super(looper);
        this.f11896a = abstractC2717c;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5607a(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        TListener tlistener;
        if (this.f11896a.f11821w.get() != message.arg1) {
            if (m5607a(message)) {
                AbstractC2754q0 abstractC2754q0 = (AbstractC2754q0) message.obj;
                abstractC2754q0.mo5594a();
                abstractC2754q0.m5609c();
                return;
            }
            return;
        }
        int i = message.what;
        if (i != 1 && i != 7) {
            if (i == 4) {
                Objects.requireNonNull(this.f11896a);
            } else if (i == 5) {
            }
            if (!this.f11896a.m5572d()) {
                AbstractC2754q0 abstractC2754q1 = (AbstractC2754q0) message.obj;
                abstractC2754q1.mo5594a();
                abstractC2754q1.m5609c();
                return;
            }
        } else if (!this.f11896a.m5572d()) {
            AbstractC2754q0 abstractC2754q2 = (AbstractC2754q0) message.obj;
            abstractC2754q2.mo5594a();
            abstractC2754q2.m5609c();
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.f11896a.f11818t = new C2602b(message.arg2);
            if (AbstractC2717c.m5569z(this.f11896a)) {
                AbstractC2717c abstractC2717c = this.f11896a;
                if (!abstractC2717c.f11819u) {
                    abstractC2717c.m5570B(3, null);
                    return;
                }
            }
            C2602b c2602b = this.f11896a.f11818t;
            if (c2602b == null) {
                c2602b = new C2602b(8);
            }
            this.f11896a.f11809k.mo5535a(c2602b);
            this.f11896a.mo5136v(c2602b);
            return;
        }
        if (i2 == 5) {
            C2602b c2602b2 = this.f11896a.f11818t;
            if (c2602b2 == null) {
                c2602b2 = new C2602b(8);
            }
            this.f11896a.f11809k.mo5535a(c2602b2);
            this.f11896a.mo5136v(c2602b2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            C2602b c2602b3 = new C2602b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f11896a.f11809k.mo5535a(c2602b3);
            this.f11896a.mo5136v(c2602b3);
            return;
        }
        if (i2 == 6) {
            this.f11896a.m5570B(5, null);
            AbstractC2717c.a aVar = this.f11896a.f11814p;
            if (aVar != null) {
                aVar.mo5562Q(message.arg2);
            }
            Objects.requireNonNull(this.f11896a);
            System.currentTimeMillis();
            AbstractC2717c.m5567A(this.f11896a, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.f11896a.m5582u0()) {
            AbstractC2754q0 abstractC2754q3 = (AbstractC2754q0) message.obj;
            abstractC2754q3.mo5594a();
            abstractC2754q3.m5609c();
            return;
        }
        if (!m5607a(message)) {
            Log.wtf("GmsClient", outline.m1585g(45, "Don't know how to handle message: ", message.what), new Exception());
            return;
        }
        AbstractC2754q0 abstractC2754q4 = (AbstractC2754q0) message.obj;
        synchronized (abstractC2754q4) {
            tlistener = abstractC2754q4.f11899a;
            if (abstractC2754q4.f11900b) {
                String strValueOf = String.valueOf(abstractC2754q4);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Callback proxy ");
                sb.append(strValueOf);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != 0) {
            try {
                abstractC2754q4.mo5595b(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (abstractC2754q4) {
            abstractC2754q4.f11900b = true;
        }
        abstractC2754q4.m5609c();
    }
}
