package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.z, reason: use source file name */
/* JADX INFO: compiled from: SchemaManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class SchemaManager5 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: f */
    public static final List<a> f5919f = Arrays.asList(new a() { // from class: c.n.b.a.j.v.i.v
        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.SchemaManager5.a
        /* JADX INFO: renamed from: a */
        public void mo2876a(SQLiteDatabase sQLiteDatabase) {
            List<SchemaManager5.a> list = SchemaManager5.f5919f;
            sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
            sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
            sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
            sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
        }
    }, new a() { // from class: c.n.b.a.j.v.i.w
        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.SchemaManager5.a
        /* JADX INFO: renamed from: a */
        public void mo2876a(SQLiteDatabase sQLiteDatabase) {
            List<SchemaManager5.a> list = SchemaManager5.f5919f;
            sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
            sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
        }
    }, new a() { // from class: c.n.b.a.j.v.i.x
        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.SchemaManager5.a
        /* JADX INFO: renamed from: a */
        public void mo2876a(SQLiteDatabase sQLiteDatabase) {
            List<SchemaManager5.a> list = SchemaManager5.f5919f;
            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
        }
    }, new a() { // from class: c.n.b.a.j.v.i.y
        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.SchemaManager5.a
        /* JADX INFO: renamed from: a */
        public void mo2876a(SQLiteDatabase sQLiteDatabase) {
            List<SchemaManager5.a> list = SchemaManager5.f5919f;
            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
            sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
        }
    });

    /* JADX INFO: renamed from: g */
    public final int f5920g;

    /* JADX INFO: renamed from: h */
    public boolean f5921h;

    /* JADX INFO: renamed from: c.n.b.a.j.v.i.z$a */
    /* JADX INFO: compiled from: SchemaManager.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2876a(SQLiteDatabase sQLiteDatabase);
    }

    public SchemaManager5(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f5921h = false;
        this.f5920g = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2877a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<a> list = f5919f;
        if (i2 <= list.size()) {
            while (i < i2) {
                f5919f.get(i).mo2876a(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder sbM1559J = outline.m1559J("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
            sbM1559J.append(list.size());
            sbM1559J.append(" migrations are provided");
            throw new IllegalArgumentException(sbM1559J.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f5921h = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f5920g;
        if (!this.f5921h) {
            onConfigure(sQLiteDatabase);
        }
        m2877a(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f5921h) {
            onConfigure(sQLiteDatabase);
        }
        m2877a(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f5921h) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f5921h) {
            onConfigure(sQLiteDatabase);
        }
        m2877a(sQLiteDatabase, i, i2);
    }
}
