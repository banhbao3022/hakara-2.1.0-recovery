package p636z0.p641a0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p636z0.p660c0.p661a.SupportSQLiteProgram;
import p636z0.p660c0.p661a.SupportSQLiteQuery;

/* JADX INFO: renamed from: z0.a0.u, reason: use source file name */
/* JADX INFO: compiled from: RoomSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
public class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {

    /* JADX INFO: renamed from: f */
    public static final TreeMap<Integer, RoomSQLiteQuery> f34348f = new TreeMap<>();

    /* JADX INFO: renamed from: g */
    public volatile String f34349g;

    /* JADX INFO: renamed from: h */
    public final long[] f34350h;

    /* JADX INFO: renamed from: i */
    public final double[] f34351i;

    /* JADX INFO: renamed from: j */
    public final String[] f34352j;

    /* JADX INFO: renamed from: k */
    public final byte[][] f34353k;

    /* JADX INFO: renamed from: l */
    public final int[] f34354l;

    /* JADX INFO: renamed from: m */
    public final int f34355m;

    /* JADX INFO: renamed from: n */
    public int f34356n;

    public RoomSQLiteQuery(int i) {
        this.f34355m = i;
        int i2 = i + 1;
        this.f34354l = new int[i2];
        this.f34350h = new long[i2];
        this.f34351i = new double[i2];
        this.f34352j = new String[i2];
        this.f34353k = new byte[i2][];
    }

    /* JADX INFO: renamed from: f */
    public static RoomSQLiteQuery m14548f(String str, int i) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = f34348f;
        synchronized (treeMap) {
            Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i);
                roomSQLiteQuery.f34349g = str;
                roomSQLiteQuery.f34356n = i;
                return roomSQLiteQuery;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            RoomSQLiteQuery value = entryCeilingEntry.getValue();
            value.f34349g = str;
            value.f34356n = i;
            return value;
        }
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: J */
    public void mo14549J(int i, long j2) {
        this.f34354l[i] = 2;
        this.f34350h[i] = j2;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: N */
    public void mo14550N(int i, byte[] bArr) {
        this.f34354l[i] = 5;
        this.f34353k[i] = bArr;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteQuery
    /* JADX INFO: renamed from: a */
    public String mo14551a() {
        return this.f34349g;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteQuery
    /* JADX INFO: renamed from: c */
    public void mo14552c(SupportSQLiteProgram supportSQLiteProgram) {
        for (int i = 1; i <= this.f34356n; i++) {
            int i2 = this.f34354l[i];
            if (i2 == 1) {
                supportSQLiteProgram.mo14553d0(i);
            } else if (i2 == 2) {
                supportSQLiteProgram.mo14549J(i, this.f34350h[i]);
            } else if (i2 == 3) {
                supportSQLiteProgram.mo14556v(i, this.f34351i[i]);
            } else if (i2 == 4) {
                supportSQLiteProgram.mo14555o(i, this.f34352j[i]);
            } else if (i2 == 5) {
                supportSQLiteProgram.mo14550N(i, this.f34353k[i]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: d0 */
    public void mo14553d0(int i) {
        this.f34354l[i] = 1;
    }

    /* JADX INFO: renamed from: h */
    public void m14554h() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = f34348f;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f34355m), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: o */
    public void mo14555o(int i, String str) {
        this.f34354l[i] = 4;
        this.f34352j[i] = str;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: v */
    public void mo14556v(int i, double d) {
        this.f34354l[i] = 3;
        this.f34351i[i] = d;
    }
}
