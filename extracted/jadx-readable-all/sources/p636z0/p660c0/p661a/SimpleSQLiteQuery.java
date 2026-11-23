package p636z0.p660c0.p661a;

/* JADX INFO: renamed from: z0.c0.a.a, reason: use source file name */
/* JADX INFO: compiled from: SimpleSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    /* JADX INFO: renamed from: f */
    public final String f35324f;

    /* JADX INFO: renamed from: g */
    public final Object[] f35325g;

    public SimpleSQLiteQuery(String str, Object[] objArr) {
        this.f35324f = str;
        this.f35325g = objArr;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteQuery
    /* JADX INFO: renamed from: a */
    public String mo14551a() {
        return this.f35324f;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteQuery
    /* JADX INFO: renamed from: c */
    public void mo14552c(SupportSQLiteProgram supportSQLiteProgram) {
        Object[] objArr = this.f35325g;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                supportSQLiteProgram.mo14553d0(i);
            } else if (obj instanceof byte[]) {
                supportSQLiteProgram.mo14550N(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                supportSQLiteProgram.mo14556v(i, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                supportSQLiteProgram.mo14556v(i, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                supportSQLiteProgram.mo14549J(i, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                supportSQLiteProgram.mo14549J(i, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                supportSQLiteProgram.mo14549J(i, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                supportSQLiteProgram.mo14549J(i, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                supportSQLiteProgram.mo14555o(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
                supportSQLiteProgram.mo14549J(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public SimpleSQLiteQuery(String str) {
        this(str, null);
    }
}
