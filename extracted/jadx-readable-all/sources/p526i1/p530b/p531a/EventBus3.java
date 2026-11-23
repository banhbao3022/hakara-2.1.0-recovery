package p526i1.p530b.p531a;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import p007c.p071d.p078c.p079a.outline;
import p526i1.p530b.p531a.p532r.AndroidLogger;
import p526i1.p530b.p531a.p533s.SubscriberInfo;

/* JADX INFO: renamed from: i1.b.a.c, reason: use source file name */
/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes2.dex */
public class EventBus3 {

    /* JADX INFO: renamed from: a */
    public static volatile EventBus3 f30798a;

    /* JADX INFO: renamed from: b */
    public static final EventBusBuilder f30799b = new EventBusBuilder();

    /* JADX INFO: renamed from: c */
    public static final Map<Class<?>, List<Class<?>>> f30800c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f30801d;

    /* JADX INFO: renamed from: e */
    public final Map<Object, List<Class<?>>> f30802e;

    /* JADX INFO: renamed from: f */
    public final Map<Class<?>, Object> f30803f;

    /* JADX INFO: renamed from: g */
    public final ThreadLocal<b> f30804g;

    /* JADX INFO: renamed from: h */
    public final MainThreadSupport f30805h;

    /* JADX INFO: renamed from: i */
    public final Poster f30806i;

    /* JADX INFO: renamed from: j */
    public final BackgroundPoster f30807j;

    /* JADX INFO: renamed from: k */
    public final AsyncPoster f30808k;

    /* JADX INFO: renamed from: l */
    public final SubscriberMethodFinder f30809l;

    /* JADX INFO: renamed from: m */
    public final ExecutorService f30810m;

    /* JADX INFO: renamed from: n */
    public final boolean f30811n;

    /* JADX INFO: renamed from: o */
    public final boolean f30812o;

    /* JADX INFO: renamed from: p */
    public final boolean f30813p;

    /* JADX INFO: renamed from: q */
    public final boolean f30814q;

    /* JADX INFO: renamed from: r */
    public final boolean f30815r;

    /* JADX INFO: renamed from: s */
    public final Logger5 f30816s;

    /* JADX INFO: renamed from: i1.b.a.c$a */
    /* JADX INFO: compiled from: EventBus.java */
    public class a extends ThreadLocal<b> {
        public a(EventBus3 eventBus3) {
        }

        @Override // java.lang.ThreadLocal
        public b initialValue() {
            return new b();
        }
    }

    /* JADX INFO: renamed from: i1.b.a.c$b */
    /* JADX INFO: compiled from: EventBus.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<Object> f30817a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public boolean f30818b;

        /* JADX INFO: renamed from: c */
        public boolean f30819c;

        /* JADX INFO: renamed from: d */
        public Object f30820d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public EventBus3() {
        Looper mainLooper;
        Logger5 androidLogger;
        Looper mainLooper2;
        MainThreadSupport.a aVar;
        EventBusBuilder eventBusBuilder = f30799b;
        this.f30804g = new a(this);
        Objects.requireNonNull(eventBusBuilder);
        if (AndroidLogger.f30856a) {
            try {
                mainLooper = Looper.getMainLooper();
            } catch (RuntimeException unused) {
                mainLooper = null;
            }
            if (mainLooper != null) {
                androidLogger = new AndroidLogger("EventBus");
            } else {
                androidLogger = new Logger5.a();
            }
        } else {
            androidLogger = new Logger5.a();
        }
        this.f30816s = androidLogger;
        this.f30801d = new HashMap();
        this.f30802e = new HashMap();
        this.f30803f = new ConcurrentHashMap();
        if (AndroidLogger.f30856a) {
            try {
                mainLooper2 = Looper.getMainLooper();
            } catch (RuntimeException unused2) {
                mainLooper2 = null;
            }
            if (mainLooper2 == null) {
                aVar = null;
            } else {
                aVar = new MainThreadSupport.a(mainLooper2);
            }
        } else {
            aVar = null;
        }
        this.f30805h = aVar;
        this.f30806i = aVar != null ? new HandlerPoster(this, aVar.f30827a, 10) : null;
        this.f30807j = new BackgroundPoster(this);
        this.f30808k = new AsyncPoster(this);
        this.f30809l = new SubscriberMethodFinder(null, false, false);
        this.f30811n = true;
        this.f30812o = true;
        this.f30813p = true;
        this.f30814q = true;
        this.f30815r = true;
        this.f30810m = eventBusBuilder.f30822b;
    }

    /* JADX INFO: renamed from: a */
    public static void m13809a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m13809a(list, cls.getInterfaces());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static EventBus3 m13810b() {
        EventBus3 eventBus3 = f30798a;
        if (eventBus3 == null) {
            synchronized (EventBus3.class) {
                eventBus3 = f30798a;
                if (eventBus3 == null) {
                    eventBus3 = new EventBus3();
                    f30798a = eventBus3;
                }
            }
        }
        return eventBus3;
    }

    /* JADX INFO: renamed from: c */
    public void m13811c(PendingPost pendingPost) {
        Object obj = pendingPost.f30830b;
        Subscription subscription = pendingPost.f30831c;
        pendingPost.f30830b = null;
        pendingPost.f30831c = null;
        pendingPost.f30832d = null;
        List<PendingPost> list = PendingPost.f30829a;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
        if (subscription.f30855c) {
            m13812d(subscription, obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m13812d(Subscription subscription, Object obj) {
        try {
            subscription.f30854b.f30838a.invoke(subscription.f30853a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(obj instanceof SubscriberExceptionEvent)) {
                if (this.f30811n) {
                    Logger5 logger5 = this.f30816s;
                    Level level = Level.SEVERE;
                    StringBuilder sbM1556G = outline.m1556G("Could not dispatch event: ");
                    sbM1556G.append(obj.getClass());
                    sbM1556G.append(" to subscribing class ");
                    sbM1556G.append(subscription.f30853a.getClass());
                    logger5.mo13823b(level, sbM1556G.toString(), cause);
                }
                if (this.f30813p) {
                    m13815g(new SubscriberExceptionEvent(this, cause, obj, subscription.f30853a));
                    return;
                }
                return;
            }
            if (this.f30811n) {
                Logger5 logger6 = this.f30816s;
                Level level2 = Level.SEVERE;
                StringBuilder sbM1556G2 = outline.m1556G("SubscriberExceptionEvent subscriber ");
                sbM1556G2.append(subscription.f30853a.getClass());
                sbM1556G2.append(" threw an exception");
                logger6.mo13823b(level2, sbM1556G2.toString(), cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Logger5 logger7 = this.f30816s;
                StringBuilder sbM1556G3 = outline.m1556G("Initial event ");
                sbM1556G3.append(subscriberExceptionEvent.f30836b);
                sbM1556G3.append(" caused exception in ");
                sbM1556G3.append(subscriberExceptionEvent.f30837c);
                logger7.mo13823b(level2, sbM1556G3.toString(), subscriberExceptionEvent.f30835a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13813e() {
        MainThreadSupport mainThreadSupport = this.f30805h;
        if (mainThreadSupport != null) {
            if (!(((MainThreadSupport.a) mainThreadSupport).f30827a == Looper.myLooper())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m13814f(Object obj) {
        return this.f30802e.containsKey(obj);
    }

    /* JADX INFO: renamed from: g */
    public void m13815g(Object obj) {
        b bVar = this.f30804g.get();
        List<Object> list = bVar.f30817a;
        list.add(obj);
        if (bVar.f30818b) {
            return;
        }
        bVar.f30819c = m13813e();
        bVar.f30818b = true;
        while (!list.isEmpty()) {
            try {
                m13816h(list.remove(0), bVar);
            } catch (Throwable th) {
                bVar.f30818b = false;
                bVar.f30819c = false;
                throw th;
            }
        }
        bVar.f30818b = false;
        bVar.f30819c = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m13816h(Object obj, b bVar) throws Error {
        boolean zM13817i;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f30815r) {
            Map<Class<?>, List<Class<?>>> map = f30800c;
            synchronized (map) {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        m13809a(arrayList, superclass.getInterfaces());
                    }
                    f30800c.put(cls, arrayList);
                    list = arrayList;
                }
            }
            int size = list.size();
            zM13817i = false;
            for (int i = 0; i < size; i++) {
                zM13817i |= m13817i(obj, bVar, (Class) list.get(i));
            }
        } else {
            zM13817i = m13817i(obj, bVar, cls);
        }
        if (zM13817i) {
            return;
        }
        if (this.f30812o) {
            this.f30816s.mo13822a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f30814q || cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
            return;
        }
        m13815g(new NoSubscriberEvent(this, obj));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13817i(Object obj, b bVar, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f30801d.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (Subscription subscription : copyOnWriteArrayList) {
            bVar.f30820d = obj;
            m13818j(subscription, obj, bVar.f30819c);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m13818j(Subscription subscription, Object obj, boolean z) {
        int iOrdinal = subscription.f30854b.f30839b.ordinal();
        if (iOrdinal == 0) {
            m13812d(subscription, obj);
            return;
        }
        if (iOrdinal == 1) {
            if (z) {
                m13812d(subscription, obj);
                return;
            } else {
                this.f30806i.mo13808a(subscription, obj);
                return;
            }
        }
        if (iOrdinal == 2) {
            Poster poster = this.f30806i;
            if (poster != null) {
                poster.mo13808a(subscription, obj);
                return;
            } else {
                m13812d(subscription, obj);
                return;
            }
        }
        if (iOrdinal == 3) {
            if (z) {
                this.f30807j.mo13808a(subscription, obj);
                return;
            } else {
                m13812d(subscription, obj);
                return;
            }
        }
        if (iOrdinal == 4) {
            this.f30808k.mo13808a(subscription, obj);
        } else {
            StringBuilder sbM1556G = outline.m1556G("Unknown thread mode: ");
            sbM1556G.append(subscription.f30854b.f30839b);
            throw new IllegalStateException(sbM1556G.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX INFO: renamed from: k */
    public void m13819k(Object obj) {
        SubscriberInfo subscriberInfoM13836b;
        Class<?> cls = obj.getClass();
        SubscriberMethodFinder subscriberMethodFinder = this.f30809l;
        Objects.requireNonNull(subscriberMethodFinder);
        List<SubscriberMethod> listM13829b = SubscriberMethodFinder.f30844a.get(cls);
        if (listM13829b == null) {
            SubscriberMethodFinder.a aVarM13830c = subscriberMethodFinder.m13830c();
            aVarM13830c.f30850e = cls;
            aVarM13830c.f30851f = false;
            aVarM13830c.f30852g = null;
            while (aVarM13830c.f30850e != null) {
                SubscriberInfo subscriberInfo = aVarM13830c.f30852g;
                if (subscriberInfo == null || subscriberInfo.m13836b() == null) {
                    subscriberInfoM13836b = null;
                } else {
                    subscriberInfoM13836b = aVarM13830c.f30852g.m13836b();
                    if (aVarM13830c.f30850e != subscriberInfoM13836b.m13837c()) {
                        subscriberInfoM13836b = null;
                    }
                }
                aVarM13830c.f30852g = subscriberInfoM13836b;
                if (subscriberInfoM13836b != null) {
                    for (SubscriberMethod subscriberMethod : subscriberInfoM13836b.m13835a()) {
                        if (aVarM13830c.m13831a(subscriberMethod.f30838a, subscriberMethod.f30840c)) {
                            aVarM13830c.f30846a.add(subscriberMethod);
                        }
                    }
                } else {
                    subscriberMethodFinder.m13828a(aVarM13830c);
                }
                aVarM13830c.m13833c();
            }
            listM13829b = subscriberMethodFinder.m13829b(aVarM13830c);
            if (((ArrayList) listM13829b).isEmpty()) {
                throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
            }
            SubscriberMethodFinder.f30844a.put(cls, listM13829b);
        }
        synchronized (this) {
            Iterator<SubscriberMethod> it = listM13829b.iterator();
            while (it.hasNext()) {
                m13820l(obj, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13820l(Object obj, SubscriberMethod subscriberMethod) {
        Object value;
        Class<?> cls = subscriberMethod.f30840c;
        Subscription subscription = new Subscription(obj, subscriberMethod);
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f30801d.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f30801d.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(subscription)) {
            StringBuilder sbM1556G = outline.m1556G("Subscriber ");
            sbM1556G.append(obj.getClass());
            sbM1556G.append(" already registered to event ");
            sbM1556G.append(cls);
            throw new EventBusException(sbM1556G.toString());
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || subscriberMethod.f30841d > copyOnWriteArrayList.get(i).f30854b.f30841d) {
                copyOnWriteArrayList.add(i, subscription);
                break;
            }
        }
        List<Class<?>> arrayList = this.f30802e.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f30802e.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (subscriberMethod.f30842e) {
            if (!this.f30815r) {
                Object obj2 = this.f30803f.get(cls);
                if (obj2 != null) {
                    m13818j(subscription, obj2, m13813e());
                    return;
                }
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f30803f.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey()) && (value = entry.getValue()) != null) {
                    m13818j(subscription, value, m13813e());
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m13821m(Object obj) {
        List<Class<?>> list = this.f30802e.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f30801d.get(it.next());
                if (copyOnWriteArrayList != null) {
                    int size = copyOnWriteArrayList.size();
                    int i = 0;
                    while (i < size) {
                        Subscription subscription = copyOnWriteArrayList.get(i);
                        if (subscription.f30853a == obj) {
                            subscription.f30855c = false;
                            copyOnWriteArrayList.remove(i);
                            i--;
                            size--;
                        }
                        i++;
                    }
                }
            }
            this.f30802e.remove(obj);
        } else {
            this.f30816s.mo13822a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        StringBuilder sbM1557H = outline.m1557H("EventBus[indexCount=", 0, ", eventInheritance=");
        sbM1557H.append(this.f30815r);
        sbM1557H.append("]");
        return sbM1557H.toString();
    }
}
