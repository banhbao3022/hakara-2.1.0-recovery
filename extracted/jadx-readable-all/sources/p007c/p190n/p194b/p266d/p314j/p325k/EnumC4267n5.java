package p007c.p190n.p194b.p266d.p314j.p325k;

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
/* JADX INFO: renamed from: c.n.b.d.j.k.n5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4267n5 {

    /* JADX INFO: renamed from: f */
    public static final EnumC4267n5 f23337f;

    /* JADX INFO: renamed from: g */
    public static final EnumC4267n5 f23338g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4267n5 f23339h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4267n5 f23340i;

    /* JADX INFO: renamed from: j */
    public static final EnumC4267n5 f23341j;

    /* JADX INFO: renamed from: k */
    public static final EnumC4267n5 f23342k;

    /* JADX INFO: renamed from: l */
    public static final EnumC4267n5 f23343l;

    /* JADX INFO: renamed from: m */
    public static final EnumC4267n5 f23344m;

    /* JADX INFO: renamed from: n */
    public static final EnumC4267n5 f23345n;

    /* JADX INFO: renamed from: o */
    public static final EnumC4267n5 f23346o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ EnumC4267n5[] f23347p;

    /* JADX INFO: renamed from: q */
    public final Class<?> f23348q;

    /* JADX INFO: renamed from: r */
    public final Object f23349r;

    static {
        EnumC4267n5 enumC4267n5 = new EnumC4267n5("VOID", 0, Void.class, Void.class, null);
        f23337f = enumC4267n5;
        Class cls = Integer.TYPE;
        EnumC4267n5 enumC4267n6 = new EnumC4267n5("INT", 1, cls, Integer.class, 0);
        f23338g = enumC4267n6;
        EnumC4267n5 enumC4267n7 = new EnumC4267n5("LONG", 2, Long.TYPE, Long.class, 0L);
        f23339h = enumC4267n7;
        EnumC4267n5 enumC4267n8 = new EnumC4267n5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f23340i = enumC4267n8;
        EnumC4267n5 enumC4267n9 = new EnumC4267n5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f23341j = enumC4267n9;
        EnumC4267n5 enumC4267n10 = new EnumC4267n5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f23342k = enumC4267n10;
        EnumC4267n5 enumC4267n11 = new EnumC4267n5("STRING", 6, String.class, String.class, "");
        f23343l = enumC4267n11;
        EnumC4267n5 enumC4267n12 = new EnumC4267n5("BYTE_STRING", 7, AbstractC4402x3.class, AbstractC4402x3.class, AbstractC4402x3.f23614f);
        f23344m = enumC4267n12;
        EnumC4267n5 enumC4267n13 = new EnumC4267n5("ENUM", 8, cls, Integer.class, null);
        f23345n = enumC4267n13;
        EnumC4267n5 enumC4267n14 = new EnumC4267n5("MESSAGE", 9, Object.class, Object.class, null);
        f23346o = enumC4267n14;
        f23347p = new EnumC4267n5[]{enumC4267n5, enumC4267n6, enumC4267n7, enumC4267n8, enumC4267n9, enumC4267n10, enumC4267n11, enumC4267n12, enumC4267n13, enumC4267n14};
    }

    public EnumC4267n5(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.f23348q = cls2;
        this.f23349r = obj;
    }

    public static EnumC4267n5[] values() {
        return (EnumC4267n5[]) f23347p.clone();
    }
}
