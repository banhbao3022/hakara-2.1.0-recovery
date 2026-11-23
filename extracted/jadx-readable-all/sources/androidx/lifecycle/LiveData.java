package androidx.lifecycle;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p655c.p656a.p657a.ArchTaskExecutor;
import p636z0.p655c.p656a.p658b.SafeIterableMap;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.Observer;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: a */
    public static final Object f767a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f768b;

    /* JADX INFO: renamed from: c */
    public SafeIterableMap<Observer<? super T>, LiveData<T>.AbstractC0123c> f769c;

    /* JADX INFO: renamed from: d */
    public int f770d;

    /* JADX INFO: renamed from: e */
    public boolean f771e;

    /* JADX INFO: renamed from: f */
    public volatile Object f772f;

    /* JADX INFO: renamed from: g */
    public volatile Object f773g;

    /* JADX INFO: renamed from: h */
    public int f774h;

    /* JADX INFO: renamed from: i */
    public boolean f775i;

    /* JADX INFO: renamed from: j */
    public boolean f776j;

    /* JADX INFO: renamed from: k */
    public final Runnable f777k;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0123c implements LifecycleEventObserver {

        /* JADX INFO: renamed from: j */
        public final LifecycleOwner f778j;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f778j = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* JADX INFO: renamed from: c */
        public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
            Lifecycle3.b bVarMo16728b = this.f778j.mo124b().mo16728b();
            if (bVarMo16728b == Lifecycle3.b.DESTROYED) {
                LiveData.this.mo426i(this.f781f);
                return;
            }
            Lifecycle3.b bVar = null;
            while (bVar != bVarMo16728b) {
                m431e(this.f778j.mo124b().mo16728b().isAtLeast(Lifecycle3.b.STARTED));
                bVar = bVarMo16728b;
                bVarMo16728b = this.f778j.mo124b().mo16728b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0123c
        /* JADX INFO: renamed from: f */
        public void mo428f() {
            this.f778j.mo124b().mo16729c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0123c
        /* JADX INFO: renamed from: g */
        public boolean mo429g(LifecycleOwner lifecycleOwner) {
            return this.f778j == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0123c
        /* JADX INFO: renamed from: h */
        public boolean mo430h() {
            return this.f778j.mo124b().mo16728b().isAtLeast(Lifecycle3.b.STARTED);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$a */
    public class RunnableC0121a implements Runnable {
        public RunnableC0121a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f768b) {
                obj = LiveData.this.f773g;
                LiveData.this.f773g = LiveData.f767a;
            }
            LiveData.this.mo427j(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$b */
    public class C0122b extends LiveData<T>.AbstractC0123c {
        public C0122b(LiveData liveData, Observer<? super T> observer) {
            super(observer);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0123c
        /* JADX INFO: renamed from: h */
        public boolean mo430h() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$c */
    public abstract class AbstractC0123c {

        /* JADX INFO: renamed from: f */
        public final Observer<? super T> f781f;

        /* JADX INFO: renamed from: g */
        public boolean f782g;

        /* JADX INFO: renamed from: h */
        public int f783h = -1;

        public AbstractC0123c(Observer<? super T> observer) {
            this.f781f = observer;
        }

        /* JADX INFO: renamed from: e */
        public void m431e(boolean z) {
            if (z == this.f782g) {
                return;
            }
            this.f782g = z;
            LiveData liveData = LiveData.this;
            int i = z ? 1 : -1;
            int i2 = liveData.f770d;
            liveData.f770d = i + i2;
            if (!liveData.f771e) {
                liveData.f771e = true;
                while (true) {
                    try {
                        int i3 = liveData.f770d;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.mo424g();
                        } else if (z3) {
                            liveData.mo425h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.f771e = false;
                        throw th;
                    }
                }
                liveData.f771e = false;
            }
            if (this.f782g) {
                LiveData.this.m420c(this);
            }
        }

        /* JADX INFO: renamed from: f */
        public void mo428f() {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo429g(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public abstract boolean mo430h();
    }

    public LiveData(T t) {
        this.f768b = new Object();
        this.f769c = new SafeIterableMap<>();
        this.f770d = 0;
        this.f773g = f767a;
        this.f777k = new RunnableC0121a();
        this.f772f = t;
        this.f774h = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m418a(String str) {
        if (!ArchTaskExecutor.m15023d().mo15025b()) {
            throw new IllegalStateException(outline.m1600v("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m419b(LiveData<T>.AbstractC0123c abstractC0123c) {
        if (abstractC0123c.f782g) {
            if (!abstractC0123c.mo430h()) {
                abstractC0123c.m431e(false);
                return;
            }
            int i = abstractC0123c.f783h;
            int i2 = this.f774h;
            if (i >= i2) {
                return;
            }
            abstractC0123c.f783h = i2;
            abstractC0123c.f781f.mo410d((Object) this.f772f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m420c(LiveData<T>.AbstractC0123c abstractC0123c) {
        if (this.f775i) {
            this.f776j = true;
            return;
        }
        this.f775i = true;
        do {
            this.f776j = false;
            if (abstractC0123c != null) {
                m419b(abstractC0123c);
                abstractC0123c = null;
            } else {
                SafeIterableMap<Observer<? super T>, LiveData<T>.AbstractC0123c>.d dVarM15031f = this.f769c.m15031f();
                while (dVarM15031f.hasNext()) {
                    m419b((AbstractC0123c) ((Map.Entry) dVarM15031f.next()).getValue());
                    if (this.f776j) {
                        break;
                    }
                }
            }
        } while (this.f776j);
        this.f775i = false;
    }

    /* JADX INFO: renamed from: d */
    public T m421d() {
        T t = (T) this.f772f;
        if (t != f767a) {
            return t;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void mo422e(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        m418a("observe");
        if (lifecycleOwner.mo124b().mo16728b() == Lifecycle3.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        LiveData<T>.AbstractC0123c abstractC0123cMo15029j = this.f769c.mo15029j(observer, lifecycleBoundObserver);
        if (abstractC0123cMo15029j != null && !abstractC0123cMo15029j.mo429g(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0123cMo15029j != null) {
            return;
        }
        lifecycleOwner.mo124b().mo16727a(lifecycleBoundObserver);
    }

    /* JADX INFO: renamed from: f */
    public void m423f(Observer<? super T> observer) {
        m418a("observeForever");
        C0122b c0122b = new C0122b(this, observer);
        LiveData<T>.AbstractC0123c abstractC0123cMo15029j = this.f769c.mo15029j(observer, c0122b);
        if (abstractC0123cMo15029j instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0123cMo15029j != null) {
            return;
        }
        c0122b.m431e(true);
    }

    /* JADX INFO: renamed from: g */
    public void mo424g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo425h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo426i(Observer<? super T> observer) {
        m418a("removeObserver");
        LiveData<T>.AbstractC0123c abstractC0123cMo15030m = this.f769c.mo15030m(observer);
        if (abstractC0123cMo15030m == null) {
            return;
        }
        abstractC0123cMo15030m.mo428f();
        abstractC0123cMo15030m.m431e(false);
    }

    /* JADX INFO: renamed from: j */
    public void mo427j(T t) {
        m418a("setValue");
        this.f774h++;
        this.f772f = t;
        m420c(null);
    }

    public LiveData() {
        this.f768b = new Object();
        this.f769c = new SafeIterableMap<>();
        this.f770d = 0;
        Object obj = f767a;
        this.f773g = obj;
        this.f777k = new RunnableC0121a();
        this.f772f = obj;
        this.f774h = -1;
    }
}
