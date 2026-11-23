package p007c.p190n.p194b.p209b.p212b2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import p007c.p190n.p194b.p209b.p212b2.MutableFlags;
import p007c.p190n.p378c.p379a.Supplier;

/* JADX INFO: renamed from: c.n.b.b.b2.o, reason: use source file name */
/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class ListenerSet<T, E extends MutableFlags> {

    /* JADX INFO: renamed from: a */
    public final Clock2 f6346a;

    /* JADX INFO: renamed from: b */
    public final SystemHandlerWrapper f6347b;

    /* JADX INFO: renamed from: c */
    public final Supplier<E> f6348c;

    /* JADX INFO: renamed from: d */
    public final b<T, E> f6349d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArraySet<c<T, E>> f6350e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<Runnable> f6351f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque<Runnable> f6352g;

    /* JADX INFO: renamed from: h */
    public boolean f6353h;

    /* JADX INFO: renamed from: c.n.b.b.b2.o$a */
    /* JADX INFO: compiled from: ListenerSet.java */
    public interface a<T> {
        /* JADX INFO: renamed from: b */
        void mo2881b(T t);
    }

    /* JADX INFO: renamed from: c.n.b.b.b2.o$b */
    /* JADX INFO: compiled from: ListenerSet.java */
    public interface b<T, E extends MutableFlags> {
        /* JADX INFO: renamed from: a */
        void mo3152a(T t, E e);
    }

    /* JADX INFO: renamed from: c.n.b.b.b2.o$c */
    /* JADX INFO: compiled from: ListenerSet.java */
    public static final class c<T, E extends MutableFlags> {

        /* JADX INFO: renamed from: a */
        public final T f6354a;

        /* JADX INFO: renamed from: b */
        public E f6355b;

        /* JADX INFO: renamed from: c */
        public boolean f6356c;

        /* JADX INFO: renamed from: d */
        public boolean f6357d;

        public c(T t, Supplier<E> supplier) {
            this.f6354a = t;
            this.f6355b = supplier.get();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f6354a.equals(((c) obj).f6354a);
        }

        public int hashCode() {
            return this.f6354a.hashCode();
        }
    }

    public ListenerSet(Looper looper, Clock2 clock2, Supplier<E> supplier, b<T, E> bVar) {
        this(new CopyOnWriteArraySet(), looper, clock2, supplier, bVar);
    }

    /* JADX INFO: renamed from: a */
    public void m3148a() {
        if (this.f6352g.isEmpty()) {
            return;
        }
        if (!this.f6347b.f6291a.hasMessages(0)) {
            this.f6347b.m3071a(0).sendToTarget();
        }
        boolean z = !this.f6351f.isEmpty();
        this.f6351f.addAll(this.f6352g);
        this.f6352g.clear();
        if (z) {
            return;
        }
        while (!this.f6351f.isEmpty()) {
            this.f6351f.peekFirst().run();
            this.f6351f.removeFirst();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3149b(final int i, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f6350e);
        this.f6352g.add(new Runnable() { // from class: c.n.b.b.b2.a
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet<ListenerSet.c> copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                ListenerSet.a aVar2 = aVar;
                for (ListenerSet.c cVar : copyOnWriteArraySet2) {
                    if (!cVar.f6357d) {
                        if (i2 != -1) {
                            cVar.f6355b.f6367a.append(i2, true);
                        }
                        cVar.f6356c = true;
                        aVar2.mo2881b(cVar.f6354a);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m3150c() {
        for (c<T, E> cVar : this.f6350e) {
            b<T, E> bVar = this.f6349d;
            cVar.f6357d = true;
            if (cVar.f6356c) {
                bVar.mo3152a(cVar.f6354a, cVar.f6355b);
            }
        }
        this.f6350e.clear();
        this.f6353h = true;
    }

    /* JADX INFO: renamed from: d */
    public void m3151d(T t) {
        for (c<T, E> cVar : this.f6350e) {
            if (cVar.f6354a.equals(t)) {
                b<T, E> bVar = this.f6349d;
                cVar.f6357d = true;
                if (cVar.f6356c) {
                    bVar.mo3152a(cVar.f6354a, cVar.f6355b);
                }
                this.f6350e.remove(cVar);
            }
        }
    }

    public ListenerSet(CopyOnWriteArraySet<c<T, E>> copyOnWriteArraySet, Looper looper, Clock2 clock2, Supplier<E> supplier, b<T, E> bVar) {
        this.f6346a = clock2;
        this.f6350e = copyOnWriteArraySet;
        this.f6348c = supplier;
        this.f6349d = bVar;
        this.f6351f = new ArrayDeque<>();
        this.f6352g = new ArrayDeque<>();
        this.f6347b = clock2.mo3070c(looper, new Handler.Callback() { // from class: c.n.b.b.b2.b
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ListenerSet listenerSet = this.f6277f;
                Objects.requireNonNull(listenerSet);
                int i = message.what;
                if (i == 0) {
                    Iterator it = listenerSet.f6350e.iterator();
                    while (it.hasNext()) {
                        ListenerSet.c cVar = (ListenerSet.c) it.next();
                        Supplier<E> supplier2 = listenerSet.f6348c;
                        ListenerSet.b<T, E> bVar2 = listenerSet.f6349d;
                        if (!cVar.f6357d && cVar.f6356c) {
                            E e = cVar.f6355b;
                            cVar.f6355b = (E) supplier2.get();
                            cVar.f6356c = false;
                            bVar2.mo3152a(cVar.f6354a, e);
                        }
                        if (listenerSet.f6347b.f6291a.hasMessages(0)) {
                            break;
                        }
                    }
                } else if (i == 1) {
                    listenerSet.m3149b(message.arg1, (ListenerSet.a) message.obj);
                    listenerSet.m3148a();
                    listenerSet.m3150c();
                }
                return true;
            }
        });
    }
}
