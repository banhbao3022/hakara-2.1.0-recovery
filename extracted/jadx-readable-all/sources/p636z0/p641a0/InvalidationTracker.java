package p636z0.p641a0;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p655c.p656a.p658b.SafeIterableMap;
import p636z0.p660c0.p661a.SimpleSQLiteQuery;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.a0.n, reason: use source file name */
/* JADX INFO: compiled from: InvalidationTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class InvalidationTracker {

    /* JADX INFO: renamed from: a */
    public static final String[] f34261a = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Integer> f34262b;

    /* JADX INFO: renamed from: c */
    public final String[] f34263c;

    /* JADX INFO: renamed from: d */
    public Map<String, Set<String>> f34264d;

    /* JADX INFO: renamed from: e */
    public AutoCloser f34265e;

    /* JADX INFO: renamed from: f */
    public final RoomDatabase f34266f;

    /* JADX INFO: renamed from: g */
    public AtomicBoolean f34267g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f34268h;

    /* JADX INFO: renamed from: i */
    public volatile SupportSQLiteStatement f34269i;

    /* JADX INFO: renamed from: j */
    public b f34270j;

    /* JADX INFO: renamed from: k */
    @SuppressLint({"RestrictedApi"})
    public final SafeIterableMap<c, d> f34271k;

    /* JADX INFO: renamed from: l */
    public Runnable f34272l;

    /* JADX INFO: renamed from: z0.a0.n$a */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final Set<Integer> m14522a() {
            HashSet hashSet = new HashSet();
            Cursor cursorM14536m = InvalidationTracker.this.f34266f.m14536m(new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (cursorM14536m.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorM14536m.getInt(0)));
                } catch (Throwable th) {
                    cursorM14536m.close();
                    throw th;
                }
            }
            cursorM14536m.close();
            if (!hashSet.isEmpty()) {
                InvalidationTracker.this.f34269i.mo15051q();
            }
            return hashSet;
        }

        /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
        @Override // java.lang.Runnable
        public void run() {
            ?? r5;
            ?? r6;
            Set<Integer> setM14522a;
            ReentrantReadWriteLock.ReadLock lock = InvalidationTracker.this.f34266f.f34311i.readLock();
            lock.lock();
            try {
                try {
                    if (!InvalidationTracker.this.m14517b()) {
                        lock.unlock();
                        if (InvalidationTracker.this.f34265e != null) {
                            throw null;
                        }
                        return;
                    }
                    if (!InvalidationTracker.this.f34267g.compareAndSet(true, false)) {
                        lock.unlock();
                        if (InvalidationTracker.this.f34265e != null) {
                            throw null;
                        }
                        return;
                    }
                    if (InvalidationTracker.this.f34266f.m14531h()) {
                        lock.unlock();
                        if (InvalidationTracker.this.f34265e != null) {
                            throw null;
                        }
                        return;
                    }
                    RoomDatabase roomDatabase = InvalidationTracker.this.f34266f;
                    boolean z = roomDatabase.f34309g;
                    if (z) {
                        try {
                            SupportSQLiteDatabase supportSQLiteDatabaseMo14509e = roomDatabase.f34306d.mo14509e();
                            supportSQLiteDatabaseMo14509e.mo15039M();
                            try {
                                Set<Integer> setM14522a2 = m14522a();
                                try {
                                    supportSQLiteDatabaseMo14509e.mo15037K();
                                    supportSQLiteDatabaseMo14509e.mo15041T();
                                    setM14522a = setM14522a2;
                                } catch (Throwable th) {
                                    th = th;
                                    supportSQLiteDatabaseMo14509e.mo15041T();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            r5 = z;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            lock.unlock();
                            r6 = r5;
                            if (InvalidationTracker.this.f34265e != null) {
                                throw null;
                            }
                        } catch (IllegalStateException e2) {
                            e = e2;
                            r5 = z;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            lock.unlock();
                            r6 = r5;
                            if (InvalidationTracker.this.f34265e != null) {
                                throw null;
                            }
                        }
                    } else {
                        setM14522a = m14522a();
                    }
                    lock.unlock();
                    r6 = setM14522a;
                    if (InvalidationTracker.this.f34265e != null) {
                        throw null;
                    }
                    if (r6 == 0 || r6.isEmpty()) {
                        return;
                    }
                    synchronized (InvalidationTracker.this.f34271k) {
                        Iterator<Map.Entry<c, d>> it = InvalidationTracker.this.f34271k.iterator();
                        while (true) {
                            SafeIterableMap.e eVar = (SafeIterableMap.e) it;
                            if (eVar.hasNext()) {
                                d dVar = (d) ((Map.Entry) eVar.next()).getValue();
                                int length = dVar.f34280a.length;
                                Set<String> hashSet = null;
                                for (int i = 0; i < length; i++) {
                                    if (r6.contains(Integer.valueOf(dVar.f34280a[i]))) {
                                        if (length == 1) {
                                            hashSet = dVar.f34283d;
                                        } else {
                                            if (hashSet == null) {
                                                hashSet = new HashSet<>(length);
                                            }
                                            hashSet.add(dVar.f34281b[i]);
                                        }
                                    }
                                }
                                if (hashSet != null) {
                                    dVar.f34282c.mo14524a(hashSet);
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    lock.unlock();
                    if (InvalidationTracker.this.f34265e == null) {
                        throw th3;
                    }
                    throw null;
                }
            } catch (SQLiteException | IllegalStateException e3) {
                e = e3;
                r5 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: z0.a0.n$b */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final long[] f34274a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f34275b;

        /* JADX INFO: renamed from: c */
        public final int[] f34276c;

        /* JADX INFO: renamed from: d */
        public boolean f34277d;

        /* JADX INFO: renamed from: e */
        public boolean f34278e;

        public b(int i) {
            long[] jArr = new long[i];
            this.f34274a = jArr;
            boolean[] zArr = new boolean[i];
            this.f34275b = zArr;
            this.f34276c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* JADX INFO: renamed from: a */
        public int[] m14523a() {
            synchronized (this) {
                if (this.f34277d && !this.f34278e) {
                    int length = this.f34274a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.f34278e = true;
                            this.f34277d = false;
                            return this.f34276c;
                        }
                        boolean z = this.f34274a[i] > 0;
                        boolean[] zArr = this.f34275b;
                        if (z != zArr[i]) {
                            int[] iArr = this.f34276c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f34276c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: z0.a0.n$c */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final String[] f34279a;

        public c(String[] strArr) {
            this.f34279a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo14524a(Set<String> set);
    }

    /* JADX INFO: renamed from: z0.a0.n$d */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final int[] f34280a;

        /* JADX INFO: renamed from: b */
        public final String[] f34281b;

        /* JADX INFO: renamed from: c */
        public final c f34282c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f34283d;

        public d(c cVar, int[] iArr, String[] strArr) {
            this.f34282c = cVar;
            this.f34280a = iArr;
            this.f34281b = strArr;
            if (iArr.length != 1) {
                this.f34283d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f34283d = Collections.unmodifiableSet(hashSet);
        }

        /* JADX INFO: renamed from: a */
        public void m14525a(String[] strArr) {
            Set<String> set = null;
            if (this.f34281b.length == 1) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase(this.f34281b[0])) {
                        set = this.f34283d;
                        break;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    for (String str3 : this.f34281b) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f34282c.mo14524a(set);
            }
        }
    }

    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, new HashMap(), Collections.emptyMap(), strArr);
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: a */
    public void m14516a(c cVar) {
        d dVarMo15029j;
        boolean z;
        String[] strArr = cVar.f34279a;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f34264d.containsKey(lowerCase)) {
                hashSet.addAll(this.f34264d.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        int length2 = strArr2.length;
        for (int i = 0; i < length2; i++) {
            Integer num = this.f34262b.get(strArr2[i].toLowerCase(Locale.US));
            if (num == null) {
                StringBuilder sbM1556G = outline.m1556G("There is no table with name ");
                sbM1556G.append(strArr2[i]);
                throw new IllegalArgumentException(sbM1556G.toString());
            }
            iArr[i] = num.intValue();
        }
        d dVar = new d(cVar, iArr, strArr2);
        synchronized (this.f34271k) {
            dVarMo15029j = this.f34271k.mo15029j(cVar, dVar);
        }
        if (dVarMo15029j == null) {
            b bVar = this.f34270j;
            synchronized (bVar) {
                z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i2];
                    long[] jArr = bVar.f34274a;
                    long j2 = jArr[i3];
                    jArr[i3] = 1 + j2;
                    if (j2 == 0) {
                        bVar.f34277d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                m14520e();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m14517b() {
        if (!this.f34266f.m14535l()) {
            return false;
        }
        if (!this.f34268h) {
            this.f34266f.f34306d.mo14509e();
        }
        if (this.f34268h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m14518c(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.mo15045n("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f34263c[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f34261a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            outline.m1572W(sb, str, "_", str2, "`");
            outline.m1572W(sb, " AFTER ", str2, " ON `", str);
            outline.m1572W(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            outline.m1572W(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            supportSQLiteDatabase.mo15045n(sb.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14519d(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.f34263c[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f34261a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            supportSQLiteDatabase.mo15045n(outline.m1553D(sb, str, "_", str2, "`"));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m14520e() {
        if (this.f34266f.m14535l()) {
            m14521f(this.f34266f.f34306d.mo14509e());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14521f(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.mo15044i0()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f34266f.f34311i.readLock();
                lock.lock();
                try {
                    int[] iArrM14523a = this.f34270j.m14523a();
                    if (iArrM14523a == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrM14523a.length;
                    if (supportSQLiteDatabase.mo15046q0()) {
                        supportSQLiteDatabase.mo15039M();
                    } else {
                        supportSQLiteDatabase.mo15043i();
                    }
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrM14523a[i];
                            if (i2 == 1) {
                                m14518c(supportSQLiteDatabase, i);
                            } else if (i2 == 2) {
                                m14519d(supportSQLiteDatabase, i);
                            }
                        } catch (Throwable th) {
                            supportSQLiteDatabase.mo15041T();
                            throw th;
                        }
                    }
                    supportSQLiteDatabase.mo15037K();
                    supportSQLiteDatabase.mo15041T();
                    b bVar = this.f34270j;
                    synchronized (bVar) {
                        bVar.f34278e = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }

    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f34265e = null;
        this.f34267g = new AtomicBoolean(false);
        this.f34268h = false;
        this.f34271k = new SafeIterableMap<>();
        this.f34272l = new a();
        this.f34266f = roomDatabase;
        this.f34270j = new b(strArr.length);
        this.f34262b = new HashMap<>();
        this.f34264d = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f34263c = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f34262b.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f34263c[i] = str2.toLowerCase(locale);
            } else {
                this.f34263c[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f34262b.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f34262b;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }
}
