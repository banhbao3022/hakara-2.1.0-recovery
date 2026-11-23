package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.p198j.AutoValue_EventInternal;
import p007c.p190n.p194b.p195a.p198j.EncodedPayload;
import p007c.p190n.p194b.p195a.p198j.EventInternal;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationException;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;
import p007c.p190n.p194b.p195a.p198j.p208y.PriorityMapping;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.t */
/* JADX INFO: compiled from: SQLiteEventStore.java */
/* JADX INFO: loaded from: classes.dex */
public class C1380t implements EventStore, SynchronizationGuard {

    /* JADX INFO: renamed from: f */
    public static final Encoding f5904f = new Encoding("proto");

    /* JADX INFO: renamed from: g */
    public final SchemaManager5 f5905g;

    /* JADX INFO: renamed from: h */
    public final Clock f5906h;

    /* JADX INFO: renamed from: i */
    public final Clock f5907i;

    /* JADX INFO: renamed from: j */
    public final EventStoreConfig f5908j;

    /* JADX INFO: renamed from: c.n.b.a.j.v.i.t$b */
    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public interface b<T, U> {
        U apply(T t);
    }

    /* JADX INFO: renamed from: c.n.b.a.j.v.i.t$c */
    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final String f5909a;

        /* JADX INFO: renamed from: b */
        public final String f5910b;

        public c(String str, String str2, a aVar) {
            this.f5909a = str;
            this.f5910b = str2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.a.j.v.i.t$d */
    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public interface d<T> {
        /* JADX INFO: renamed from: a */
        T mo2868a();
    }

    public C1380t(Clock clock, Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager5 schemaManager5) {
        this.f5905g = schemaManager5;
        this.f5906h = clock;
        this.f5907i = clock2;
        this.f5908j = eventStoreConfig;
    }

    /* JADX INFO: renamed from: B */
    public static String m2869B(Iterable<PersistedEvent> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo2857b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public static <T> T m2870D(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: C */
    public Iterable<TransportContext> mo2859C() {
        SQLiteDatabase sQLiteDatabaseM2872c = m2872c();
        sQLiteDatabaseM2872c.beginTransaction();
        try {
            List list = (List) m2870D(sQLiteDatabaseM2872c.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: c.n.b.a.j.v.i.p
                @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
                public Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    Encoding encoding = C1380t.f5904f;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        TransportContext.a aVarM2819a = TransportContext.m2819a();
                        aVarM2819a.mo2812b(cursor.getString(1));
                        aVarM2819a.mo2814d(PriorityMapping.m2880b(cursor.getInt(2)));
                        String string = cursor.getString(3);
                        aVarM2819a.mo2813c(string == null ? null : Base64.decode(string, 0));
                        arrayList.add(aVarM2819a.mo2811a());
                    }
                    return arrayList;
                }
            });
            sQLiteDatabaseM2872c.setTransactionSuccessful();
            return list;
        } finally {
            sQLiteDatabaseM2872c.endTransaction();
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard
    /* JADX INFO: renamed from: a */
    public <T> T mo2871a(SynchronizationGuard.a<T> aVar) {
        final SQLiteDatabase sQLiteDatabaseM2872c = m2872c();
        m2875u(new d(sQLiteDatabaseM2872c) { // from class: c.n.b.a.j.v.i.m

            /* JADX INFO: renamed from: a */
            public final SQLiteDatabase f5895a;

            {
                this.f5895a = sQLiteDatabaseM2872c;
            }

            @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.d
            /* JADX INFO: renamed from: a */
            public Object mo2868a() {
                SQLiteDatabase sQLiteDatabase = this.f5895a;
                Encoding encoding = C1380t.f5904f;
                sQLiteDatabase.beginTransaction();
                return null;
            }
        }, new b() { // from class: c.n.b.a.j.v.i.n
            @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
            public Object apply(Object obj) {
                Encoding encoding = C1380t.f5904f;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            }
        });
        try {
            T tMo2836h = aVar.mo2836h();
            sQLiteDatabaseM2872c.setTransactionSuccessful();
            return tMo2836h;
        } finally {
            sQLiteDatabaseM2872c.endTransaction();
        }
    }

    /* JADX INFO: renamed from: c */
    public SQLiteDatabase m2872c() {
        final SchemaManager5 schemaManager5 = this.f5905g;
        schemaManager5.getClass();
        return (SQLiteDatabase) m2875u(new d(schemaManager5) { // from class: c.n.b.a.j.v.i.o

            /* JADX INFO: renamed from: a */
            public final SchemaManager5 f5897a;

            {
                this.f5897a = schemaManager5;
            }

            @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.d
            /* JADX INFO: renamed from: a */
            public Object mo2868a() {
                return this.f5897a.getWritableDatabase();
            }
        }, new b() { // from class: c.n.b.a.j.v.i.r
            @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
            public Object apply(Object obj) {
                Encoding encoding = C1380t.f5904f;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5905g.close();
    }

    /* JADX INFO: renamed from: f */
    public final Long m2873f(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.mo2808b(), String.valueOf(PriorityMapping.m2879a(transportContext.mo2810d()))));
        if (transportContext.mo2809c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.mo2809c(), 0));
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: h */
    public final <T> T m2874h(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseM2872c = m2872c();
        sQLiteDatabaseM2872c.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseM2872c);
            sQLiteDatabaseM2872c.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseM2872c.endTransaction();
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: j */
    public int mo2860j() {
        long jMo2878a = this.f5906h.mo2878a() - this.f5908j.mo2852b();
        SQLiteDatabase sQLiteDatabaseM2872c = m2872c();
        sQLiteDatabaseM2872c.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(sQLiteDatabaseM2872c.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(jMo2878a)}));
            sQLiteDatabaseM2872c.setTransactionSuccessful();
            return numValueOf.intValue();
        } finally {
            sQLiteDatabaseM2872c.endTransaction();
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: k */
    public void mo2861k(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sbM1556G = outline.m1556G("DELETE FROM events WHERE _id in ");
            sbM1556G.append(m2869B(iterable));
            m2872c().compileStatement(sbM1556G.toString()).execute();
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: k0 */
    public PersistedEvent mo2862k0(final TransportContext transportContext, final EventInternal eventInternal) {
        C1095a.m2398n("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.mo2810d(), eventInternal.mo2798g(), transportContext.mo2808b());
        long jLongValue = ((Long) m2874h(new b(this, transportContext, eventInternal) { // from class: c.n.b.a.j.v.i.s

            /* JADX INFO: renamed from: a */
            public final C1380t f5901a;

            /* JADX INFO: renamed from: b */
            public final TransportContext f5902b;

            /* JADX INFO: renamed from: c */
            public final EventInternal f5903c;

            {
                this.f5901a = this;
                this.f5902b = transportContext;
                this.f5903c = eventInternal;
            }

            @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
            public Object apply(Object obj) {
                long jInsert;
                C1380t c1380t = this.f5901a;
                TransportContext transportContext2 = this.f5902b;
                EventInternal eventInternal2 = this.f5903c;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = C1380t.f5904f;
                if (c1380t.m2872c().compileStatement("PRAGMA page_size").simpleQueryForLong() * c1380t.m2872c().compileStatement("PRAGMA page_count").simpleQueryForLong() >= c1380t.f5908j.mo2855e()) {
                    return -1L;
                }
                Long lM2873f = c1380t.m2873f(sQLiteDatabase, transportContext2);
                if (lM2873f != null) {
                    jInsert = lM2873f.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", transportContext2.mo2808b());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.m2879a(transportContext2.mo2810d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (transportContext2.mo2809c() != null) {
                        contentValues.put("extras", Base64.encodeToString(transportContext2.mo2809c(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iMo2854d = c1380t.f5908j.mo2854d();
                byte[] bArr = eventInternal2.mo2796d().f5736b;
                boolean z = bArr.length <= iMo2854d;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", eventInternal2.mo2798g());
                contentValues2.put("timestamp_ms", Long.valueOf(eventInternal2.mo2797e()));
                contentValues2.put("uptime_ms", Long.valueOf(eventInternal2.mo2799h()));
                contentValues2.put("payload_encoding", eventInternal2.mo2796d().f5735a.f5515a);
                contentValues2.put("code", eventInternal2.mo2795c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr.length) / ((double) iMo2854d));
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i - 1) * iMo2854d, Math.min(i * iMo2854d, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(eventInternal2.mo2794b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new AutoValue_PersistedEvent(jLongValue, transportContext, eventInternal);
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: o0 */
    public long mo2863o0(TransportContext transportContext) {
        Cursor cursorRawQuery = m2872c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.mo2808b(), String.valueOf(PriorityMapping.m2879a(transportContext.mo2810d()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: s0 */
    public boolean mo2864s0(TransportContext transportContext) {
        SQLiteDatabase sQLiteDatabaseM2872c = m2872c();
        sQLiteDatabaseM2872c.beginTransaction();
        try {
            Long lM2873f = m2873f(sQLiteDatabaseM2872c, transportContext);
            Boolean bool = lM2873f == null ? Boolean.FALSE : (Boolean) m2870D(m2872c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM2873f.toString()}), new b() { // from class: c.n.b.a.j.v.i.q
                @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
                public Object apply(Object obj) {
                    return Boolean.valueOf(((Cursor) obj).moveToNext());
                }
            });
            sQLiteDatabaseM2872c.setTransactionSuccessful();
            return bool.booleanValue();
        } finally {
            sQLiteDatabaseM2872c.endTransaction();
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: t */
    public Iterable<PersistedEvent> mo2865t(final TransportContext transportContext) {
        return (Iterable) m2874h(new b(this, transportContext) { // from class: c.n.b.a.j.v.i.j

            /* JADX INFO: renamed from: a */
            public final C1380t f5889a;

            /* JADX INFO: renamed from: b */
            public final TransportContext f5890b;

            {
                this.f5889a = this;
                this.f5890b = transportContext;
            }

            @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
            public Object apply(Object obj) {
                final C1380t c1380t = this.f5889a;
                final TransportContext transportContext2 = this.f5890b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = C1380t.f5904f;
                Objects.requireNonNull(c1380t);
                final ArrayList arrayList = new ArrayList();
                Long lM2873f = c1380t.m2873f(sQLiteDatabase, transportContext2);
                if (lM2873f != null) {
                    C1380t.m2870D(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM2873f.toString()}, null, null, null, String.valueOf(c1380t.f5908j.mo2853c())), new C1380t.b(c1380t, arrayList, transportContext2) { // from class: c.n.b.a.j.v.i.k

                        /* JADX INFO: renamed from: a */
                        public final C1380t f5891a;

                        /* JADX INFO: renamed from: b */
                        public final List f5892b;

                        /* JADX INFO: renamed from: c */
                        public final TransportContext f5893c;

                        {
                            this.f5891a = c1380t;
                            this.f5892b = arrayList;
                            this.f5893c = transportContext2;
                        }

                        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
                        public Object apply(Object obj2) {
                            C1380t c1380t2 = this.f5891a;
                            List list = this.f5892b;
                            TransportContext transportContext3 = this.f5893c;
                            Cursor cursor = (Cursor) obj2;
                            Encoding encoding2 = C1380t.f5904f;
                            while (cursor.moveToNext()) {
                                long j2 = cursor.getLong(0);
                                boolean z = cursor.getInt(7) != 0;
                                AutoValue_EventInternal.b bVar = new AutoValue_EventInternal.b();
                                bVar.f5711f = new HashMap();
                                bVar.m2806h(cursor.getString(1));
                                bVar.m2805g(cursor.getLong(2));
                                bVar.m2807i(cursor.getLong(3));
                                if (z) {
                                    String string = cursor.getString(4);
                                    bVar.m2804f(new EncodedPayload(string == null ? C1380t.f5904f : new Encoding(string), cursor.getBlob(5)));
                                } else {
                                    String string2 = cursor.getString(4);
                                    bVar.m2804f(new EncodedPayload(string2 == null ? C1380t.f5904f : new Encoding(string2), (byte[]) C1380t.m2870D(c1380t2.m2872c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), new C1380t.b() { // from class: c.n.b.a.j.v.i.l
                                        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
                                        public Object apply(Object obj3) {
                                            Cursor cursor2 = (Cursor) obj3;
                                            Encoding encoding3 = C1380t.f5904f;
                                            ArrayList arrayList2 = new ArrayList();
                                            int length = 0;
                                            while (cursor2.moveToNext()) {
                                                byte[] blob = cursor2.getBlob(0);
                                                arrayList2.add(blob);
                                                length += blob.length;
                                            }
                                            byte[] bArr = new byte[length];
                                            int length2 = 0;
                                            for (int i = 0; i < arrayList2.size(); i++) {
                                                byte[] bArr2 = (byte[]) arrayList2.get(i);
                                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                                length2 += bArr2.length;
                                            }
                                            return bArr;
                                        }
                                    })));
                                }
                                if (!cursor.isNull(6)) {
                                    bVar.m2803e(Integer.valueOf(cursor.getInt(6)));
                                }
                                list.add(new AutoValue_PersistedEvent(j2, transportContext3, bVar.mo2800b()));
                            }
                            return null;
                        }
                    });
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append(((PersistedEvent) arrayList.get(i)).mo2857b());
                    if (i < arrayList.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        long j2 = cursorQuery.getLong(0);
                        Set hashSet = (Set) map.get(Long.valueOf(j2));
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(Long.valueOf(j2), hashSet);
                        }
                        hashSet.add(new C1380t.c(cursorQuery.getString(1), cursorQuery.getString(2), null));
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
                    if (map.containsKey(Long.valueOf(persistedEvent.mo2857b()))) {
                        EventInternal.a aVarM2817i = persistedEvent.mo2856a().m2817i();
                        for (C1380t.c cVar : (Set) map.get(Long.valueOf(persistedEvent.mo2857b()))) {
                            aVarM2817i.m2818a(cVar.f5909a, cVar.f5910b);
                        }
                        listIterator.set(new AutoValue_PersistedEvent(persistedEvent.mo2857b(), persistedEvent.mo2858c(), aVarM2817i.mo2800b()));
                    }
                }
                return arrayList;
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final <T> T m2875u(d<T> dVar, b<Throwable, T> bVar) {
        long jMo2878a = this.f5907i.mo2878a();
        while (true) {
            try {
                return dVar.mo2868a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f5907i.mo2878a() >= ((long) this.f5908j.mo2851a()) + jMo2878a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: v0 */
    public void mo2866v0(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sbM1556G = outline.m1556G("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sbM1556G.append(m2869B(iterable));
            String string = sbM1556G.toString();
            SQLiteDatabase sQLiteDatabaseM2872c = m2872c();
            sQLiteDatabaseM2872c.beginTransaction();
            try {
                sQLiteDatabaseM2872c.compileStatement(string).execute();
                sQLiteDatabaseM2872c.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM2872c.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseM2872c.endTransaction();
            }
        }
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore
    /* JADX INFO: renamed from: x */
    public void mo2867x(final TransportContext transportContext, final long j2) {
        m2874h(new b(j2, transportContext) { // from class: c.n.b.a.j.v.i.i

            /* JADX INFO: renamed from: a */
            public final long f5887a;

            /* JADX INFO: renamed from: b */
            public final TransportContext f5888b;

            {
                this.f5887a = j2;
                this.f5888b = transportContext;
            }

            @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t.b
            public Object apply(Object obj) {
                long j3 = this.f5887a;
                TransportContext transportContext2 = this.f5888b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = C1380t.f5904f;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j3));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext2.mo2808b(), String.valueOf(PriorityMapping.m2879a(transportContext2.mo2810d()))}) < 1) {
                    contentValues.put("backend_name", transportContext2.mo2808b());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.m2879a(transportContext2.mo2810d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }
}
