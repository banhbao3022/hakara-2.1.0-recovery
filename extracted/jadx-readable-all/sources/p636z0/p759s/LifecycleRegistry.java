package p636z0.p759s;

import android.annotation.SuppressLint;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p655c.p656a.p657a.ArchTaskExecutor;
import p636z0.p655c.p656a.p658b.FastSafeIterableMap;
import p636z0.p655c.p656a.p658b.SafeIterableMap;

/* JADX INFO: renamed from: z0.s.o, reason: use source file name */
/* JADX INFO: compiled from: LifecycleRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle3 {

    /* JADX INFO: renamed from: c */
    public final WeakReference<LifecycleOwner> f38706c;

    /* JADX INFO: renamed from: a */
    public FastSafeIterableMap<LifecycleObserver, a> f38704a = new FastSafeIterableMap<>();

    /* JADX INFO: renamed from: d */
    public int f38707d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f38708e = false;

    /* JADX INFO: renamed from: f */
    public boolean f38709f = false;

    /* JADX INFO: renamed from: g */
    public ArrayList<Lifecycle3.b> f38710g = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Lifecycle3.b f38705b = Lifecycle3.b.INITIALIZED;

    /* JADX INFO: renamed from: h */
    public final boolean f38711h = true;

    /* JADX INFO: renamed from: z0.s.o$a */
    /* JADX INFO: compiled from: LifecycleRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Lifecycle3.b f38712a;

        /* JADX INFO: renamed from: b */
        public LifecycleEventObserver f38713b;

        public a(LifecycleObserver lifecycleObserver, Lifecycle3.b bVar) {
            LifecycleEventObserver reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = Lifecycling.f38715a;
            boolean z = lifecycleObserver instanceof LifecycleEventObserver;
            boolean z2 = lifecycleObserver instanceof FullLifecycleObserver;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((FullLifecycleObserver) lifecycleObserver, (LifecycleEventObserver) lifecycleObserver);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((FullLifecycleObserver) lifecycleObserver, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (LifecycleEventObserver) lifecycleObserver;
            } else {
                Class<?> cls = lifecycleObserver.getClass();
                if (Lifecycling.m16741c(cls) == 2) {
                    List<Constructor<? extends GeneratedAdapter>> list = Lifecycling.f38716b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(Lifecycling.m16739a(list.get(0), lifecycleObserver));
                    } else {
                        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            generatedAdapterArr[i] = Lifecycling.m16739a(list.get(i), lifecycleObserver);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(lifecycleObserver);
                }
            }
            this.f38713b = reflectiveGenericLifecycleObserver;
            this.f38712a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public void m16738a(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
            Lifecycle3.b targetState = aVar.getTargetState();
            this.f38712a = LifecycleRegistry.m16730g(this.f38712a, targetState);
            this.f38713b.mo130c(lifecycleOwner, aVar);
            this.f38712a = targetState;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this.f38706c = new WeakReference<>(lifecycleOwner);
    }

    /* JADX INFO: renamed from: g */
    public static Lifecycle3.b m16730g(Lifecycle3.b bVar, Lifecycle3.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @Override // p636z0.p759s.Lifecycle3
    /* JADX INFO: renamed from: a */
    public void mo16727a(LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner;
        m16732e("addObserver");
        Lifecycle3.b bVar = this.f38705b;
        Lifecycle3.b bVar2 = Lifecycle3.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = Lifecycle3.b.INITIALIZED;
        }
        a aVar = new a(lifecycleObserver, bVar2);
        if (this.f38704a.mo15029j(lifecycleObserver, aVar) == null && (lifecycleOwner = this.f38706c.get()) != null) {
            boolean z = this.f38707d != 0 || this.f38708e;
            Lifecycle3.b bVarM16731d = m16731d(lifecycleObserver);
            this.f38707d++;
            while (aVar.f38712a.compareTo(bVarM16731d) < 0 && this.f38704a.f35310j.containsKey(lifecycleObserver)) {
                this.f38710g.add(aVar.f38712a);
                Lifecycle3.a aVarUpFrom = Lifecycle3.a.upFrom(aVar.f38712a);
                if (aVarUpFrom == null) {
                    StringBuilder sbM1556G = outline.m1556G("no event up from ");
                    sbM1556G.append(aVar.f38712a);
                    throw new IllegalStateException(sbM1556G.toString());
                }
                aVar.m16738a(lifecycleOwner, aVarUpFrom);
                m16735i();
                bVarM16731d = m16731d(lifecycleObserver);
            }
            if (!z) {
                m16737k();
            }
            this.f38707d--;
        }
    }

    @Override // p636z0.p759s.Lifecycle3
    /* JADX INFO: renamed from: b */
    public Lifecycle3.b mo16728b() {
        return this.f38705b;
    }

    @Override // p636z0.p759s.Lifecycle3
    /* JADX INFO: renamed from: c */
    public void mo16729c(LifecycleObserver lifecycleObserver) {
        m16732e("removeObserver");
        this.f38704a.mo15030m(lifecycleObserver);
    }

    /* JADX INFO: renamed from: d */
    public final Lifecycle3.b m16731d(LifecycleObserver lifecycleObserver) {
        FastSafeIterableMap<LifecycleObserver, a> fastSafeIterableMap = this.f38704a;
        Lifecycle3.b bVar = null;
        SafeIterableMap.c<LifecycleObserver, a> cVar = fastSafeIterableMap.f35310j.containsKey(lifecycleObserver) ? fastSafeIterableMap.f35310j.get(lifecycleObserver).f35318i : null;
        Lifecycle3.b bVar2 = cVar != null ? cVar.f35316g.f38712a : null;
        if (!this.f38710g.isEmpty()) {
            ArrayList<Lifecycle3.b> arrayList = this.f38710g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m16730g(m16730g(this.f38705b, bVar2), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: e */
    public final void m16732e(String str) {
        if (this.f38711h && !ArchTaskExecutor.m15023d().mo15025b()) {
            throw new IllegalStateException(outline.m1600v("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m16733f(Lifecycle3.a aVar) {
        m16732e("handleLifecycleEvent");
        m16734h(aVar.getTargetState());
    }

    /* JADX INFO: renamed from: h */
    public final void m16734h(Lifecycle3.b bVar) {
        if (this.f38705b == bVar) {
            return;
        }
        this.f38705b = bVar;
        if (this.f38708e || this.f38707d != 0) {
            this.f38709f = true;
            return;
        }
        this.f38708e = true;
        m16737k();
        this.f38708e = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m16735i() {
        ArrayList<Lifecycle3.b> arrayList = this.f38710g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: j */
    public void m16736j(Lifecycle3.b bVar) {
        m16732e("setCurrentState");
        m16734h(bVar);
    }

    /* JADX INFO: renamed from: k */
    public final void m16737k() {
        LifecycleOwner lifecycleOwner = this.f38706c.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            FastSafeIterableMap<LifecycleObserver, a> fastSafeIterableMap = this.f38704a;
            boolean z = true;
            if (fastSafeIterableMap.f35314i != 0) {
                Lifecycle3.b bVar = fastSafeIterableMap.f35311f.f35316g.f38712a;
                Lifecycle3.b bVar2 = fastSafeIterableMap.f35312g.f35316g.f38712a;
                if (bVar != bVar2 || this.f38705b != bVar2) {
                    z = false;
                }
            }
            if (z) {
                this.f38709f = false;
                return;
            }
            this.f38709f = false;
            if (this.f38705b.compareTo(fastSafeIterableMap.f35311f.f35316g.f38712a) < 0) {
                FastSafeIterableMap<LifecycleObserver, a> fastSafeIterableMap2 = this.f38704a;
                SafeIterableMap.b bVar3 = new SafeIterableMap.b(fastSafeIterableMap2.f35312g, fastSafeIterableMap2.f35311f);
                fastSafeIterableMap2.f35313h.put(bVar3, Boolean.FALSE);
                while (bVar3.hasNext() && !this.f38709f) {
                    Map.Entry entry = (Map.Entry) bVar3.next();
                    a aVar = (a) entry.getValue();
                    while (aVar.f38712a.compareTo(this.f38705b) > 0 && !this.f38709f && this.f38704a.contains((LifecycleObserver) entry.getKey())) {
                        Lifecycle3.a aVarDownFrom = Lifecycle3.a.downFrom(aVar.f38712a);
                        if (aVarDownFrom == null) {
                            StringBuilder sbM1556G = outline.m1556G("no event down from ");
                            sbM1556G.append(aVar.f38712a);
                            throw new IllegalStateException(sbM1556G.toString());
                        }
                        this.f38710g.add(aVarDownFrom.getTargetState());
                        aVar.m16738a(lifecycleOwner, aVarDownFrom);
                        m16735i();
                    }
                }
            }
            SafeIterableMap.c<LifecycleObserver, a> cVar = this.f38704a.f35312g;
            if (!this.f38709f && cVar != null && this.f38705b.compareTo(cVar.f35316g.f38712a) > 0) {
                SafeIterableMap<LifecycleObserver, a>.d dVarM15031f = this.f38704a.m15031f();
                while (dVarM15031f.hasNext() && !this.f38709f) {
                    Map.Entry entry2 = (Map.Entry) dVarM15031f.next();
                    a aVar2 = (a) entry2.getValue();
                    while (aVar2.f38712a.compareTo(this.f38705b) < 0 && !this.f38709f && this.f38704a.contains((LifecycleObserver) entry2.getKey())) {
                        this.f38710g.add(aVar2.f38712a);
                        Lifecycle3.a aVarUpFrom = Lifecycle3.a.upFrom(aVar2.f38712a);
                        if (aVarUpFrom == null) {
                            StringBuilder sbM1556G2 = outline.m1556G("no event up from ");
                            sbM1556G2.append(aVar2.f38712a);
                            throw new IllegalStateException(sbM1556G2.toString());
                        }
                        aVar2.m16738a(lifecycleOwner, aVarUpFrom);
                        m16735i();
                    }
                }
            }
        }
    }
}
