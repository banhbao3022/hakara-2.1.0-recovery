package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;
import p007c.p190n.p191a.p192d.InterfaceC1256b;
import p007c.p190n.p191a.p192d.InterfaceC1260f;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2107a;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.C2128c;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.InterfaceC2126a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ld */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3247ld extends AbstractBinderC3358od {

    /* JADX INFO: renamed from: f */
    public Map<Class<?>, ?> f16317f;

    static {
        new C3397pf();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: E */
    public final boolean mo7583E(String str) throws RemoteException {
        try {
            return InterfaceC2126a.class.isAssignableFrom(Class.forName(str, false, BinderC3247ld.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            C2622l.m5226A3(sb.toString());
            return false;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: S */
    public final InterfaceC3249lf mo7584S(String str) throws RemoteException {
        try {
            return new BinderC3657wf((RtbAdapter) Class.forName(str, false, C3397pf.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: o0 */
    public final boolean mo7585o0(String str) throws RemoteException {
        try {
            return AbstractC2107a.class.isAssignableFrom(Class.forName(str, false, BinderC3247ld.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            C2622l.m5226A3(sb.toString());
            return false;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: t */
    public final InterfaceC3506sd mo7586t(String str) throws RemoteException {
        InterfaceC3506sd binderC3470re;
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC3247ld.class.getClassLoader());
                if (InterfaceC1256b.class.isAssignableFrom(cls)) {
                    InterfaceC1256b interfaceC1256b = (InterfaceC1256b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new BinderC3470re(interfaceC1256b, (InterfaceC1260f) this.f16317f.get(interfaceC1256b.getAdditionalParametersType()));
                }
                if (InterfaceC2112f.class.isAssignableFrom(cls)) {
                    return new BinderC3322ne((InterfaceC2112f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (AbstractC2107a.class.isAssignableFrom(cls)) {
                    return new BinderC3322ne((AbstractC2107a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                C2622l.m5226A3(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                C2622l.m5241D3(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            C2622l.m5318U2("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                binderC3470re = new BinderC3322ne(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                binderC3470re = new BinderC3322ne(new AdUrlAdapter());
            } else {
                if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        CustomEventAdapter customEventAdapter = new CustomEventAdapter();
                        binderC3470re = new BinderC3470re(customEventAdapter, (C2128c) this.f16317f.get(customEventAdapter.getAdditionalParametersType()));
                    }
                    throw new RemoteException();
                }
                binderC3470re = new BinderC3322ne(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
            }
            return binderC3470re;
        }
    }
}
