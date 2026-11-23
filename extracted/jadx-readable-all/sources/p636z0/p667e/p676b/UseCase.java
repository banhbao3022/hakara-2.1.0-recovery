package p636z0.p667e.p676b;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.p677v1.CameraInfoInternal;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.ImageOutputConfig2;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig2;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p667e.p676b.p681w1.TargetConfig2;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.s1, reason: use source file name */
/* JADX INFO: compiled from: UseCase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class UseCase {

    /* JADX INFO: renamed from: d */
    public UseCaseConfig2<?> f36016d;

    /* JADX INFO: renamed from: e */
    public UseCaseConfig2<?> f36017e;

    /* JADX INFO: renamed from: f */
    public UseCaseConfig2<?> f36018f;

    /* JADX INFO: renamed from: g */
    public Size f36019g;

    /* JADX INFO: renamed from: h */
    public UseCaseConfig2<?> f36020h;

    /* JADX INFO: renamed from: i */
    public Rect f36021i;

    /* JADX INFO: renamed from: j */
    public CameraInternal2 f36022j;

    /* JADX INFO: renamed from: a */
    public final Set<b> f36013a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Object f36014b = new Object();

    /* JADX INFO: renamed from: c */
    public int f36015c = 2;

    /* JADX INFO: renamed from: k */
    public SessionConfig f36023k = SessionConfig.m15370a();

    /* JADX INFO: renamed from: z0.e.b.s1$a */
    /* JADX INFO: compiled from: UseCase.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m15309a();

        /* JADX INFO: renamed from: b */
        void m15310b(CameraInfo cameraInfo);
    }

    /* JADX INFO: renamed from: z0.e.b.s1$b */
    /* JADX INFO: compiled from: UseCase.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15158a(UseCase useCase);

        /* JADX INFO: renamed from: b */
        void mo15159b(UseCase useCase);

        /* JADX INFO: renamed from: c */
        void mo15160c(UseCase useCase);

        /* JADX INFO: renamed from: d */
        void mo15161d(UseCase useCase);
    }

    public UseCase(UseCaseConfig2<?> useCaseConfig2) {
        this.f36017e = useCaseConfig2;
        this.f36018f = useCaseConfig2;
    }

    /* JADX INFO: renamed from: a */
    public CameraInternal2 m15300a() {
        CameraInternal2 cameraInternal2;
        synchronized (this.f36014b) {
            cameraInternal2 = this.f36022j;
        }
        return cameraInternal2;
    }

    /* JADX INFO: renamed from: b */
    public String m15301b() {
        CameraInternal2 cameraInternal2M15300a = m15300a();
        C8162a.m16063h(cameraInternal2M15300a, "No camera attached to use case: " + this);
        return cameraInternal2M15300a.mo15166i().mo15183a();
    }

    /* JADX INFO: renamed from: c */
    public abstract UseCaseConfig2<?> mo15246c(boolean z, UseCaseConfigFactory useCaseConfigFactory);

    /* JADX INFO: renamed from: d */
    public int m15302d() {
        return this.f36018f.mo15108i();
    }

    /* JADX INFO: renamed from: e */
    public String m15303e() {
        UseCaseConfig2<?> useCaseConfig2 = this.f36018f;
        StringBuilder sbM1556G = outline.m1556G("<UnknownUseCase-");
        sbM1556G.append(hashCode());
        sbM1556G.append(">");
        return useCaseConfig2.mo15112o(sbM1556G.toString());
    }

    /* JADX INFO: renamed from: f */
    public abstract UseCaseConfig2.a<?, ?, ?> mo15247f(Config3 config3);

    /* JADX INFO: renamed from: g */
    public UseCaseConfig2<?> m15304g(CameraInfoInternal cameraInfoInternal, UseCaseConfig2<?> useCaseConfig2, UseCaseConfig2<?> useCaseConfig3) {
        MutableOptionsBundle mutableOptionsBundleM15434y;
        if (useCaseConfig3 != null) {
            mutableOptionsBundleM15434y = MutableOptionsBundle.m15435z(useCaseConfig3);
            mutableOptionsBundleM15434y.f36111s.remove(TargetConfig2.f36348n);
        } else {
            mutableOptionsBundleM15434y = MutableOptionsBundle.m15434y();
        }
        for (Config3.a<?> aVar : this.f36017e.mo15104c()) {
            mutableOptionsBundleM15434y.m15436A(aVar, this.f36017e.mo15106e(aVar), this.f36017e.mo15102a(aVar));
        }
        if (useCaseConfig2 != null) {
            for (Config3.a<?> aVar2 : useCaseConfig2.mo15104c()) {
                if (!aVar2.mo15383a().equals(TargetConfig2.f36348n.mo15383a())) {
                    mutableOptionsBundleM15434y.m15436A(aVar2, useCaseConfig2.mo15106e(aVar2), useCaseConfig2.mo15102a(aVar2));
                }
            }
        }
        if (mutableOptionsBundleM15434y.mo15103b(ImageOutputConfig2.f36301d)) {
            Config3.a<Integer> aVar3 = ImageOutputConfig2.f36299b;
            if (mutableOptionsBundleM15434y.mo15103b(aVar3)) {
                mutableOptionsBundleM15434y.f36111s.remove(aVar3);
            }
        }
        return mo15281n(cameraInfoInternal, mo15247f(mutableOptionsBundleM15434y));
    }

    /* JADX INFO: renamed from: h */
    public final void m15305h() {
        Iterator<b> it = this.f36013a.iterator();
        while (it.hasNext()) {
            it.next().mo15159b(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15306i() {
        int iM15315d = C7804v0.m15315d(this.f36015c);
        if (iM15315d == 0) {
            Iterator<b> it = this.f36013a.iterator();
            while (it.hasNext()) {
                it.next().mo15158a(this);
            }
        } else {
            if (iM15315d != 1) {
                return;
            }
            Iterator<b> it2 = this.f36013a.iterator();
            while (it2.hasNext()) {
                it2.next().mo15161d(this);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: j */
    public void m15307j(CameraInternal2 cameraInternal2, UseCaseConfig2<?> useCaseConfig2, UseCaseConfig2<?> useCaseConfig3) {
        synchronized (this.f36014b) {
            this.f36022j = cameraInternal2;
            this.f36013a.add(cameraInternal2);
        }
        this.f36016d = useCaseConfig2;
        this.f36020h = useCaseConfig3;
        UseCaseConfig2<?> useCaseConfig2M15304g = m15304g(cameraInternal2.mo15166i(), this.f36016d, this.f36020h);
        this.f36018f = useCaseConfig2M15304g;
        a aVarMo15116u = useCaseConfig2M15304g.mo15116u(null);
        if (aVarMo15116u != null) {
            aVarMo15116u.m15310b(cameraInternal2.mo15166i());
        }
        mo15248k();
    }

    /* JADX INFO: renamed from: k */
    public void mo15248k() {
    }

    /* JADX INFO: renamed from: l */
    public void m15308l(CameraInternal2 cameraInternal2) {
        mo15249m();
        a aVarMo15116u = this.f36018f.mo15116u(null);
        if (aVarMo15116u != null) {
            aVarMo15116u.m15309a();
        }
        synchronized (this.f36014b) {
            C8162a.m16060e(cameraInternal2 == this.f36022j);
            this.f36013a.remove(this.f36022j);
            this.f36022j = null;
        }
        this.f36019g = null;
        this.f36021i = null;
        this.f36018f = this.f36017e;
        this.f36016d = null;
        this.f36020h = null;
    }

    /* JADX INFO: renamed from: m */
    public void mo15249m() {
    }

    /* JADX INFO: renamed from: n */
    public UseCaseConfig2<?> mo15281n(CameraInfoInternal cameraInfoInternal, UseCaseConfig2.a<?, ?, ?> aVar) {
        return aVar.mo15252b();
    }

    /* JADX INFO: renamed from: o */
    public abstract Size mo15250o(Size size);
}
