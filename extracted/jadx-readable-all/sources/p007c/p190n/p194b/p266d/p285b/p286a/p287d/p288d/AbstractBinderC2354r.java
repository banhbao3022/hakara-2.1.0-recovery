package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2334a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2635h;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2685q;
import p007c.p190n.p194b.p266d.p298f.p302q.C2721d0;
import p007c.p190n.p194b.p266d.p298f.p302q.C2724e0;
import p007c.p190n.p194b.p266d.p298f.p302q.C2755r;
import p007c.p190n.p194b.p266d.p298f.p304r.C2775a;
import p007c.p190n.p194b.p266d.p314j.p317c.BinderC3794b;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.r */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2354r extends BinderC3794b implements IInterface {
    public AbstractBinderC2354r() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p317c.BinderC3794b
    /* JADX INFO: renamed from: E0 */
    public final boolean mo4934E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        BasePendingResult basePendingResultMo5490a;
        BasePendingResult basePendingResultMo5490a2;
        if (i == 1) {
            BinderC2357u binderC2357u = (BinderC2357u) this;
            binderC2357u.m4937o();
            C2339c c2339cM4912a = C2339c.m4912a(binderC2357u.f10952f);
            GoogleSignInAccount googleSignInAccountM4914b = c2339cM4912a.m4914b();
            GoogleSignInOptions googleSignInOptionsM4915c = GoogleSignInOptions.f28511k;
            if (googleSignInAccountM4914b != null) {
                googleSignInOptionsM4915c = c2339cM4912a.m4915c();
            }
            Context context = binderC2357u.f10952f;
            Objects.requireNonNull(googleSignInOptionsM4915c, "null reference");
            C2334a c2334a = new C2334a(context, googleSignInOptionsM4915c);
            if (googleSignInAccountM4914b != null) {
                AbstractC2632e abstractC2632e = c2334a.f11616g;
                Context context2 = c2334a.f11610a;
                boolean z = c2334a.m4906d() == 3;
                C2346j.f10946a.m5613a("Revoking access", new Object[0]);
                String strM4918g = C2339c.m4912a(context2).m4918g("refreshToken");
                C2346j.m4928b(context2);
                if (z) {
                    C2775a c2775a = RunnableC2343g.f10942f;
                    if (strM4918g == null) {
                        Status status = new Status(4);
                        C2622l.m5379i(status, "Result must not be null");
                        C2622l.m5344b(!status.m12654H(), "Status code must not be SUCCESS");
                        basePendingResultMo5490a2 = new C2635h(null, status);
                        basePendingResultMo5490a2.mo4931a(status);
                    } else {
                        RunnableC2343g runnableC2343g = new RunnableC2343g(strM4918g);
                        new Thread(runnableC2343g).start();
                        basePendingResultMo5490a2 = runnableC2343g.f10944h;
                    }
                } else {
                    basePendingResultMo5490a2 = abstractC2632e.mo5490a(new C2348l(abstractC2632e));
                }
                basePendingResultMo5490a2.m12656e(new C2721d0(basePendingResultMo5490a2, new C4782j(), new C2724e0(), C2755r.f11902a));
            } else {
                AbstractC2632e abstractC2632e2 = c2334a.f11616g;
                Context context3 = c2334a.f11610a;
                boolean z2 = c2334a.m4906d() == 3;
                C2346j.f10946a.m5613a("Signing out", new Object[0]);
                C2346j.m4928b(context3);
                if (z2) {
                    Status status2 = Status.f28648f;
                    C2622l.m5379i(status2, "Result must not be null");
                    basePendingResultMo5490a = new C2685q(abstractC2632e2);
                    basePendingResultMo5490a.mo4931a(status2);
                } else {
                    basePendingResultMo5490a = abstractC2632e2.mo5490a(new C2347k(abstractC2632e2));
                }
                basePendingResultMo5490a.m12656e(new C2721d0(basePendingResultMo5490a, new C4782j(), new C2724e0(), C2755r.f11902a));
            }
        } else {
            if (i != 2) {
                return false;
            }
            BinderC2357u binderC2357u2 = (BinderC2357u) this;
            binderC2357u2.m4937o();
            C2352p.m4932b(binderC2357u2.f10952f).m4933a();
        }
        return true;
    }
}
