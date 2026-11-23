package p007c.p190n.p385d.p390k;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.p412n.ComponentLoader;
import p007c.p190n.p385d.p416p.Event2;
import p007c.p190n.p385d.p416p.EventHandler2;
import p007c.p190n.p385d.p416p.Publisher;
import p007c.p190n.p385d.p416p.Subscriber;
import p007c.p190n.p385d.p420s.Provider2;

/* JADX INFO: renamed from: c.n.d.k.o, reason: use source file name */
/* JADX INFO: compiled from: ComponentRuntime.java */
/* JADX INFO: loaded from: classes.dex */
public class ComponentRuntime7 extends AbstractComponentContainer implements ComponentLoader {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f26387a = 0;

    /* JADX INFO: renamed from: b */
    public final Map<Component3<?>, Provider2<?>> f26388b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, Provider2<?>> f26389c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, LazySet<?>> f26390d;

    /* JADX INFO: renamed from: e */
    public final List<Provider2<ComponentRegistrar>> f26391e;

    /* JADX INFO: renamed from: f */
    public final EventBus2 f26392f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<Boolean> f26393g;

    public ComponentRuntime7(Executor executor, Iterable<Provider2<ComponentRegistrar>> iterable, Collection<Component3<?>> collection) {
        this.f26388b = new HashMap();
        this.f26389c = new HashMap();
        this.f26390d = new HashMap();
        this.f26393g = new AtomicReference<>();
        EventBus2 eventBus2 = new EventBus2(executor);
        this.f26392f = eventBus2;
        ArrayList<Component3<?>> arrayList = new ArrayList();
        arrayList.add(Component3.m11687c(eventBus2, EventBus2.class, Subscriber.class, Publisher.class));
        arrayList.add(Component3.m11687c(this, ComponentLoader.class, new Class[0]));
        for (Component3<?> component3 : collection) {
            if (component3 != null) {
                arrayList.add(component3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Provider2<ComponentRegistrar>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        this.f26391e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider2) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(componentRegistrar.getComponents());
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f26388b.isEmpty()) {
                C4799a.m11016v(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f26388b.keySet());
                arrayList4.addAll(arrayList);
                C4799a.m11016v(arrayList4);
            }
            for (final Component3<?> component4 : arrayList) {
                this.f26388b.put(component4, new Lazy(new Provider2(this, component4) { // from class: c.n.d.k.i

                    /* JADX INFO: renamed from: a */
                    public final ComponentRuntime7 f26378a;

                    /* JADX INFO: renamed from: b */
                    public final Component3 f26379b;

                    {
                        this.f26378a = this;
                        this.f26379b = component4;
                    }

                    @Override // p007c.p190n.p385d.p420s.Provider2
                    public Object get() {
                        ComponentRuntime7 componentRuntime7 = this.f26378a;
                        Component3 component5 = this.f26379b;
                        int i = ComponentRuntime7.f26387a;
                        return component5.f26359e.mo11679a(new RestrictedComponentContainer(component5, componentRuntime7));
                    }
                }));
            }
            arrayList3.addAll(m11697g(arrayList));
            arrayList3.addAll(m11698h());
            m11696f();
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        Boolean bool = this.f26393g.get();
        if (bool != null) {
            m11695e(this.f26388b, bool.booleanValue());
        }
    }

    @Override // p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: b */
    public synchronized <T> Provider2<T> mo11693b(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return (Provider2) this.f26389c.get(cls);
    }

    @Override // p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: c */
    public synchronized <T> Provider2<Set<T>> mo11694c(Class<T> cls) {
        LazySet<?> lazySet = this.f26390d.get(cls);
        if (lazySet != null) {
            return lazySet;
        }
        return new Provider2() { // from class: c.n.d.k.m
            @Override // p007c.p190n.p385d.p420s.Provider2
            public Object get() {
                return Collections.emptySet();
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public final void m11695e(Map<Component3<?>, Provider2<?>> map, boolean z) {
        Queue<Event2<?>> queue;
        Set<Map.Entry<EventHandler2<Object>, Executor>> setEmptySet;
        for (Map.Entry<Component3<?>, Provider2<?>> entry : map.entrySet()) {
            Component3<?> key = entry.getKey();
            Provider2<?> value = entry.getValue();
            int i = key.f26357c;
            if (!(i == 1)) {
                if (!(i == 2) || !z) {
                }
            }
            value.get();
        }
        EventBus2 eventBus2 = this.f26392f;
        synchronized (eventBus2) {
            queue = eventBus2.f26406b;
            if (queue != null) {
                eventBus2.f26406b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (final Event2<?> event2 : queue) {
                Objects.requireNonNull(event2);
                synchronized (eventBus2) {
                    Queue<Event2<?>> queue2 = eventBus2.f26406b;
                    if (queue2 != null) {
                        queue2.add(event2);
                    } else {
                        synchronized (eventBus2) {
                            ConcurrentHashMap<EventHandler2<Object>, Executor> concurrentHashMap = eventBus2.f26405a.get(event2.f27033a);
                            setEmptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
                        }
                        for (final Map.Entry<EventHandler2<Object>, Executor> entry2 : setEmptySet) {
                            entry2.getValue().execute(new Runnable(entry2, event2) { // from class: c.n.d.k.v

                                /* JADX INFO: renamed from: f */
                                public final Map.Entry f26403f;

                                /* JADX INFO: renamed from: g */
                                public final Event2 f26404g;

                                {
                                    this.f26403f = entry2;
                                    this.f26404g = event2;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    Map.Entry entry3 = this.f26403f;
                                    ((EventHandler2) entry3.getKey()).mo11681a(this.f26404g);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11696f() {
        for (Component3<?> component3 : this.f26388b.keySet()) {
            for (Dependency dependency : component3.f26356b) {
                if (dependency.m11700a() && !this.f26390d.containsKey(dependency.f26399a)) {
                    this.f26390d.put(dependency.f26399a, new LazySet<>(Collections.emptySet()));
                } else if (this.f26389c.containsKey(dependency.f26399a)) {
                    continue;
                } else {
                    if (dependency.f26400b == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component3, dependency.f26399a));
                    }
                    if (!dependency.m11700a()) {
                        this.f26389c.put(dependency.f26399a, new OptionalProvider3(OptionalProvider.f26352a, OptionalProvider2.f26354a));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final List<Runnable> m11697g(List<Component3<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component3<?> component3 : list) {
            if (component3.m11688b()) {
                final Provider2<?> provider2 = this.f26388b.get(component3);
                for (Class<? super Object> cls : component3.f26355a) {
                    if (this.f26389c.containsKey(cls)) {
                        final OptionalProvider3 optionalProvider3 = (OptionalProvider3) this.f26389c.get(cls);
                        arrayList.add(new Runnable(optionalProvider3, provider2) { // from class: c.n.d.k.k

                            /* JADX INFO: renamed from: f */
                            public final OptionalProvider3 f26381f;

                            /* JADX INFO: renamed from: g */
                            public final Provider2 f26382g;

                            {
                                this.f26381f = optionalProvider3;
                                this.f26382g = provider2;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                Object obj;
                                OptionalProvider3 optionalProvider4 = this.f26381f;
                                Provider2<T> provider3 = this.f26382g;
                                int i = ComponentRuntime7.f26387a;
                                if (optionalProvider4.f26369c != OptionalProvider2.f26354a) {
                                    throw new IllegalStateException("provide() can be called only once.");
                                }
                                synchronized (optionalProvider4) {
                                    obj = optionalProvider4.f26368b;
                                    optionalProvider4.f26368b = null;
                                    optionalProvider4.f26369c = provider3;
                                }
                                Objects.requireNonNull((OptionalProvider) obj);
                            }
                        });
                    } else {
                        this.f26389c.put(cls, provider2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final List<Runnable> m11698h() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<Component3<?>, Provider2<?>> entry : this.f26388b.entrySet()) {
            Component3<?> key = entry.getKey();
            if (!key.m11688b()) {
                Provider2<?> value = entry.getValue();
                for (Class<? super Object> cls : key.f26355a) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f26390d.containsKey(entry2.getKey())) {
                final LazySet<?> lazySet = this.f26390d.get(entry2.getKey());
                for (final Provider2 provider2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable(lazySet, provider2) { // from class: c.n.d.k.l

                        /* JADX INFO: renamed from: f */
                        public final LazySet f26383f;

                        /* JADX INFO: renamed from: g */
                        public final Provider2 f26384g;

                        {
                            this.f26383f = lazySet;
                            this.f26384g = provider2;
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // java.lang.Runnable
                        public void run() {
                            LazySet lazySet2 = this.f26383f;
                            Provider2 provider3 = this.f26384g;
                            int i = ComponentRuntime7.f26387a;
                            synchronized (lazySet2) {
                                if (lazySet2.f26412b == 0) {
                                    lazySet2.f26411a.add((Provider2<T>) provider3);
                                } else {
                                    lazySet2.f26412b.add((T) provider3.get());
                                }
                            }
                        }
                    });
                }
            } else {
                this.f26390d.put((Class) entry2.getKey(), new LazySet<>((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }

    @Deprecated
    public ComponentRuntime7(Executor executor, Iterable<ComponentRegistrar> iterable, Component3<?>... component3Arr) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new Provider2(componentRegistrar) { // from class: c.n.d.k.j

                /* JADX INFO: renamed from: a */
                public final ComponentRegistrar f26380a;

                {
                    this.f26380a = componentRegistrar;
                }

                @Override // p007c.p190n.p385d.p420s.Provider2
                public Object get() {
                    ComponentRegistrar componentRegistrar2 = this.f26380a;
                    int i = ComponentRuntime7.f26387a;
                    return componentRegistrar2;
                }
            });
        }
        this(executor, arrayList, Arrays.asList(component3Arr));
    }
}
