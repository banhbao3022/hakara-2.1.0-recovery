package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s82 {

    /* JADX INFO: renamed from: f */
    public static final s82 f19489f;

    /* JADX INFO: renamed from: g */
    public static final s82 f19490g;

    /* JADX INFO: renamed from: h */
    public static final s82 f19491h;

    /* JADX INFO: renamed from: i */
    public static final s82 f19492i;

    /* JADX INFO: renamed from: j */
    public static final s82 f19493j;

    /* JADX INFO: renamed from: k */
    public static final s82 f19494k;

    /* JADX INFO: renamed from: l */
    public static final s82 f19495l;

    /* JADX INFO: renamed from: m */
    public static final s82 f19496m;

    /* JADX INFO: renamed from: n */
    public static final s82 f19497n;

    /* JADX INFO: renamed from: o */
    public static final s82 f19498o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ s82[] f19499p;

    /* JADX INFO: renamed from: q */
    public final Class<?> f19500q;

    /* JADX INFO: renamed from: r */
    public final Object f19501r;

    static {
        s82 s82Var = new s82("VOID", 0, Void.class, Void.class, null);
        f19489f = s82Var;
        Class cls = Integer.TYPE;
        s82 s82Var2 = new s82("INT", 1, cls, Integer.class, 0);
        f19490g = s82Var2;
        s82 s82Var3 = new s82("LONG", 2, Long.TYPE, Long.class, 0L);
        f19491h = s82Var3;
        s82 s82Var4 = new s82("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19492i = s82Var4;
        s82 s82Var5 = new s82("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19493j = s82Var5;
        s82 s82Var6 = new s82("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19494k = s82Var6;
        s82 s82Var7 = new s82("STRING", 6, String.class, String.class, "");
        f19495l = s82Var7;
        s82 s82Var8 = new s82("BYTE_STRING", 7, g72.class, g72.class, g72.f14513f);
        f19496m = s82Var8;
        s82 s82Var9 = new s82("ENUM", 8, cls, Integer.class, null);
        f19497n = s82Var9;
        s82 s82Var10 = new s82("MESSAGE", 9, Object.class, Object.class, null);
        f19498o = s82Var10;
        f19499p = new s82[]{s82Var, s82Var2, s82Var3, s82Var4, s82Var5, s82Var6, s82Var7, s82Var8, s82Var9, s82Var10};
    }

    public s82(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.f19500q = cls2;
        this.f19501r = obj;
    }

    public static s82[] values() {
        return (s82[]) f19499p.clone();
    }
}
