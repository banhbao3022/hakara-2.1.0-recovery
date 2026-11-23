package p007c.p165l.p178k0;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import p007c.p165l.CallbackManager;

/* JADX INFO: renamed from: c.l.k0.e, reason: use source file name */
/* JADX INFO: compiled from: CallbackManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class CallbackManagerImpl implements CallbackManager {

    /* JADX INFO: renamed from: a */
    public static Map<Integer, a> f4907a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Map<Integer, a> f4908b = new HashMap();

    /* JADX INFO: renamed from: c.l.k0.e$a */
    /* JADX INFO: compiled from: CallbackManagerImpl.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo2427a(int i, Intent intent);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m2425b(int i, a aVar) {
        Validate.m2477f(aVar, "callback");
        if (f4907a.containsKey(Integer.valueOf(i))) {
            return;
        }
        f4907a.put(Integer.valueOf(i), aVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2426a(int i, int i2, Intent intent) {
        a aVar;
        a aVar2 = this.f4908b.get(Integer.valueOf(i));
        if (aVar2 != null) {
            return aVar2.mo2427a(i2, intent);
        }
        Integer numValueOf = Integer.valueOf(i);
        synchronized (CallbackManagerImpl.class) {
            aVar = f4907a.get(numValueOf);
        }
        if (aVar != null) {
            return aVar.mo2427a(i2, intent);
        }
        return false;
    }
}
