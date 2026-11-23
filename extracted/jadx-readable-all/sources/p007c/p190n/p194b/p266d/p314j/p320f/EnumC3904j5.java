package p007c.p190n.p194b.p266d.p314j.p320f;

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
/* JADX INFO: renamed from: c.n.b.d.j.f.j5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3904j5 {

    /* JADX INFO: renamed from: f */
    public static final EnumC3904j5 f22709f;

    /* JADX INFO: renamed from: g */
    public static final EnumC3904j5 f22710g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3904j5 f22711h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3904j5 f22712i;

    /* JADX INFO: renamed from: j */
    public static final EnumC3904j5 f22713j;

    /* JADX INFO: renamed from: k */
    public static final EnumC3904j5 f22714k;

    /* JADX INFO: renamed from: l */
    public static final EnumC3904j5 f22715l;

    /* JADX INFO: renamed from: m */
    public static final EnumC3904j5 f22716m;

    /* JADX INFO: renamed from: n */
    public static final EnumC3904j5 f22717n;

    /* JADX INFO: renamed from: o */
    public static final EnumC3904j5 f22718o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ EnumC3904j5[] f22719p;

    /* JADX INFO: renamed from: q */
    public final Class<?> f22720q;

    /* JADX INFO: renamed from: r */
    public final Object f22721r;

    static {
        EnumC3904j5 enumC3904j5 = new EnumC3904j5("VOID", 0, Void.class, Void.class, null);
        f22709f = enumC3904j5;
        Class cls = Integer.TYPE;
        EnumC3904j5 enumC3904j6 = new EnumC3904j5("INT", 1, cls, Integer.class, 0);
        f22710g = enumC3904j6;
        EnumC3904j5 enumC3904j7 = new EnumC3904j5("LONG", 2, Long.TYPE, Long.class, 0L);
        f22711h = enumC3904j7;
        EnumC3904j5 enumC3904j8 = new EnumC3904j5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f22712i = enumC3904j8;
        EnumC3904j5 enumC3904j9 = new EnumC3904j5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f22713j = enumC3904j9;
        EnumC3904j5 enumC3904j10 = new EnumC3904j5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f22714k = enumC3904j10;
        EnumC3904j5 enumC3904j11 = new EnumC3904j5("STRING", 6, String.class, String.class, "");
        f22715l = enumC3904j11;
        EnumC3904j5 enumC3904j12 = new EnumC3904j5("BYTE_STRING", 7, AbstractC3823b4.class, AbstractC3823b4.class, AbstractC3823b4.f22519f);
        f22716m = enumC3904j12;
        EnumC3904j5 enumC3904j13 = new EnumC3904j5("ENUM", 8, cls, Integer.class, null);
        f22717n = enumC3904j13;
        EnumC3904j5 enumC3904j14 = new EnumC3904j5("MESSAGE", 9, Object.class, Object.class, null);
        f22718o = enumC3904j14;
        f22719p = new EnumC3904j5[]{enumC3904j5, enumC3904j6, enumC3904j7, enumC3904j8, enumC3904j9, enumC3904j10, enumC3904j11, enumC3904j12, enumC3904j13, enumC3904j14};
    }

    public EnumC3904j5(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.f22720q = cls2;
        this.f22721r = obj;
    }

    public static EnumC3904j5[] values() {
        return (EnumC3904j5[]) f22719p.clone();
    }
}
