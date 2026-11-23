package p636z0.p641a0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p641a0.p642a0.Migration;
import p636z0.p660c0.p661a.SimpleSQLiteQuery;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;
import p636z0.p660c0.p661a.p662g.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: z0.a0.t, reason: use source file name */
/* JADX INFO: compiled from: RoomOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.a {

    /* JADX INFO: renamed from: b */
    public DatabaseConfiguration f34341b;

    /* JADX INFO: renamed from: c */
    public final a f34342c;

    /* JADX INFO: renamed from: d */
    public final String f34343d;

    /* JADX INFO: renamed from: e */
    public final String f34344e;

    /* JADX INFO: renamed from: z0.a0.t$a */
    /* JADX INFO: compiled from: RoomOpenHelper.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final int f34345a;

        public a(int i) {
            this.f34345a = i;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo950a(SupportSQLiteDatabase supportSQLiteDatabase);

        /* JADX INFO: renamed from: b */
        public abstract void mo951b(SupportSQLiteDatabase supportSQLiteDatabase);

        /* JADX INFO: renamed from: c */
        public abstract void mo952c(SupportSQLiteDatabase supportSQLiteDatabase);

        /* JADX INFO: renamed from: d */
        public abstract void mo953d(SupportSQLiteDatabase supportSQLiteDatabase);

        /* JADX INFO: renamed from: e */
        public void mo954e(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* JADX INFO: renamed from: f */
        public void mo955f(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* JADX INFO: renamed from: g */
        public b mo956g(SupportSQLiteDatabase supportSQLiteDatabase) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* JADX INFO: renamed from: z0.a0.t$b */
    /* JADX INFO: compiled from: RoomOpenHelper.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final boolean f34346a;

        /* JADX INFO: renamed from: b */
        public final String f34347b;

        public b(boolean z, String str) {
            this.f34346a = z;
            this.f34347b = str;
        }
    }

    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, a aVar, String str, String str2) {
        super(aVar.f34345a);
        this.f34341b = databaseConfiguration;
        this.f34342c = aVar;
        this.f34343d = str;
        this.f34344e = str2;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper.a
    /* JADX INFO: renamed from: b */
    public void mo14542b(SupportSQLiteDatabase supportSQLiteDatabase) {
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper.a
    /* JADX INFO: renamed from: c */
    public void mo14543c(SupportSQLiteDatabase supportSQLiteDatabase) {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
        Cursor cursorMo15040Q = frameworkSQLiteDatabase.mo15040Q("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorMo15040Q.moveToFirst() && cursorMo15040Q.getInt(0) == 0) {
                z = true;
            }
            cursorMo15040Q.close();
            this.f34342c.mo950a(frameworkSQLiteDatabase);
            if (!z) {
                b bVarMo956g = this.f34342c.mo956g(frameworkSQLiteDatabase);
                if (!bVarMo956g.f34346a) {
                    StringBuilder sbM1556G = outline.m1556G("Pre-packaged database has an invalid schema: ");
                    sbM1556G.append(bVarMo956g.f34347b);
                    throw new IllegalStateException(sbM1556G.toString());
                }
            }
            m14547g(frameworkSQLiteDatabase);
            this.f34342c.mo952c(frameworkSQLiteDatabase);
        } catch (Throwable th) {
            cursorMo15040Q.close();
            throw th;
        }
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper.a
    /* JADX INFO: renamed from: d */
    public void mo14544d(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        mo14546f(supportSQLiteDatabase, i, i2);
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper.a
    /* JADX INFO: renamed from: e */
    public void mo14545e(SupportSQLiteDatabase supportSQLiteDatabase) {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
        Cursor cursorMo15040Q = frameworkSQLiteDatabase.mo15040Q("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorMo15040Q.moveToFirst() && cursorMo15040Q.getInt(0) != 0;
            cursorMo15040Q.close();
            if (z) {
                Cursor cursorMo15042c0 = frameworkSQLiteDatabase.mo15042c0(new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorMo15042c0.moveToFirst() ? cursorMo15042c0.getString(0) : null;
                    cursorMo15042c0.close();
                    if (!this.f34343d.equals(string) && !this.f34344e.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorMo15042c0.close();
                    throw th;
                }
            } else {
                b bVarMo956g = this.f34342c.mo956g(frameworkSQLiteDatabase);
                if (!bVarMo956g.f34346a) {
                    StringBuilder sbM1556G = outline.m1556G("Pre-packaged database has an invalid schema: ");
                    sbM1556G.append(bVarMo956g.f34347b);
                    throw new IllegalStateException(sbM1556G.toString());
                }
                this.f34342c.mo954e(frameworkSQLiteDatabase);
                m14547g(frameworkSQLiteDatabase);
            }
            this.f34342c.mo953d(frameworkSQLiteDatabase);
            this.f34341b = null;
        } catch (Throwable th2) {
            cursorMo15040Q.close();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[LOOP:1: B:11:0x001d->B:38:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:2: B:22:0x0043->B:69:?, LOOP_END, SYNTHETIC] */
    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper.a
    /* JADX INFO: renamed from: f */
    public void mo14546f(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        List listEmptyList;
        TreeMap<Integer, Migration> treeMap;
        Set<Integer> setKeySet;
        Iterator<Integer> it;
        int iIntValue;
        boolean z;
        DatabaseConfiguration databaseConfiguration = this.f34341b;
        boolean z2 = true;
        if (databaseConfiguration != null) {
            RoomDatabase.d dVar = databaseConfiguration.f34245d;
            Objects.requireNonNull(dVar);
            if (i == i2) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z3 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                while (true) {
                    if (z3) {
                        if (i3 < i2) {
                            treeMap = dVar.f34332a.get(Integer.valueOf(i3));
                            if (treeMap != null) {
                                if (z3) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        iIntValue = i3;
                                        z = false;
                                        break;
                                    } else {
                                        iIntValue = it.next().intValue();
                                        if (z3 ? !(iIntValue < i2 || iIntValue >= i3) : !(iIntValue > i2 || iIntValue <= i3)) {
                                            arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z) {
                                    i3 = iIntValue;
                                }
                            }
                            listEmptyList = null;
                        } else {
                            listEmptyList = arrayList;
                        }
                    } else if (i3 > i2) {
                        treeMap = dVar.f34332a.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            if (z3) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    iIntValue = i3;
                                    z = false;
                                    break;
                                } else {
                                    iIntValue = it.next().intValue();
                                    if (z3 ? !(iIntValue < i2 || iIntValue >= i3) : !(iIntValue > i2 || iIntValue <= i3)) {
                                        arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                i3 = iIntValue;
                            }
                        }
                        listEmptyList = null;
                    } else {
                        listEmptyList = arrayList;
                    }
                }
            }
            if (listEmptyList != null) {
                this.f34342c.mo955f(supportSQLiteDatabase);
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((Migration) it2.next()).mo14349a(supportSQLiteDatabase);
                }
                b bVarMo956g = this.f34342c.mo956g(supportSQLiteDatabase);
                if (!bVarMo956g.f34346a) {
                    StringBuilder sbM1556G = outline.m1556G("Migration didn't properly handle: ");
                    sbM1556G.append(bVarMo956g.f34347b);
                    throw new IllegalStateException(sbM1556G.toString());
                }
                this.f34342c.mo954e(supportSQLiteDatabase);
                m14547g(supportSQLiteDatabase);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        DatabaseConfiguration databaseConfiguration2 = this.f34341b;
        if (databaseConfiguration2 == null || databaseConfiguration2.m14512a(i, i2)) {
            throw new IllegalStateException(outline.m1593o("A migration from ", i, " to ", i2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        this.f34342c.mo951b(supportSQLiteDatabase);
        this.f34342c.mo950a(supportSQLiteDatabase);
    }

    /* JADX INFO: renamed from: g */
    public final void m14547g(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase.mo15045n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f34343d + "')");
    }

    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, a aVar, String str) {
        this(databaseConfiguration, aVar, "", str);
    }
}
