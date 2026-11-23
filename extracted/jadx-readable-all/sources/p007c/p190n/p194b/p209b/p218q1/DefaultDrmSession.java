package p007c.p190n.p194b.p209b.p218q1;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p212b2.Consumer;
import p007c.p190n.p194b.p209b.p212b2.CopyOnWriteMultiset;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.q1.p, reason: use source file name */
/* JADX INFO: compiled from: DefaultDrmSession.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a */
    public final List<DrmInitData.b> f7359a;

    /* JADX INFO: renamed from: b */
    public final ExoMediaDrm f7360b;

    /* JADX INFO: renamed from: c */
    public final a f7361c;

    /* JADX INFO: renamed from: d */
    public final b f7362d;

    /* JADX INFO: renamed from: e */
    public final int f7363e;

    /* JADX INFO: renamed from: f */
    public final boolean f7364f;

    /* JADX INFO: renamed from: g */
    public final boolean f7365g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, String> f7366h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteMultiset<DrmSessionEventListener2.a> f7367i;

    /* JADX INFO: renamed from: j */
    public final LoadErrorHandlingPolicy f7368j;

    /* JADX INFO: renamed from: k */
    public final MediaDrmCallback f7369k;

    /* JADX INFO: renamed from: l */
    public final UUID f7370l;

    /* JADX INFO: renamed from: m */
    public final e f7371m;

    /* JADX INFO: renamed from: n */
    public int f7372n;

    /* JADX INFO: renamed from: o */
    public int f7373o;

    /* JADX INFO: renamed from: p */
    public HandlerThread f7374p;

    /* JADX INFO: renamed from: q */
    public c f7375q;

    /* JADX INFO: renamed from: r */
    public ExoMediaCrypto f7376r;

    /* JADX INFO: renamed from: s */
    public DrmSession.a f7377s;

    /* JADX INFO: renamed from: t */
    public byte[] f7378t;

    /* JADX INFO: renamed from: u */
    public byte[] f7379u;

    /* JADX INFO: renamed from: v */
    public ExoMediaDrm.b f7380v;

    /* JADX INFO: renamed from: w */
    public ExoMediaDrm.e f7381w;

    /* JADX INFO: renamed from: c.n.b.b.q1.p$a */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    public interface a {
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.p$b */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.p$c */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: a */
        public boolean f7382a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        public void m3677a(int i, Object obj, boolean z) {
            obtainMessage(i, new d(LoadEventInfo.m4367a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v11, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r0v15, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r0v2, types: [c.n.b.b.q1.i0, java.io.IOException] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            boolean z = true;
            try {
                int i = message.what;
                if (i == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    e = ((HttpMediaDrmCallback) defaultDrmSession.f7369k).m3666c(defaultDrmSession.f7370l, (ExoMediaDrm.e) dVar.f7387d);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    e = ((HttpMediaDrmCallback) defaultDrmSession2.f7369k).m3665a(defaultDrmSession2.f7370l, (ExoMediaDrm.b) dVar.f7387d);
                }
            } catch (MediaDrmCallbackException e) {
                e = e;
                d dVar2 = (d) message.obj;
                if (dVar2.f7385b) {
                    int i2 = dVar2.f7388e + 1;
                    dVar2.f7388e = i2;
                    if (i2 > ((DefaultLoadErrorHandlingPolicy) DefaultDrmSession.this.f7368j).m3025b(3)) {
                        z = false;
                    } else {
                        long jM3026c = ((DefaultLoadErrorHandlingPolicy) DefaultDrmSession.this.f7368j).m3026c(new LoadErrorHandlingPolicy.a(new LoadEventInfo(dVar2.f7384a, e.f7346f, e.f7347g, e.f7348h, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar2.f7386c, e.f7349i), new MediaLoadData(3), e.getCause() instanceof IOException ? (IOException) e.getCause() : new f(e.getCause()), dVar2.f7388e));
                        if (jM3026c == -9223372036854775807L) {
                            z = false;
                        } else {
                            synchronized (this) {
                                if (this.f7382a) {
                                    z = false;
                                } else {
                                    sendMessageDelayed(Message.obtain(message), jM3026c);
                                }
                            }
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                Log.m3156d("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = DefaultDrmSession.this.f7368j;
            long j2 = dVar.f7384a;
            Objects.requireNonNull(loadErrorHandlingPolicy);
            synchronized (this) {
                if (!this.f7382a) {
                    DefaultDrmSession.this.f7371m.obtainMessage(message.what, Pair.create(dVar.f7387d, e)).sendToTarget();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.p$d */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final long f7384a;

        /* JADX INFO: renamed from: b */
        public final boolean f7385b;

        /* JADX INFO: renamed from: c */
        public final long f7386c;

        /* JADX INFO: renamed from: d */
        public final Object f7387d;

        /* JADX INFO: renamed from: e */
        public int f7388e;

        public d(long j2, boolean z, long j3, Object obj) {
            this.f7384a = j2;
            this.f7385b = z;
            this.f7386c = j3;
            this.f7387d = obj;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.p$e */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f7381w) {
                    if (defaultDrmSession.f7372n == 2 || defaultDrmSession.m3669i()) {
                        defaultDrmSession.f7381w = null;
                        if (obj2 instanceof Exception) {
                            ((DefaultDrmSessionManager.f) defaultDrmSession.f7361c).m3683a((Exception) obj2);
                            return;
                        }
                        try {
                            defaultDrmSession.f7360b.mo3661k((byte[]) obj2);
                            DefaultDrmSessionManager.f fVar = (DefaultDrmSessionManager.f) defaultDrmSession.f7361c;
                            for (DefaultDrmSession defaultDrmSession2 : DefaultDrmSessionManager.this.f7402n) {
                                if (defaultDrmSession2.m3672l(false)) {
                                    defaultDrmSession2.m3668h(true);
                                }
                            }
                            DefaultDrmSessionManager.this.f7402n.clear();
                            return;
                        } catch (Exception e) {
                            ((DefaultDrmSessionManager.f) defaultDrmSession.f7361c).m3683a(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
            if (obj == defaultDrmSession3.f7380v && defaultDrmSession3.m3669i()) {
                defaultDrmSession3.f7380v = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession3.m3671k((Exception) obj2);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (defaultDrmSession3.f7363e == 3) {
                        ExoMediaDrm exoMediaDrm = defaultDrmSession3.f7360b;
                        byte[] bArr2 = defaultDrmSession3.f7379u;
                        int i2 = Util6.f6307a;
                        exoMediaDrm.mo3660j(bArr2, bArr);
                        defaultDrmSession3.m3667g(new Consumer() { // from class: c.n.b.b.q1.b
                            @Override // p007c.p190n.p194b.p209b.p212b2.Consumer
                            /* JADX INFO: renamed from: a */
                            public final void mo3142a(Object obj3) {
                                ((DrmSessionEventListener2.a) obj3).m3696b();
                            }
                        });
                        return;
                    }
                    byte[] bArrMo3660j = defaultDrmSession3.f7360b.mo3660j(defaultDrmSession3.f7378t, bArr);
                    int i3 = defaultDrmSession3.f7363e;
                    if ((i3 == 2 || (i3 == 0 && defaultDrmSession3.f7379u != null)) && bArrMo3660j != null && bArrMo3660j.length != 0) {
                        defaultDrmSession3.f7379u = bArrMo3660j;
                    }
                    defaultDrmSession3.f7372n = 4;
                    defaultDrmSession3.m3667g(new Consumer() { // from class: c.n.b.b.q1.n
                        @Override // p007c.p190n.p194b.p209b.p212b2.Consumer
                        /* JADX INFO: renamed from: a */
                        public final void mo3142a(Object obj3) {
                            ((DrmSessionEventListener2.a) obj3).m3695a();
                        }
                    });
                } catch (Exception e2) {
                    defaultDrmSession3.m3671k(e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.p$f */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, a aVar, b bVar, List<DrmInitData.b> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> map, MediaDrmCallback mediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        if (i == 1 || i == 3) {
            Objects.requireNonNull(bArr);
        }
        this.f7370l = uuid;
        this.f7361c = aVar;
        this.f7362d = bVar;
        this.f7360b = exoMediaDrm;
        this.f7363e = i;
        this.f7364f = z;
        this.f7365g = z2;
        if (bArr != null) {
            this.f7379u = bArr;
            this.f7359a = null;
        } else {
            Objects.requireNonNull(list);
            this.f7359a = Collections.unmodifiableList(list);
        }
        this.f7366h = map;
        this.f7369k = mediaDrmCallback;
        this.f7367i = new CopyOnWriteMultiset<>();
        this.f7368j = loadErrorHandlingPolicy;
        this.f7372n = 2;
        this.f7371m = new e(looper);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: a */
    public void mo3645a(DrmSessionEventListener2.a aVar) {
        C2096e.m4570f(this.f7373o >= 0);
        if (aVar != null) {
            CopyOnWriteMultiset<DrmSessionEventListener2.a> copyOnWriteMultiset = this.f7367i;
            synchronized (copyOnWriteMultiset.f6328f) {
                ArrayList arrayList = new ArrayList(copyOnWriteMultiset.f6331i);
                arrayList.add(aVar);
                copyOnWriteMultiset.f6331i = Collections.unmodifiableList(arrayList);
                Integer num = copyOnWriteMultiset.f6329g.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(copyOnWriteMultiset.f6330h);
                    hashSet.add(aVar);
                    copyOnWriteMultiset.f6330h = Collections.unmodifiableSet(hashSet);
                }
                copyOnWriteMultiset.f6329g.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.f7373o + 1;
        this.f7373o = i;
        if (i == 1) {
            C2096e.m4570f(this.f7372n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f7374p = handlerThread;
            handlerThread.start();
            this.f7375q = new c(this.f7374p.getLooper());
            if (m3672l(true)) {
                m3668h(true);
            }
        } else if (aVar != null && m3669i()) {
            aVar.m3698d();
        }
        DefaultDrmSessionManager.g gVar = (DefaultDrmSessionManager.g) this.f7362d;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f7400l != -9223372036854775807L) {
            defaultDrmSessionManager.f7403o.remove(this);
            Handler handler = DefaultDrmSessionManager.this.f7409u;
            Objects.requireNonNull(handler);
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: b */
    public void mo3646b(DrmSessionEventListener2.a aVar) {
        C2096e.m4570f(this.f7373o > 0);
        int i = this.f7373o - 1;
        this.f7373o = i;
        if (i == 0) {
            this.f7372n = 0;
            e eVar = this.f7371m;
            int i2 = Util6.f6307a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f7375q;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f7382a = true;
            }
            this.f7375q = null;
            this.f7374p.quit();
            this.f7374p = null;
            this.f7376r = null;
            this.f7377s = null;
            this.f7380v = null;
            this.f7381w = null;
            byte[] bArr = this.f7378t;
            if (bArr != null) {
                this.f7360b.mo3658h(bArr);
                this.f7378t = null;
            }
            m3667g(new Consumer() { // from class: c.n.b.b.q1.a
                @Override // p007c.p190n.p194b.p209b.p212b2.Consumer
                /* JADX INFO: renamed from: a */
                public final void mo3142a(Object obj) {
                    ((DrmSessionEventListener2.a) obj).m3700f();
                }
            });
        }
        if (aVar != null) {
            if (m3669i()) {
                aVar.m3700f();
            }
            CopyOnWriteMultiset<DrmSessionEventListener2.a> copyOnWriteMultiset = this.f7367i;
            synchronized (copyOnWriteMultiset.f6328f) {
                Integer num = copyOnWriteMultiset.f6329g.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(copyOnWriteMultiset.f6331i);
                    arrayList.remove(aVar);
                    copyOnWriteMultiset.f6331i = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        copyOnWriteMultiset.f6329g.remove(aVar);
                        HashSet hashSet = new HashSet(copyOnWriteMultiset.f6330h);
                        hashSet.remove(aVar);
                        copyOnWriteMultiset.f6330h = Collections.unmodifiableSet(hashSet);
                    } else {
                        copyOnWriteMultiset.f6329g.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
        }
        b bVar = this.f7362d;
        int i3 = this.f7373o;
        DefaultDrmSessionManager.g gVar = (DefaultDrmSessionManager.g) bVar;
        Objects.requireNonNull(gVar);
        if (i3 == 1) {
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f7400l != -9223372036854775807L) {
                defaultDrmSessionManager.f7403o.add(this);
                Handler handler = DefaultDrmSessionManager.this.f7409u;
                Objects.requireNonNull(handler);
                handler.postAtTime(new Runnable() { // from class: c.n.b.b.q1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7323f.mo3646b(null);
                    }
                }, this, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f7400l);
                return;
            }
        }
        if (i3 == 0) {
            DefaultDrmSessionManager.this.f7401m.remove(this);
            DefaultDrmSessionManager defaultDrmSessionManager2 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager2.f7406r == this) {
                defaultDrmSessionManager2.f7406r = null;
            }
            if (defaultDrmSessionManager2.f7407s == this) {
                defaultDrmSessionManager2.f7407s = null;
            }
            if (defaultDrmSessionManager2.f7402n.size() > 1 && DefaultDrmSessionManager.this.f7402n.get(0) == this) {
                DefaultDrmSessionManager.this.f7402n.get(1).m3674n();
            }
            DefaultDrmSessionManager.this.f7402n.remove(this);
            DefaultDrmSessionManager defaultDrmSessionManager3 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager3.f7400l != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager3.f7409u;
                Objects.requireNonNull(handler2);
                handler2.removeCallbacksAndMessages(this);
                DefaultDrmSessionManager.this.f7403o.remove(this);
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: c */
    public final UUID mo3647c() {
        return this.f7370l;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: d */
    public boolean mo3648d() {
        return this.f7364f;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: e */
    public final ExoMediaCrypto mo3649e() {
        return this.f7376r;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: f */
    public final DrmSession.a mo3650f() {
        if (this.f7372n == 1) {
            return this.f7377s;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m3667g(Consumer<DrmSessionEventListener2.a> consumer) {
        Set<DrmSessionEventListener2.a> set;
        CopyOnWriteMultiset<DrmSessionEventListener2.a> copyOnWriteMultiset = this.f7367i;
        synchronized (copyOnWriteMultiset.f6328f) {
            set = copyOnWriteMultiset.f6330h;
        }
        Iterator<DrmSessionEventListener2.a> it = set.iterator();
        while (it.hasNext()) {
            consumer.mo3142a(it.next());
        }
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    public final int getState() {
        return this.f7372n;
    }

    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: h */
    public final void m3668h(boolean z) {
        long j2;
        Pair pair;
        long jMin;
        if (this.f7365g) {
            return;
        }
        byte[] bArr = this.f7378t;
        int i = Util6.f6307a;
        int i2 = this.f7363e;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.f7379u == null || m3676p()) {
                    m3673m(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            Objects.requireNonNull(this.f7379u);
            Objects.requireNonNull(this.f7378t);
            if (m3676p()) {
                m3673m(this.f7379u, 3, z);
                return;
            }
            return;
        }
        if (this.f7379u == null) {
            m3673m(bArr, 1, z);
            return;
        }
        if (this.f7372n == 4 || m3676p()) {
            if (C.f6406d.equals(this.f7370l)) {
                Map<String, String> mapM3675o = m3675o();
                if (mapM3675o == null) {
                    pair = null;
                } else {
                    long j3 = -9223372036854775807L;
                    try {
                        String str = mapM3675o.get("LicenseDurationRemaining");
                        j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                    } catch (NumberFormatException unused) {
                    }
                    Long lValueOf = Long.valueOf(j2);
                    try {
                        String str2 = mapM3675o.get("PlaybackDurationRemaining");
                        if (str2 != null) {
                            j3 = Long.parseLong(str2);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    pair = new Pair(lValueOf, Long.valueOf(j3));
                }
                Objects.requireNonNull(pair);
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (this.f7363e != 0 || jMin > 60) {
                if (jMin <= 0) {
                    m3670j(new KeysExpiredException());
                    return;
                } else {
                    this.f7372n = 4;
                    m3667g(new Consumer() { // from class: c.n.b.b.q1.o
                        @Override // p007c.p190n.p194b.p209b.p212b2.Consumer
                        /* JADX INFO: renamed from: a */
                        public final void mo3142a(Object obj) {
                            ((DrmSessionEventListener2.a) obj).m3697c();
                        }
                    });
                    return;
                }
            }
            android.util.Log.d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m3673m(bArr, 2, z);
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: i */
    public final boolean m3669i() {
        int i = this.f7372n;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: j */
    public final void m3670j(final Exception exc) {
        this.f7377s = new DrmSession.a(exc);
        m3667g(new Consumer() { // from class: c.n.b.b.q1.c
            @Override // p007c.p190n.p194b.p209b.p212b2.Consumer
            /* JADX INFO: renamed from: a */
            public final void mo3142a(Object obj) {
                ((DrmSessionEventListener2.a) obj).m3699e(exc);
            }
        });
        if (this.f7372n != 4) {
            this.f7372n = 1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3671k(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            ((DefaultDrmSessionManager.f) this.f7361c).m3684b(this);
        } else {
            m3670j(exc);
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: l */
    public final boolean m3672l(boolean z) {
        if (m3669i()) {
            return true;
        }
        try {
            byte[] bArrMo3656f = this.f7360b.mo3656f();
            this.f7378t = bArrMo3656f;
            this.f7376r = this.f7360b.mo3654d(bArrMo3656f);
            m3667g(new Consumer() { // from class: c.n.b.b.q1.k
                @Override // p007c.p190n.p194b.p209b.p212b2.Consumer
                /* JADX INFO: renamed from: a */
                public final void mo3142a(Object obj) {
                    ((DrmSessionEventListener2.a) obj).m3698d();
                }
            });
            this.f7372n = 3;
            Objects.requireNonNull(this.f7378t);
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                ((DefaultDrmSessionManager.f) this.f7361c).m3684b(this);
                return false;
            }
            m3670j(e2);
            return false;
        } catch (Exception e3) {
            m3670j(e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3673m(byte[] bArr, int i, boolean z) {
        try {
            ExoMediaDrm.b bVarMo3662l = this.f7360b.mo3662l(bArr, this.f7359a, i, this.f7366h);
            this.f7380v = bVarMo3662l;
            c cVar = this.f7375q;
            int i2 = Util6.f6307a;
            Objects.requireNonNull(bVarMo3662l);
            cVar.m3677a(1, bVarMo3662l, z);
        } catch (Exception e2) {
            m3671k(e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m3674n() {
        ExoMediaDrm.e eVarMo3655e = this.f7360b.mo3655e();
        this.f7381w = eVarMo3655e;
        c cVar = this.f7375q;
        int i = Util6.f6307a;
        Objects.requireNonNull(eVarMo3655e);
        cVar.m3677a(0, eVarMo3655e, true);
    }

    /* JADX INFO: renamed from: o */
    public Map<String, String> m3675o() {
        byte[] bArr = this.f7378t;
        if (bArr == null) {
            return null;
        }
        return this.f7360b.mo3653c(bArr);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    /* JADX INFO: renamed from: p */
    public final boolean m3676p() {
        try {
            this.f7360b.mo3657g(this.f7378t, this.f7379u);
            return true;
        } catch (Exception e2) {
            Log.m3154b("DefaultDrmSession", "Error trying to restore keys.", e2);
            m3670j(e2);
            return false;
        }
    }
}
