package p636z0.p709j0.p710y.p719s;

import android.database.Cursor;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.j0.y.s.f, reason: use source file name */
/* JADX INFO: compiled from: PreferenceDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDao_Impl implements PreferenceDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37507a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<Preference> f37508b;

    /* JADX INFO: renamed from: z0.j0.y.s.f$a */
    /* JADX INFO: compiled from: PreferenceDao_Impl.java */
    public class a extends EntityInsertionAdapter<Preference> {
        public a(PreferenceDao_Impl preferenceDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, Preference preference) {
            Preference preference2 = preference;
            String str = preference2.f37505a;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            Long l = preference2.f37506b;
            if (l == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14549J(2, l.longValue());
            }
        }
    }

    public PreferenceDao_Impl(RoomDatabase roomDatabase) {
        this.f37507a = roomDatabase;
        this.f37508b = new a(this, roomDatabase);
    }

    /* JADX INFO: renamed from: a */
    public Long m15973a(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37507a.m14528b();
        Long lValueOf = null;
        Cursor cursorM14503b = DBUtil.m14503b(this.f37507a, roomSQLiteQueryM14548f, false, null);
        try {
            if (cursorM14503b.moveToFirst() && !cursorM14503b.isNull(0)) {
                lValueOf = Long.valueOf(cursorM14503b.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15974b(Preference preference) {
        this.f37507a.m14528b();
        this.f37507a.m14529c();
        try {
            this.f37508b.m14513f(preference);
            this.f37507a.m14537n();
        } finally {
            this.f37507a.m14530f();
        }
    }
}
