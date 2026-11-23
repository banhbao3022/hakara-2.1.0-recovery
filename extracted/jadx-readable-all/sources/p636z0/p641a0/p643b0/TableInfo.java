package p636z0.p641a0.p643b0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;

/* JADX INFO: renamed from: z0.a0.b0.c, reason: use source file name */
/* JADX INFO: compiled from: TableInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class TableInfo {

    /* JADX INFO: renamed from: a */
    public final String f34206a;

    /* JADX INFO: renamed from: b */
    public final Map<String, a> f34207b;

    /* JADX INFO: renamed from: c */
    public final Set<b> f34208c;

    /* JADX INFO: renamed from: d */
    public final Set<d> f34209d;

    /* JADX INFO: renamed from: z0.a0.b0.c$a */
    /* JADX INFO: compiled from: TableInfo.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f34210a;

        /* JADX INFO: renamed from: b */
        public final String f34211b;

        /* JADX INFO: renamed from: c */
        public final int f34212c;

        /* JADX INFO: renamed from: d */
        public final boolean f34213d;

        /* JADX INFO: renamed from: e */
        public final int f34214e;

        /* JADX INFO: renamed from: f */
        public final String f34215f;

        /* JADX INFO: renamed from: g */
        public final int f34216g;

        @Deprecated
        public a(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34214e != aVar.f34214e || !this.f34210a.equals(aVar.f34210a) || this.f34213d != aVar.f34213d) {
                return false;
            }
            if (this.f34216g == 1 && aVar.f34216g == 2 && (str3 = this.f34215f) != null && !str3.equals(aVar.f34215f)) {
                return false;
            }
            if (this.f34216g == 2 && aVar.f34216g == 1 && (str2 = aVar.f34215f) != null && !str2.equals(this.f34215f)) {
                return false;
            }
            int i = this.f34216g;
            return (i == 0 || i != aVar.f34216g || ((str = this.f34215f) == null ? aVar.f34215f == null : str.equals(aVar.f34215f))) && this.f34212c == aVar.f34212c;
        }

        public int hashCode() {
            return (((((this.f34210a.hashCode() * 31) + this.f34212c) * 31) + (this.f34213d ? 1231 : 1237)) * 31) + this.f34214e;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Column{name='");
            sbM1556G.append(this.f34210a);
            sbM1556G.append('\'');
            sbM1556G.append(", type='");
            sbM1556G.append(this.f34211b);
            sbM1556G.append('\'');
            sbM1556G.append(", affinity='");
            sbM1556G.append(this.f34212c);
            sbM1556G.append('\'');
            sbM1556G.append(", notNull=");
            sbM1556G.append(this.f34213d);
            sbM1556G.append(", primaryKeyPosition=");
            sbM1556G.append(this.f34214e);
            sbM1556G.append(", defaultValue='");
            sbM1556G.append(this.f34215f);
            sbM1556G.append('\'');
            sbM1556G.append('}');
            return sbM1556G.toString();
        }

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f34210a = str;
            this.f34211b = str2;
            this.f34213d = z;
            this.f34214e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f34212c = i3;
            this.f34215f = str3;
            this.f34216g = i2;
        }
    }

    /* JADX INFO: renamed from: z0.a0.b0.c$b */
    /* JADX INFO: compiled from: TableInfo.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f34217a;

        /* JADX INFO: renamed from: b */
        public final String f34218b;

        /* JADX INFO: renamed from: c */
        public final String f34219c;

        /* JADX INFO: renamed from: d */
        public final List<String> f34220d;

        /* JADX INFO: renamed from: e */
        public final List<String> f34221e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f34217a = str;
            this.f34218b = str2;
            this.f34219c = str3;
            this.f34220d = Collections.unmodifiableList(list);
            this.f34221e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f34217a.equals(bVar.f34217a) && this.f34218b.equals(bVar.f34218b) && this.f34219c.equals(bVar.f34219c) && this.f34220d.equals(bVar.f34220d)) {
                return this.f34221e.equals(bVar.f34221e);
            }
            return false;
        }

        public int hashCode() {
            return this.f34221e.hashCode() + ((this.f34220d.hashCode() + outline.m1569T(this.f34219c, outline.m1569T(this.f34218b, this.f34217a.hashCode() * 31, 31), 31)) * 31);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("ForeignKey{referenceTable='");
            sbM1556G.append(this.f34217a);
            sbM1556G.append('\'');
            sbM1556G.append(", onDelete='");
            sbM1556G.append(this.f34218b);
            sbM1556G.append('\'');
            sbM1556G.append(", onUpdate='");
            sbM1556G.append(this.f34219c);
            sbM1556G.append('\'');
            sbM1556G.append(", columnNames=");
            sbM1556G.append(this.f34220d);
            sbM1556G.append(", referenceColumnNames=");
            sbM1556G.append(this.f34221e);
            sbM1556G.append('}');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: z0.a0.b0.c$c */
    /* JADX INFO: compiled from: TableInfo.java */
    public static class c implements Comparable<c> {

        /* JADX INFO: renamed from: f */
        public final int f34222f;

        /* JADX INFO: renamed from: g */
        public final int f34223g;

        /* JADX INFO: renamed from: h */
        public final String f34224h;

        /* JADX INFO: renamed from: i */
        public final String f34225i;

        public c(int i, int i2, String str, String str2) {
            this.f34222f = i;
            this.f34223g = i2;
            this.f34224h = str;
            this.f34225i = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            c cVar2 = cVar;
            int i = this.f34222f - cVar2.f34222f;
            return i == 0 ? this.f34223g - cVar2.f34223g : i;
        }
    }

    /* JADX INFO: renamed from: z0.a0.b0.c$d */
    /* JADX INFO: compiled from: TableInfo.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f34226a;

        /* JADX INFO: renamed from: b */
        public final boolean f34227b;

        /* JADX INFO: renamed from: c */
        public final List<String> f34228c;

        public d(String str, boolean z, List<String> list) {
            this.f34226a = str;
            this.f34227b = z;
            this.f34228c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f34227b == dVar.f34227b && this.f34228c.equals(dVar.f34228c)) {
                return this.f34226a.startsWith("index_") ? dVar.f34226a.startsWith("index_") : this.f34226a.equals(dVar.f34226a);
            }
            return false;
        }

        public int hashCode() {
            return this.f34228c.hashCode() + ((((this.f34226a.startsWith("index_") ? -1184239155 : this.f34226a.hashCode()) * 31) + (this.f34227b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Index{name='");
            sbM1556G.append(this.f34226a);
            sbM1556G.append('\'');
            sbM1556G.append(", unique=");
            sbM1556G.append(this.f34227b);
            sbM1556G.append(", columns=");
            sbM1556G.append(this.f34228c);
            sbM1556G.append('}');
            return sbM1556G.toString();
        }
    }

    public TableInfo(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f34206a = str;
        this.f34207b = Collections.unmodifiableMap(map);
        this.f34208c = Collections.unmodifiableSet(set);
        this.f34209d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* JADX INFO: renamed from: a */
    public static TableInfo m14505a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        List<c> list;
        int i;
        Cursor cursorMo15040Q = supportSQLiteDatabase.mo15040Q("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorMo15040Q.getColumnCount() > 0) {
                int columnIndex = cursorMo15040Q.getColumnIndex("name");
                int columnIndex2 = cursorMo15040Q.getColumnIndex("type");
                int columnIndex3 = cursorMo15040Q.getColumnIndex("notnull");
                int columnIndex4 = cursorMo15040Q.getColumnIndex("pk");
                int columnIndex5 = cursorMo15040Q.getColumnIndex("dflt_value");
                while (cursorMo15040Q.moveToNext()) {
                    String string = cursorMo15040Q.getString(columnIndex);
                    map.put(string, new a(string, cursorMo15040Q.getString(columnIndex2), cursorMo15040Q.getInt(columnIndex3) != 0, cursorMo15040Q.getInt(columnIndex4), cursorMo15040Q.getString(columnIndex5), 2));
                }
            }
            cursorMo15040Q.close();
            HashSet hashSet = new HashSet();
            Cursor cursorMo15040Q2 = supportSQLiteDatabase.mo15040Q("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorMo15040Q2.getColumnIndex("id");
                int columnIndex7 = cursorMo15040Q2.getColumnIndex("seq");
                int columnIndex8 = cursorMo15040Q2.getColumnIndex("table");
                int columnIndex9 = cursorMo15040Q2.getColumnIndex("on_delete");
                int columnIndex10 = cursorMo15040Q2.getColumnIndex("on_update");
                List<c> listM14506b = m14506b(cursorMo15040Q2);
                int count = cursorMo15040Q2.getCount();
                int i2 = 0;
                while (i2 < count) {
                    cursorMo15040Q2.moveToPosition(i2);
                    if (cursorMo15040Q2.getInt(columnIndex7) != 0) {
                        list = listM14506b;
                        i = count;
                    } else {
                        int i3 = cursorMo15040Q2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (c cVar : (ArrayList) listM14506b) {
                            List<c> list2 = listM14506b;
                            int i4 = count;
                            if (cVar.f34222f == i3) {
                                arrayList.add(cVar.f34224h);
                                arrayList2.add(cVar.f34225i);
                            }
                            count = i4;
                            listM14506b = list2;
                        }
                        list = listM14506b;
                        i = count;
                        hashSet.add(new b(cursorMo15040Q2.getString(columnIndex8), cursorMo15040Q2.getString(columnIndex9), cursorMo15040Q2.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i2++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    count = i;
                    listM14506b = list;
                }
                cursorMo15040Q2.close();
                Cursor cursorMo15040Q3 = supportSQLiteDatabase.mo15040Q("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorMo15040Q3.getColumnIndex("name");
                    int columnIndex12 = cursorMo15040Q3.getColumnIndex("origin");
                    int columnIndex13 = cursorMo15040Q3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorMo15040Q3.close();
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (true) {
                        if (!cursorMo15040Q3.moveToNext()) {
                            cursorMo15040Q3.close();
                            hashSet2 = hashSet3;
                            break;
                        }
                        if ("c".equals(cursorMo15040Q3.getString(columnIndex12))) {
                            d dVarM14507c = m14507c(supportSQLiteDatabase, cursorMo15040Q3.getString(columnIndex11), cursorMo15040Q3.getInt(columnIndex13) == 1);
                            if (dVarM14507c == null) {
                                cursorMo15040Q3.close();
                                break;
                            }
                            hashSet3.add(dVarM14507c);
                        }
                    }
                    return new TableInfo(str, map, hashSet, hashSet2);
                } catch (Throwable th) {
                    cursorMo15040Q3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorMo15040Q2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorMo15040Q.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<c> m14506b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static d m14507c(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        Cursor cursorMo15040Q = supportSQLiteDatabase.mo15040Q("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorMo15040Q.getColumnIndex("seqno");
            int columnIndex2 = cursorMo15040Q.getColumnIndex("cid");
            int columnIndex3 = cursorMo15040Q.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorMo15040Q.moveToNext()) {
                    if (cursorMo15040Q.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorMo15040Q.getInt(columnIndex)), cursorMo15040Q.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            cursorMo15040Q.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        String str = this.f34206a;
        if (str == null ? tableInfo.f34206a != null : !str.equals(tableInfo.f34206a)) {
            return false;
        }
        Map<String, a> map = this.f34207b;
        if (map == null ? tableInfo.f34207b != null : !map.equals(tableInfo.f34207b)) {
            return false;
        }
        Set<b> set2 = this.f34208c;
        if (set2 == null ? tableInfo.f34208c != null : !set2.equals(tableInfo.f34208c)) {
            return false;
        }
        Set<d> set3 = this.f34209d;
        if (set3 == null || (set = tableInfo.f34209d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f34206a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f34207b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f34208c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("TableInfo{name='");
        sbM1556G.append(this.f34206a);
        sbM1556G.append('\'');
        sbM1556G.append(", columns=");
        sbM1556G.append(this.f34207b);
        sbM1556G.append(", foreignKeys=");
        sbM1556G.append(this.f34208c);
        sbM1556G.append(", indices=");
        sbM1556G.append(this.f34209d);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    public TableInfo(String str, Map<String, a> map, Set<b> set) {
        this(str, map, set, Collections.emptySet());
    }
}
