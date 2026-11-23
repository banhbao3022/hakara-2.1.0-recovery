package p555j.p556a.p557a.p606h.p609c.p610a;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p555j.p556a.p557a.p606h.p609c.p611b.KeywordEntity;
import p636z0.p641a0.CoroutinesRoom4;
import p636z0.p641a0.EntityDeletionOrUpdateAdapter;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.SharedSQLiteStatement;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: j.a.a.h.c.a.b, reason: use source file name */
/* JADX INFO: compiled from: KeywordDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class KeywordDao_Impl implements KeywordDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f32273a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<KeywordEntity> f32274b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f32275c;

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$a */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class a implements Callable<Unit> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Unit call() throws Exception {
            SupportSQLiteStatement supportSQLiteStatementM14559a = KeywordDao_Impl.this.f32275c.m14559a();
            KeywordDao_Impl.this.f32273a.m14529c();
            try {
                supportSQLiteStatementM14559a.mo15051q();
                KeywordDao_Impl.this.f32273a.m14537n();
                Unit unit = Unit.f29502a;
                KeywordDao_Impl.this.f32273a.m14530f();
                SharedSQLiteStatement sharedSQLiteStatement = KeywordDao_Impl.this.f32275c;
                if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                    sharedSQLiteStatement.f34365a.set(false);
                }
                return unit;
            } catch (Throwable th) {
                KeywordDao_Impl.this.f32273a.m14530f();
                KeywordDao_Impl.this.f32275c.m14561d(supportSQLiteStatementM14559a);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$b */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class b implements Callable<List<KeywordEntity>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f32277a;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f32277a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public List<KeywordEntity> call() throws Exception {
            Cursor cursorM14503b = DBUtil.m14503b(KeywordDao_Impl.this.f32273a, this.f32277a, false, null);
            try {
                int iM16940g = C8462c.m16940g(cursorM14503b, "id");
                int iM16940g2 = C8462c.m16940g(cursorM14503b, "name");
                int iM16940g3 = C8462c.m16940g(cursorM14503b, "createdAt");
                int iM16940g4 = C8462c.m16940g(cursorM14503b, "updatedAt");
                ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                while (cursorM14503b.moveToNext()) {
                    arrayList.add(new KeywordEntity(cursorM14503b.isNull(iM16940g) ? null : Long.valueOf(cursorM14503b.getLong(iM16940g)), cursorM14503b.isNull(iM16940g2) ? null : cursorM14503b.getString(iM16940g2), cursorM14503b.getLong(iM16940g3), cursorM14503b.getLong(iM16940g4)));
                }
                return arrayList;
            } finally {
                cursorM14503b.close();
                this.f32277a.m14554h();
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$c */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class c implements Callable<KeywordEntity> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f32279a;

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.f32279a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public KeywordEntity call() throws Exception {
            KeywordEntity keywordEntity = null;
            Cursor cursorM14503b = DBUtil.m14503b(KeywordDao_Impl.this.f32273a, this.f32279a, false, null);
            try {
                int iM16940g = C8462c.m16940g(cursorM14503b, "id");
                int iM16940g2 = C8462c.m16940g(cursorM14503b, "name");
                int iM16940g3 = C8462c.m16940g(cursorM14503b, "createdAt");
                int iM16940g4 = C8462c.m16940g(cursorM14503b, "updatedAt");
                if (cursorM14503b.moveToFirst()) {
                    keywordEntity = new KeywordEntity(cursorM14503b.isNull(iM16940g) ? null : Long.valueOf(cursorM14503b.getLong(iM16940g)), cursorM14503b.isNull(iM16940g2) ? null : cursorM14503b.getString(iM16940g2), cursorM14503b.getLong(iM16940g3), cursorM14503b.getLong(iM16940g4));
                }
                return keywordEntity;
            } finally {
                cursorM14503b.close();
                this.f32279a.m14554h();
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$d */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class d extends EntityInsertionAdapter<KeywordEntity> {
        public d(KeywordDao_Impl keywordDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR IGNORE INTO `keywords` (`id`,`name`,`createdAt`,`updatedAt`) VALUES (?,?,?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, KeywordEntity keywordEntity) {
            KeywordEntity keywordEntity2 = keywordEntity;
            Long l = keywordEntity2.f32323f;
            if (l == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14549J(1, l.longValue());
            }
            String str = keywordEntity2.f32324g;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str);
            }
            supportSQLiteStatement.mo14549J(3, keywordEntity2.f32325h);
            supportSQLiteStatement.mo14549J(4, keywordEntity2.f32326i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$e */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class e extends EntityInsertionAdapter<KeywordEntity> {
        public e(KeywordDao_Impl keywordDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR REPLACE INTO `keywords` (`id`,`name`,`createdAt`,`updatedAt`) VALUES (?,?,?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, KeywordEntity keywordEntity) {
            KeywordEntity keywordEntity2 = keywordEntity;
            Long l = keywordEntity2.f32323f;
            if (l == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14549J(1, l.longValue());
            }
            String str = keywordEntity2.f32324g;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str);
            }
            supportSQLiteStatement.mo14549J(3, keywordEntity2.f32325h);
            supportSQLiteStatement.mo14549J(4, keywordEntity2.f32326i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$f */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class f extends EntityDeletionOrUpdateAdapter<KeywordEntity> {
        public f(KeywordDao_Impl keywordDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM `keywords` WHERE `id` = ?";
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$g */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class g extends SharedSQLiteStatement {
        public g(KeywordDao_Impl keywordDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM keywords WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$h */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class h extends SharedSQLiteStatement {
        public h(KeywordDao_Impl keywordDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM keywords";
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.b$i */
    /* JADX INFO: compiled from: KeywordDao_Impl.java */
    public class i implements Callable<Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ KeywordEntity f32281a;

        public i(KeywordEntity keywordEntity) {
            this.f32281a = keywordEntity;
        }

        @Override // java.util.concurrent.Callable
        public Unit call() throws Exception {
            KeywordDao_Impl.this.f32273a.m14529c();
            try {
                KeywordDao_Impl.this.f32274b.m14513f(this.f32281a);
                KeywordDao_Impl.this.f32273a.m14537n();
                return Unit.f29502a;
            } finally {
                KeywordDao_Impl.this.f32273a.m14530f();
            }
        }
    }

    public KeywordDao_Impl(RoomDatabase roomDatabase) {
        this.f32273a = roomDatabase;
        new d(this, roomDatabase);
        this.f32274b = new e(this, roomDatabase);
        new f(this, roomDatabase);
        new g(this, roomDatabase);
        this.f32275c = new h(this, roomDatabase);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao
    /* JADX INFO: renamed from: a */
    public Object mo14035a(String str, Continuation<? super KeywordEntity> continuation) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT * FROM keywords WHERE name = ?", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        return CoroutinesRoom4.m14510a(this.f32273a, false, new CancellationSignal(), new c(roomSQLiteQueryM14548f), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao
    /* JADX INFO: renamed from: b */
    public Object mo14036b(Continuation<? super List<KeywordEntity>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT * FROM keywords ORDER BY updatedAt DESC", 0);
        return CoroutinesRoom4.m14510a(this.f32273a, false, new CancellationSignal(), new b(roomSQLiteQueryM14548f), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao
    /* JADX INFO: renamed from: c */
    public Object mo14037c(KeywordEntity keywordEntity, Continuation<? super Unit> continuation) {
        return CoroutinesRoom4.m14511b(this.f32273a, true, new i(keywordEntity), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao
    /* JADX INFO: renamed from: d */
    public Object mo14038d(Continuation<? super Unit> continuation) {
        return CoroutinesRoom4.m14511b(this.f32273a, true, new a(), continuation);
    }
}
