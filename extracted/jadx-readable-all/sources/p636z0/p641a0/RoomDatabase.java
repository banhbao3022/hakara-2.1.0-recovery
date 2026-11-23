package p636z0.p641a0;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p641a0.p642a0.Migration;
import p636z0.p655c.p656a.p657a.ArchTaskExecutor;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;
import p636z0.p660c0.p661a.SupportSQLiteQuery;
import p636z0.p660c0.p661a.p662g.FrameworkSQLiteOpenHelperFactory;

/* JADX INFO: renamed from: z0.a0.q, reason: use source file name */
/* JADX INFO: compiled from: RoomDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public volatile SupportSQLiteDatabase f34303a;

    /* JADX INFO: renamed from: b */
    public Executor f34304b;

    /* JADX INFO: renamed from: c */
    public Executor f34305c;

    /* JADX INFO: renamed from: d */
    public SupportSQLiteOpenHelper f34306d;

    /* JADX INFO: renamed from: f */
    public boolean f34308f;

    /* JADX INFO: renamed from: g */
    public boolean f34309g;

    /* JADX INFO: renamed from: h */
    @Deprecated
    public List<b> f34310h;

    /* JADX INFO: renamed from: j */
    public AutoCloser f34312j;

    /* JADX INFO: renamed from: i */
    public final ReentrantReadWriteLock f34311i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: k */
    public final ThreadLocal<Integer> f34313k = new ThreadLocal<>();

    /* JADX INFO: renamed from: l */
    public final Map<String, Object> f34314l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e */
    public final InvalidationTracker f34307e = mo948d();

    /* JADX INFO: renamed from: m */
    public final Map<Class<?>, Object> f34315m = new HashMap();

    /* JADX INFO: renamed from: z0.a0.q$a */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public static class a<T extends RoomDatabase> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f34316a;

        /* JADX INFO: renamed from: b */
        public final String f34317b;

        /* JADX INFO: renamed from: c */
        public final Context f34318c;

        /* JADX INFO: renamed from: d */
        public ArrayList<b> f34319d;

        /* JADX INFO: renamed from: e */
        public Executor f34320e;

        /* JADX INFO: renamed from: f */
        public Executor f34321f;

        /* JADX INFO: renamed from: g */
        public SupportSQLiteOpenHelper.c f34322g;

        /* JADX INFO: renamed from: h */
        public boolean f34323h;

        /* JADX INFO: renamed from: j */
        public boolean f34325j;

        /* JADX INFO: renamed from: l */
        public Set<Integer> f34327l;

        /* JADX INFO: renamed from: i */
        public boolean f34324i = true;

        /* JADX INFO: renamed from: k */
        public final d f34326k = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f34318c = context;
            this.f34316a = cls;
            this.f34317b = str;
        }

        /* JADX INFO: renamed from: a */
        public a<T> m14539a(Migration... migrationArr) {
            if (this.f34327l == null) {
                this.f34327l = new HashSet();
            }
            for (Migration migration : migrationArr) {
                this.f34327l.add(Integer.valueOf(migration.f34197a));
                this.f34327l.add(Integer.valueOf(migration.f34198b));
            }
            d dVar = this.f34326k;
            Objects.requireNonNull(dVar);
            for (Migration migration2 : migrationArr) {
                int i = migration2.f34197a;
                int i2 = migration2.f34198b;
                TreeMap<Integer, Migration> treeMap = dVar.f34332a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    dVar.f34332a.put(Integer.valueOf(i), treeMap);
                }
                Migration migration3 = treeMap.get(Integer.valueOf(i2));
                if (migration3 != null) {
                    Log.w("ROOM", "Overriding migration " + migration3 + " with " + migration2);
                }
                treeMap.put(Integer.valueOf(i2), migration2);
            }
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: b */
        public T m14540b() {
            Executor executor;
            c cVar = c.WRITE_AHEAD_LOGGING;
            if (this.f34318c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f34316a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f34320e;
            if (executor2 == null && this.f34321f == null) {
                Executor executor3 = ArchTaskExecutor.f35303b;
                this.f34321f = executor3;
                this.f34320e = executor3;
            } else if (executor2 != null && this.f34321f == null) {
                this.f34321f = executor2;
            } else if (executor2 == null && (executor = this.f34321f) != null) {
                this.f34320e = executor;
            }
            SupportSQLiteOpenHelper.c frameworkSQLiteOpenHelperFactory = this.f34322g;
            if (frameworkSQLiteOpenHelperFactory == null) {
                frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            SupportSQLiteOpenHelper.c cVar2 = frameworkSQLiteOpenHelperFactory;
            Context context = this.f34318c;
            String str = this.f34317b;
            d dVar = this.f34326k;
            ArrayList<b> arrayList = this.f34319d;
            boolean z = this.f34323h;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str, cVar2, dVar, arrayList, z, (activityManager == null || activityManager.isLowRamDevice()) ? c.TRUNCATE : cVar, this.f34320e, this.f34321f, false, this.f34324i, this.f34325j, null, null, null, null, null, null);
            Class<T> cls = this.f34316a;
            String name = cls.getPackage().getName();
            String canonicalName = cls.getCanonicalName();
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str2 = canonicalName.replace('.', '_') + "_Impl";
            try {
                T t = (T) Class.forName(name.isEmpty() ? str2 : name + "." + str2, true, cls.getClassLoader()).newInstance();
                SupportSQLiteOpenHelper supportSQLiteOpenHelperMo949e = t.mo949e(databaseConfiguration);
                t.f34306d = supportSQLiteOpenHelperMo949e;
                SQLiteCopyOpenHelper2 sQLiteCopyOpenHelper2 = (SQLiteCopyOpenHelper2) t.m14538o(SQLiteCopyOpenHelper2.class, supportSQLiteOpenHelperMo949e);
                if (sQLiteCopyOpenHelper2 != null) {
                    sQLiteCopyOpenHelper2.f34363l = databaseConfiguration;
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) t.m14538o(AutoClosingRoomOpenHelper.class, t.f34306d);
                if (autoClosingRoomOpenHelper != null) {
                    AutoCloser autoCloser = autoClosingRoomOpenHelper.f34231h;
                    t.f34312j = autoCloser;
                    final InvalidationTracker invalidationTracker = t.f34307e;
                    invalidationTracker.f34265e = autoCloser;
                    autoCloser.f34199a = new Runnable() { // from class: z0.a0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            InvalidationTracker invalidationTracker2 = invalidationTracker;
                            synchronized (invalidationTracker2) {
                                invalidationTracker2.f34268h = false;
                                InvalidationTracker.b bVar = invalidationTracker2.f34270j;
                                synchronized (bVar) {
                                    Arrays.fill(bVar.f34275b, false);
                                    bVar.f34277d = true;
                                }
                            }
                        }
                    };
                }
                boolean z2 = databaseConfiguration.f34250i == cVar;
                t.f34306d.setWriteAheadLoggingEnabled(z2);
                t.f34310h = databaseConfiguration.f34246e;
                t.f34304b = databaseConfiguration.f34251j;
                t.f34305c = new TransactionExecutor(databaseConfiguration.f34252k);
                t.f34308f = databaseConfiguration.f34249h;
                t.f34309g = z2;
                if (databaseConfiguration.f34253l) {
                    InvalidationTracker invalidationTracker2 = t.f34307e;
                    new MultiInstanceInvalidationClient(databaseConfiguration.f34243b, databaseConfiguration.f34244c, invalidationTracker2, invalidationTracker2.f34266f.f34304b);
                }
                Map<Class<?>, List<Class<?>>> mapMo14350g = t.mo14350g();
                BitSet bitSet = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : mapMo14350g.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls2 : entry.getValue()) {
                        int size = databaseConfiguration.f34248g.size() - 1;
                        while (true) {
                            if (size < 0) {
                                size = -1;
                                break;
                            }
                            if (cls2.isAssignableFrom(databaseConfiguration.f34248g.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            }
                            size--;
                        }
                        if (size < 0) {
                            throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                        t.f34315m.put(cls2, databaseConfiguration.f34248g.get(size));
                    }
                }
                for (int size2 = databaseConfiguration.f34248g.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected type converter " + databaseConfiguration.f34248g.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return t;
            } catch (ClassNotFoundException unused) {
                StringBuilder sbM1556G = outline.m1556G("cannot find implementation for ");
                sbM1556G.append(cls.getCanonicalName());
                sbM1556G.append(". ");
                sbM1556G.append(str2);
                sbM1556G.append(" does not exist");
                throw new RuntimeException(sbM1556G.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder sbM1556G2 = outline.m1556G("Cannot access the constructor");
                sbM1556G2.append(cls.getCanonicalName());
                throw new RuntimeException(sbM1556G2.toString());
            } catch (InstantiationException unused3) {
                StringBuilder sbM1556G3 = outline.m1556G("Failed to create an instance of ");
                sbM1556G3.append(cls.getCanonicalName());
                throw new RuntimeException(sbM1556G3.toString());
            }
        }
    }

    /* JADX INFO: renamed from: z0.a0.q$b */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public void mo14541a(SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    /* JADX INFO: renamed from: z0.a0.q$c */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* JADX INFO: renamed from: z0.a0.q$d */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public HashMap<Integer, TreeMap<Integer, Migration>> f34332a = new HashMap<>();
    }

    /* JADX INFO: renamed from: z0.a0.q$e */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: a */
    public void m14527a() {
        if (this.f34308f) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14528b() {
        if (!m14531h() && this.f34313k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m14529c() {
        m14527a();
        AutoCloser autoCloser = this.f34312j;
        if (autoCloser == null) {
            m14532i();
        } else {
            Objects.requireNonNull(autoCloser);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract InvalidationTracker mo948d();

    /* JADX INFO: renamed from: e */
    public abstract SupportSQLiteOpenHelper mo949e(DatabaseConfiguration databaseConfiguration);

    @Deprecated
    /* JADX INFO: renamed from: f */
    public void m14530f() {
        AutoCloser autoCloser = this.f34312j;
        if (autoCloser == null) {
            m14533j();
        } else {
            Objects.requireNonNull(autoCloser);
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public Map<Class<?>, List<Class<?>>> mo14350g() {
        return Collections.emptyMap();
    }

    /* JADX INFO: renamed from: h */
    public boolean m14531h() {
        return this.f34306d.mo14509e().mo15044i0();
    }

    /* JADX INFO: renamed from: i */
    public final void m14532i() {
        m14527a();
        SupportSQLiteDatabase supportSQLiteDatabaseMo14509e = this.f34306d.mo14509e();
        this.f34307e.m14521f(supportSQLiteDatabaseMo14509e);
        if (supportSQLiteDatabaseMo14509e.mo15046q0()) {
            supportSQLiteDatabaseMo14509e.mo15039M();
        } else {
            supportSQLiteDatabaseMo14509e.mo15043i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m14533j() {
        this.f34306d.mo14509e().mo15041T();
        if (m14531h()) {
            return;
        }
        InvalidationTracker invalidationTracker = this.f34307e;
        if (invalidationTracker.f34267g.compareAndSet(false, true)) {
            if (invalidationTracker.f34265e != null) {
                throw null;
            }
            invalidationTracker.f34266f.f34304b.execute(invalidationTracker.f34272l);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14534k(SupportSQLiteDatabase supportSQLiteDatabase) {
        InvalidationTracker invalidationTracker = this.f34307e;
        synchronized (invalidationTracker) {
            if (invalidationTracker.f34268h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.mo15045n("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.mo15045n("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.mo15045n("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.m14521f(supportSQLiteDatabase);
            invalidationTracker.f34269i = supportSQLiteDatabase.mo15047r("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            invalidationTracker.f34268h = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m14535l() {
        AutoCloser autoCloser = this.f34312j;
        if (autoCloser != null) {
            return !autoCloser.f34200b;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = this.f34303a;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    /* JADX INFO: renamed from: m */
    public Cursor m14536m(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        m14527a();
        m14528b();
        return cancellationSignal != null ? this.f34306d.mo14509e().mo15036A(supportSQLiteQuery, cancellationSignal) : this.f34306d.mo14509e().mo15042c0(supportSQLiteQuery);
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public void m14537n() {
        this.f34306d.mo14509e().mo15037K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final <T> T m14538o(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return (T) m14538o(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).mo14508a());
        }
        return null;
    }
}
