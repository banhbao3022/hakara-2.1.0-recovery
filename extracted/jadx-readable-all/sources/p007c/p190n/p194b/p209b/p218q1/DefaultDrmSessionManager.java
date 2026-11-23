package p007c.p190n.p194b.p209b.p218q1;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.ImmutableSet;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.q1.q, reason: use source file name */
/* JADX INFO: compiled from: DefaultDrmSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSessionManager implements DrmSessionManager2 {

    /* JADX INFO: renamed from: b */
    public final UUID f7390b;

    /* JADX INFO: renamed from: c */
    public final ExoMediaDrm.d f7391c;

    /* JADX INFO: renamed from: d */
    public final MediaDrmCallback f7392d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, String> f7393e;

    /* JADX INFO: renamed from: f */
    public final boolean f7394f;

    /* JADX INFO: renamed from: g */
    public final int[] f7395g;

    /* JADX INFO: renamed from: h */
    public final boolean f7396h;

    /* JADX INFO: renamed from: i */
    public final f f7397i;

    /* JADX INFO: renamed from: j */
    public final LoadErrorHandlingPolicy f7398j;

    /* JADX INFO: renamed from: k */
    public final g f7399k;

    /* JADX INFO: renamed from: l */
    public final long f7400l;

    /* JADX INFO: renamed from: m */
    public final List<DefaultDrmSession> f7401m;

    /* JADX INFO: renamed from: n */
    public final List<DefaultDrmSession> f7402n;

    /* JADX INFO: renamed from: o */
    public final Set<DefaultDrmSession> f7403o;

    /* JADX INFO: renamed from: p */
    public int f7404p;

    /* JADX INFO: renamed from: q */
    public ExoMediaDrm f7405q;

    /* JADX INFO: renamed from: r */
    public DefaultDrmSession f7406r;

    /* JADX INFO: renamed from: s */
    public DefaultDrmSession f7407s;

    /* JADX INFO: renamed from: t */
    public Looper f7408t;

    /* JADX INFO: renamed from: u */
    public Handler f7409u;

    /* JADX INFO: renamed from: v */
    public int f7410v;

    /* JADX INFO: renamed from: w */
    public byte[] f7411w;

    /* JADX INFO: renamed from: x */
    public volatile d f7412x;

    /* JADX INFO: renamed from: c.n.b.b.q1.q$b */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final HashMap<String, String> f7413a = new HashMap<>();

        /* JADX INFO: renamed from: b */
        public UUID f7414b = C.f6406d;

        /* JADX INFO: renamed from: c */
        public ExoMediaDrm.d f7415c;

        /* JADX INFO: renamed from: d */
        public boolean f7416d;

        /* JADX INFO: renamed from: e */
        public int[] f7417e;

        /* JADX INFO: renamed from: f */
        public boolean f7418f;

        /* JADX INFO: renamed from: g */
        public LoadErrorHandlingPolicy f7419g;

        /* JADX INFO: renamed from: h */
        public long f7420h;

        public b() {
            int i = FrameworkMediaDrm.f7330a;
            this.f7415c = C1672l.f7354a;
            this.f7419g = new DefaultLoadErrorHandlingPolicy();
            this.f7417e = new int[0];
            this.f7420h = 300000L;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.q$c */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    public class c implements ExoMediaDrm.c {
        public c(a aVar) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.q$d */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f7401m) {
                if (Arrays.equals(defaultDrmSession.f7378t, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f7363e == 0 && defaultDrmSession.f7372n == 4) {
                        int i = Util6.f6307a;
                        defaultDrmSession.m3668h(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.q$e */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    public static final class e extends Exception {
        public e(UUID uuid, a aVar) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.q$f */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    public class f implements DefaultDrmSession.a {
        public f(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public void m3683a(Exception exc) {
            Iterator<DefaultDrmSession> it = DefaultDrmSessionManager.this.f7402n.iterator();
            while (it.hasNext()) {
                it.next().m3670j(exc);
            }
            DefaultDrmSessionManager.this.f7402n.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m3684b(DefaultDrmSession defaultDrmSession) {
            if (DefaultDrmSessionManager.this.f7402n.contains(defaultDrmSession)) {
                return;
            }
            DefaultDrmSessionManager.this.f7402n.add(defaultDrmSession);
            if (DefaultDrmSessionManager.this.f7402n.size() == 1) {
                defaultDrmSession.m3674n();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.q$g */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    public class g implements DefaultDrmSession.b {
        public g(a aVar) {
        }
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map) {
        this(uuid, exoMediaDrm, mediaDrmCallback, map == null ? new HashMap<>() : map, false, 3);
    }

    /* JADX INFO: renamed from: e */
    public static List<DrmInitData.b> m3678e(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f7431i);
        for (int i = 0; i < drmInitData.f7431i; i++) {
            DrmInitData.b bVar = drmInitData.f7428f[i];
            if ((bVar.m3689b(uuid) || (C.f6405c.equals(uuid) && bVar.m3689b(C.f6404b))) && (bVar.f7436j != null || z)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
    /* JADX INFO: renamed from: a */
    public DrmSession mo3679a(Looper looper, DrmSessionEventListener2.a aVar, Format format) {
        List<DrmInitData.b> listM3678e;
        Looper looper2 = this.f7408t;
        int i = 0;
        if (looper2 == null) {
            this.f7408t = looper;
            this.f7409u = new Handler(looper);
        } else {
            C2096e.m4570f(looper2 == looper);
        }
        if (this.f7412x == null) {
            this.f7412x = new d(looper);
        }
        DrmInitData drmInitData = format.f6937t;
        DefaultDrmSession defaultDrmSessionM3682d = null;
        if (drmInitData != null) {
            if (this.f7411w == null) {
                listM3678e = m3678e(drmInitData, this.f7390b, false);
                if (((ArrayList) listM3678e).isEmpty()) {
                    e eVar = new e(this.f7390b, null);
                    if (aVar != null) {
                        aVar.m3699e(eVar);
                    }
                    return new ErrorStateDrmSession(new DrmSession.a(eVar));
                }
            } else {
                listM3678e = null;
            }
            if (this.f7394f) {
                for (DefaultDrmSession defaultDrmSession : this.f7401m) {
                    if (Util6.m3113a(defaultDrmSession.f7359a, listM3678e)) {
                        defaultDrmSessionM3682d = defaultDrmSession;
                        break;
                    }
                }
            } else {
                defaultDrmSessionM3682d = this.f7407s;
            }
            if (defaultDrmSessionM3682d == null) {
                defaultDrmSessionM3682d = m3682d(listM3678e, false, aVar);
                if (!this.f7394f) {
                    this.f7407s = defaultDrmSessionM3682d;
                }
                this.f7401m.add(defaultDrmSessionM3682d);
            } else {
                defaultDrmSessionM3682d.mo3645a(aVar);
            }
            return defaultDrmSessionM3682d;
        }
        int iM3167i = MimeTypes.m3167i(format.f6934q);
        ExoMediaDrm exoMediaDrm = this.f7405q;
        Objects.requireNonNull(exoMediaDrm);
        if (FrameworkMediaCrypto.class.equals(exoMediaDrm.mo3652b()) && FrameworkMediaCrypto.f7324a) {
            return null;
        }
        int[] iArr = this.f7395g;
        int i2 = Util6.f6307a;
        while (true) {
            if (i >= iArr.length) {
                i = -1;
                break;
            }
            if (iArr[i] == iM3167i) {
                break;
            }
            i++;
        }
        if (i == -1 || UnsupportedMediaCrypto.class.equals(exoMediaDrm.mo3652b())) {
            return null;
        }
        DefaultDrmSession defaultDrmSession2 = this.f7406r;
        if (defaultDrmSession2 == null) {
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            DefaultDrmSession defaultDrmSessionM3682d2 = m3682d(RegularImmutableList.f26218h, true, null);
            this.f7401m.add(defaultDrmSessionM3682d2);
            this.f7406r = defaultDrmSessionM3682d2;
        } else {
            defaultDrmSession2.mo3645a(null);
        }
        return this.f7406r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
    /* JADX INFO: renamed from: b */
    public Class<? extends ExoMediaCrypto> mo3680b(Format format) {
        String str;
        ExoMediaDrm exoMediaDrm = this.f7405q;
        Objects.requireNonNull(exoMediaDrm);
        Class<? extends ExoMediaCrypto> clsMo3652b = exoMediaDrm.mo3652b();
        DrmInitData drmInitData = format.f6937t;
        int i = 0;
        if (drmInitData == null) {
            int iM3167i = MimeTypes.m3167i(format.f6934q);
            int[] iArr = this.f7395g;
            int i2 = Util6.f6307a;
            while (i < iArr.length) {
                if (iArr[i] == iM3167i) {
                    if (i != -1) {
                        return clsMo3652b;
                    }
                    return null;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return clsMo3652b;
            }
            return null;
        }
        if (this.f7411w != null) {
            i = 1;
        } else if (!((ArrayList) m3678e(drmInitData, this.f7390b, true)).isEmpty()) {
            str = drmInitData.f7430h;
            if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : Util6.f6307a >= 25)) {
                i = 1;
            }
        } else if (drmInitData.f7431i == 1 && drmInitData.f7428f[0].m3689b(C.f6404b)) {
            StringBuilder sbM1556G = outline.m1556G("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sbM1556G.append(this.f7390b);
            Log.w("DefaultDrmSessionMgr", sbM1556G.toString());
            str = drmInitData.f7430h;
            if (str != null) {
                i = 1;
            } else {
                i = 1;
            }
        }
        return i != 0 ? clsMo3652b : UnsupportedMediaCrypto.class;
    }

    /* JADX INFO: renamed from: c */
    public final DefaultDrmSession m3681c(List<DrmInitData.b> list, boolean z, DrmSessionEventListener2.a aVar) {
        Objects.requireNonNull(this.f7405q);
        boolean z2 = this.f7396h | z;
        UUID uuid = this.f7390b;
        ExoMediaDrm exoMediaDrm = this.f7405q;
        f fVar = this.f7397i;
        g gVar = this.f7399k;
        int i = this.f7410v;
        byte[] bArr = this.f7411w;
        HashMap<String, String> map = this.f7393e;
        MediaDrmCallback mediaDrmCallback = this.f7392d;
        Looper looper = this.f7408t;
        Objects.requireNonNull(looper);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, exoMediaDrm, fVar, gVar, list, i, z2, z, bArr, map, mediaDrmCallback, looper, this.f7398j);
        defaultDrmSession.mo3645a(aVar);
        if (this.f7400l != -9223372036854775807L) {
            defaultDrmSession.mo3645a(null);
        }
        return defaultDrmSession;
    }

    /* JADX INFO: renamed from: d */
    public final DefaultDrmSession m3682d(List<DrmInitData.b> list, boolean z, DrmSessionEventListener2.a aVar) {
        DefaultDrmSession defaultDrmSessionM3681c = m3681c(list, z, aVar);
        if (defaultDrmSessionM3681c.f7372n != 1) {
            return defaultDrmSessionM3681c;
        }
        if (Util6.f6307a >= 19) {
            DrmSession.a aVarMo3650f = defaultDrmSessionM3681c.mo3650f();
            Objects.requireNonNull(aVarMo3650f);
            if (!(aVarMo3650f.getCause() instanceof ResourceBusyException)) {
                return defaultDrmSessionM3681c;
            }
        }
        if (this.f7403o.isEmpty()) {
            return defaultDrmSessionM3681c;
        }
        Iterator it = ImmutableSet.m11661v(this.f7403o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).mo3646b(null);
        }
        defaultDrmSessionM3681c.mo3646b(aVar);
        if (this.f7400l != -9223372036854775807L) {
            defaultDrmSessionM3681c.mo3646b(null);
        }
        return m3681c(list, z, aVar);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
    public final void prepare() {
        int i = this.f7404p;
        this.f7404p = i + 1;
        if (i != 0) {
            return;
        }
        C2096e.m4570f(this.f7405q == null);
        ExoMediaDrm exoMediaDrmMo3663a = this.f7391c.mo3663a(this.f7390b);
        this.f7405q = exoMediaDrmMo3663a;
        exoMediaDrmMo3663a.mo3659i(new c(null));
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
    public final void release() {
        int i = this.f7404p - 1;
        this.f7404p = i;
        if (i != 0) {
            return;
        }
        if (this.f7400l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f7401m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).mo3646b(null);
            }
        }
        ExoMediaDrm exoMediaDrm = this.f7405q;
        Objects.requireNonNull(exoMediaDrm);
        exoMediaDrm.release();
        this.f7405q = null;
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z) {
        this(uuid, exoMediaDrm, mediaDrmCallback, map == null ? new HashMap<>() : map, z, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z, int i) {
        this(uuid, new ExoMediaDrm.a(exoMediaDrm), mediaDrmCallback, map == null ? new HashMap<>() : map, z, new int[0], false, new DefaultLoadErrorHandlingPolicy(i), 300000L);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.d dVar, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2) {
        Objects.requireNonNull(uuid);
        C2096e.m4567c(!C.f6404b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7390b = uuid;
        this.f7391c = dVar;
        this.f7392d = mediaDrmCallback;
        this.f7393e = map;
        this.f7394f = z;
        this.f7395g = iArr;
        this.f7396h = z2;
        this.f7398j = loadErrorHandlingPolicy;
        this.f7397i = new f(null);
        this.f7399k = new g(null);
        this.f7410v = 0;
        this.f7401m = new ArrayList();
        this.f7402n = new ArrayList();
        this.f7403o = Collections.newSetFromMap(new IdentityHashMap());
        this.f7400l = j2;
    }
}
